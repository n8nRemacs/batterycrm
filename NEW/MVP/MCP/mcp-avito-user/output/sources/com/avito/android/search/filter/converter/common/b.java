package com.avito.android.search.filter.converter.common;

import Cp0.InterfaceC13339c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ItemWithState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckBoxItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/converter/common/b;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.conveyor_item.a, ItemWithState, InterfaceC13339c, ParameterElement.m {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262951b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262952c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f262953d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f262954e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ItemWithState.State f262955f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f262956g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f262957h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f262958i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f262959j;

    public b(@k String str, @k String str2, boolean z12, @l AttributedText attributedText, @k ItemWithState.State state, @l AttributedText attributedText2, @l String str3, boolean z13, @l String str4) {
        this.f262951b = str;
        this.f262952c = str2;
        this.f262953d = z12;
        this.f262954e = attributedText;
        this.f262955f = state;
        this.f262956g = attributedText2;
        this.f262957h = str3;
        this.f262958i = z13;
        this.f262959j = str4;
    }

    @Override // com.avito.android.search.filter.converter.ParameterElement.m
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF262950i() {
        return this.f262959j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF250735b().hashCode();
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
    public final String getF250735b() {
        return this.f262951b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(String str, String str2, boolean z12, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str3, boolean z13, String str4, int i12, C42822w c42822w) {
        ItemWithState.State normal;
        CharSequence charSequence = null;
        Object[] objArr = 0;
        AttributedText attributedText3 = (i12 & 8) != 0 ? null : attributedText;
        if ((i12 & 16) != 0) {
            normal = new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0);
        } else {
            normal = state;
        }
        this(str, str2, z12, attributedText3, normal, (i12 & 32) != 0 ? null : attributedText2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? null : str4);
    }
}
