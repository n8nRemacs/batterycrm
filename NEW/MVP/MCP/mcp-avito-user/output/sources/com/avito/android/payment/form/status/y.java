package com.avito.android.payment.form.status;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.snackbar.e;
import com.avito.android.lib.design.modal.a;
import com.avito.android.payment.ModalState;
import com.avito.android.payment.form.status.A;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.N0;
import com.avito.android.util.P5;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35893e;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentStatusFormView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/status/y;", "Lcom/avito/android/payment/form/status/q;", "Lcom/avito/android/payment/b;", "Lcom/avito/android/payment/c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y implements q, com.avito.android.payment.b, com.avito.android.payment.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f214455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Toolbar f214456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f214457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214458d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214459e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f214460f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C f214461g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f214462h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final s f214463i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f214464j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C35893e<A> f214465k;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.avito.android.payment.form.status.s] */
    public y(@Y61.k View view, @Y61.k final com.avito.konveyor.adapter.j jVar, @Y61.k final com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        final int i12 = 0;
        final int i13 = 1;
        this.f214455a = view;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f214456b = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.payment_form_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f214458d = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f214459e = cVar2;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        View viewFindViewById3 = view.findViewById(R.id.payment_form_content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.payment_form_recycler, interfaceC28373a, 0, 0, 24, null);
        this.f214457c = lVar;
        lVar.f231600j = new t(this);
        com.avito.android.payment.l.a(view, recyclerView);
        this.f214461g = P5.g(toolbar);
        this.f214462h = cVar2;
        l41.g gVar = new l41.g(this) { // from class: com.avito.android.payment.form.status.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f214448c;

            {
                this.f214448c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        ModalState modalState = (ModalState) obj;
                        boolean z12 = modalState instanceof ModalState.NotifyingDialog;
                        y yVar = this.f214448c;
                        if (!z12) {
                            if (!(modalState instanceof ModalState.b)) {
                                if (!modalState.equals(ModalState.a.f213981b) && !modalState.equals(ModalState.SBOLAppLaunchError.f213979b)) {
                                    boolean z13 = modalState instanceof ModalState.SBOLResultDialog;
                                    break;
                                }
                            } else {
                                ModalState.b bVar = (ModalState.b) modalState;
                                yVar.b(bVar.f213983c, bVar.f213982b);
                                break;
                            }
                        } else {
                            N0.a(yVar.f214460f);
                            com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, yVar.f214455a.getContext(), new x(((ModalState.NotifyingDialog) modalState).f213976b, yVar));
                            yVar.f214460f = aVarC;
                            com.avito.android.lib.util.g.a(aVarC);
                            break;
                        }
                        break;
                    default:
                        A a12 = (A) obj;
                        boolean z14 = a12 instanceof A.a;
                        com.avito.android.progress_overlay.l lVar2 = this.f214448c.f214457c;
                        if (!z14) {
                            if (!(a12 instanceof A.c)) {
                                if (a12 instanceof A.b) {
                                    lVar2.a(((A.b) a12).f214397a);
                                    break;
                                }
                            } else {
                                lVar2.k(null);
                                break;
                            }
                        } else {
                            lVar2.j();
                            break;
                        }
                        break;
                }
            }
        };
        l41.g gVar2 = new l41.g() { // from class: com.avito.android.payment.form.status.r
            @Override // l41.g
            public final void accept(Object obj) {
                A a12 = (A) obj;
                V2.f318762a.d("DEBUG BUG", a12.toString());
                if (!(a12 instanceof A.a)) {
                    if (a12 instanceof A.b) {
                        return;
                    }
                    boolean z12 = a12 instanceof A.c;
                } else {
                    A.a aVar2 = (A.a) a12;
                    aVar.c(new UV0.c(aVar2.f214396b));
                    jVar.notifyDataSetChanged();
                    this.f214456b.setTitle(aVar2.f214395a);
                }
            }
        };
        this.f214463i = new l41.g(this) { // from class: com.avito.android.payment.form.status.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f214448c;

            {
                this.f214448c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        ModalState modalState = (ModalState) obj;
                        boolean z12 = modalState instanceof ModalState.NotifyingDialog;
                        y yVar = this.f214448c;
                        if (!z12) {
                            if (!(modalState instanceof ModalState.b)) {
                                if (!modalState.equals(ModalState.a.f213981b) && !modalState.equals(ModalState.SBOLAppLaunchError.f213979b)) {
                                    boolean z13 = modalState instanceof ModalState.SBOLResultDialog;
                                    break;
                                }
                            } else {
                                ModalState.b bVar = (ModalState.b) modalState;
                                yVar.b(bVar.f213983c, bVar.f213982b);
                                break;
                            }
                        } else {
                            N0.a(yVar.f214460f);
                            com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, yVar.f214455a.getContext(), new x(((ModalState.NotifyingDialog) modalState).f213976b, yVar));
                            yVar.f214460f = aVarC;
                            com.avito.android.lib.util.g.a(aVarC);
                            break;
                        }
                        break;
                    default:
                        A a12 = (A) obj;
                        boolean z14 = a12 instanceof A.a;
                        com.avito.android.progress_overlay.l lVar2 = this.f214448c.f214457c;
                        if (!z14) {
                            if (!(a12 instanceof A.c)) {
                                if (a12 instanceof A.b) {
                                    lVar2.a(((A.b) a12).f214397a);
                                    break;
                                }
                            } else {
                                lVar2.k(null);
                                break;
                            }
                        } else {
                            lVar2.j();
                            break;
                        }
                        break;
                }
            }
        };
        this.f214464j = cVar;
        C35893e<A> c35893e = new C35893e<>();
        c35893e.f319021b = C42756l.i0(new l41.g[]{gVar, gVar2});
        this.f214465k = c35893e;
    }

    @Override // com.avito.android.payment.b
    public final void a(@Y61.k String str) {
        b(null, str);
    }

    public final void b(ApiError apiError, String str) {
        e.b bVar;
        if (apiError != null) {
            bVar = new e.b(apiError);
        } else {
            e.b.f125239c.getClass();
            bVar = new e.b(null, null, 3, null);
        }
        com.avito.android.component.snackbar.h.c(this.f214455a, str, 0, bVar, null, null, null, 250);
    }
}
