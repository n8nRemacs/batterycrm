package com.avito.android.recall_me.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29390c;
import com.avito.android.di.C29972i;
import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import zi0.InterfaceC50571a;
import zi0.InterfaceC50572b;

/* compiled from: RecallMeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recall_me/presentation/RecallMeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public q f251901n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f251902o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC29390c f251903p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f251904q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f251905r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public n f251906s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f251907t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<InterfaceC50572b.C12968b> f251908u0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f251900w0 = {m0.f406844a.e(new Y(RecallMeFragment.class, "openParams", "getOpenParams()Lcom/avito/android/recall_me/presentation/RecallMeParams;", 0))};

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f251899v0 = new a(null);

    /* compiled from: RecallMeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/RecallMeFragment$a;", "", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public RecallMeFragment() {
        super(0, 1, null);
        this.f251907t0 = new C35968w3(this);
        this.f251908u0 = registerForActivityResult(new C34236f(this), new L91.o(this, 26));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.recall_me_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        n nVar = this.f251906s0;
        if (nVar != null) {
            io.reactivex.rxjava3.internal.observers.y yVar = nVar.f252023e;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            com.avito.android.lib.design.toast_bar.b bVar = nVar.f252024f;
            if (bVar != null) {
                bVar.a();
            }
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f251905r0;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q qVar = this.f251901n0;
        if (qVar == null) {
            qVar = null;
        }
        RecallMeFormState recallMeFormStateH = qVar.H();
        if (recallMeFormStateH != null) {
            bundle.putParcelable("recall_me_form_state", recallMeFormStateH);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        q qVar = this.f251901n0;
        q qVar2 = qVar != null ? qVar : null;
        com.avito.konveyor.adapter.j jVar = this.f251902o0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f251904q0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        kotlin.reflect.n<Object>[] nVarArr = f251900w0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f251907t0;
        this.f251906s0 = new n(view, qVar2, jVar2, aVar2, (RecallMeParams) c35968w3.getValue(this, nVar));
        q qVar3 = this.f251901n0;
        if (qVar3 == null) {
            qVar3 = null;
        }
        qVar3.m1().accept(new InterfaceC50571a.C12967a((RecallMeParams) c35968w3.getValue(this, nVarArr[0]), bundle != null ? (RecallMeFormState) bundle.getParcelable("recall_me_form_state") : null));
        q qVar4 = this.f251901n0;
        this.f251905r0 = (io.reactivex.rxjava3.internal.observers.y) (qVar4 != null ? qVar4 : null).N9().t0(new C34237g(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.recall_me.di.a.a().a((RecallMeParams) this.f251907t0.getValue(this, f251900w0[0]), getF42820b(), getResources(), (com.avito.android.recall_me.di.e) C29972i.a(C29972i.b(this), com.avito.android.recall_me.di.e.class), cv.c.b(this)).a(this);
    }
}
