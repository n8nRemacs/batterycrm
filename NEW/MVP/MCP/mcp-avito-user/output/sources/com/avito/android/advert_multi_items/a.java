package com.avito.android.advert_multi_items;

import Ra.InterfaceC15021a;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import j.U;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiItemParamViewStateHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/a;", "", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RecyclerView f85876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85877b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85878c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayoutManager f85879d;

    public a(@k RecyclerView recyclerView, @U int i12, @U int i13) {
        this.f85876a = recyclerView;
        this.f85877b = i12;
        this.f85878c = i13;
        this.f85879d = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @k
    public final AdvertDetailsMultiItemState.ParamState a() {
        LinearLayoutManager linearLayoutManager = this.f85879d;
        int iH1 = linearLayoutManager.H1();
        View viewZ = linearLayoutManager.Z(iH1);
        return new AdvertDetailsMultiItemState.ParamState(iH1, viewZ != null ? (viewZ.getLeft() - this.f85877b) - (this.f85878c / 2) : 0);
    }

    public final void b(@k List<? extends InterfaceC15021a> list, boolean z12) {
        Iterator<? extends InterfaceC15021a> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().getF85954d() == ModificationViewState.f85897c) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            LinearLayoutManager linearLayoutManager = this.f85879d;
            int iH1 = linearLayoutManager.H1();
            int iL1 = linearLayoutManager.L1();
            if (iH1 > i12 || i12 > iL1) {
                RecyclerView recyclerView = this.f85876a;
                if (z12) {
                    recyclerView.F0(i12);
                } else {
                    recyclerView.A0(i12);
                }
            }
        }
    }
}
