package com.avito.android.messenger.blacklist_reasons;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.blacklist_reasons.e;
import com.avito.android.mvi.e;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import z1.AbstractC50339a;

/* compiled from: BlacklistReasonsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/BlacklistReasonsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BlacklistReasonsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f186536n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.blacklist_reasons.e f186537o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f186538p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f186539q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f186540r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C47743i f186541s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f186542t0;

    /* renamed from: u0, reason: collision with root package name */
    public v f186543u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f186544v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f186545w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public String f186546x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186547y0;

    /* compiled from: BlacklistReasonsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<C47733d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = BlacklistReasonsFragment.this.f186541s0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC23040h0 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                BlacklistReasonsFragment blacklistReasonsFragment = BlacklistReasonsFragment.this;
                ActivityC22955m activityC22955mL1 = blacklistReasonsFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(-1);
                }
                ActivityC22955m activityC22955mL12 = blacklistReasonsFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                Q q12 = (Q) t12;
                PrintableText printableText = (PrintableText) q12.f406619b;
                Throwable th2 = (Throwable) q12.f406620c;
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, BlacklistReasonsFragment.this, printableText, null, null, f.c.a.a(null, th2), 1500, ToastBarPosition.f181046d, 910);
            }
        }
    }

    /* compiled from: BlacklistReasonsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist_reasons/e$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.a aVar = (e.a) obj;
            v vVar = BlacklistReasonsFragment.this.f186543u0;
            if (vVar == null) {
                vVar = null;
            }
            vVar.getClass();
            e.a.a(vVar, aVar);
        }
    }

    /* compiled from: BlacklistReasonsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ActivityC22955m activityC22955mL1 = BlacklistReasonsFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
        }
    }

    /* compiled from: BlacklistReasonsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            BlacklistReasonsFragment blacklistReasonsFragment = BlacklistReasonsFragment.this;
            com.avito.android.messenger.blacklist_reasons.e eVar = blacklistReasonsFragment.f186537o0;
            if (eVar == null) {
                eVar = null;
            }
            String str = blacklistReasonsFragment.f186544v0;
            if (str == null) {
                str = null;
            }
            String str2 = blacklistReasonsFragment.f186545w0;
            eVar.Bd(str, str2 != null ? str2 : null, blacklistReasonsFragment.f186546x0);
        }
    }

    /* compiled from: BlacklistReasonsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.messenger.blacklist_reasons.e eVar = BlacklistReasonsFragment.this.f186537o0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.S3();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements InterfaceC23040h0 {
        public h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                ActivityC22955m activityC22955mL1 = BlacklistReasonsFragment.this.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f186556l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f186556l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f186556l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BlacklistReasonsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f186558l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f186558l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f186558l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f186559l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f186559l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f186559l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f186560l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f186560l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f186560l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public BlacklistReasonsFragment() {
        super(0, 1, null);
        i iVar = new i(new a());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f186542t0 = new O0(m0.f406844a.b(C47733d.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f186547y0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("user_id") : null;
        if (string == null) {
            throw new IllegalArgumentException("User id is required");
        }
        this.f186544v0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("channel_id") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Channel id is required");
        }
        this.f186545w0 = string2;
        Bundle arguments3 = getArguments();
        this.f186546x0 = arguments3 != null ? arguments3.getString("item_id") : null;
        com.avito.android.messenger.blacklist_reasons.di.h.a().a(this, (com.avito.android.messenger.blacklist_reasons.di.c) C29972i.a(C29972i.b(this), com.avito.android.messenger.blacklist_reasons.di.c.class)).a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.messenger_blacklist_reasons_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        v vVar = this.f186543u0;
        if (vVar == null) {
            vVar = null;
        }
        vVar.f186654b.removeCallbacks(vVar.f186663k);
        com.avito.android.lib.design.toast_bar.k kVar = vVar.f186664l;
        if (kVar != null) {
            kVar.f();
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f186540r0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("BlacklistReasonsFragment");
        this.f186547y0.e();
        com.avito.android.messenger.blacklist_reasons.e eVar = this.f186537o0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.Z().removeObservers(getViewLifecycleOwner());
        com.avito.android.messenger.blacklist_reasons.e eVar2 = this.f186537o0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.k8().removeObservers(getViewLifecycleOwner());
        com.avito.android.messenger.blacklist_reasons.e eVar3 = this.f186537o0;
        (eVar3 != null ? eVar3 : null).Da();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.messenger.blacklist_reasons.e eVar = this.f186537o0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.Z().observe(getViewLifecycleOwner(), new b());
        com.avito.android.messenger.blacklist_reasons.e eVar2 = this.f186537o0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.k8().observe(getViewLifecycleOwner(), new c());
        com.avito.android.messenger.blacklist_reasons.e eVar3 = this.f186537o0;
        if (eVar3 == null) {
            eVar3 = null;
        }
        io.reactivex.rxjava3.core.z<e.a> zVarM0 = eVar3.M0();
        zVarM0.getClass();
        L lD2 = zVarM0.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        InterfaceC35745a5 interfaceC35745a5 = this.f186536n0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = lD2.j0(interfaceC35745a5.e()).t0(new d());
        io.reactivex.rxjava3.disposables.c cVar = this.f186547y0;
        cVar.b(dVarT0);
        v vVar = this.f186543u0;
        if (vVar == null) {
            vVar = null;
        }
        cVar.b(vVar.f186665m.t0(new e()));
        v vVar2 = this.f186543u0;
        if (vVar2 == null) {
            vVar2 = null;
        }
        com.jakewharton.rxrelay3.c cVar2 = vVar2.f186667o;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a52 = this.f186536n0;
        if (interfaceC35745a52 == null) {
            interfaceC35745a52 = null;
        }
        cVar.b(cVar2.C0(200L, timeUnit, interfaceC35745a52.c()).t0(new f()));
        v vVar3 = this.f186543u0;
        if (vVar3 == null) {
            vVar3 = null;
        }
        com.jakewharton.rxrelay3.c cVar3 = vVar3.f186666n;
        InterfaceC35745a5 interfaceC35745a53 = this.f186536n0;
        if (interfaceC35745a53 == null) {
            interfaceC35745a53 = null;
        }
        cVar.b(cVar3.C0(200L, timeUnit, interfaceC35745a53.c()).t0(new g()));
        InterfaceC32572u interfaceC32572u = this.f186540r0;
        (interfaceC32572u != null ? interfaceC32572u : null).a("BlacklistReasonsFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C47733d c47733d = (C47733d) this.f186542t0.getValue();
        c47733d.f430743J.observe(getViewLifecycleOwner(), new h());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.konveyor.a aVar = this.f186538p0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.adapter.h hVar = this.f186539q0;
        if (hVar == null) {
            hVar = null;
        }
        this.f186543u0 = new v(viewGroup, aVar, hVar);
        if (bundle == null) {
            com.avito.android.messenger.blacklist_reasons.e eVar = this.f186537o0;
            (eVar != null ? eVar : null).S3();
        }
    }
}
