package com.avito.android.payment.form;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.payment.form.P;
import com.avito.android.util.P5;
import com.avito.android.util.RunnableC35941s4;
import com.avito.android.util.rx3.C35893e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentGenericFormView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/J;", "Lcom/avito/android/payment/form/G;", "Lcom/avito/android/payment/b;", "a", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class J implements G, com.avito.android.payment.b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f214324i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f214325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Toolbar f214326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f214327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f214328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214329e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C f214330f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f214331g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C35893e<P> f214332h;

    /* compiled from: PaymentGenericFormView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/payment/form/J$a;", "", "<init>", "()V", "", "SNACKBAR_MAXLINES", "I", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public J(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        final int i12 = 0;
        final int i13 = 1;
        this.f214325a = view;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f214326b = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.payment_form_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f214328d = recyclerView;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f214329e = cVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(new ru.avito.component.animator.k(false, 1, null));
        View viewFindViewById3 = view.findViewById(R.id.payment_form_content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.payment_form_recycler, interfaceC28373a, 0, 0, 24, null);
        this.f214327c = lVar;
        lVar.f231600j = new I(this);
        com.avito.android.payment.l.a(view, recyclerView);
        this.f214330f = P5.g(toolbar);
        this.f214331g = cVar;
        l41.g[] gVarArr = {new l41.g(this) { // from class: com.avito.android.payment.form.H

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f214322c;

            {
                this.f214322c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                J j12 = this.f214322c;
                P p12 = (P) obj;
                switch (i13) {
                    case 0:
                        int i14 = J.f214324i;
                        if (!(p12 instanceof P.a)) {
                            if (!(p12 instanceof P.b)) {
                                boolean z12 = p12 instanceof P.c;
                                break;
                            }
                        } else {
                            P.a aVar = (P.a) p12;
                            j12.f214326b.setTitle(aVar.f214336a);
                            if (aVar.f214338c) {
                                K k12 = K.f214333l;
                                RecyclerView recyclerView2 = j12.f214328d;
                                recyclerView2.postDelayed(new RunnableC35941s4(recyclerView2, k12), 100L);
                                break;
                            }
                        }
                        break;
                    default:
                        int i15 = J.f214324i;
                        boolean z13 = p12 instanceof P.a;
                        com.avito.android.progress_overlay.l lVar2 = j12.f214327c;
                        if (!z13) {
                            if (!(p12 instanceof P.c)) {
                                if (p12 instanceof P.b) {
                                    lVar2.a(((P.b) p12).f214339a);
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
        }, new l41.g(this) { // from class: com.avito.android.payment.form.H

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f214322c;

            {
                this.f214322c = this;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                J j12 = this.f214322c;
                P p12 = (P) obj;
                switch (i12) {
                    case 0:
                        int i14 = J.f214324i;
                        if (!(p12 instanceof P.a)) {
                            if (!(p12 instanceof P.b)) {
                                boolean z12 = p12 instanceof P.c;
                                break;
                            }
                        } else {
                            P.a aVar = (P.a) p12;
                            j12.f214326b.setTitle(aVar.f214336a);
                            if (aVar.f214338c) {
                                K k12 = K.f214333l;
                                RecyclerView recyclerView2 = j12.f214328d;
                                recyclerView2.postDelayed(new RunnableC35941s4(recyclerView2, k12), 100L);
                                break;
                            }
                        }
                        break;
                    default:
                        int i15 = J.f214324i;
                        boolean z13 = p12 instanceof P.a;
                        com.avito.android.progress_overlay.l lVar2 = j12.f214327c;
                        if (!z13) {
                            if (!(p12 instanceof P.c)) {
                                if (p12 instanceof P.b) {
                                    lVar2.a(((P.b) p12).f214339a);
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
        }};
        C35893e<P> c35893e = new C35893e<>();
        c35893e.f319021b = C42756l.i0(gVarArr);
        this.f214332h = c35893e;
    }

    @Override // com.avito.android.payment.b
    public final void a(@Y61.k String str) {
        com.avito.android.component.snackbar.h.c(this.f214325a, str, 0, null, null, null, null, 238);
    }
}
