package com.avito.android.lib.util;

import android.view.View;
import androidx.core.view.G0;
import androidx.core.view.J0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/k;", "Landroidx/core/view/G0$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends G0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f181403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f181404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(View view, Y41.l<? super Integer, kotlin.G0> lVar) {
        super(0);
        this.f181403d = view;
        this.f181404e = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.core.view.G0.b
    public final void b(@Y61.k G0 g02) {
        i.f181373a.getClass();
        View view = this.f181403d;
        if (i.b(view) != i.e(view)) {
            int iE2 = i.e(view);
            kotlin.reflect.n<Object> nVar = i.f181374b[2];
            view.setTag(i.f181380h.f181381b, Integer.valueOf(iE2));
            this.f181404e.invoke(Integer.valueOf(Math.max(i.c(view), i.e(view))));
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.core.view.G0.b
    @Y61.k
    public final J0 d(@Y61.k J0 j02, @Y61.k List<G0> list) {
        Integer num;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(j02.e(((G0) it.next()).c()).f44778d);
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(j02.e(((G0) it.next()).c()).f44778d);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            i.f181373a.getClass();
            kotlin.reflect.n<Object> nVar = i.f181374b[2];
            int i12 = i.f181380h.f181381b;
            View view = this.f181403d;
            view.setTag(i12, num);
            this.f181404e.invoke(Integer.valueOf(Math.max(i.c(view), i.b(view))));
        }
        return j02;
    }
}
