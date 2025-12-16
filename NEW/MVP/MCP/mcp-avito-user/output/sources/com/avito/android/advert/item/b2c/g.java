package com.avito.android.advert.item.b2c;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.advert_core.safedeal.v;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsB2CBottomView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/b2c/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/b2c/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f73201b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final v f73202c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public List<? extends SafeDeal.Component> f73203d;

    public g(@k ViewGroup viewGroup, @k v vVar) {
        super(viewGroup);
        this.f73201b = viewGroup;
        this.f73202c = vVar;
        this.f73203d = C42784z0.f406748b;
    }

    @Override // com.avito.android.advert.item.b2c.f
    public final void Vk(@k List<? extends SafeDeal.Component> list, @k com.avito.android.advert_core.safedeal.a aVar) {
        View viewB;
        Object next;
        if (list.equals(this.f73203d)) {
            return;
        }
        ViewGroup viewGroup = this.f73201b;
        viewGroup.removeAllViews();
        this.f73203d = list;
        for (SafeDeal.Component component : list) {
            Iterator<T> it = this.f73202c.f84281a.iterator();
            while (true) {
                viewB = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (((u) next).a(component)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            u uVar = (u) next;
            if (uVar != null) {
                viewB = uVar.b(viewGroup, component, aVar);
            }
            viewGroup.addView(viewB);
        }
    }
}
