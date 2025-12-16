package com.avito.android.advert_core.analytics.address;

import Y61.k;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressClickTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/address/GeoFromBlock;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GeoFromBlock {

    /* renamed from: c, reason: collision with root package name */
    public static final GeoFromBlock f82789c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeoFromBlock f82790d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeoFromBlock f82791e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeoFromBlock f82792f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeoFromBlock f82793g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeoFromBlock f82794h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ GeoFromBlock[] f82795i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f82796j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82797b;

    static {
        GeoFromBlock geoFromBlock = new GeoFromBlock("ADDRESS", 0, AddressParameter.TYPE);
        f82789c = geoFromBlock;
        GeoFromBlock geoFromBlock2 = new GeoFromBlock("GEO_REFERENCE", 1, "geo");
        f82790d = geoFromBlock2;
        GeoFromBlock geoFromBlock3 = new GeoFromBlock("MAP_PREVIEW", 2, "map_preview");
        f82791e = geoFromBlock3;
        GeoFromBlock geoFromBlock4 = new GeoFromBlock("MINI_MAP_PREVIEW", 3, "mini_map_preview");
        f82792f = geoFromBlock4;
        GeoFromBlock geoFromBlock5 = new GeoFromBlock("MINI_PIN", 4, "pin");
        f82793g = geoFromBlock5;
        GeoFromBlock geoFromBlock6 = new GeoFromBlock("ADDRESS_LIST", 5, "address_list");
        f82794h = geoFromBlock6;
        GeoFromBlock[] geoFromBlockArr = {geoFromBlock, geoFromBlock2, geoFromBlock3, geoFromBlock4, geoFromBlock5, geoFromBlock6};
        f82795i = geoFromBlockArr;
        f82796j = c.a(geoFromBlockArr);
    }

    public GeoFromBlock(String str, int i12, String str2) {
        this.f82797b = str2;
    }

    public static GeoFromBlock valueOf(String str) {
        return (GeoFromBlock) Enum.valueOf(GeoFromBlock.class, str);
    }

    public static GeoFromBlock[] values() {
        return (GeoFromBlock[]) f82795i.clone();
    }
}
