"""PostgreSQL schema for iFixit Knowledge Base."""

SCHEMA_SQL = """
-- ═══════════════════════════════════════════════════════════
-- CREATE SCHEMA
-- ═══════════════════════════════════════════════════════════

CREATE SCHEMA IF NOT EXISTS ifixit_kb;

-- ═══════════════════════════════════════════════════════════
-- CATEGORIES
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.categories (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT UNIQUE NOT NULL,
    name_ru TEXT,
    title TEXT,
    description TEXT,
    description_ru TEXT,
    image_url TEXT,
    wiki_url TEXT,
    locale TEXT DEFAULT 'en',

    -- Hierarchy
    parent_id UUID REFERENCES ifixit_kb.categories(id),
    level INTEGER DEFAULT 0,
    path TEXT,  -- "Electronics/Phone/iPhone"

    -- Stats
    guide_count INTEGER DEFAULT 0,
    device_count INTEGER DEFAULT 0,

    -- Processing status
    parsed_at TIMESTAMPTZ,
    devices_parsed BOOLEAN DEFAULT FALSE,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_categories_parent
    ON ifixit_kb.categories(parent_id);
CREATE INDEX IF NOT EXISTS idx_kb_categories_level
    ON ifixit_kb.categories(level);

-- ═══════════════════════════════════════════════════════════
-- BRANDS
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.brands (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT UNIQUE NOT NULL,
    name_ru TEXT,
    name_normalized TEXT,  -- lowercase, no spaces
    logo_url TEXT,
    website TEXT,
    country TEXT,

    -- Stats
    device_count INTEGER DEFAULT 0,
    guide_count INTEGER DEFAULT 0,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_brands_normalized
    ON ifixit_kb.brands(name_normalized);

-- ═══════════════════════════════════════════════════════════
-- DEVICES
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.devices (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    ifixit_topic_uid TEXT UNIQUE,

    name TEXT NOT NULL,
    name_ru TEXT,
    display_title TEXT,

    -- Relations
    brand_id UUID REFERENCES ifixit_kb.brands(id),
    category_id UUID REFERENCES ifixit_kb.categories(id),

    -- Parsed brand/model
    brand_name TEXT,
    model_name TEXT,

    -- Media
    image_url TEXT,
    thumbnail_url TEXT,

    -- Data
    model_numbers TEXT[],
    release_date DATE,
    specifications JSONB DEFAULT '{}',

    -- Source
    source_url TEXT,

    -- Stats
    guide_count INTEGER DEFAULT 0,
    popularity INTEGER DEFAULT 0,

    -- Processing
    guides_parsed BOOLEAN DEFAULT FALSE,
    parsed_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_devices_brand
    ON ifixit_kb.devices(brand_id);
CREATE INDEX IF NOT EXISTS idx_kb_devices_category
    ON ifixit_kb.devices(category_id);
CREATE INDEX IF NOT EXISTS idx_kb_devices_name
    ON ifixit_kb.devices(name);

-- ═══════════════════════════════════════════════════════════
-- GUIDES
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.guides (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    ifixit_id INTEGER UNIQUE NOT NULL,

    -- Relations
    device_id UUID REFERENCES ifixit_kb.devices(id),
    category_id UUID REFERENCES ifixit_kb.categories(id),

    -- Titles
    title TEXT NOT NULL,
    title_ru TEXT,

    -- Type & Difficulty
    guide_type TEXT,  -- replacement, repair, teardown, disassembly, technique
    difficulty TEXT,  -- Easy, Moderate, Difficult, Very difficult
    difficulty_num INTEGER,  -- 1-4

    -- Time
    time_required TEXT,
    time_min INTEGER,
    time_max INTEGER,

    -- Content (EN)
    introduction TEXT,
    conclusion TEXT,
    summary TEXT,

    -- Content (RU)
    introduction_ru TEXT,
    conclusion_ru TEXT,
    summary_ru TEXT,

    -- Flags
    featured BOOLEAN DEFAULT FALSE,
    public BOOLEAN DEFAULT TRUE,

    -- Stats
    step_count INTEGER DEFAULT 0,
    view_count INTEGER DEFAULT 0,

    -- Processing status
    text_status TEXT DEFAULT 'original',  -- original, translated, rewritten
    translation_status TEXT DEFAULT 'none',  -- none, auto, manual, verified
    images_status TEXT DEFAULT 'ifixit',  -- ifixit, mixed, own

    -- Source
    source_url TEXT,
    locale TEXT DEFAULT 'en',

    -- Local service data
    price_rub INTEGER,
    avg_repair_time INTEGER,
    success_rate DECIMAL(3,2),
    notes TEXT,

    -- Raw data
    raw_data JSONB,

    -- Dates
    ifixit_created_at TIMESTAMPTZ,
    ifixit_modified_at TIMESTAMPTZ,
    parsed_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_guides_device
    ON ifixit_kb.guides(device_id);
CREATE INDEX IF NOT EXISTS idx_kb_guides_category
    ON ifixit_kb.guides(category_id);
CREATE INDEX IF NOT EXISTS idx_kb_guides_type
    ON ifixit_kb.guides(guide_type);
CREATE INDEX IF NOT EXISTS idx_kb_guides_difficulty
    ON ifixit_kb.guides(difficulty_num);
CREATE INDEX IF NOT EXISTS idx_kb_guides_text_status
    ON ifixit_kb.guides(text_status);
CREATE INDEX IF NOT EXISTS idx_kb_guides_ifixit_id
    ON ifixit_kb.guides(ifixit_id);

-- ═══════════════════════════════════════════════════════════
-- STEPS
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.steps (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    ifixit_id INTEGER,
    guide_id UUID REFERENCES ifixit_kb.guides(id) ON DELETE CASCADE,

    order_num INTEGER NOT NULL,

    -- Content (EN)
    title TEXT,
    lines JSONB,  -- [{text, level, bullet}]
    lines_text TEXT,  -- Combined text

    -- Content (RU)
    title_ru TEXT,
    lines_text_ru TEXT,

    -- Special blocks (EN)
    warnings TEXT[],
    tips TEXT[],
    notes TEXT[],
    reminders TEXT[],

    -- Special blocks (RU)
    warnings_ru TEXT[],
    tips_ru TEXT[],
    notes_ru TEXT[],
    reminders_ru TEXT[],

    -- Processing status
    text_status TEXT DEFAULT 'original',

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(guide_id, order_num)
);

CREATE INDEX IF NOT EXISTS idx_kb_steps_guide
    ON ifixit_kb.steps(guide_id);

-- ═══════════════════════════════════════════════════════════
-- TOOLS
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.tools (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    name TEXT UNIQUE NOT NULL,
    name_ru TEXT,
    name_normalized TEXT,

    description TEXT,
    description_ru TEXT,

    tool_type TEXT,
    url TEXT,
    image_url TEXT,
    thumbnail_url TEXT,

    -- Local data
    price_rub INTEGER,
    suppliers_ru JSONB,  -- [{name, url, price}]
    alternatives TEXT[],
    in_stock BOOLEAN DEFAULT TRUE,

    -- Stats
    usage_count INTEGER DEFAULT 0,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_tools_normalized
    ON ifixit_kb.tools(name_normalized);

-- ═══════════════════════════════════════════════════════════
-- PARTS
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.parts (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

    name TEXT NOT NULL,
    name_ru TEXT,
    name_normalized TEXT,

    sku TEXT,
    part_number TEXT,

    url TEXT,
    image_url TEXT,
    thumbnail_url TEXT,

    price_usd DECIMAL(10,2),

    -- Local data
    price_rub INTEGER,
    suppliers_ru JSONB,
    quality_grade TEXT,  -- original, oem, refurbished, copy
    in_stock BOOLEAN DEFAULT TRUE,
    lead_time_days INTEGER,

    -- Stats
    usage_count INTEGER DEFAULT 0,

    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_parts_normalized
    ON ifixit_kb.parts(name_normalized);

-- ═══════════════════════════════════════════════════════════
-- IMAGES
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.images (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    ifixit_id INTEGER,
    guid TEXT UNIQUE,

    -- iFixit URLs
    url_mini TEXT,
    url_thumbnail TEXT,
    url_standard TEXT,
    url_medium TEXT,
    url_large TEXT,
    url_huge TEXT,
    url_original TEXT,

    -- Local paths
    local_path_thumb TEXT,
    local_path_std TEXT,
    local_path_large TEXT,

    -- Own replacement
    own_url TEXT,
    own_local_path TEXT,

    -- Metadata
    width INTEGER,
    height INTEGER,

    -- Status
    status TEXT DEFAULT 'pending',  -- pending, downloaded, replaced
    downloaded_at TIMESTAMPTZ,
    replaced_at TIMESTAMPTZ,

    created_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_kb_images_status
    ON ifixit_kb.images(status);
CREATE INDEX IF NOT EXISTS idx_kb_images_guid
    ON ifixit_kb.images(guid);

-- ═══════════════════════════════════════════════════════════
-- JUNCTION TABLES
-- ═══════════════════════════════════════════════════════════

-- Step images
CREATE TABLE IF NOT EXISTS ifixit_kb.step_images (
    step_id UUID REFERENCES ifixit_kb.steps(id) ON DELETE CASCADE,
    image_id UUID REFERENCES ifixit_kb.images(id),
    order_num INTEGER DEFAULT 0,
    marker TEXT,
    PRIMARY KEY (step_id, image_id)
);

-- Guide tools
CREATE TABLE IF NOT EXISTS ifixit_kb.guide_tools (
    guide_id UUID REFERENCES ifixit_kb.guides(id) ON DELETE CASCADE,
    tool_id UUID REFERENCES ifixit_kb.tools(id),
    quantity INTEGER DEFAULT 1,
    optional BOOLEAN DEFAULT FALSE,
    notes TEXT,
    PRIMARY KEY (guide_id, tool_id)
);

-- Guide parts
CREATE TABLE IF NOT EXISTS ifixit_kb.guide_parts (
    guide_id UUID REFERENCES ifixit_kb.guides(id) ON DELETE CASCADE,
    part_id UUID REFERENCES ifixit_kb.parts(id),
    quantity INTEGER DEFAULT 1,
    notes TEXT,
    PRIMARY KEY (guide_id, part_id)
);

-- Guide prerequisites
CREATE TABLE IF NOT EXISTS ifixit_kb.guide_prerequisites (
    guide_id UUID REFERENCES ifixit_kb.guides(id) ON DELETE CASCADE,
    prerequisite_id UUID REFERENCES ifixit_kb.guides(id),
    order_num INTEGER DEFAULT 0,
    PRIMARY KEY (guide_id, prerequisite_id)
);

-- ═══════════════════════════════════════════════════════════
-- FULL-TEXT SEARCH INDEXES
-- ═══════════════════════════════════════════════════════════

CREATE INDEX IF NOT EXISTS idx_kb_guides_title_search
    ON ifixit_kb.guides USING GIN(to_tsvector('english', title));

CREATE INDEX IF NOT EXISTS idx_kb_guides_title_ru_search
    ON ifixit_kb.guides USING GIN(to_tsvector('russian', COALESCE(title_ru, '')));

CREATE INDEX IF NOT EXISTS idx_kb_devices_name_search
    ON ifixit_kb.devices USING GIN(to_tsvector('english', name));

-- ═══════════════════════════════════════════════════════════
-- PARSING PROGRESS TABLE
-- ═══════════════════════════════════════════════════════════

CREATE TABLE IF NOT EXISTS ifixit_kb.parse_progress (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    task_type TEXT NOT NULL,  -- categories, devices, guides, images
    task_key TEXT,  -- category name, device id, etc.
    status TEXT DEFAULT 'pending',  -- pending, in_progress, completed, failed
    total_items INTEGER,
    processed_items INTEGER DEFAULT 0,
    error_message TEXT,
    started_at TIMESTAMPTZ,
    completed_at TIMESTAMPTZ,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW(),

    UNIQUE(task_type, task_key)
);

CREATE INDEX IF NOT EXISTS idx_kb_progress_status
    ON ifixit_kb.parse_progress(status);
"""


async def create_schema(pool) -> None:
    """Create the ifixit_kb schema and all tables."""
    async with pool.acquire() as conn:
        await conn.execute(SCHEMA_SQL)
