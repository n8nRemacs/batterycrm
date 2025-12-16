package com.avito.android.ui.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OnBackPressedListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/fragments/d;", "Landroidx/activity/x;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f304622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f304623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(FragmentManager fragmentManager, Y41.a<G0> aVar) {
        super(true);
        this.f304622d = fragmentManager;
        this.f304623e = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.view.x
    public final void c() {
        List<Fragment> listP = this.f304622d.P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((Fragment) obj).isResumed()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof c) {
                arrayList2.add(next);
            }
        }
        c cVar = (c) C42745f0.G(arrayList2);
        if (cVar != null ? cVar.i0() : false) {
            return;
        }
        this.f304623e.invoke();
    }
}
