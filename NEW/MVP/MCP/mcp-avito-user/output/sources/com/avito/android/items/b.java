package com.avito.android.items;

import JO.i;
import JO.k;
import JO.m;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SwitcherAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: CheckBoxItem.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/items/b;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.conveyor_item.a, ItemWithState, i, ParameterElement.o, k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f173927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f173928c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f173929d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f173930e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public ItemWithState.State f173931f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f173932g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f173933h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f173934i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f173935j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f173936k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final CustomPaddings f173937l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f173938m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final SwitcherAction f173939n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f173940o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final List<m> f173941p;

    public b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, String str2, boolean z12, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str3, boolean z13, String str4, boolean z14, CustomPaddings customPaddings, boolean z15, SwitcherAction switcherAction, BaseListItem.Alignment alignment, List list, int i12, C42822w c42822w) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        AttributedText attributedText3 = (i12 & 8) != 0 ? null : attributedText;
        ItemWithState.State normal = (i12 & 16) != 0 ? new ItemWithState.State.Normal(objArr2 == true ? 1 : 0, 1 == true ? 1 : 0, objArr == true ? 1 : 0) : state;
        AttributedText attributedText4 = (i12 & 32) != 0 ? null : attributedText2;
        String str5 = (i12 & 64) != 0 ? null : str3;
        boolean z16 = (i12 & 128) != 0 ? false : z13;
        String str6 = (i12 & 256) != 0 ? null : str4;
        boolean z17 = (i12 & 512) == 0 ? z14 : true;
        CustomPaddings customPaddings2 = (i12 & 1024) != 0 ? null : customPaddings;
        boolean z18 = (i12 & 2048) == 0 ? z15 : false;
        SwitcherAction switcherAction2 = (i12 & 4096) != 0 ? null : switcherAction;
        BaseListItem.Alignment alignment2 = (i12 & 8192) == 0 ? alignment : null;
        List list2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C42784z0.f406748b : list;
        this.f173927b = str;
        this.f173928c = str2;
        this.f173929d = z12;
        this.f173930e = attributedText3;
        this.f173931f = normal;
        this.f173932g = attributedText4;
        this.f173933h = str5;
        this.f173934i = z16;
        this.f173935j = str6;
        this.f173936k = z17;
        this.f173937l = customPaddings2;
        this.f173938m = z18;
        this.f173939n = switcherAction2;
        this.f173940o = alignment2;
        this.f173941p = list2;
    }

    @Override // JO.k
    /* renamed from: M, reason: from getter */
    public final boolean getF117609n() {
        return this.f173938m;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@Y61.k ItemWithState.State state) {
        this.f173931f = state;
    }

    @Override // com.avito.android.category_parameters.ParameterElement.o
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF117598k() {
        return this.f173935j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return getF72570b().hashCode();
    }

    @Override // JO.i
    @l
    /* renamed from: getMotivation, reason: from getter */
    public final AttributedText getF117606k() {
        return this.f173932g;
    }

    @Override // com.avito.android.items.ItemWithState
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF117616j() {
        return this.f173931f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72570b() {
        return this.f173927b;
    }
}
