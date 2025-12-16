package com.avito.android.serp.adapter.reformulations;

import android.os.Bundle;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.p1;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;
import zr0.C50618a;
import zr0.C50619b;

/* compiled from: ReformulationsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/n;", "Lcom/avito/android/serp/adapter/reformulations/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f270637b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final SearchParams f270638c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p1 f270639d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f270640e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270641f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Bundle f270642g;

    /* compiled from: ReformulationsItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/reformulations/ReformulationElement;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<ReformulationElement, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f270643l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(ReformulationElement reformulationElement) {
            return reformulationElement.f270620b;
        }
    }

    @Inject
    public n(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.l SearchParams searchParams, @Y61.k p1 p1Var, @Y61.k u uVar, @Y61.k h31.e<InterfaceC47690b> eVar, @Ar0.b @Y61.l Bundle bundle) {
        this.f270637b = interfaceC28373a;
        this.f270638c = searchParams;
        this.f270639d = p1Var;
        this.f270640e = uVar;
        this.f270641f = eVar;
        this.f270642g = bundle == null ? new Bundle() : bundle;
    }

    @Override // com.avito.android.serp.adapter.reformulations.a
    public final void O(@Y61.k q qVar, @Y61.k List<ReformulationElement> list) {
        this.f270642g.putBoolean(G.f("REFORMULATIONS_MORE_CLICKED_KEY", qVar.NT()), true);
        qVar.G10(list, false);
        SearchParams searchParams = this.f270638c;
        String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
        this.f270639d.getClass();
        C50618a c50618a = new C50618a(categoryId, null, "Ещё");
        InterfaceC28373a interfaceC28373a = this.f270637b;
        interfaceC28373a.c(c50618a);
        interfaceC28373a.c(new C50619b(searchParams != null ? searchParams.getCategoryId() : null, null, list.size(), C42745f0.O(list, ";", null, null, a.f270643l, 30)));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        ReformulationsItem reformulationsItem = (ReformulationsItem) aVar;
        StringBuilder sb2 = new StringBuilder("REFORMULATIONS_MORE_CLICKED_KEY");
        String str = reformulationsItem.f270623c;
        sb2.append(str);
        boolean z12 = this.f270642g.getBoolean(sb2.toString(), false);
        io.reactivex.rxjava3.disposables.d dVarV0 = qVar.V1().v0(new l(this, qVar), m.f270636b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        qVar.X5(this.f270640e.getWidth());
        qVar.Px(str);
        qVar.hy(reformulationsItem.f270625e);
        qVar.G10(reformulationsItem.f270624d, !z12);
        qVar.d(new k((y) dVarV0));
    }

    @Override // com.avito.android.serp.adapter.reformulations.j
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Bundle getF270642g() {
        return this.f270642g;
    }

    @Override // com.avito.android.serp.adapter.reformulations.a
    public final void k(@Y61.k DeepLink deepLink, @Y61.k String str) {
        SearchParams searchParams = this.f270638c;
        String categoryId = searchParams != null ? searchParams.getCategoryId() : null;
        this.f270639d.getClass();
        this.f270637b.c(new C50618a(categoryId, null, str));
        InterfaceC47691c.a.b(this.f270641f.get(), deepLink, 6);
    }
}
