package com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError;

import Ff.InterfaceC13798a;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WaitingForPaymentErrorBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/waitingForPaymentError/a;", "LTV0/b;", "LFf/a;", "Lcom/avito/android/autoteka/items/fullScreenError/waitingForPaymentError/WaitingForPaymentErrorItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<InterfaceC13798a, WaitingForPaymentErrorItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f96829a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<Ff.b> f96830b = new g.a<>(R.layout.autoteka_full_screen_error, C2881a.f96831l);

    /* compiled from: WaitingForPaymentErrorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LFf/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LFf/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.a$a, reason: collision with other inner class name */
    public static final class C2881a extends N implements p<ViewGroup, View, Ff.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2881a f96831l = new C2881a();

        public C2881a() {
            super(2);
        }

        @Override // Y41.p
        public final Ff.b invoke(ViewGroup viewGroup, View view) {
            return new Ff.b(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f96829a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f96829a;
    }

    @Override // TV0.b
    @k
    public final g.a<Ff.b> b() {
        return this.f96830b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof WaitingForPaymentErrorItem;
    }
}
