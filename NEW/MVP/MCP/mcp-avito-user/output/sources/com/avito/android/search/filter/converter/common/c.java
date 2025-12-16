package com.avito.android.search.filter.converter.common;

import Cp0.InterfaceC13339c;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ItemWithState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckBoxWithBadgeItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/converter/common/c;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.conveyor_item.a, ItemWithState, InterfaceC13339c, ParameterElement.m {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262960b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262961c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f262962d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262963e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f262964f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f262965g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ItemWithState.State f262966h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f262967i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f262968j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f262969k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Badge f262970l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final DeepLink f262971m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f262972n;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, String str2, String str3, boolean z12, boolean z13, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str4, boolean z14, Badge badge, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        String str6 = (i12 & 4) != 0 ? null : str3;
        AttributedText attributedText3 = (i12 & 32) != 0 ? null : attributedText;
        ItemWithState.State normal = (i12 & 64) != 0 ? new ItemWithState.State.Normal(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0) : state;
        AttributedText attributedText4 = (i12 & 128) != 0 ? null : attributedText2;
        String str7 = (i12 & 256) != 0 ? null : str4;
        boolean z15 = (i12 & 512) != 0 ? false : z14;
        Badge badge2 = (i12 & 1024) != 0 ? null : badge;
        String str8 = (i12 & 4096) == 0 ? str5 : null;
        this.f262960b = str;
        this.f262961c = str2;
        this.f262962d = str6;
        this.f262963e = z12;
        this.f262964f = z13;
        this.f262965g = attributedText3;
        this.f262966h = normal;
        this.f262967i = attributedText4;
        this.f262968j = str7;
        this.f262969k = z15;
        this.f262970l = badge2;
        this.f262971m = deepLink;
        this.f262972n = str8;
    }

    @Override // com.avito.android.search.filter.converter.ParameterElement.m
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF2688c() {
        return this.f262972n;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF2687b().hashCode();
    }

    @Override // Cp0.InterfaceC13339c
    @l
    /* renamed from: getMotivation */
    public final AttributedText getF262796o() {
        throw null;
    }

    @Override // com.avito.android.search.filter.converter.common.ItemWithState
    @k
    /* renamed from: getState */
    public final ItemWithState.State getF262797p() {
        throw null;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2687b() {
        return this.f262960b;
    }
}
