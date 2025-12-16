package com.avito.android.map_core.overlay;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.remote.model.Overlay;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: TopOverlayController.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/overlay/e;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "connectListener", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @k
    public View f185676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<c<Overlay>> f185677c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f185678d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f185679e = C42727D.c(new d(this));

    public e(@k BaseFragment baseFragment, @k View view, @k List list) {
        this.f185676b = view;
        this.f185677c = list;
        baseFragment.getLifecycle().a(this);
    }

    public final void a(@k Overlay overlay) {
        Object next;
        Iterator<T> it = this.f185677c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((c) next).a(), m0.f406844a.b(overlay.getClass()))) {
                break;
            }
        }
        c cVar = (c) next;
        if (cVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f185678d;
        int i12 = cVar.f185674a;
        Integer numValueOf = Integer.valueOf(i12);
        Object obj = linkedHashMap.get(numValueOf);
        Object obj2 = obj;
        if (obj == null) {
            View viewInflate = ((LayoutInflater) this.f185679e.getValue()).inflate(i12, (ViewGroup) this.f185676b.getParent(), false);
            cVar.c(viewInflate);
            linkedHashMap.put(numValueOf, viewInflate);
            obj2 = viewInflate;
        }
        View view = (View) obj2;
        cVar.b(overlay);
        if (view.equals(this.f185676b)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f185676b.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this.f185676b);
        viewGroup.removeViewInLayout(this.f185676b);
        ViewGroup.LayoutParams layoutParams = this.f185676b.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        this.f185676b = view;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    public final void connectListener() {
        this.f185678d.clear();
    }
}
