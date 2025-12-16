package com.avito.android.autoteka.items.fullScreenError.report;

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

/* compiled from: ReportErrorBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/report/a;", "LTV0/b;", "LFf/a;", "Lcom/avito/android/autoteka/items/fullScreenError/report/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<InterfaceC13798a, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f96803a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<Ff.b> f96804b = new g.a<>(R.layout.autoteka_full_screen_error, C2879a.f96805l);

    /* compiled from: ReportErrorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LFf/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LFf/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.items.fullScreenError.report.a$a, reason: collision with other inner class name */
    public static final class C2879a extends N implements p<ViewGroup, View, Ff.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2879a f96805l = new C2879a();

        public C2879a() {
            super(2);
        }

        @Override // Y41.p
        public final Ff.b invoke(ViewGroup viewGroup, View view) {
            return new Ff.b(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f96803a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f96803a;
    }

    @Override // TV0.b
    @k
    public final g.a<Ff.b> b() {
        return this.f96804b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
