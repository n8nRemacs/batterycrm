package com.avito.android.messenger.channels.mvi.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.bottom_navigation.C28888j;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.messenger.conversation.mvi.send.C32216i;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.conversation.mvi.send.Onboarding;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PinChannelOnboardingController.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/a0;", "Lcom/avito/android/messenger/channels/mvi/view/j0;", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f188726a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f188727b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f188728c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f188729d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f188730e = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f188731f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188732g;

    /* compiled from: PinChannelOnboardingController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "onboardingShouldBeShown", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "kotlin.jvm.PlatformType", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
            }
            com.jakewharton.rxrelay3.c<G0> cVar = a0.this.f188730e;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.getClass();
            return cVar.y(1L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b);
        }
    }

    /* compiled from: PinChannelOnboardingController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            try {
                a0.d(a0.this);
            } catch (Exception e12) {
                V2.f318762a.a("PinChannelOnboardingController", "Something went during tooltip showing", e12);
            }
        }
    }

    /* compiled from: PinChannelOnboardingController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f188735b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("PinChannelOnboardingController", "Something went wrong in PinChannelOnboardingController", (Throwable) obj);
        }
    }

    /* compiled from: PinChannelOnboardingController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/a0$d;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        new d(null);
    }

    public a0(@Y61.k RecyclerView recyclerView, @Y61.k LinearLayoutManager linearLayoutManager, @Y61.k View view, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f188726a = recyclerView;
        this.f188727b = linearLayoutManager;
        this.f188728c = view;
        this.f188729d = interfaceC32208e;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f188732g = cVar;
        cVar.b(C32216i.a(interfaceC32208e, Onboarding.f194327f).x0(interfaceC35745a5.a()).y0(new a()).j0(interfaceC35745a5.e()).v0(new b(), c.f188735b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public static final void d(a0 a0Var) {
        LinearLayoutManager linearLayoutManager = a0Var.f188727b;
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 <= iM1) {
            while (true) {
                RecyclerView recyclerView = a0Var.f188726a;
                RecyclerView.C cQ2 = recyclerView.Q(iK1, false);
                if (cQ2 != null && (cQ2 instanceof com.avito.android.messenger.channels.adapter.konveyor.channel.p) && ((com.avito.android.messenger.channels.adapter.konveyor.channel.p) cQ2).f186893g) {
                    Rect rect = new Rect();
                    cQ2.itemView.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    recyclerView.getGlobalVisibleRect(rect2);
                    int iB2 = (rect.bottom - rect2.top) - y6.b(8);
                    if (iB2 > 0 && rect2.contains(rect)) {
                        View view = a0Var.f188728c;
                        if (view.getLayoutParams().height != iB2 || a0Var.f188731f == null) {
                            view.setVisibility(0);
                            view.getLayoutParams().height = iB2;
                            com.avito.android.lib.design.tooltip.k kVar = a0Var.f188731f;
                            if (kVar != null) {
                                kVar.setOnDismissListener(null);
                            }
                            com.avito.android.lib.design.tooltip.k kVar2 = a0Var.f188731f;
                            if (kVar2 != null) {
                                kVar2.dismiss();
                            }
                            a0Var.f188731f = null;
                            com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
                            int i12 = kVar3.f181229o;
                            kVar3.f181228n = -2;
                            kVar3.f181229o = i12;
                            kVar3.f181224j = new r.a(new i.a(new b.a()));
                            com.avito.android.lib.design.tooltip.p.a(kVar3, b0.f188738l);
                            kVar3.setOnDismissListener(new C28888j(a0Var, 2));
                            kVar3.e(view);
                            a0Var.f188731f = kVar3;
                            return;
                        }
                        return;
                    }
                }
                if (iK1 == iM1) {
                    break;
                } else {
                    iK1++;
                }
            }
        }
        com.avito.android.lib.design.tooltip.k kVar4 = a0Var.f188731f;
        if (kVar4 != null) {
            kVar4.setOnDismissListener(null);
        }
        com.avito.android.lib.design.tooltip.k kVar5 = a0Var.f188731f;
        if (kVar5 != null) {
            kVar5.dismiss();
        }
        a0Var.f188731f = null;
    }

    @Override // com.avito.android.messenger.channels.mvi.view.j0
    public final void a() {
        this.f188730e.accept(G0.f406611a);
    }

    @Override // com.avito.android.messenger.channels.mvi.view.j0
    public final void b() {
        this.f188732g.e();
    }

    @Override // com.avito.android.messenger.channels.mvi.view.j0
    public final void c() {
        com.avito.android.lib.design.tooltip.k kVar = this.f188731f;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f188731f = null;
    }
}
