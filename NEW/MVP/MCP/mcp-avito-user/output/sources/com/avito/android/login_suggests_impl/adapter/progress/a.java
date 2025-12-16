package com.avito.android.login_suggests_impl.adapter.progress;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgressItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/progress/a;", "LTV0/b;", "Lcom/avito/android/login_suggests_impl/adapter/progress/d;", "Lcom/avito/android/login_suggests_impl/adapter/progress/ProgressItem;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<d, ProgressItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f182875a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f182876b = new g.a<>(R.layout.login_suggests_loading, C5356a.f182877l);

    /* compiled from: ProgressItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/login_suggests_impl/adapter/progress/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/login_suggests_impl/adapter/progress/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.login_suggests_impl.adapter.progress.a$a, reason: collision with other inner class name */
    public static final class C5356a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5356a f182877l = new C5356a();

        public C5356a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    public a(@k b bVar) {
        this.f182875a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f182875a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f182876b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProgressItem;
    }
}
