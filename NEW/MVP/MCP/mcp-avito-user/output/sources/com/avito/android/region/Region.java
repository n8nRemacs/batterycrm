package com.avito.android.region;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Region.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/region/Region;", "", "_common_region_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Region {

    /* renamed from: c, reason: collision with root package name */
    public static final Region f252702c;

    /* renamed from: d, reason: collision with root package name */
    public static final Region f252703d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Region[] f252704e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f252705f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeeplinkScheme f252706b;

    static {
        Region region = new Region("MAIN", 0, DeeplinkScheme.f252697c);
        f252702c = region;
        Region region2 = new Region("GLOBAL", 1, DeeplinkScheme.f252698d);
        f252703d = region2;
        Region[] regionArr = {region, region2};
        f252704e = regionArr;
        f252705f = c.a(regionArr);
    }

    public Region(String str, int i12, DeeplinkScheme deeplinkScheme) {
        this.f252706b = deeplinkScheme;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) f252704e.clone();
    }
}
