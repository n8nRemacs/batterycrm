package com.avito.android.config;

import Y61.k;
import com.avito.android.region.Region;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/config/AppType;", "", "_avito_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AppType {

    /* renamed from: c, reason: collision with root package name */
    public static final AppType f125474c;

    /* renamed from: d, reason: collision with root package name */
    public static final AppType f125475d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AppType[] f125476e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f125477f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Region> f125478b;

    static {
        Region region = Region.f252702c;
        AppType appType = new AppType("MAIN", 0, Collections.singleton(region));
        f125474c = appType;
        AppType appType2 = new AppType("GLOBAL", 1, C42756l.l0(new Region[]{region, Region.f252703d}));
        f125475d = appType2;
        AppType[] appTypeArr = {appType, appType2};
        f125476e = appTypeArr;
        f125477f = c.a(appTypeArr);
    }

    public AppType(String str, int i12, Set set) {
        this.f125478b = set;
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) f125476e.clone();
    }
}
