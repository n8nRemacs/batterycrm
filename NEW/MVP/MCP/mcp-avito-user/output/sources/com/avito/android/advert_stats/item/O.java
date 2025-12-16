package com.avito.android.advert_stats.item;

import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: WeekItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/O;", "Lcom/avito/android/advert_stats/item/w;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f86701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f86702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f86703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f86704f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f86705g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f86706h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86707i;

    public O(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.k String str2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str3, boolean z12) {
        this.f86700b = str;
        this.f86701c = arrayList;
        this.f86702d = str2;
        this.f86703e = num;
        this.f86704f = num2;
        this.f86705g = num3;
        this.f86706h = str3;
        this.f86707i = z12;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: I, reason: from getter */
    public final Integer getF86705g() {
        return this.f86705g;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: I1, reason: from getter */
    public final Integer getF86703e() {
        return this.f86703e;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.k
    /* renamed from: W0, reason: from getter */
    public final String getF86702d() {
        return this.f86702d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83668b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86700b() {
        return this.f86700b;
    }

    @Override // com.avito.android.advert_stats.item.w
    @Y61.l
    /* renamed from: l2, reason: from getter */
    public final Integer getF86704f() {
        return this.f86704f;
    }
}
