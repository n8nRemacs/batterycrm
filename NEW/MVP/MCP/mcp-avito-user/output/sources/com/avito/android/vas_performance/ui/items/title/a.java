package com.avito.android.vas_performance.ui.items.title;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPerformanceTitleBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/title/a;", "LTV0/b;", "Lcom/avito/android/vas_performance/ui/items/title/c;", "Lcom/avito/android/vas_performance/ui/items/title/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<c, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f321782a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<d> f321783b = new g.a<>(R.layout.vas_performance_title_item, C9955a.f321784l);

    /* compiled from: VasPerformanceTitleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/vas_performance/ui/items/title/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/vas_performance/ui/items/title/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.vas_performance.ui.items.title.a$a, reason: collision with other inner class name */
    public static final class C9955a extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9955a f321784l = new C9955a();

        public C9955a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    public a(@k e eVar) {
        this.f321782a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f321782a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f321783b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
