package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DataSource {

    /* renamed from: b, reason: collision with root package name */
    public static final DataSource f338827b;

    /* renamed from: c, reason: collision with root package name */
    public static final DataSource f338828c;

    /* renamed from: d, reason: collision with root package name */
    public static final DataSource f338829d;

    /* renamed from: e, reason: collision with root package name */
    public static final DataSource f338830e;

    /* renamed from: f, reason: collision with root package name */
    public static final DataSource f338831f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ DataSource[] f338832g;

    static {
        DataSource dataSource = new DataSource("LOCAL", 0);
        f338827b = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        f338828c = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        f338829d = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        f338830e = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        f338831f = dataSource5;
        f338832g = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public DataSource() {
        throw null;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f338832g.clone();
    }
}
