package one.me.startconversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a84;
import defpackage.a93;
import defpackage.abf;
import defpackage.api;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b0i;
import defpackage.b14;
import defpackage.bbd;
import defpackage.bbf;
import defpackage.bwf;
import defpackage.cbf;
import defpackage.cm6;
import defpackage.cv6;
import defpackage.dbf;
import defpackage.dv6;
import defpackage.ebf;
import defpackage.ec6;
import defpackage.em6;
import defpackage.eo7;
import defpackage.fb6;
import defpackage.fbb;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hs;
import defpackage.is7;
import defpackage.ji0;
import defpackage.jva;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kbf;
import defpackage.kd5;
import defpackage.kt3;
import defpackage.l38;
import defpackage.lfb;
import defpackage.lzf;
import defpackage.mvd;
import defpackage.nbf;
import defpackage.ndb;
import defpackage.nte;
import defpackage.odb;
import defpackage.okf;
import defpackage.paf;
import defpackage.prd;
import defpackage.px3;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq7;
import defpackage.qsb;
import defpackage.r40;
import defpackage.r5j;
import defpackage.rb;
import defpackage.rsb;
import defpackage.s14;
import defpackage.s2i;
import defpackage.svi;
import defpackage.tfb;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tx3;
import defpackage.u45;
import defpackage.uaf;
import defpackage.uq7;
import defpackage.usd;
import defpackage.v1a;
import defpackage.vaf;
import defpackage.vdc;
import defpackage.vid;
import defpackage.wrb;
import defpackage.xaf;
import defpackage.xfh;
import defpackage.y71;
import defpackage.y9b;
import defpackage.yaf;
import defpackage.yfb;
import defpackage.ym3;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z44;
import defpackage.z7;
import defpackage.z8a;
import defpackage.z8e;
import defpackage.zaf;
import defpackage.zh0;
import defpackage.zm3;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Lpx3;", "Lcv6;", "Lb14;", "Ls14;", "", "Luq7;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StartConversationScreen extends Widget implements px3, cv6, b14, s14, uq7 {
    public static final /* synthetic */ yy7[] H0 = {new z8a(StartConversationScreen.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), u45.h(vid.a, StartConversationScreen.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new z8a(StartConversationScreen.class, "isInSearch", "isInSearch()Z"), new toc(StartConversationScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(StartConversationScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final ji0 A0;
    public final b0i B0;
    public final ji0 C0;
    public final ji0 D0;
    public final zm3 E0;
    public final kd5 F0;
    public final z44 G0;
    public final k18 X;
    public final bwf Y;
    public final k18 Z;
    public final ka5 a;
    public final eo7 b;
    public final hs c;
    public final hs d;
    public final hs o;
    public final k18 s0;
    public final bbd t0;
    public final bbd u0;
    public final k18 v0;
    public final ExecutorService w0;
    public final fb6 x0;
    public final ji0 y0;
    public final b0i z0;

    /* JADX WARN: Multi-variable type inference failed */
    public StartConversationScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new nte(11), (cm6) null, 6);
        this.b = eo7.f;
        Boolean bool = Boolean.FALSE;
        this.c = new hs(Boolean.class, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.d = new hs(CharSequence.class, null, "start_conversations_widget_search_query");
        hs hsVar = new hs(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.o = hsVar;
        paf pafVar = paf.a;
        this.X = pafVar.getAccessor().d(487);
        this.Y = new bwf(new nte(13));
        this.Z = createViewModelLazy(nbf.class, new vdc(24, new nte(14)));
        this.s0 = createViewModelLazy(zh0.class, new vdc(25, new nte(15)));
        this.t0 = viewBinding(ndb.o);
        this.u0 = viewBinding(ndb.q);
        this.v0 = rsb.a.a();
        ExecutorService executorServiceA = ((g4b) pafVar.getAccessor().c(56)).a();
        this.w0 = executorServiceA;
        int i = 2;
        fb6 fb6Var = new fb6(this, executorServiceA, i);
        this.x0 = fb6Var;
        ji0 ji0Var = new ji0((b14) this, executorServiceA);
        this.y0 = ji0Var;
        b0i b0iVar = new b0i(this, executorServiceA, i);
        this.z0 = b0iVar;
        ji0 ji0Var2 = new ji0((cv6) this, executorServiceA);
        this.A0 = ji0Var2;
        b0i b0iVar2 = new b0i(this, executorServiceA, i);
        this.B0 = b0iVar2;
        ji0 ji0Var3 = new ji0((uq7) this, executorServiceA);
        this.C0 = ji0Var3;
        ji0 ji0Var4 = new ji0((s14) this, executorServiceA);
        this.D0 = ji0Var4;
        this.E0 = new zm3(new ym3(false, 1), fb6Var, ji0Var3, ji0Var, b0iVar, ji0Var2, b0iVar2, ji0Var4);
        this.F0 = new kd5(7, new prd(19, this));
        yy7 yy7Var = H0[2];
        this.G0 = new z44(this, ((Boolean) hsVar.a(this)).booleanValue());
        gw0.w(new g56(z0().w0.i, new yaf(null, this), 1), getLifecycleScope());
        gw0.w(new g56(z0().y0, new zaf(null, this), 1), getLifecycleScope());
    }

    @Override // defpackage.b14
    public final void A(int i) {
        if (abf.$EnumSwitchMapping$0[az1.v(i)] != 1) {
            x();
            return;
        }
        s2i s2iVar = new s2i(this, 1);
        k18 k18Var = this.v0;
        if (((qsb) k18Var.getValue()).d()) {
            return;
        }
        ((qsb) k18Var.getValue()).h(s2iVar, true);
    }

    @Override // defpackage.uq7
    public final void D(qq7 qq7Var) {
        int iOrdinal = qq7Var.ordinal();
        if (iOrdinal == 0) {
            uaf.c.p0().b(":invite/phone", null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((is7) this.X.getValue()).a("click_link", "main", "invite_friends");
            z0().t();
        }
    }

    @Override // defpackage.cv6
    public final void L(dv6 dv6Var) {
        api.c(this);
        svi.e(getViewLifecycleScope(), null, null, new cbf(this, dv6Var, null), 3);
    }

    @Override // defpackage.s14
    public final void W() {
        x();
    }

    @Override // defpackage.px3
    public final void d(long j) {
        z0().t();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getC() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        jva onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), this.G0);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(ndb.m);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setId(ndb.q);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle(odb.f);
        final int i = 0;
        yfbVar.setLeftActions(new gfb(new em6(this) { // from class: waf
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                int i2 = i;
                StartConversationScreen startConversationScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = StartConversationScreen.H0;
                        jva onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return qqg.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iJ = startConversationScreen.C0.j() + startConversationScreen.x0.j();
                        int iJ2 = startConversationScreen.y0.j() + iJ;
                        b0i b0iVar = startConversationScreen.z0;
                        int iJ3 = b0iVar.j() + iJ2;
                        int iJ4 = startConversationScreen.D0.j();
                        CharSequence charSequenceY0 = startConversationScreen.y0();
                        if ((charSequenceY0 == null || charSequenceY0.length() == 0) && iIntValue >= iJ && iIntValue >= iJ2 && iIntValue >= iJ4 && iIntValue < iJ3) {
                            return ((xx3) ((t98) b0iVar.C(iIntValue - iJ2))).b;
                        }
                        return null;
                }
            }
        }));
        Continuation continuation = null;
        yfbVar.setRightActions(new lfb(null, new tfb(new bbf(this)), null));
        fbb searchView = yfbVar.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(z7.e(yfbVar.getContext(), odb.x));
            yy7 yy7Var = H0[2];
            if (((Boolean) this.o.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(y0());
            }
        }
        kt3 kt3Var = new kt3(-1, -2);
        kt3Var.i = 0;
        kt3Var.e = 0;
        kt3Var.h = 0;
        constraintLayout.addView(yfbVar, kt3Var);
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), null);
        recyclerView.setId(ndb.o);
        recyclerView.setItemAnimator(null);
        zm3 zm3Var = this.E0;
        recyclerView.setAdapter(zm3Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new r40(14, recyclerView));
        final int i2 = 1;
        r5j r5jVar = new r5j(24, new em6(this) { // from class: waf
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                int i22 = i2;
                StartConversationScreen startConversationScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = StartConversationScreen.H0;
                        jva onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return qqg.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iJ = startConversationScreen.C0.j() + startConversationScreen.x0.j();
                        int iJ2 = startConversationScreen.y0.j() + iJ;
                        b0i b0iVar = startConversationScreen.z0;
                        int iJ3 = b0iVar.j() + iJ2;
                        int iJ4 = startConversationScreen.D0.j();
                        CharSequence charSequenceY0 = startConversationScreen.y0();
                        if ((charSequenceY0 == null || charSequenceY0.length() == 0) && iIntValue >= iJ && iIntValue >= iJ2 && iIntValue >= iJ4 && iIntValue < iJ3) {
                            return ((xx3) ((t98) b0iVar.C(iIntValue - iJ2))).b;
                        }
                        return null;
                }
            }
        });
        okf okfVar = new okf(recyclerView, zm3Var, r5jVar);
        recyclerView.j(okfVar);
        v1a v1aVar = a93.s0;
        recyclerView.j(new tx3(r5jVar, v1aVar.y(recyclerView), new xaf(this, 0)));
        recyclerView.j(new y71(3));
        recyclerView.j(new okf(recyclerView, zm3Var, new r5j(23, new vaf(this, recyclerView, 1))));
        recyclerView.j(new ec6(v1aVar.y(recyclerView), new xaf(this, 1)));
        recyclerView.j(new okf(recyclerView, zm3Var, new usd(12, new vaf(this, recyclerView, 0))));
        tqi.c(new rb(okfVar, continuation, 4), recyclerView);
        kt3 kt3Var2 = new kt3(-1, 0);
        kt3Var2.j = yfbVar.getId();
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        kt3Var2.l = 0;
        constraintLayout.addView(recyclerView, kt3Var2);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.E0.B(this.F0);
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            qsb qsbVar = (qsb) this.v0.getValue();
            s2i s2iVar = new s2i(this, 1);
            String[] strArr2 = qsb.e;
            int i2 = mvd.a1;
            int i3 = mvd.b1;
            wrb wrbVar = new wrb(y9b.e);
            qsbVar.getClass();
            qsb.r(s2iVar, strArr, iArr, strArr2, i2, i3, wrbVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(z0().z0, new ebf(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().A0, getViewLifecycleOwner().p(), l38.d), new dbf(null, this), 1), getViewLifecycleScope());
        gw0.w(new z41(z0().v0, ((zh0) this.s0.getValue()).Z, new z8e(this, (Continuation) null, 4), 3), getViewLifecycleScope());
        this.E0.z(this.F0);
    }

    @Override // defpackage.b14
    public final void x() {
        ((qsb) this.v0.getValue()).j(new s2i(this, 1), qsb.e, 156);
    }

    public final CharSequence y0() {
        yy7 yy7Var = H0[1];
        return (CharSequence) this.d.a(this);
    }

    @Override // defpackage.px3
    public final void z(long j) {
        nbf nbfVarZ0 = z0();
        xfh.o(nbfVarZ0, ((q2b) ((lzf) nbfVarZ0.o.getValue())).a().plus((a84) nbfVarZ0.s0.getValue()), new kbf(nbfVarZ0, j, null), 2);
        api.d(requireActivity());
    }

    public final nbf z0() {
        return (nbf) this.Z.getValue();
    }
}
