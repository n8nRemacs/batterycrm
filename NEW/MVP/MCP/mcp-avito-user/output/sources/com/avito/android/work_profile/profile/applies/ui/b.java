package com.avito.android.work_profile.profile.applies.ui;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.progress_overlay.l;
import jQ0.AbstractC42297a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: AppliesToVacancyFragmentView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/b;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f330925a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f330926b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f330927c;

    /* compiled from: AppliesToVacancyFragmentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<AbstractC42297a, G0> f330928b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super AbstractC42297a, G0> lVar) {
            this.f330928b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f330928b.invoke(AbstractC42297a.c.f405607a);
        }
    }

    /* compiled from: AppliesToVacancyFragmentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.work_profile.profile.applies.ui.b$b, reason: collision with other inner class name */
    public static final class C10281b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<AbstractC42297a, G0> f330929b;

        /* JADX WARN: Multi-variable type inference failed */
        public C10281b(Y41.l<? super AbstractC42297a, G0> lVar) {
            this.f330929b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f330929b.invoke(AbstractC42297a.b.f405606a);
        }
    }

    public b(@k Y41.l lVar, @k View view, @k com.avito.konveyor.adapter.d dVar) {
        this.f330925a = dVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        l lVar2 = new l((ViewGroup) viewFindViewById2, 0, null, 0, 0, 30, null);
        this.f330926b = lVar2;
        View viewFindViewById3 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById3;
        this.f330927c = swipeRefreshLayout;
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
        recyclerView.l(new d(), -1);
        cVar.b(com.jakewharton.rxbinding4.swiperefreshlayout.b.a(swipeRefreshLayout).t0(new a(lVar)));
        cVar.b(lVar2.e().t0(new C10281b(lVar)));
    }
}
