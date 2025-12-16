package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator;

import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommonIndicatorItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/common_indicator/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f317437b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f317438c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f317439d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f317440e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f317441f;

    /* renamed from: g, reason: collision with root package name */
    public final double f317442g;

    /* renamed from: h, reason: collision with root package name */
    public final double f317443h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Float f317444i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<k> f317445j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AttributedText f317446k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f317447l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f317448m;

    public c() {
        throw null;
    }

    public c(String str, String str2, String str3, String str4, String str5, double d12, double d13, Float f12, List list, AttributedText attributedText, boolean z12, boolean z13, int i12, C42822w c42822w) {
        String str6 = (i12 & 8) != 0 ? null : str4;
        String str7 = (i12 & 16) != 0 ? null : str5;
        List list2 = (i12 & 256) != 0 ? null : list;
        AttributedText attributedText2 = (i12 & 512) == 0 ? attributedText : null;
        boolean z14 = (i12 & 1024) != 0 ? false : z12;
        boolean z15 = (i12 & 2048) == 0 ? z13 : false;
        this.f317437b = str;
        this.f317438c = str2;
        this.f317439d = str3;
        this.f317440e = str6;
        this.f317441f = str7;
        this.f317442g = d12;
        this.f317443h = d13;
        this.f317444i = f12;
        this.f317445j = list2;
        this.f317446k = attributedText2;
        this.f317447l = z14;
        this.f317448m = z15;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF318492b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318492b() {
        return this.f317437b;
    }
}
