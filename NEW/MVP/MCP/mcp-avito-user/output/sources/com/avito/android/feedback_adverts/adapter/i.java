package com.avito.android.feedback_adverts.adapter;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ok0.InterfaceC44788a;

/* compiled from: PaginationLoadingBluePrint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/feedback_adverts/adapter/i;", "LTV0/b;", "LTV0/e;", "Lok0/a$b;", "<init>", "()V", "a", "b", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements TV0.b<TV0.e, InterfaceC44788a.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f157771a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<b> f157772b = new g.a<>(R.layout.feedback_advert_pagination_item, c.f157773l);

    /* compiled from: PaginationLoadingBluePrint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/adapter/i$a;", "LTV0/d;", "LTV0/e;", "Lok0/a$b;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TV0.d<TV0.e, InterfaceC44788a.b> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: PaginationLoadingBluePrint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/adapter/i$b;", "Lcom/avito/konveyor/adapter/b;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b {
    }

    /* compiled from: PaginationLoadingBluePrint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/feedback_adverts/adapter/i$b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/feedback_adverts/adapter/i$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f157773l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b(view);
        }
    }

    @Inject
    public i() {
    }

    @Override // TV0.b
    @k
    public final TV0.d<TV0.e, InterfaceC44788a.b> a() {
        return this.f157771a;
    }

    @Override // TV0.b
    @k
    public final g.a<b> b() {
        return this.f157772b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof InterfaceC44788a.b;
    }
}
