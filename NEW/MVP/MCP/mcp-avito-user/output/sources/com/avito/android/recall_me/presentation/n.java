package com.avito.android.recall_me.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import zi0.InterfaceC50572b;

/* compiled from: RecallMeView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/n;", "Lcom/avito/android/recall_me/presentation/l;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f252019a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f252020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f252021c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecallMeParams f252022d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final io.reactivex.rxjava3.internal.observers.y f252023e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.b f252024f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.progress_overlay.l f252025g;

    /* compiled from: RecallMeView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f252026b;

        public a(Y41.l lVar) {
            this.f252026b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f252026b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f252026b;
        }

        public final int hashCode() {
            return this.f252026b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f252026b.invoke(obj);
        }
    }

    public n(@Y61.k View view, @Y61.k q qVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k RecallMeParams recallMeParams) {
        this.f252019a = view;
        this.f252020b = jVar;
        this.f252021c = aVar;
        this.f252022d = recallMeParams;
        View viewFindViewById = view.findViewById(R.id.recall_me_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(jVar);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, null, 0, C35835l0.d(R.attr.transparentWhite, viewGroup.getContext()), 14, null);
        this.f252025g = lVar;
        lVar.f231600j = new m(qVar, this);
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        if (interfaceC22983PA == null) {
            return;
        }
        qVar.getState().observe(interfaceC22983PA, new a(new o(1, this, n.class, "handleState", "handleState(Lcom/avito/android/recall_me/presentation/architecture/RecallMeState;)V", 0)));
        this.f252023e = (io.reactivex.rxjava3.internal.observers.y) qVar.getF251886Q().t0(new l41.g() { // from class: com.avito.android.recall_me.presentation.p
            @Override // l41.g
            public final void accept(Object obj) {
                InterfaceC50572b interfaceC50572b = (InterfaceC50572b) obj;
                n nVar = this.f252027b;
                nVar.getClass();
                if (interfaceC50572b instanceof InterfaceC50572b.e) {
                    nVar.f252024f = com.avito.android.component.toast.b.b(nVar.f252019a, ((InterfaceC50572b.e) interfaceC50572b).f444189a, 0, null, 0, null, 0, null, null, null, 131070);
                    return;
                }
                if (interfaceC50572b instanceof InterfaceC50572b.d) {
                    com.avito.android.progress_overlay.l lVar2 = nVar.f252025g;
                    if (lVar2 == null) {
                        lVar2 = null;
                    }
                    lVar2.k(null);
                    return;
                }
                if (interfaceC50572b instanceof InterfaceC50572b.a) {
                    com.avito.android.progress_overlay.l lVar3 = nVar.f252025g;
                    (lVar3 != null ? lVar3 : null).j();
                }
            }
        });
    }
}
