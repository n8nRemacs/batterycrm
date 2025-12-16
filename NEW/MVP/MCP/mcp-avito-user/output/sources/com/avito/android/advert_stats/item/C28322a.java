package com.avito.android.advert_stats.item;

import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BarItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/a;", "Lcom/avito/android/advert_stats/item/w;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28322a implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f86718c;

    /* renamed from: d, reason: collision with root package name */
    public final float f86719d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public BarState f86720e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86721f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f86722g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f86723h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f86724i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f86725j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<VasInfo> f86726k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f86727l;

    public C28322a() {
        throw null;
    }

    public C28322a(String str, Integer num, float f12, BarState barState, int i12, String str2, Integer num2, Integer num3, Integer num4, List list, String str3, int i13, C42822w c42822w) {
        barState = (i13 & 8) != 0 ? BarState.f86678b : barState;
        this.f86717b = str;
        this.f86718c = num;
        this.f86719d = f12;
        this.f86720e = barState;
        this.f86721f = i12;
        this.f86722g = str2;
        this.f86723h = num2;
        this.f86724i = num3;
        this.f86725j = num4;
        this.f86726k = list;
        this.f86727l = str3;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: I, reason: from getter */
    public final Integer getF86724i() {
        return this.f86724i;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: I1, reason: from getter */
    public final Integer getF86718c() {
        return this.f86718c;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.k
    /* renamed from: W0, reason: from getter */
    public final String getF86722g() {
        return this.f86722g;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f86717b;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: l2, reason: from getter */
    public final Integer getF86723h() {
        return this.f86723h;
    }
}
