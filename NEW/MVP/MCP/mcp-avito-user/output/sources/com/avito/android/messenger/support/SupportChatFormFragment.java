package com.avito.android.messenger.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.F;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.k0;
import com.avito.android.messenger.analytics.l0;
import com.avito.android.messenger.support.di.b;
import com.avito.android.messenger.support.j;
import com.avito.android.mvi.e;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35739a;
import com.avito.android.util.C35769c6;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.L5;
import com.avito.android.util.TypefaceType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SupportChatFormFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/support/SupportChatFormFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class SupportChatFormFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f197348u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public j f197349n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public F f197350o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f197351p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f197352q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f197353r0;

    /* renamed from: s0, reason: collision with root package name */
    public o f197354s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197355t0;

    /* compiled from: SupportChatFormFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/support/SupportChatFormFragment$a;", "", "<init>", "()V", "", "KEY_PROBLEM_ID", "Ljava/lang/String;", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC23040h0 {
        public b() {
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != null) {
                SupportChatFormFragment supportChatFormFragment = SupportChatFormFragment.this;
                String strK0 = ((PrintableText) t12).k0(supportChatFormFragment.requireContext());
                Context context = supportChatFormFragment.getContext();
                if (context != null) {
                    L5.b(context, strK0, 0);
                }
            }
        }
    }

    /* compiled from: SupportChatFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/support/j$b;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/support/j$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            j.b bVar = (j.b) obj;
            j.a aVar = bVar.f197399a;
            j.a.c cVar = aVar instanceof j.a.c ? (j.a.c) aVar : null;
            SupportChatFormFragment supportChatFormFragment = SupportChatFormFragment.this;
            if (cVar != null && (str = cVar.f197396a) != null) {
                F f12 = supportChatFormFragment.f197350o0;
                if (f12 == null) {
                    f12 = null;
                }
                Intent intentAddFlags = F.a.b(f12, null, 3).addFlags(603979776);
                F f13 = supportChatFormFragment.f197350o0;
                if (f13 == null) {
                    f13 = null;
                }
                Intent intentPutExtra = f13.c((30 & 2) != 0 ? null : null, str, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 32) != 0 ? null : null, (30 & 16) == 0).putExtra("up_intent", intentAddFlags);
                if (intentPutExtra != null) {
                    C35966w1.f(supportChatFormFragment, intentPutExtra);
                }
            }
            o oVar = supportChatFormFragment.f197354s0;
            o oVar2 = oVar != null ? oVar : null;
            oVar2.getClass();
            e.a.a(oVar2, bVar);
        }
    }

    /* compiled from: SupportChatFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "accept", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            SupportChatFormFragment supportChatFormFragment = SupportChatFormFragment.this;
            InterfaceC28373a interfaceC28373a = supportChatFormFragment.f197351p0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(l0.f186297c);
            j jVar = supportChatFormFragment.f197349n0;
            (jVar != null ? jVar : null).H2(charSequence);
        }
    }

    public SupportChatFormFragment() {
        super(0, 1, null);
        this.f197355t0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(R.layout.messenger_support_chat_form, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f197352q0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("SupportChatFormFragment");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f197352q0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("SupportChatFormFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        j jVar = this.f197349n0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.Q().observe(getViewLifecycleOwner(), new b());
        j jVar2 = this.f197349n0;
        if (jVar2 == null) {
            jVar2 = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = jVar2.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new c());
        io.reactivex.rxjava3.disposables.c cVar = this.f197355t0;
        cVar.b(dVarT0);
        o oVar = this.f197354s0;
        cVar.b((oVar != null ? oVar : null).f197424d.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new d()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        j jVar = this.f197349n0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.Q().removeObservers(this);
        this.f197355t0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f197351p0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(k0.f186294c);
        }
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        o5((Toolbar) viewFindViewById);
        C35739a c35739a = C35739a.f318787a;
        AbstractC19927a abstractC19927aC = C35966w1.c(this);
        c35739a.getClass();
        Context contextJ = abstractC19927aC.j();
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i12 = C35777d6.f318863a;
        SpannableString spannableStringValueOf = SpannableString.valueOf("");
        spannableStringValueOf.setSpan(new C35769c6(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontRegular, contextJ), contextJ)), 0, spannableStringValueOf.length(), 33);
        abstractC19927aC.w(spannableStringValueOf);
        C35966w1.c(this).u(R.drawable.ic_close_24);
        this.f197354s0 = new o(view);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        this.f197353r0 = arguments != null ? arguments.getInt("problemId") : 0;
        b.a aVarA = com.avito.android.messenger.support.di.a.a();
        aVarA.c(this.f197353r0);
        aVarA.b(getResources());
        aVarA.d(this);
        aVarA.a((com.avito.android.messenger.support.di.c) C29972i.a(C29972i.b(this), com.avito.android.messenger.support.di.c.class));
        aVarA.build().a(this);
    }
}
