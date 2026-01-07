#!/usr/bin/env python3
"""Export normalized models to Excel"""

import json
import pandas as pd
from pathlib import Path

# Paths
BASE_DIR = Path(__file__).parent.parent
JSON_PATH = BASE_DIR / "NEW/Prices/Normalize All/models_normalized.json"
EXCEL_PATH = BASE_DIR / "NEW/Prices/Normalize All/models_normalized.xlsx"

# Load JSON
print(f"Loading: {JSON_PATH}")
with open(JSON_PATH, 'r', encoding='utf-8') as f:
    data = json.load(f)

# Prepare data for Excel
rows = []
for brand, info in data['brands'].items():
    for model in info['models']:
        rows.append({
            'Brand': brand,
            'Model': model,
            'Raw Count': info['raw_count']
        })

# Create DataFrame
df = pd.DataFrame(rows)

# Save to Excel
print(f"Saving: {EXCEL_PATH}")
with pd.ExcelWriter(EXCEL_PATH, engine='openpyxl') as writer:
    # Sheet 1: All models
    df.to_excel(writer, sheet_name='All Models', index=False)

    # Adjust column widths
    worksheet = writer.sheets['All Models']
    worksheet.column_dimensions['A'].width = 15
    worksheet.column_dimensions['B'].width = 35
    worksheet.column_dimensions['C'].width = 12

    # Sheet 2: Summary by brand
    summary = df.groupby('Brand').agg({
        'Model': 'count',
        'Raw Count': 'first'
    }).rename(columns={'Model': 'Normalized Count'}).reset_index()
    summary = summary.sort_values('Raw Count', ascending=False)
    summary.to_excel(writer, sheet_name='Summary', index=False)

    # Adjust column widths
    worksheet2 = writer.sheets['Summary']
    worksheet2.column_dimensions['A'].width = 15
    worksheet2.column_dimensions['B'].width = 18
    worksheet2.column_dimensions['C'].width = 12

print(f"\nDone!")
print(f"Total models: {len(df)}")
print(f"Brands: {df['Brand'].nunique()}")
