package com.avito.android.autoteka.items.skeleton.report;

import Gf.InterfaceC13873a;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReportSkeletonBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/skeleton/report/a;", "LTV0/b;", "LGf/a;", "Lcom/avito/android/autoteka/items/skeleton/report/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<InterfaceC13873a, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f97023a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<Gf.b> f97024b = new g.a<>(R.layout.autoteka_report_skeleton, C2893a.f97025l);

    /* compiled from: ReportSkeletonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LGf/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LGf/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.items.skeleton.report.a$a, reason: collision with other inner class name */
    public static final class C2893a extends N implements p<ViewGroup, View, Gf.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2893a f97025l = new C2893a();

        public C2893a() {
            super(2);
        }

        @Override // Y41.p
        public final Gf.b invoke(ViewGroup viewGroup, View view) {
            return new Gf.b(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f97023a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f97023a;
    }

    @Override // TV0.b
    @k
    public final g.a<Gf.b> b() {
        return this.f97024b;
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
