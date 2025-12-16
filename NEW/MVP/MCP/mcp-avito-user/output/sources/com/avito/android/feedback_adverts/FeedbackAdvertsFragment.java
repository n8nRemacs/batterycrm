package com.avito.android.feedback_adverts;

import Cd.C13243a;
import T20.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C23424o;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.feedback_adverts.g;
import com.avito.android.feedback_adverts.o;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.B1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ok0.InterfaceC44788a;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import z1.AbstractC50339a;

/* compiled from: FeedbackAdvertsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/feedback_adverts/FeedbackAdvertsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackAdvertsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f157727w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.feedback_adverts.o f157728n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f157729o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f157730p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f157731q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C47743i f157732r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f157733s0;

    /* renamed from: t0, reason: collision with root package name */
    public u f157734t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.feedback_adverts.s f157735u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f157736v0;

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/feedback_adverts/FeedbackAdvertsFragment$a;", "", "<init>", "()V", "", "CHANNEL_ID_KEY", "Ljava/lang/String;", "ITEM_ID_KEY", "TAG", "", "UI_THROTTLE_TIMEOUT_MS", "J", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/FeedbackAdvertsFragment$b;", "Lcom/avito/android/mvi/a;", "Lcom/avito/android/feedback_adverts/o$b;", "Lok0/a;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.mvi.a<o.b, InterfaceC44788a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f157737a = new b();

        @Override // com.avito.android.mvi.a
        public final boolean a(InterfaceC44788a interfaceC44788a, InterfaceC44788a interfaceC44788a2) {
            return interfaceC44788a.equals(interfaceC44788a2);
        }

        @Override // com.avito.android.mvi.a
        public final boolean b(InterfaceC44788a interfaceC44788a, InterfaceC44788a interfaceC44788a2) {
            return L.f(interfaceC44788a.getF96790b(), interfaceC44788a2.getF96790b());
        }

        @Override // com.avito.android.mvi.a
        public final List<InterfaceC44788a> d(o.b bVar) {
            g.b f157869b;
            o.b bVar2 = bVar;
            if (bVar2 == null || (f157869b = bVar2.getF157869b()) == null) {
                return null;
            }
            return f157869b.f157818a;
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C47733d> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = FeedbackAdvertsFragment.this.f157732r0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC23040h0 {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                com.avito.android.feedback_adverts.s sVar = FeedbackAdvertsFragment.this.f157735u0;
                if (sVar != null) {
                    sVar.p();
                }
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
                FeedbackAdvertItem feedbackAdvertItem = (FeedbackAdvertItem) t12;
                com.avito.android.feedback_adverts.s sVar = FeedbackAdvertsFragment.this.f157735u0;
                if (sVar != null) {
                    sVar.K0(feedbackAdvertItem);
                }
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements InterfaceC23040h0 {
        public f() {
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != null) {
                FeedbackAdvertsFragment feedbackAdvertsFragment = FeedbackAdvertsFragment.this;
                String strK0 = ((PrintableText) t12).k0(feedbackAdvertsFragment.requireContext());
                f.c.f125255c.getClass();
                com.avito.android.component.toast.b.c(feedbackAdvertsFragment, strK0, ToastBarPosition.f181046d, f.c.a.b(), 318);
            }
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.feedback_adverts.o oVar = FeedbackAdvertsFragment.this.f157728n0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.J();
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.feedback_adverts.s sVar = FeedbackAdvertsFragment.this.f157735u0;
            if (sVar != null) {
                sVar.p();
            }
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            com.avito.android.feedback_adverts.o oVar = FeedbackAdvertsFragment.this.f157728n0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.m4(str);
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "", "query", "apply", "(Lkotlin/G0;Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T1, T2, R> f157746b = new k<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return C43066x.A0((String) obj2).toString();
        }
    }

    /* compiled from: FeedbackAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {
        public l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            com.avito.android.feedback_adverts.o oVar = FeedbackAdvertsFragment.this.f157728n0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.m4(str);
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a&\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000 \u0005*\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "StateT", "Item", "curState", "Lkotlin/G0;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lkotlin/Q;", "invoke", "(Ljava/lang/Object;Lkotlin/G0;)Lkotlin/Q;", "T20/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.p<o.b, G0, Q<? extends o.b, ? extends o.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.feedback_adverts.t f157748l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.avito.android.feedback_adverts.t tVar) {
            super(2);
            this.f157748l = tVar;
        }

        @Override // Y41.p
        public final Q<? extends o.b, ? extends o.b> invoke(o.b bVar, G0 g02) {
            return new Q<>(this.f157748l.c(), bVar);
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0004*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022*\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000 \u0004*\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "StateT", "Item", "Lkotlin/Q;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Landroidx/recyclerview/widget/o$e;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "T20/c", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<Q<? extends o.b, ? extends o.b>, Q<? extends o.b, ? extends C23424o.e>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mvi.a f157749l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.avito.android.mvi.a aVar) {
            super(1);
            this.f157749l = aVar;
        }

        @Override // Y41.l
        public final Q<? extends o.b, ? extends C23424o.e> invoke(Q<? extends o.b, ? extends o.b> q12) {
            Q<? extends o.b, ? extends o.b> q13 = q12;
            A a12 = q13.f406619b;
            com.avito.android.mvi.a aVar = this.f157749l;
            B b12 = q13.f406620c;
            return new Q<>(b12, com.avito.android.mvi.a.c(aVar, a12, b12));
        }
    }

    /* compiled from: Renderers.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022*\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "StateT", "Item", "Lkotlin/Q;", "Landroidx/recyclerview/widget/o$e;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "T20/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<Q<? extends o.b, ? extends C23424o.e>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.feedback_adverts.t f157750l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.b f157751m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.avito.android.feedback_adverts.t tVar, com.jakewharton.rxrelay3.b bVar) {
            super(1);
            this.f157750l = tVar;
            this.f157751m = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Q<? extends o.b, ? extends C23424o.e> q12) {
            Q<? extends o.b, ? extends C23424o.e> q13 = q12;
            Object obj = q13.f406619b;
            C23424o.e eVar = (C23424o.e) q13.f406620c;
            com.avito.android.feedback_adverts.t tVar = this.f157750l;
            tVar.c();
            tVar.h(obj, eVar);
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Thread.currentThread().getName() + ']');
            sb2.append(" Rendered ");
            sb2.append(obj);
            v22.g("FeedbackAdvertsFragment", sb2.toString());
            G0 g02 = G0.f406611a;
            this.f157751m.accept(g02);
            return g02;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f157752l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Y41.a aVar) {
            super(0);
            this.f157752l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f157752l);
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
            return FeedbackAdvertsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f157754l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q qVar) {
            super(0);
            this.f157754l = qVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f157754l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f157755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f157755l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f157755l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f157756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f157756l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f157756l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public FeedbackAdvertsFragment() {
        super(0, 1, null);
        p pVar = new p(new c());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new r(new q()));
        this.f157733s0 = new O0(m0.f406844a.b(C47733d.class), new s(interfaceC42726CB), pVar, new t(interfaceC42726CB));
        this.f157736v0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f157735u0 = (com.avito.android.feedback_adverts.s) l1();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_feedback_adverts, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f157735u0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((C47733d) this.f157733s0.getValue()).f430743J.observe(getViewLifecycleOwner(), new d());
        com.avito.android.feedback_adverts.o oVar = this.f157728n0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.Ad().observe(getViewLifecycleOwner(), new e());
        com.avito.android.feedback_adverts.o oVar2 = this.f157728n0;
        if (oVar2 == null) {
            oVar2 = null;
        }
        oVar2.Q().observe(getViewLifecycleOwner(), new f());
        u uVar = this.f157734t0;
        if (uVar == null) {
            uVar = null;
        }
        com.jakewharton.rxrelay3.c cVar = uVar.f157907l;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.getClass();
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        io.reactivex.rxjava3.disposables.d dVarT0 = cVar.C0(300L, timeUnit, h12).t0(new g());
        io.reactivex.rxjava3.disposables.c cVar2 = this.f157736v0;
        cVar2.b(dVarT0);
        u uVar2 = this.f157734t0;
        if (uVar2 == null) {
            uVar2 = null;
        }
        com.jakewharton.rxrelay3.c cVar3 = uVar2.f157908m;
        cVar3.getClass();
        cVar2.b(cVar3.C0(300L, timeUnit, h12).t0(new h()));
        u uVar3 = this.f157734t0;
        if (uVar3 == null) {
            uVar3 = null;
        }
        B0 b02 = uVar3.f157905j;
        b02.getClass();
        cVar2.b(b02.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.feedback_adverts.FeedbackAdvertsFragment.i
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        }).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new j()));
        u uVar4 = this.f157734t0;
        if (uVar4 == null) {
            uVar4 = null;
        }
        I0 i0J0 = uVar4.f157906k.j0(h12);
        u uVar5 = this.f157734t0;
        cVar2.b(i0J0.I0((uVar5 != null ? uVar5 : null).f157905j, k.f157746b).t0(new l()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f157736v0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.konveyor.adapter.a aVar = this.f157729o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f157730p0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        InterfaceC28373a interfaceC28373a = this.f157731q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        this.f157734t0 = new u(viewGroup, aVar, aVar2, interfaceC28373a);
        com.avito.android.feedback_adverts.o oVar = this.f157728n0;
        if (oVar == null) {
            oVar = null;
        }
        z<o.b> zVarM0 = oVar.M0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarM0.getClass();
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        B1 b1D0 = zVarM0.D0(300L, timeUnit, h12);
        u uVar = this.f157734t0;
        u uVar2 = uVar != null ? uVar : null;
        b bVar = b.f157737a;
        com.jakewharton.rxrelay3.b bVarN0 = com.jakewharton.rxrelay3.b.N0(G0.f406611a);
        z.K0(b1D0.j0(io.reactivex.rxjava3.android.schedulers.b.b()), bVarN0, new e.d(new m(uVar2))).j0(h12).d0(new e.f(new n(bVar))).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new e.C1045e(new o(uVar2, bVarN0)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.feedback_adverts.di.b.a().a(requireArguments().getString("item_id_key"), requireArguments().getString("channel_id_key", ""), this, (com.avito.android.feedback_adverts.di.c) C29972i.a(C29972i.b(this), com.avito.android.feedback_adverts.di.c.class)).a(this);
    }
}
