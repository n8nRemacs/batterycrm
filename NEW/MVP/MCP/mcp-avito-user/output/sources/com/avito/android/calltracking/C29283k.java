package com.avito.android.calltracking;

import Rh.C15041a;
import androidx.view.InterfaceC23040h0;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: CalltrackingBottomSheetViewPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/k;", "Lcom/avito/android/calltracking/g;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29283k implements InterfaceC29279g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29278f f113743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29287o f113744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f113745c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<I> f113746d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking.item.j f113747e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f113748f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f113749g;

    /* compiled from: CalltrackingBottomSheetViewPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.calltracking.k$a */
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f113750b;

        public a(Y41.l lVar) {
            this.f113750b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f113750b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f113750b;
        }

        public final int hashCode() {
            return this.f113750b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113750b.invoke(obj);
        }
    }

    @Inject
    public C29283k(@Y61.k InterfaceC29278f interfaceC29278f, @Y61.k InterfaceC29287o interfaceC29287o, @Y61.k com.avito.android.util.text.a aVar, @Y61.k l41.g<I> gVar, @Y61.k com.avito.android.calltracking.item.j jVar) {
        this.f113743a = interfaceC29278f;
        this.f113744b = interfaceC29287o;
        this.f113745c = aVar;
        this.f113746d = gVar;
        this.f113747e = jVar;
    }

    @Override // com.avito.android.calltracking.InterfaceC29279g
    public final void a(@Y61.k C29277e c29277e, @Y61.k CalltrackingResponse calltrackingResponse, @Y61.k com.avito.android.calltracking.item.e eVar) {
        this.f113743a.getF113625d0().observe(this.f113744b.b(), new a(new C29280h(c29277e)));
        c29277e.f113711d.setText(calltrackingResponse.getCallWarningHeader());
        calltrackingResponse.getCallWarningText().setOnDeepLinkClickListener(new C15041a(this, 23));
        I5.a(c29277e.f113712e, this.f113745c.c(c29277e.f113709b.getContext(), calltrackingResponse.getCallWarningText()), false);
        this.f113749g = new C29281i(calltrackingResponse);
        this.f113747e.k(c29277e, eVar);
        c29277e.c(null);
        c29277e.sr(false);
        com.jakewharton.rxrelay3.c<G0> cVar = c29277e.f113714g;
        this.f113748f = (io.reactivex.rxjava3.internal.observers.y) com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new C29282j(this, eVar));
    }

    @Override // com.avito.android.calltracking.InterfaceC29279g
    public final void clear() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f113748f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f113748f = null;
        Y41.a<G0> aVar = this.f113749g;
        if (aVar != null) {
            ((C29281i) aVar).invoke();
        }
        this.f113749g = null;
        this.f113743a.getF113625d0().removeObservers(this.f113744b.b());
    }
}
