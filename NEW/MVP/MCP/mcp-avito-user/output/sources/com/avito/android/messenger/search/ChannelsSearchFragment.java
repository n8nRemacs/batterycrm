package com.avito.android.messenger.search;

import Cd.C13243a;
import T20.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C23424o;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.c;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.search.B;
import com.avito.android.messenger.search.s;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import fZ.AbstractC40377a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.B1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.MessengerUserHashInfo;
import z1.AbstractC50339a;

/* compiled from: ChannelsSearchFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/search/ChannelsSearchFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelsSearchFragment extends BaseFragment implements com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196978n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public InterfaceC32565a f196979o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.F f196980p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.search.s f196981q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f196982r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f196983s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.C f196984t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f196985u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C47743i f196986v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f196987w0;

    /* renamed from: x0, reason: collision with root package name */
    public z f196988x0;

    /* renamed from: y0, reason: collision with root package name */
    public D f196989y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f196990z0;

    /* compiled from: ChannelsSearchFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/search/ChannelsSearchFragment$a;", "Lcom/avito/android/mvi/a;", "Lcom/avito/android/messenger/search/B$b;", "LfZ/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.mvi.a<B.b, AbstractC40377a> {
        @Override // com.avito.android.mvi.a
        public final boolean a(AbstractC40377a abstractC40377a, AbstractC40377a abstractC40377a2) {
            return abstractC40377a.equals(abstractC40377a2);
        }

        @Override // com.avito.android.mvi.a
        public final boolean b(AbstractC40377a abstractC40377a, AbstractC40377a abstractC40377a2) {
            return L.f(abstractC40377a.getF145164b(), abstractC40377a2.getF145164b());
        }

        @Override // com.avito.android.mvi.a
        public final List<AbstractC40377a> d(B.b bVar) {
            B.b.f f196974c;
            List<AbstractC40377a> list;
            B.b bVar2 = bVar;
            if (bVar2 == null || (f196974c = bVar2.getF196974c()) == null || (list = f196974c.f196970b) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                AbstractC40377a abstractC40377a = (AbstractC40377a) obj;
                if (!(abstractC40377a instanceof AbstractC40377a.C11158a) || !bVar2.a().contains(((AbstractC40377a.C11158a) abstractC40377a).f395912b)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C47733d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = ChannelsSearchFragment.this.f196986v0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                z zVar = ChannelsSearchFragment.this.f196988x0;
                if (zVar == null) {
                    zVar = null;
                }
                zVar.a();
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC23040h0 {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                s.a aVar = (s.a) t12;
                ChannelsSearchFragment channelsSearchFragment = ChannelsSearchFragment.this;
                D d12 = channelsSearchFragment.f196989y0;
                if (d12 == null) {
                    d12 = null;
                }
                K2.d(d12.f197017e, true);
                z zVar = channelsSearchFragment.f196988x0;
                z zVar2 = zVar != null ? zVar : null;
                zVar2.f197216a.startActivity(zVar2.f197217b.c((30 & 2) != 0 ? null : Integer.valueOf(aVar.f197178b + 1), aVar.f197177a, (30 & 4) != 0 ? null : aVar.f197179c, (30 & 8) != 0 ? null : aVar.f197180d, (30 & 32) != 0 ? null : aVar.f197181e, (30 & 16) == 0));
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements InterfaceC23040h0 {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                com.avito.android.messenger.channels.mvi.interactor.z zVar = (com.avito.android.messenger.channels.mvi.interactor.z) t12;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j12 = zVar.f187677c;
                long j13 = jCurrentTimeMillis - j12;
                int i12 = 5000 - ((int) j13);
                if (jCurrentTimeMillis > j12 && j13 <= 5000 && i12 >= 3000) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    ChannelsSearchFragment channelsSearchFragment = ChannelsSearchFragment.this;
                    channelsSearchFragment.f196990z0 = com.avito.android.component.toast.c.c(cVar, channelsSearchFragment, com.avito.android.printable_text.b.f(channelsSearchFragment.getString(R.string.messenger_locally_delete_chat_notice_message)), null, Collections.singletonList(new c.a.C3719a(channelsSearchFragment.getString(R.string.messenger_restore_locally_delete_chat), true, null, channelsSearchFragment.new i(zVar.f187675a, zVar.f187676b), 4, null)), null, i12, null, 986);
                }
            }
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a&\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000 \u0005*\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "StateT", "Item", "curState", "Lkotlin/G0;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lkotlin/Q;", "invoke", "(Ljava/lang/Object;Lkotlin/G0;)Lkotlin/Q;", "T20/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<B.b, G0, Q<? extends B.b, ? extends B.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D f196995l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(D d12) {
            super(2);
            this.f196995l = d12;
        }

        @Override // Y41.p
        public final Q<? extends B.b, ? extends B.b> invoke(B.b bVar, G0 g02) {
            return new Q<>(this.f196995l.c(), bVar);
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0004*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022*\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000 \u0004*\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "StateT", "Item", "Lkotlin/Q;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Landroidx/recyclerview/widget/o$e;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "T20/c", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Q<? extends B.b, ? extends B.b>, Q<? extends B.b, ? extends C23424o.e>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mvi.a f196996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.avito.android.mvi.a aVar) {
            super(1);
            this.f196996l = aVar;
        }

        @Override // Y41.l
        public final Q<? extends B.b, ? extends C23424o.e> invoke(Q<? extends B.b, ? extends B.b> q12) {
            Q<? extends B.b, ? extends B.b> q13 = q12;
            A a12 = q13.f406619b;
            com.avito.android.mvi.a aVar = this.f196996l;
            B b12 = q13.f406620c;
            return new Q<>(b12, com.avito.android.mvi.a.c(aVar, a12, b12));
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022*\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "StateT", "Item", "Lkotlin/Q;", "Landroidx/recyclerview/widget/o$e;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "T20/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Q<? extends B.b, ? extends C23424o.e>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D f196997l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.b f196998m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(D d12, com.jakewharton.rxrelay3.b bVar) {
            super(1);
            this.f196997l = d12;
            this.f196998m = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Q<? extends B.b, ? extends C23424o.e> q12) {
            Q<? extends B.b, ? extends C23424o.e> q13 = q12;
            Object obj = q13.f406619b;
            C23424o.e eVar = (C23424o.e) q13.f406620c;
            D d12 = this.f196997l;
            d12.c();
            d12.h(obj, eVar);
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Thread.currentThread().getName() + ']');
            sb2.append(" Rendered ");
            sb2.append(obj);
            v22.g("ChannelsSearchFragment", sb2.toString());
            G0 g02 = G0.f406611a;
            this.f196998m.accept(g02);
            return g02;
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f197000m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f197001n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MessengerUserHashInfo messengerUserHashInfo, String str) {
            super(0);
            this.f197000m = messengerUserHashInfo;
            this.f197001n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.messenger.search.s sVar = ChannelsSearchFragment.this.f196981q0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.p(this.f197001n, this.f197000m);
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {
        public k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            com.avito.android.messenger.search.s sVar = ChannelsSearchFragment.this.f196981q0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.je(str, false);
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "", "query", "apply", "(Lkotlin/G0;Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T1, T2, R> f197004b = new l<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return C43066x.A0((String) obj2).toString();
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            com.avito.android.messenger.search.s sVar = ChannelsSearchFragment.this.f196981q0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.je(str, true);
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {
        public n() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.messenger.search.s sVar = ChannelsSearchFragment.this.f196981q0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.X();
        }
    }

    /* compiled from: ChannelsSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.g {
        public o() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.messenger.search.s sVar = ChannelsSearchFragment.this.f196981q0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.J();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f197008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Y41.a aVar) {
            super(0);
            this.f197008l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f197008l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<Fragment> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelsSearchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f197010l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q qVar) {
            super(0);
            this.f197010l = qVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f197010l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f197011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f197011l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f197011l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f197012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f197012l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f197012l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public ChannelsSearchFragment() {
        super(0, 1, null);
        this.f196978n0 = new io.reactivex.rxjava3.disposables.c();
        p pVar = new p(new b());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new r(new q()));
        this.f196987w0 = new O0(m0.f406844a.b(C47733d.class), new s(interfaceC42726CB), pVar, new t(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return q5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC32565a interfaceC32565a = context instanceof InterfaceC32565a ? (InterfaceC32565a) context : null;
        this.f196979o0 = interfaceC32565a;
        if (interfaceC32565a != null) {
            interfaceC32565a.x(this);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.messenger_channels_search, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && !activityC22955mL1.isChangingConfigurations()) {
            com.avito.android.lib.design.toast_bar.k kVar = this.f196990z0;
            if (kVar != null) {
                kVar.f();
            }
            this.f196990z0 = null;
        }
        D d12 = this.f196989y0;
        if (d12 == null) {
            d12 = null;
        }
        d12.f197031s.e();
        d12.f197017e.setOnEditorActionListener(null);
        d12.f197018f.v0(d12.f197030r);
        d12.f197014b.removeCallbacks(d12.f197029q);
        com.avito.android.lib.design.toast_bar.k kVar2 = d12.f197022j;
        if (kVar2 != null) {
            kVar2.f();
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        InterfaceC32565a interfaceC32565a = this.f196979o0;
        if (interfaceC32565a != null) {
            interfaceC32565a.m1(this);
        }
        this.f196979o0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        return menuItem.getItemId() == 16908332 ? q5() : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f196985u0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("ChannelsSearchFragment");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f196985u0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("ChannelsSearchFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        z zVar = this.f196988x0;
        if (zVar == null) {
            zVar = null;
        }
        bundle.putInt("original_orientation", zVar.f197218c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((C47733d) this.f196987w0.getValue()).f430743J.observe(getViewLifecycleOwner(), new c());
        com.avito.android.messenger.search.s sVar = this.f196981q0;
        if (sVar == null) {
            sVar = null;
        }
        io.reactivex.rxjava3.core.z<B.b> zVarM0 = sVar.M0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarM0.getClass();
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        B1 b1D0 = zVarM0.D0(300L, timeUnit, h12);
        D d12 = this.f196989y0;
        if (d12 == null) {
            d12 = null;
        }
        a aVar = new a();
        com.jakewharton.rxrelay3.b bVarN0 = com.jakewharton.rxrelay3.b.N0(G0.f406611a);
        io.reactivex.rxjava3.disposables.d dVarT0 = io.reactivex.rxjava3.core.z.K0(b1D0.j0(io.reactivex.rxjava3.android.schedulers.b.b()), bVarN0, new e.j(new f(d12))).j0(h12).d0(new e.l(new g(aVar))).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new e.k(new h(d12, bVarN0)));
        io.reactivex.rxjava3.disposables.c cVar = this.f196978n0;
        cVar.b(dVarT0);
        com.avito.android.messenger.search.s sVar2 = this.f196981q0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        sVar2.getF197189c0().observe(getViewLifecycleOwner(), new d());
        com.avito.android.messenger.search.s sVar3 = this.f196981q0;
        if (sVar3 == null) {
            sVar3 = null;
        }
        sVar3.getF197186Z().observe(getViewLifecycleOwner(), new e());
        D d13 = this.f196989y0;
        if (d13 == null) {
            d13 = null;
        }
        B0 b02 = d13.f197023k;
        b02.getClass();
        cVar.b(b02.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.messenger.search.ChannelsSearchFragment.j
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        }).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new k()));
        D d14 = this.f196989y0;
        if (d14 == null) {
            d14 = null;
        }
        I0 i0J0 = d14.f197024l.j0(h12);
        D d15 = this.f196989y0;
        if (d15 == null) {
            d15 = null;
        }
        cVar.b(i0J0.I0(d15.f197023k, l.f197004b).t0(new m()));
        D d16 = this.f196989y0;
        if (d16 == null) {
            d16 = null;
        }
        com.jakewharton.rxrelay3.c cVar2 = d16.f197026n;
        cVar2.getClass();
        cVar.b(cVar2.C0(300L, timeUnit, h12).t0(new n()));
        D d17 = this.f196989y0;
        com.jakewharton.rxrelay3.c cVar3 = (d17 != null ? d17 : null).f197025m;
        cVar3.getClass();
        cVar.b(cVar3.C0(300L, timeUnit, h12).t0(new o()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f196978n0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        o5((Toolbar) view.findViewById(R.id.toolbar));
        C35966w1.c(this).s(false);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.konveyor.adapter.a aVar = this.f196982r0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f196983s0;
        this.f196989y0 = new D(viewGroup, aVar, aVar2 != null ? aVar2 : null, bundle == null);
        View viewFindViewById = view.findViewById(R.id.clear_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC31873b(this, 10));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.messenger.search.di.k.a().a(this, getResources(), (com.avito.android.messenger.search.di.b) C29972i.a(C29972i.b(this), com.avito.android.messenger.search.di.b.class)).a(this);
        com.avito.android.messenger.F f12 = this.f196980p0;
        if (f12 == null) {
            f12 = null;
        }
        this.f196988x0 = new z(this, f12, bundle);
    }

    public final boolean q5() {
        D d12 = this.f196989y0;
        if (d12 == null) {
            d12 = null;
        }
        Input.t(d12.f197017e, null, false, 6);
        z zVar = this.f196988x0;
        return (zVar != null ? zVar : null).a();
    }
}
