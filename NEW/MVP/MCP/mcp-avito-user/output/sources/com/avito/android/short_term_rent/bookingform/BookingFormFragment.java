package com.avito.android.short_term_rent.bookingform;

import Cd.C13243a;
import Ju.InterfaceC14249c;
import VU.b;
import Y41.p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.di.C29972i;
import com.avito.android.guests_selector.b;
import com.avito.android.guests_selector.io.GuestsSelectorChildOutput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import com.avito.android.short_term_rent.bookingform.mvi.v;
import com.avito.android.short_term_rent.bookingform.page.PagerNoTouchEventRecyclerView;
import com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink;
import com.avito.android.short_term_rent.soft_booking.dialog.a;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.K2;
import com.avito.android.util.p6;
import cw0.C39425b;
import cw0.InterfaceC39424a;
import cw0.InterfaceC39426c;
import eF0.InterfaceC40000a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: BookingFormFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/BookingFormFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFormFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f281183n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.short_term_rent.bookingform.l f281184o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f281185p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f281186q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f281187r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public v f281188s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f281189t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.short_term_rent.bookingform.j f281190u0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f281182w0 = {m0.f406844a.e(new Y(BookingFormFragment.class, "openParams", "getOpenParams()Lcom/avito/android/short_term_rent/bookingform/BookingFormOpenParams;", 0))};

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f281181v0 = new a(null);

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/BookingFormFragment$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw0/a;", "event", "Lkotlin/G0;", "invoke", "(Lcw0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC39424a, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC39424a interfaceC39424a) {
            InterfaceC39424a interfaceC39424a2 = interfaceC39424a;
            a aVar = BookingFormFragment.f281181v0;
            BookingFormFragment bookingFormFragment = BookingFormFragment.this;
            if (interfaceC39424a2 instanceof InterfaceC39424a.C11000a) {
                ActivityC22955m activityC22955mL1 = bookingFormFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else {
                if (interfaceC39424a2 instanceof InterfaceC39424a.c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = bookingFormFragment.f281187r0;
                    InterfaceC39424a.c cVar = (InterfaceC39424a.c) interfaceC39424a2;
                    (aVar2 != null ? aVar2 : null).r6(cVar.f393056b, cVar.f393055a, "str_booking_form_deep_link_request_key");
                } else if (interfaceC39424a2 instanceof InterfaceC39424a.g) {
                    com.avito.android.short_term_rent.bookingform.j jVar = bookingFormFragment.f281190u0;
                    if (jVar != null) {
                        InterfaceC39424a.g gVar = (InterfaceC39424a.g) interfaceC39424a2;
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, jVar.f281749j, gVar.f393061a, null, null, null, gVar.f393062b, 2750, ToastBarPosition.f181044b, null, false, false, null, null, 3982);
                        if (gVar.f393063c && Build.VERSION.SDK_INT >= 30) {
                            jVar.f281740a.performHapticFeedback(16);
                        }
                    }
                } else if (interfaceC39424a2 instanceof InterfaceC39424a.e) {
                    com.avito.android.short_term_rent.bookingform.j jVar2 = bookingFormFragment.f281190u0;
                    if (jVar2 != null) {
                        InterfaceC39424a.e eVar = (InterfaceC39424a.e) interfaceC39424a2;
                        RecyclerView.C cP2 = jVar2.f281748i.P(eVar.f393058a);
                        com.avito.android.short_term_rent.bookingform.page.i iVar = cP2 instanceof com.avito.android.short_term_rent.bookingform.page.i ? (com.avito.android.short_term_rent.bookingform.page.i) cP2 : null;
                        if (iVar != null) {
                            iVar.zr(eVar.f393059b);
                        }
                    }
                } else if (interfaceC39424a2 instanceof InterfaceC39424a.b) {
                    K2.e(bookingFormFragment);
                } else if (interfaceC39424a2 instanceof InterfaceC39424a.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = bookingFormFragment.f281187r0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    InterfaceC39424a.d dVar = (InterfaceC39424a.d) interfaceC39424a2;
                    dVar.getClass();
                    aVar3.r6(null, dVar.f393057a, "str_booking_form_deep_link_request_key");
                    ActivityC22955m activityC22955mL12 = bookingFormFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                } else if (interfaceC39424a2 instanceof InterfaceC39424a.f) {
                    a.C8444a c8444a = com.avito.android.short_term_rent.soft_booking.dialog.a.f282581I;
                    Context contextRequireContext = bookingFormFragment.requireContext();
                    RetroBadgeItemHint retroBadgeItemHint = ((InterfaceC39424a.f) interfaceC39424a2).f393060a;
                    c8444a.getClass();
                    a.C8444a.a(contextRequireContext, retroBadgeItemHint);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcw0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C39425b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C39425b c39425b) {
            C39425b c39425b2 = c39425b;
            com.avito.android.short_term_rent.bookingform.j jVar = BookingFormFragment.this.f281190u0;
            if (jVar != null) {
                InterfaceC39426c interfaceC39426c = c39425b2.f393070f;
                boolean z12 = interfaceC39426c instanceof InterfaceC39426c.C11003c;
                LinearLayout linearLayout = jVar.f281746g;
                FrameLayout frameLayout = jVar.f281745f;
                FrameLayout frameLayout2 = jVar.f281744e;
                if (z12) {
                    com.avito.android.short_term_rent.bookingform.j.b(frameLayout2);
                    com.avito.android.short_term_rent.bookingform.j.a(frameLayout, linearLayout);
                } else {
                    boolean z13 = interfaceC39426c instanceof InterfaceC39426c.a;
                    FrameLayout frameLayout3 = jVar.f281743d;
                    if (z13) {
                        InterfaceC39426c.a aVar = (InterfaceC39426c.a) interfaceC39426c;
                        com.avito.android.short_term_rent.bookingform.j.b(frameLayout);
                        com.avito.android.short_term_rent.bookingform.j.a(frameLayout2, linearLayout);
                        boolean z14 = aVar.f393075a;
                        Button button = jVar.f281750k;
                        button.setLoading(z14);
                        if (z14) {
                            com.avito.android.short_term_rent.bookingform.j.b(frameLayout3);
                        } else {
                            com.avito.android.short_term_rent.bookingform.j.a(frameLayout3);
                        }
                        com.avito.android.util.text.j.a(jVar.f281747h, aVar.f393078d.f393086a, null);
                        jVar.f281741b.l(aVar.f393077c, new RunnableC34589p(11, jVar, aVar));
                        FooterButtonItem footerButtonItem = aVar.f393079e.f393084c;
                        b.a aVar2 = VU.b.f17147t;
                        Context context = jVar.f281740a.getContext();
                        String str = footerButtonItem.f281825c;
                        aVar2.getClass();
                        button.setStyle(b.a.b(context, str));
                        com.avito.android.lib.design.button.b.a(button, footerButtonItem.f281824b, false);
                        button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(14, jVar, footerButtonItem));
                    } else if (interfaceC39426c instanceof InterfaceC39426c.b) {
                        com.avito.android.short_term_rent.bookingform.j.b(linearLayout);
                        com.avito.android.short_term_rent.bookingform.j.a(frameLayout2, frameLayout, frameLayout3);
                        jVar.f281751l.setLoading(((InterfaceC39426c.b) interfaceC39426c).f393080a);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BookingFormFragment.f281181v0;
            BookingFormFragment.this.q5().accept(a.C8401a.f281831a);
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/FooterButtonItem$ActionType;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/bookingform/mvi/entity/FooterButtonItem$ActionType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<FooterButtonItem.ActionType, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FooterButtonItem.ActionType actionType) {
            a aVar = BookingFormFragment.f281181v0;
            BookingFormFragment.this.q5().accept(new a.e(actionType));
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BookingFormFragment.f281181v0;
            BookingFormFragment.this.q5().accept(a.d.f281835a);
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.BookingFormFragment$onViewCreated$4", f = "BookingFormFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f281196q;

        /* compiled from: BookingFormFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.BookingFormFragment$onViewCreated$4$1", f = "BookingFormFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f281198q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BookingFormFragment f281199r;

            /* compiled from: BookingFormFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C8374a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BookingFormFragment f281200b;

                public C8374a(BookingFormFragment bookingFormFragment) {
                    this.f281200b = bookingFormFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    C43501a c43501a = (C43501a) obj;
                    BookingFormFragment bookingFormFragment = this.f281200b;
                    v vVar = bookingFormFragment.f281188s0;
                    Object c8402a = null;
                    if (vVar == null) {
                        vVar = null;
                    }
                    InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                    vVar.getClass();
                    if (interfaceC14249c instanceof CalendarLink.b.C3988b) {
                        CalendarLink.b.C3988b c3988b = (CalendarLink.b.C3988b) interfaceC14249c;
                        c8402a = new a.b(c3988b.f133080b, c3988b.f133081c);
                    } else if (interfaceC14249c instanceof b.C4726b) {
                        GuestsSelectorOutput guestsSelectorOutput = ((b.C4726b) interfaceC14249c).f161391b;
                        List<GuestsSelectorChildOutput> list = guestsSelectorOutput.f161449c;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((GuestsSelectorChildOutput) it.next()).f161446b);
                        }
                        c8402a = new a.f(guestsSelectorOutput.f161448b, arrayList, guestsSelectorOutput.f161450d);
                    } else if (interfaceC14249c instanceof BookingFormPromoCodeDialogDeeplink.b) {
                        BookingFormPromoCodeDialogDeeplink.b bVar = (BookingFormPromoCodeDialogDeeplink.b) interfaceC14249c;
                        if (bVar instanceof BookingFormPromoCodeDialogDeeplink.b.C8423b) {
                            c8402a = a.p.b.f281853a;
                        } else if (bVar instanceof BookingFormPromoCodeDialogDeeplink.b.c) {
                            BookingFormPromoCodeDialogDeeplink.b.c cVar = (BookingFormPromoCodeDialogDeeplink.b.c) interfaceC14249c;
                            c8402a = new a.p.C8402a(cVar.f282248b, cVar.f282249c);
                        }
                    }
                    if (c8402a != null) {
                        bookingFormFragment.q5().accept(c8402a);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f281200b, BookingFormFragment.class, "handleDeepLinkResultEvent", "handleDeepLinkResultEvent(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* compiled from: SafeCollector.common.kt */
            @s0
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b implements InterfaceC43160i<C43501a> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43160i f281201b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$b$a, reason: collision with other inner class name */
                public static final class C8375a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43172j f281202b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.BookingFormFragment$onViewCreated$4$1$invokeSuspend$$inlined$filter$1$2", f = "BookingFormFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$b$a$a, reason: collision with other inner class name */
                    public static final class C8376a extends ContinuationImpl {

                        /* renamed from: q, reason: collision with root package name */
                        public /* synthetic */ Object f281203q;

                        /* renamed from: r, reason: collision with root package name */
                        public int f281204r;

                        public C8376a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Y61.l
                        public final Object invokeSuspend(@Y61.k Object obj) {
                            this.f281203q = obj;
                            this.f281204r |= BeduinInputModel.MIN_TEXT_VERSION;
                            return C8375a.this.emit(null, this);
                        }
                    }

                    public C8375a(InterfaceC43172j interfaceC43172j) {
                        this.f281202b = interfaceC43172j;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    @Y61.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.avito.android.short_term_rent.bookingform.BookingFormFragment.g.a.b.C8375a.C8376a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$b$a$a r0 = (com.avito.android.short_term_rent.bookingform.BookingFormFragment.g.a.b.C8375a.C8376a) r0
                            int r1 = r0.f281204r
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f281204r = r1
                            goto L18
                        L13:
                            com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$b$a$a r0 = new com.avito.android.short_term_rent.bookingform.BookingFormFragment$g$a$b$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f281203q
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f281204r
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.C42729a0.b(r6)
                            goto L4e
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.C42729a0.b(r6)
                            r6 = r5
                            kv.a r6 = (kv.C43501a) r6
                            com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                            java.lang.String r2 = "str_booking_form_deep_link_request_key"
                            java.lang.String r6 = r6.f134521b
                            boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                            if (r6 == 0) goto L4e
                            r0.f281204r = r3
                            kotlinx.coroutines.flow.j r6 = r4.f281202b
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4e
                            return r1
                        L4e:
                            kotlin.G0 r5 = kotlin.G0.f406611a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.BookingFormFragment.g.a.b.C8375a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                public b(InterfaceC43160i interfaceC43160i) {
                    this.f281201b = interfaceC43160i;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43160i
                @Y61.l
                public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
                    Object objCollect = ((AbstractC43168f) this.f281201b).collect(new C8375a(interfaceC43172j), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BookingFormFragment bookingFormFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f281199r = bookingFormFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f281199r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f281198q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    BookingFormFragment bookingFormFragment = this.f281199r;
                    com.avito.android.deeplink_handler.handler.composite.a aVar = bookingFormFragment.f281187r0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b bVar = new b(y.a(aVar.d9()));
                    C8374a c8374a = new C8374a(bookingFormFragment);
                    this.f281198q = 1;
                    if (bVar.collect(c8374a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BookingFormFragment.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f281196q;
            if (i12 == 0) {
                C42729a0.b(obj);
                BookingFormFragment bookingFormFragment = BookingFormFragment.this;
                InterfaceC22983P viewLifecycleOwner = bookingFormFragment.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.f46681d;
                a aVar = new a(bookingFormFragment, null);
                this.f281196q = 1;
                if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<x, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = BookingFormFragment.f281181v0;
            BookingFormFragment.this.q5().accept(a.C8401a.f281831a);
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.short_term_rent.bookingform.mvi.entity.a aVar) {
            a aVar2 = BookingFormFragment.f281181v0;
            BookingFormFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f281208l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f281208l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f281208l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BookingFormFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f281210l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f281210l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f281210l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f281211l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f281211l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f281211l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f281212l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f281212l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f281212l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BookingFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/short_term_rent/bookingform/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.short_term_rent.bookingform.k> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.short_term_rent.bookingform.k invoke() {
            com.avito.android.short_term_rent.bookingform.l lVar = BookingFormFragment.this.f281184o0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.short_term_rent.bookingform.k) lVar.get();
        }
    }

    public BookingFormFragment() {
        super(0, 1, null);
        this.f281183n0 = new C35968w3(this);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f281185p0 = new O0(m0.f406844a.b(com.avito.android.short_term_rent.bookingform.k.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f281186q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f281186q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(), new c());
        return layoutInflater.inflate(R.layout.booking_form, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.short_term_rent.bookingform.j jVar = this.f281190u0;
        if (jVar != null) {
            PagerNoTouchEventRecyclerView pagerNoTouchEventRecyclerView = jVar.f281748i;
            p6 p6Var = new p6(pagerNoTouchEventRecyclerView);
            while (p6Var.hasNext()) {
                Object objW = pagerNoTouchEventRecyclerView.W((View) p6Var.next());
                com.avito.android.short_term_rent.bookingform.page.i iVar = objW instanceof com.avito.android.short_term_rent.bookingform.page.i ? (com.avito.android.short_term_rent.bookingform.page.i) objW : null;
                if (iVar != null) {
                    iVar.destroy();
                }
            }
            pagerNoTouchEventRecyclerView.setAdapter(null);
        }
        this.f281190u0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f281189t0;
        this.f281190u0 = new com.avito.android.short_term_rent.bookingform.j(view, dVar != null ? dVar : null, new d(), new e(), new f());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new g(null), 3);
        C19918B.a(requireActivity().getF21241d(), this, new h(), 2);
        ScreenPerformanceTracker screenPerformanceTracker = this.f281186q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.short_term_rent.bookingform.di.p.a().a((com.avito.android.short_term_rent.bookingform.di.b) C29972i.a(C29972i.b(this), com.avito.android.short_term_rent.bookingform.di.b.class), cv.c.b(this), bundle != null, s.c(this), (BookingFormOpenParams) this.f281183n0.getValue(this, f281182w0[0]), new i(), (InterfaceC40000a) C29972i.a(C29972i.b(this), InterfaceC40000a.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f281186q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.short_term_rent.bookingform.k q5() {
        return (com.avito.android.short_term_rent.bookingform.k) this.f281185p0.getValue();
    }
}
