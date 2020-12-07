
currentDir=`pwd`
cd ../../../
rootDir=`pwd`
cd $currentDir

export PYTHONPATH=$rootDir
alias taxi_alias='python $rootDir/tabular/cli.py'
filepath=$currentDir/../../datasheet/新手任务.xlsx
taxi_alias --parse_files=$filepath --enable_column_skip --cpp_out=$currentDir/src/AutogenConfig --gen_csv_parse --gen_csv_dataload --out_data_format=csv --out_data_path=$currentDir/res 


