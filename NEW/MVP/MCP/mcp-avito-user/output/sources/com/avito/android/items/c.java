package com.avito.android.items;

import JO.i;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckBoxWithBadgeItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/items/c;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.conveyor_item.a, ItemWithState, i, ParameterElement.o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173942b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public ItemWithState.State f173943c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f173944d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f173945e;

    public c(String str, String str2, boolean z12, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str3, boolean z13, Badge badge, DeepLink deepLink, String str4, int i12, C42822w c42822w) {
        state = (i12 & 16) != 0 ? new ItemWithState.State.Normal(null, 1, null) : state;
        attributedText2 = (i12 & 32) != 0 ? null : attributedText2;
        str4 = (i12 & 1024) != 0 ? null : str4;
        this.f173942b = str;
        this.f173943c = state;
        this.f173944d = attributedText2;
        this.f173945e = str4;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@k ItemWithState.State state) {
        this.f173943c = state;
    }

    @Override // com.avito.android.category_parameters.ParameterElement.o
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF173945e() {
        return this.f173945e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return getF173942b().hashCode();
    }

    @Override // JO.i
    @l
    /* renamed from: getMotivation, reason: from getter */
    public final AttributedText getF173944d() {
        return this.f173944d;
    }

    @Override // com.avito.android.items.ItemWithState
    @k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF173943c() {
        return this.f173943c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173942b() {
        return this.f173942b;
    }
}
