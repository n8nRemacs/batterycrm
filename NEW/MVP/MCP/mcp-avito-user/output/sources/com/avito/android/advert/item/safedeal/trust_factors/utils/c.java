package com.avito.android.advert.item.safedeal.trust_factors.utils;

import Y41.p;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsViewHolders.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TrustFactorsViewHolders.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/konveyor/adapter/b;", "T", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> extends N implements p<ViewGroup, View, T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f79250l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super ViewGroup, ? super View, ? super i, ? extends T> qVar) {
            super(2);
            this.f79250l = (N) qVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final Object invoke(ViewGroup viewGroup, View view) {
            ViewGroup viewGroup2 = viewGroup;
            View view2 = view;
            RecyclerView recyclerView = viewGroup2 instanceof RecyclerView ? (RecyclerView) viewGroup2 : null;
            return (com.avito.konveyor.adapter.b) this.f79250l.invoke(viewGroup2, view2, recyclerView != null ? new i(recyclerView, view2, 0, 0, null, null, 0, 124, null) : null);
        }
    }

    @k
    public static final <T extends com.avito.konveyor.adapter.b> p<ViewGroup, View, T> a(@k q<? super ViewGroup, ? super View, ? super i, ? extends T> qVar) {
        return new a(qVar);
    }
}
