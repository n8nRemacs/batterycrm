-- =====================================================
-- Migration 010: Device Catalog (Brands & Models)
-- =====================================================
-- Adds elo_dict_brands, elo_dict_models, elo_dict_symptom_candidates
-- For Neo4j integration: all IDs are UUID
-- =====================================================

-- 1. BRANDS TABLE
-- =====================================================
CREATE TABLE IF NOT EXISTS elo_dict_brands (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    aliases JSONB DEFAULT '[]',
    logo_url VARCHAR(500),
    is_active BOOLEAN DEFAULT true,
    sort_order INT DEFAULT 0,
    created_at TIMESTAMPTZ DEFAULT now()
);

CREATE INDEX idx_dict_brands_code ON elo_dict_brands(code);
CREATE INDEX idx_dict_brands_active ON elo_dict_brands(is_active) WHERE is_active = true;

COMMENT ON TABLE elo_dict_brands IS 'Device brands dictionary for Neo4j normalization';

-- 2. MODELS TABLE
-- =====================================================
CREATE TABLE IF NOT EXISTS elo_dict_models (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    brand_id UUID NOT NULL REFERENCES elo_dict_brands(id) ON DELETE CASCADE,
    code VARCHAR(100) NOT NULL UNIQUE,
    name VARCHAR(200) NOT NULL,
    aliases JSONB DEFAULT '[]',
    release_year INT,
    storage_options JSONB DEFAULT '[]',
    color_options JSONB DEFAULT '[]',
    is_active BOOLEAN DEFAULT true,
    sort_order INT DEFAULT 0,
    created_at TIMESTAMPTZ DEFAULT now()
);

CREATE INDEX idx_dict_models_brand ON elo_dict_models(brand_id);
CREATE INDEX idx_dict_models_code ON elo_dict_models(code);
CREATE INDEX idx_dict_models_year ON elo_dict_models(release_year);
CREATE INDEX idx_dict_models_active ON elo_dict_models(is_active) WHERE is_active = true;

COMMENT ON TABLE elo_dict_models IS 'Device models dictionary for Neo4j normalization';

-- 3. SYMPTOM CANDIDATES TABLE (AI Learning)
-- =====================================================
CREATE TABLE IF NOT EXISTS elo_dict_symptom_candidates (
    id SERIAL PRIMARY KEY,
    tenant_id UUID,
    dialog_id UUID,
    phrase VARCHAR(500) NOT NULL,
    suggested_category VARCHAR(50),
    suggested_symptom_type_id INT REFERENCES elo_symptom_types(id),
    confidence DECIMAL(3,2),
    status VARCHAR(20) DEFAULT 'pending' CHECK (status IN ('pending', 'approved', 'rejected')),
    reviewed_by UUID,
    reviewed_at TIMESTAMPTZ,
    created_at TIMESTAMPTZ DEFAULT now()
);

CREATE INDEX idx_symptom_candidates_status ON elo_dict_symptom_candidates(status);
CREATE INDEX idx_symptom_candidates_tenant ON elo_dict_symptom_candidates(tenant_id);

COMMENT ON TABLE elo_dict_symptom_candidates IS 'AI-suggested symptom phrases for moderation';

-- =====================================================
-- SEED DATA: BRANDS
-- =====================================================
INSERT INTO elo_dict_brands (code, name, aliases, sort_order) VALUES
('apple', 'Apple', '["айфон", "iphone", "эпл", "яблоко", "эппл"]', 1),
('samsung', 'Samsung', '["самсунг", "самс", "галакси", "galaxy", "гэлакси"]', 2),
('xiaomi', 'Xiaomi', '["сяоми", "ксяоми", "ксиаоми", "шаоми"]', 3),
('redmi', 'Redmi', '["редми"]', 4),
('poco', 'POCO', '["поко"]', 5),
('huawei', 'Huawei', '["хуавей", "хуавэй", "хуавэи"]', 6),
('honor', 'Honor', '["хонор", "онор"]', 7),
('realme', 'Realme', '["реалми", "риалми"]', 8),
('oppo', 'OPPO', '["оппо"]', 9),
('vivo', 'Vivo', '["виво"]', 10),
('google', 'Google', '["гугл", "пиксель", "pixel"]', 11),
('oneplus', 'OnePlus', '["ванплас", "один плюс", "1+"]', 12),
('nothing', 'Nothing', '["насинг", "нафинг"]', 13),
('motorola', 'Motorola', '["моторола", "moto", "мото"]', 14),
('nokia', 'Nokia', '["нокиа"]', 15)
ON CONFLICT (code) DO UPDATE SET
    aliases = EXCLUDED.aliases,
    sort_order = EXCLUDED.sort_order;

-- =====================================================
-- SEED DATA: APPLE MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('iphone_16_pro_max', 'iPhone 16 Pro Max', '["16 промакс", "16 pro max", "16пм"]', 2024, 1),
    ('iphone_16_pro', 'iPhone 16 Pro', '["16 про", "16 pro"]', 2024, 2),
    ('iphone_16_plus', 'iPhone 16 Plus', '["16 плюс", "16+"]', 2024, 3),
    ('iphone_16', 'iPhone 16', '["16", "шестнадцатый"]', 2024, 4),
    ('iphone_15_pro_max', 'iPhone 15 Pro Max', '["15 промакс", "15 pro max", "15пм"]', 2023, 5),
    ('iphone_15_pro', 'iPhone 15 Pro', '["15 про", "15 pro"]', 2023, 6),
    ('iphone_15_plus', 'iPhone 15 Plus', '["15 плюс", "15+"]', 2023, 7),
    ('iphone_15', 'iPhone 15', '["15", "пятнадцатый"]', 2023, 8),
    ('iphone_14_pro_max', 'iPhone 14 Pro Max', '["14 промакс", "14 pro max"]', 2022, 9),
    ('iphone_14_pro', 'iPhone 14 Pro', '["14 про", "14 pro"]', 2022, 10),
    ('iphone_14_plus', 'iPhone 14 Plus', '["14 плюс", "14+"]', 2022, 11),
    ('iphone_14', 'iPhone 14', '["14", "четырнадцатый"]', 2022, 12),
    ('iphone_13_pro_max', 'iPhone 13 Pro Max', '["13 промакс", "13 pro max"]', 2021, 13),
    ('iphone_13_pro', 'iPhone 13 Pro', '["13 про", "13 pro"]', 2021, 14),
    ('iphone_13_mini', 'iPhone 13 mini', '["13 мини", "13 mini"]', 2021, 15),
    ('iphone_13', 'iPhone 13', '["13", "тринадцатый"]', 2021, 16),
    ('iphone_12_pro_max', 'iPhone 12 Pro Max', '["12 промакс", "12 pro max"]', 2020, 17),
    ('iphone_12_pro', 'iPhone 12 Pro', '["12 про", "12 pro"]', 2020, 18),
    ('iphone_12_mini', 'iPhone 12 mini', '["12 мини", "12 mini"]', 2020, 19),
    ('iphone_12', 'iPhone 12', '["12", "двенадцатый"]', 2020, 20),
    ('iphone_11_pro_max', 'iPhone 11 Pro Max', '["11 промакс", "11 pro max"]', 2019, 21),
    ('iphone_11_pro', 'iPhone 11 Pro', '["11 про", "11 pro"]', 2019, 22),
    ('iphone_11', 'iPhone 11', '["11", "одиннадцатый"]', 2019, 23),
    ('iphone_xr', 'iPhone XR', '["xr", "хр", "икс эр"]', 2018, 24),
    ('iphone_xs_max', 'iPhone XS Max', '["xs max", "хс макс"]', 2018, 25),
    ('iphone_xs', 'iPhone XS', '["xs", "хс", "икс эс"]', 2018, 26),
    ('iphone_x', 'iPhone X', '["x", "десятый", "икс", "10"]', 2017, 27),
    ('iphone_8_plus', 'iPhone 8 Plus', '["8 плюс", "8+", "восьмерка плюс"]', 2017, 28),
    ('iphone_8', 'iPhone 8', '["8", "восьмерка"]', 2017, 29),
    ('iphone_7_plus', 'iPhone 7 Plus', '["7 плюс", "7+"]', 2016, 30),
    ('iphone_7', 'iPhone 7', '["7", "семерка"]', 2016, 31),
    ('iphone_6s_plus', 'iPhone 6s Plus', '["6s плюс", "6s+"]', 2015, 32),
    ('iphone_6s', 'iPhone 6s', '["6s", "шесть эс"]', 2015, 33),
    ('iphone_6_plus', 'iPhone 6 Plus', '["6 плюс", "6+"]', 2014, 34),
    ('iphone_6', 'iPhone 6', '["6", "шестерка"]', 2014, 35),
    ('iphone_se_2022', 'iPhone SE (2022)', '["se 3", "se 2022", "се третий"]', 2022, 36),
    ('iphone_se_2020', 'iPhone SE (2020)', '["se 2", "se 2020", "се второй"]', 2020, 37),
    ('iphone_se', 'iPhone SE (2016)', '["se", "се", "эсе"]', 2016, 38)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'apple'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: SAMSUNG MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    -- S-серия
    ('galaxy_s24_ultra', 'Galaxy S24 Ultra', '["s24 ultra", "s24 ультра", "с24 ультра"]', 2024, 1),
    ('galaxy_s24_plus', 'Galaxy S24+', '["s24+", "s24 плюс", "с24+"]', 2024, 2),
    ('galaxy_s24', 'Galaxy S24', '["s24", "с24"]', 2024, 3),
    ('galaxy_s23_ultra', 'Galaxy S23 Ultra', '["s23 ultra", "s23 ультра"]', 2023, 4),
    ('galaxy_s23_plus', 'Galaxy S23+', '["s23+", "s23 плюс"]', 2023, 5),
    ('galaxy_s23', 'Galaxy S23', '["s23", "с23"]', 2023, 6),
    ('galaxy_s23_fe', 'Galaxy S23 FE', '["s23 fe", "s23 фе"]', 2023, 7),
    ('galaxy_s22_ultra', 'Galaxy S22 Ultra', '["s22 ultra", "s22 ультра"]', 2022, 8),
    ('galaxy_s22_plus', 'Galaxy S22+', '["s22+", "s22 плюс"]', 2022, 9),
    ('galaxy_s22', 'Galaxy S22', '["s22", "с22"]', 2022, 10),
    ('galaxy_s21_ultra', 'Galaxy S21 Ultra', '["s21 ultra", "s21 ультра"]', 2021, 11),
    ('galaxy_s21_plus', 'Galaxy S21+', '["s21+", "s21 плюс"]', 2021, 12),
    ('galaxy_s21', 'Galaxy S21', '["s21", "с21"]', 2021, 13),
    ('galaxy_s21_fe', 'Galaxy S21 FE', '["s21 fe", "s21 фе"]', 2022, 14),
    ('galaxy_s20_ultra', 'Galaxy S20 Ultra', '["s20 ultra", "s20 ультра"]', 2020, 15),
    ('galaxy_s20_plus', 'Galaxy S20+', '["s20+", "s20 плюс"]', 2020, 16),
    ('galaxy_s20', 'Galaxy S20', '["s20", "с20"]', 2020, 17),
    ('galaxy_s20_fe', 'Galaxy S20 FE', '["s20 fe", "s20 фе"]', 2020, 18),
    ('galaxy_s10_plus', 'Galaxy S10+', '["s10+", "s10 плюс"]', 2019, 19),
    ('galaxy_s10', 'Galaxy S10', '["s10", "с10"]', 2019, 20),
    ('galaxy_s10e', 'Galaxy S10e', '["s10e", "s10е"]', 2019, 21),
    -- A-серия
    ('galaxy_a55', 'Galaxy A55', '["a55", "а55"]', 2024, 30),
    ('galaxy_a54', 'Galaxy A54', '["a54", "а54"]', 2023, 31),
    ('galaxy_a53', 'Galaxy A53', '["a53", "а53"]', 2022, 32),
    ('galaxy_a52', 'Galaxy A52', '["a52", "а52"]', 2021, 33),
    ('galaxy_a52s', 'Galaxy A52s', '["a52s", "а52s", "а52с"]', 2021, 34),
    ('galaxy_a51', 'Galaxy A51', '["a51", "а51"]', 2020, 35),
    ('galaxy_a35', 'Galaxy A35', '["a35", "а35"]', 2024, 36),
    ('galaxy_a34', 'Galaxy A34', '["a34", "а34"]', 2023, 37),
    ('galaxy_a33', 'Galaxy A33', '["a33", "а33"]', 2022, 38),
    ('galaxy_a25', 'Galaxy A25', '["a25", "а25"]', 2023, 39),
    ('galaxy_a24', 'Galaxy A24', '["a24", "а24"]', 2023, 40),
    ('galaxy_a15', 'Galaxy A15', '["a15", "а15"]', 2023, 41),
    ('galaxy_a14', 'Galaxy A14', '["a14", "а14"]', 2023, 42),
    ('galaxy_a05s', 'Galaxy A05s', '["a05s", "а05s"]', 2023, 43),
    -- Note-серия
    ('galaxy_note_20_ultra', 'Galaxy Note 20 Ultra', '["note 20 ultra", "ноут 20 ультра"]', 2020, 50),
    ('galaxy_note_20', 'Galaxy Note 20', '["note 20", "ноут 20"]', 2020, 51),
    ('galaxy_note_10_plus', 'Galaxy Note 10+', '["note 10+", "ноут 10 плюс"]', 2019, 52),
    ('galaxy_note_10', 'Galaxy Note 10', '["note 10", "ноут 10"]', 2019, 53),
    -- Z-серия
    ('galaxy_z_fold_5', 'Galaxy Z Fold 5', '["fold 5", "фолд 5", "z fold 5"]', 2023, 60),
    ('galaxy_z_fold_4', 'Galaxy Z Fold 4', '["fold 4", "фолд 4"]', 2022, 61),
    ('galaxy_z_flip_5', 'Galaxy Z Flip 5', '["flip 5", "флип 5"]', 2023, 62),
    ('galaxy_z_flip_4', 'Galaxy Z Flip 4', '["flip 4", "флип 4"]', 2022, 63)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'samsung'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: XIAOMI MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('xiaomi_14_ultra', 'Xiaomi 14 Ultra', '["14 ultra", "14 ультра"]', 2024, 1),
    ('xiaomi_14_pro', 'Xiaomi 14 Pro', '["14 pro", "14 про"]', 2024, 2),
    ('xiaomi_14', 'Xiaomi 14', '["14", "ми 14"]', 2024, 3),
    ('xiaomi_13_ultra', 'Xiaomi 13 Ultra', '["13 ultra", "13 ультра"]', 2023, 4),
    ('xiaomi_13_pro', 'Xiaomi 13 Pro', '["13 pro", "13 про"]', 2023, 5),
    ('xiaomi_13', 'Xiaomi 13', '["13", "ми 13"]', 2023, 6),
    ('xiaomi_13t_pro', 'Xiaomi 13T Pro', '["13t pro", "13т про"]', 2023, 7),
    ('xiaomi_13t', 'Xiaomi 13T', '["13t", "13т"]', 2023, 8),
    ('xiaomi_12_pro', 'Xiaomi 12 Pro', '["12 pro", "12 про"]', 2022, 9),
    ('xiaomi_12', 'Xiaomi 12', '["12", "ми 12"]', 2022, 10),
    ('xiaomi_12t_pro', 'Xiaomi 12T Pro', '["12t pro", "12т про"]', 2022, 11),
    ('xiaomi_12t', 'Xiaomi 12T', '["12t", "12т"]', 2022, 12),
    ('xiaomi_11t_pro', 'Xiaomi 11T Pro', '["11t pro", "11т про"]', 2021, 13),
    ('xiaomi_11t', 'Xiaomi 11T', '["11t", "11т"]', 2021, 14),
    ('xiaomi_mi_11_ultra', 'Mi 11 Ultra', '["mi 11 ultra", "ми 11 ультра"]', 2021, 15),
    ('xiaomi_mi_11', 'Mi 11', '["mi 11", "ми 11"]', 2021, 16)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'xiaomi'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: REDMI MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('redmi_note_13_pro_plus', 'Redmi Note 13 Pro+', '["note 13 pro+", "ноут 13 про+"]', 2024, 1),
    ('redmi_note_13_pro', 'Redmi Note 13 Pro', '["note 13 pro", "ноут 13 про"]', 2024, 2),
    ('redmi_note_13', 'Redmi Note 13', '["note 13", "ноут 13"]', 2024, 3),
    ('redmi_note_12_pro_plus', 'Redmi Note 12 Pro+', '["note 12 pro+", "ноут 12 про+"]', 2023, 4),
    ('redmi_note_12_pro', 'Redmi Note 12 Pro', '["note 12 pro", "ноут 12 про"]', 2023, 5),
    ('redmi_note_12', 'Redmi Note 12', '["note 12", "ноут 12"]', 2023, 6),
    ('redmi_note_11_pro_plus', 'Redmi Note 11 Pro+', '["note 11 pro+", "ноут 11 про+"]', 2022, 7),
    ('redmi_note_11_pro', 'Redmi Note 11 Pro', '["note 11 pro", "ноут 11 про"]', 2022, 8),
    ('redmi_note_11', 'Redmi Note 11', '["note 11", "ноут 11"]', 2022, 9),
    ('redmi_note_10_pro', 'Redmi Note 10 Pro', '["note 10 pro", "ноут 10 про"]', 2021, 10),
    ('redmi_note_10', 'Redmi Note 10', '["note 10", "ноут 10"]', 2021, 11),
    ('redmi_note_9_pro', 'Redmi Note 9 Pro', '["note 9 pro", "ноут 9 про"]', 2020, 12),
    ('redmi_note_9', 'Redmi Note 9', '["note 9", "ноут 9"]', 2020, 13),
    ('redmi_note_8_pro', 'Redmi Note 8 Pro', '["note 8 pro", "ноут 8 про"]', 2019, 14),
    ('redmi_note_8', 'Redmi Note 8', '["note 8", "ноут 8"]', 2019, 15),
    ('redmi_13', 'Redmi 13', '["редми 13"]', 2024, 20),
    ('redmi_12', 'Redmi 12', '["редми 12"]', 2023, 21),
    ('redmi_a3', 'Redmi A3', '["редми а3"]', 2024, 22),
    ('redmi_a2', 'Redmi A2', '["редми а2"]', 2023, 23)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'redmi'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: POCO MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('poco_f6_pro', 'POCO F6 Pro', '["f6 pro", "ф6 про"]', 2024, 1),
    ('poco_f6', 'POCO F6', '["f6", "ф6"]', 2024, 2),
    ('poco_f5_pro', 'POCO F5 Pro', '["f5 pro", "ф5 про"]', 2023, 3),
    ('poco_f5', 'POCO F5', '["f5", "ф5"]', 2023, 4),
    ('poco_x6_pro', 'POCO X6 Pro', '["x6 pro", "х6 про"]', 2024, 5),
    ('poco_x6', 'POCO X6', '["x6", "х6"]', 2024, 6),
    ('poco_x5_pro', 'POCO X5 Pro', '["x5 pro", "х5 про"]', 2023, 7),
    ('poco_x5', 'POCO X5', '["x5", "х5"]', 2023, 8),
    ('poco_m6_pro', 'POCO M6 Pro', '["m6 pro", "м6 про"]', 2023, 9),
    ('poco_m5', 'POCO M5', '["m5", "м5"]', 2022, 10)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'poco'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: HUAWEI MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('huawei_p60_pro', 'Huawei P60 Pro', '["p60 pro", "п60 про"]', 2023, 1),
    ('huawei_p60', 'Huawei P60', '["p60", "п60"]', 2023, 2),
    ('huawei_p50_pro', 'Huawei P50 Pro', '["p50 pro", "п50 про"]', 2021, 3),
    ('huawei_p50', 'Huawei P50', '["p50", "п50"]', 2021, 4),
    ('huawei_p40_pro_plus', 'Huawei P40 Pro+', '["p40 pro+", "п40 про+"]', 2020, 5),
    ('huawei_p40_pro', 'Huawei P40 Pro', '["p40 pro", "п40 про"]', 2020, 6),
    ('huawei_p40', 'Huawei P40', '["p40", "п40"]', 2020, 7),
    ('huawei_p30_pro', 'Huawei P30 Pro', '["p30 pro", "п30 про"]', 2019, 8),
    ('huawei_p30', 'Huawei P30', '["p30", "п30"]', 2019, 9),
    ('huawei_mate_60_pro', 'Huawei Mate 60 Pro', '["mate 60 pro", "мейт 60 про"]', 2023, 10),
    ('huawei_mate_50_pro', 'Huawei Mate 50 Pro', '["mate 50 pro", "мейт 50 про"]', 2022, 11),
    ('huawei_nova_12', 'Huawei Nova 12', '["nova 12", "нова 12"]', 2024, 12),
    ('huawei_nova_11', 'Huawei Nova 11', '["nova 11", "нова 11"]', 2023, 13)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'huawei'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: HONOR MODELS
-- =====================================================
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('honor_magic6_pro', 'Honor Magic6 Pro', '["magic6 pro", "мэджик 6 про"]', 2024, 1),
    ('honor_magic5_pro', 'Honor Magic5 Pro', '["magic5 pro", "мэджик 5 про"]', 2023, 2),
    ('honor_90_pro', 'Honor 90 Pro', '["90 pro", "90 про"]', 2023, 3),
    ('honor_90', 'Honor 90', '["90", "хонор 90"]', 2023, 4),
    ('honor_x9b', 'Honor X9b', '["x9b", "х9б"]', 2024, 5),
    ('honor_x9a', 'Honor X9a', '["x9a", "х9а"]', 2023, 6),
    ('honor_x8b', 'Honor X8b', '["x8b", "х8б"]', 2024, 7),
    ('honor_x7b', 'Honor X7b', '["x7b", "х7б"]', 2024, 8),
    ('honor_200_pro', 'Honor 200 Pro', '["200 pro", "200 про"]', 2024, 9),
    ('honor_200', 'Honor 200', '["200", "хонор 200"]', 2024, 10),
    ('honor_50', 'Honor 50', '["50", "хонор 50"]', 2021, 11)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'honor'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- SEED DATA: OTHER BRANDS
-- =====================================================
-- Realme
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('realme_gt5_pro', 'Realme GT5 Pro', '["gt5 pro", "гт5 про"]', 2024, 1),
    ('realme_gt3', 'Realme GT3', '["gt3", "гт3"]', 2023, 2),
    ('realme_12_pro_plus', 'Realme 12 Pro+', '["12 pro+", "12 про+"]', 2024, 3),
    ('realme_12_pro', 'Realme 12 Pro', '["12 pro", "12 про"]', 2024, 4),
    ('realme_11_pro_plus', 'Realme 11 Pro+', '["11 pro+", "11 про+"]', 2023, 5),
    ('realme_11_pro', 'Realme 11 Pro', '["11 pro", "11 про"]', 2023, 6),
    ('realme_c67', 'Realme C67', '["c67", "с67"]', 2024, 7),
    ('realme_c55', 'Realme C55', '["c55", "с55"]', 2023, 8),
    ('realme_narzo_60', 'Realme Narzo 60', '["narzo 60", "нарзо 60"]', 2023, 9)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'realme'
ON CONFLICT (code) DO NOTHING;

-- Google Pixel
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('pixel_8_pro', 'Pixel 8 Pro', '["pixel 8 pro", "пиксель 8 про"]', 2023, 1),
    ('pixel_8', 'Pixel 8', '["pixel 8", "пиксель 8"]', 2023, 2),
    ('pixel_8a', 'Pixel 8a', '["pixel 8a", "пиксель 8а"]', 2024, 3),
    ('pixel_7_pro', 'Pixel 7 Pro', '["pixel 7 pro", "пиксель 7 про"]', 2022, 4),
    ('pixel_7', 'Pixel 7', '["pixel 7", "пиксель 7"]', 2022, 5),
    ('pixel_7a', 'Pixel 7a', '["pixel 7a", "пиксель 7а"]', 2023, 6),
    ('pixel_6_pro', 'Pixel 6 Pro', '["pixel 6 pro", "пиксель 6 про"]', 2021, 7),
    ('pixel_6', 'Pixel 6', '["pixel 6", "пиксель 6"]', 2021, 8),
    ('pixel_6a', 'Pixel 6a', '["pixel 6a", "пиксель 6а"]', 2022, 9)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'google'
ON CONFLICT (code) DO NOTHING;

-- OnePlus
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('oneplus_12', 'OnePlus 12', '["oneplus 12", "ванплас 12", "1+ 12"]', 2024, 1),
    ('oneplus_11', 'OnePlus 11', '["oneplus 11", "ванплас 11"]', 2023, 2),
    ('oneplus_nord_3', 'OnePlus Nord 3', '["nord 3", "норд 3"]', 2023, 3),
    ('oneplus_nord_ce_3', 'OnePlus Nord CE 3', '["nord ce 3", "норд се 3"]', 2023, 4),
    ('oneplus_10_pro', 'OnePlus 10 Pro', '["10 pro", "10 про"]', 2022, 5),
    ('oneplus_10t', 'OnePlus 10T', '["10t", "10т"]', 2022, 6),
    ('oneplus_9_pro', 'OnePlus 9 Pro', '["9 pro", "9 про"]', 2021, 7),
    ('oneplus_9', 'OnePlus 9', '["9", "ванплас 9"]', 2021, 8)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'oneplus'
ON CONFLICT (code) DO NOTHING;

-- Nothing
INSERT INTO elo_dict_models (brand_id, code, name, aliases, release_year, sort_order)
SELECT b.id, m.code, m.name, m.aliases::jsonb, m.release_year, m.sort_order
FROM elo_dict_brands b,
(VALUES
    ('nothing_phone_2a', 'Nothing Phone (2a)', '["phone 2a", "фон 2а"]', 2024, 1),
    ('nothing_phone_2', 'Nothing Phone (2)', '["phone 2", "фон 2"]', 2023, 2),
    ('nothing_phone_1', 'Nothing Phone (1)', '["phone 1", "фон 1"]', 2022, 3)
) AS m(code, name, aliases, release_year, sort_order)
WHERE b.code = 'nothing'
ON CONFLICT (code) DO NOTHING;

-- =====================================================
-- VIEWS
-- =====================================================

-- View: Device catalog (brand + model)
CREATE OR REPLACE VIEW elo_v_device_catalog AS
SELECT
    b.id as brand_id,
    b.code as brand_code,
    b.name as brand_name,
    b.aliases as brand_aliases,
    m.id as model_id,
    m.code as model_code,
    m.name as model_name,
    m.aliases as model_aliases,
    m.release_year
FROM elo_dict_brands b
LEFT JOIN elo_dict_models m ON m.brand_id = b.id
WHERE b.is_active = true AND (m.is_active = true OR m.id IS NULL)
ORDER BY b.sort_order, m.release_year DESC NULLS LAST, m.sort_order;

COMMENT ON VIEW elo_v_device_catalog IS 'Flat view of brands and models for search';

-- View: Brand stats
CREATE OR REPLACE VIEW elo_v_brand_stats AS
SELECT
    b.id,
    b.code,
    b.name,
    COUNT(m.id) as model_count,
    MIN(m.release_year) as oldest_model_year,
    MAX(m.release_year) as newest_model_year
FROM elo_dict_brands b
LEFT JOIN elo_dict_models m ON m.brand_id = b.id AND m.is_active = true
WHERE b.is_active = true
GROUP BY b.id, b.code, b.name
ORDER BY b.sort_order;

COMMENT ON VIEW elo_v_brand_stats IS 'Brand statistics with model counts';

-- =====================================================
-- SUMMARY
-- =====================================================
DO $$
DECLARE
    brand_count INT;
    model_count INT;
BEGIN
    SELECT COUNT(*) INTO brand_count FROM elo_dict_brands;
    SELECT COUNT(*) INTO model_count FROM elo_dict_models;

    RAISE NOTICE 'Migration 010 completed:';
    RAISE NOTICE '  Brands: %', brand_count;
    RAISE NOTICE '  Models: %', model_count;
END $$;
