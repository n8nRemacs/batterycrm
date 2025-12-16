package com.avito.android.beduin.ui.screen.fragment.tab;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23487e;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.action.BeduinSelectComponentAction;
import com.avito.android.beduin.common.actionhandler.C28739c;
import com.avito.android.beduin.common.actionhandler.U0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin_shared.model.utils.h;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.y6;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lj.InterfaceC43779a;
import md.InterfaceC44055a;
import qK0.C47312b;

/* compiled from: BeduinTabFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/BeduinTabFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/tab/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinTabFragment extends BaseFragment implements com.avito.android.beduin.ui.screen.fragment.tab.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f104277A0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final a f104278z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC40691b f104279n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f104280o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<RecyclerView> f104281p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final C41981q0 f104282q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f104283r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C41981q0 f104284s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f104285t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C35968w3 f104286u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47312b f104287v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47312b f104288w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47312b f104289x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f104290y0;

    /* compiled from: BeduinTabFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/BeduinTabFragment$a;", "", "<init>", "()V", "", "ARG_PADDING", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinTabFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(BeduinTabFragment.this.requireArguments().getInt("arg_padding"));
        }
    }

    /* compiled from: BeduinTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/U0$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/actionhandler/U0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            BeduinTabFragment.this.f104283r0.accept(((U0.a) obj).f100137a);
        }
    }

    static {
        Y y12 = new Y(BeduinTabFragment.class, "openParams", "getOpenParams()Lcom/avito/android/beduin/ui/screen/fragment/tab/BeduinTabOpenParams;", 0);
        n0 n0Var = m0.f406844a;
        f104277A0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BeduinTabFragment.class, "topRecycler", "getTopRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BeduinTabFragment.class, "mainRecycler", "getMainRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BeduinTabFragment.class, "bottomRecycler", "getBottomRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f104278z0 = new a(null);
    }

    public BeduinTabFragment() {
        super(R.layout.beduin_tab_fragment);
        com.jakewharton.rxrelay3.c<RecyclerView> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f104281p0 = cVar;
        this.f104282q0 = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f104283r0 = cVar2;
        this.f104284s0 = new C41981q0(cVar2);
        this.f104285t0 = C42727D.c(new b());
        this.f104286u0 = new C35968w3(this);
        this.f104287v0 = new C47312b(null, 1, null);
        this.f104288w0 = new C47312b(null, 1, null);
        this.f104289x0 = new C47312b(null, 1, null);
        this.f104290y0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tab.a
    @l
    public final RecyclerView B0(@k String str) {
        boolean zEquals = str.equals(s5().f104293b);
        n<Object>[] nVarArr = f104277A0;
        if (zEquals) {
            n<Object> nVar = nVarArr[1];
            return (RecyclerView) this.f104287v0.a();
        }
        if (str.equals(s5().f104294c)) {
            return r5();
        }
        if (!str.equals(s5().f104295d)) {
            return null;
        }
        n<Object> nVar2 = nVarArr[3];
        return (RecyclerView) this.f104289x0.a();
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tab.a
    @k
    public final String m0() {
        String str = s5().f104294c;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        com.avito.android.beduin.di.screen.b bVar;
        super.onAttach(context);
        InterfaceC23487e parentFragment = getParentFragment();
        InterfaceC44055a interfaceC44055a = parentFragment instanceof InterfaceC44055a ? (InterfaceC44055a) parentFragment : null;
        if (interfaceC44055a == null || (bVar = (com.avito.android.beduin.di.screen.b) interfaceC44055a.r0()) == null) {
            throw new IllegalStateException("Containing fragment must provide BeduinScreenFragmentComponent");
        }
        bVar.e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f104290y0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_top_list);
        n<Object>[] nVarArr = f104277A0;
        n<Object> nVar = nVarArr[1];
        C47312b c47312b = this.f104287v0;
        c47312b.b(this, recyclerView);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.beduin_main_list);
        n<Object> nVar2 = nVarArr[2];
        this.f104288w0.b(this, recyclerView2);
        RecyclerView recyclerViewR5 = r5();
        recyclerViewR5.setPadding(recyclerViewR5.getPaddingLeft(), recyclerViewR5.getPaddingTop(), recyclerViewR5.getPaddingRight(), ((Number) this.f104285t0.getValue()).intValue());
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.beduin_bottom_list);
        n<Object> nVar3 = nVarArr[3];
        C47312b c47312b2 = this.f104289x0;
        c47312b2.b(this, recyclerView3);
        r5().setItemAnimator(null);
        String str = s5().f104295d;
        io.reactivex.rxjava3.disposables.c cVar = this.f104290y0;
        if (str != null) {
            InterfaceC40691b interfaceC40691b = this.f104279n0;
            if (interfaceC40691b == null) {
                interfaceC40691b = null;
            }
            InterfaceC43779a interfaceC43779a = interfaceC40691b.getF103565k().get(str);
            if (interfaceC43779a != null) {
                com.avito.android.beduin.common.component.adapter.a aVarQ5 = q5();
                C41981q0 f103348p = interfaceC43779a.getF103348p();
                InterfaceC35745a5 interfaceC35745a5 = this.f104280o0;
                if (interfaceC35745a5 == null) {
                    interfaceC35745a5 = null;
                }
                cVar.b(f103348p.j0(interfaceC35745a5.e()).t0(new d(aVarQ5, this)));
                n<Object> nVar4 = nVarArr[3];
                h.b((RecyclerView) c47312b2.a(), aVarQ5);
            }
        }
        n<Object> nVar5 = nVarArr[1];
        t5((RecyclerView) c47312b.a(), q5(), s5().f104293b, null);
        com.avito.android.beduin.common.component.adapter.a aVarQ52 = q5();
        t5(r5(), aVarQ52, s5().f104294c, new com.avito.android.beduin.common.component.adapter.f(aVarQ52));
        this.f104281p0.accept(r5());
        InterfaceC40691b interfaceC40691b2 = this.f104279n0;
        cVar.b(((U0) ((C28739c) (interfaceC40691b2 != null ? interfaceC40691b2 : null).f()).f100181a.get(BeduinSelectComponentAction.class)).f100136b.t0(new c()));
    }

    public final com.avito.android.beduin.common.component.adapter.a q5() {
        Integer numValueOf;
        if (s5().f104296e == BeduinComponentTheme.AVITO_RE_23) {
            Context context = getContext();
            numValueOf = context != null ? Integer.valueOf(C35835l0.f(R.attr.horizontalOffset, context)) : null;
        } else {
            numValueOf = Integer.valueOf(y6.b(24));
        }
        return new com.avito.android.beduin.common.component.adapter.a(numValueOf);
    }

    public final RecyclerView r5() {
        n<Object> nVar = f104277A0[2];
        return (RecyclerView) this.f104288w0.a();
    }

    public final BeduinTabOpenParams s5() {
        return (BeduinTabOpenParams) this.f104286u0.getValue(this, f104277A0[0]);
    }

    public final void t5(RecyclerView recyclerView, com.avito.android.beduin.common.component.adapter.a aVar, String str, com.avito.android.beduin.common.component.adapter.f fVar) {
        if (str == null) {
            return;
        }
        InterfaceC40691b interfaceC40691b = this.f104279n0;
        if (interfaceC40691b == null) {
            interfaceC40691b = null;
        }
        InterfaceC43779a interfaceC43779a = interfaceC40691b.getF103565k().get(str);
        if (interfaceC43779a == null) {
            return;
        }
        com.avito.android.beduin_shared.model.utils.l.a(interfaceC43779a.getF103348p(), aVar, this.f104290y0);
        if (fVar != null) {
            recyclerView.o(fVar);
        }
        h.b(recyclerView, aVar);
    }
}
