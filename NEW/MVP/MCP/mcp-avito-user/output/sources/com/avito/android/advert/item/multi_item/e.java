package com.avito.android.advert.item.multi_item;

import Sa.InterfaceC15166a;
import Y61.l;
import android.view.View;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f77729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f77730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsMultiItemState.ParamsItemState f77731d;

    public e(View view, f fVar, AdvertDetailsMultiItemState.ParamsItemState paramsItemState) {
        this.f77729b = view;
        this.f77730c = fVar;
        this.f77731d = paramsItemState;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Object objP;
        f fVar = this.f77730c;
        List list = fVar.f77736f;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        int size = list.size();
        for (int i22 = 0; i22 < size; i22++) {
            AdvertDetailsMultiItemState.ParamState paramState = (AdvertDetailsMultiItemState.ParamState) C42745f0.K(i22, this.f77731d.f85873b);
            if (paramState != null && (objP = fVar.f77733c.P(i22)) != null) {
                InterfaceC15166a interfaceC15166a = objP instanceof InterfaceC15166a ? (InterfaceC15166a) objP : null;
                if (interfaceC15166a != null) {
                    interfaceC15166a.Zp(paramState);
                }
            }
        }
        this.f77729b.removeOnLayoutChangeListener(this);
    }
}
