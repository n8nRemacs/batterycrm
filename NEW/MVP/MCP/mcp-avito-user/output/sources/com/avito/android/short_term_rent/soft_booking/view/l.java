package com.avito.android.short_term_rent.soft_booking.view;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.util.C35872q;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import ow0.InterfaceC44952b;
import qw0.C47456b;
import qw0.InterfaceC47457c;

/* compiled from: StrSoftBookingView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/l;", "Lcom/avito/android/short_term_rent/soft_booking/view/a;", "a", "b", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements com.avito.android.short_term_rent.soft_booking.view.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f282985a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f282986b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f282987c = C42727D.c(new d());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f282988d;

    /* compiled from: StrSoftBookingView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/l$a;", "Lcom/avito/android/util/q$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f282989a;

        public a(@Y61.k ViewGroup viewGroup) {
            this.f282989a = viewGroup;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            this.f282989a.setVisibility(8);
        }
    }

    /* compiled from: StrSoftBookingView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/l$b;", "Lcom/avito/android/util/q$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f282990a;

        public b(@Y61.k ViewGroup viewGroup) {
            this.f282990a = viewGroup;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Y61.k Animator animator) {
            this.f282990a.setVisibility(0);
        }
    }

    /* compiled from: StrSoftBookingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[StrSoftBookingContactFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = StrSoftBookingContactFieldType.f282654b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: StrSoftBookingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/g;", "invoke", "()Lcom/avito/android/short_term_rent/soft_booking/view/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<g> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final g invoke() {
            l lVar = l.this;
            return new g(lVar.c(), lVar.f282985a, lVar.f282986b);
        }
    }

    /* compiled from: StrSoftBookingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/k;", "invoke", "()Lcom/avito/android/short_term_rent/soft_booking/view/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<k> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f282992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f282992l = view;
        }

        @Override // Y41.a
        public final k invoke() {
            return new k(this.f282992l);
        }
    }

    public l(@Y61.k View view, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k com.avito.android.util.text.a aVar) {
        this.f282985a = abstractC25658a;
        this.f282986b = aVar;
        this.f282988d = C42727D.c(new e(view));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.a
    public final void a(@Y61.k InterfaceC44952b interfaceC44952b) {
        if (interfaceC44952b instanceof InterfaceC44952b.h) {
            InterfaceC44952b.h hVar = (InterfaceC44952b.h) interfaceC44952b;
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, c().getF282955d(), com.avito.android.printable_text.b.f(hVar.f422371a), null, null, null, hVar.f422372b, 2750, ToastBarPosition.f181045c, null, false, false, null, null, 3982);
            if (!hVar.f422373c || Build.VERSION.SDK_INT < 30) {
                return;
            }
            c().getF282949a().performHapticFeedback(16);
            return;
        }
        if (interfaceC44952b instanceof InterfaceC44952b.d) {
            InterfaceC44952b.d dVar = (InterfaceC44952b.d) interfaceC44952b;
            J0 j0O = C22823h0.o(c().getF282949a());
            if (j0O == null) {
                return;
            }
            if (!j0O.p(8)) {
                e(dVar.f422367a);
            } else {
                K2.d(c().getF282953c(), true);
                c().getF282951b().postDelayed(new RunnableC34589p(12, this, dVar), 200L);
            }
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.a
    public final void b(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar) {
        InterfaceC47457c interfaceC47457c = aVar.f282800i;
        if (interfaceC47457c instanceof InterfaceC47457c.C12346c) {
            D6.w(c().getF282953c());
            D6.w(c().getF282933K());
            D6.H(c().getF282935M());
            D6.w(c().getF282939Q());
            return;
        }
        if (!(interfaceC47457c instanceof InterfaceC47457c.a)) {
            if (interfaceC47457c instanceof InterfaceC47457c.b) {
                D6.w(c().getF282953c());
                D6.w(c().getF282933K());
                c().getF282940R().setLoading(false);
                D6.w(c().getF282935M());
                D6.w(c().getF282936N());
                D6.H(c().getF282939Q());
                return;
            }
            return;
        }
        InterfaceC47457c.a aVar2 = (InterfaceC47457c.a) interfaceC47457c;
        com.avito.android.short_term_rent.soft_booking.view.b bVar = (com.avito.android.short_term_rent.soft_booking.view.b) this.f282987c.getValue();
        bVar.r(aVar2.f429511b);
        bVar.y(aVar2.f429512c);
        bVar.c(aVar2.f429513d);
        bVar.m(aVar2.f429514e);
        bVar.v(aVar2.f429515f, aVar.f282796e);
        bVar.K(aVar2.f429516g);
        bVar.M(aVar2.f429517h);
        bVar.z(aVar2.f429518i);
        bVar.N(aVar2.f429519j);
        bVar.P(aVar2.f429520k);
        bVar.a(aVar2.f429521l.k0(c().getContext()));
        bVar.F(aVar2.f429522m);
        bVar.G(aVar2.f429523n, aVar2.f429524o);
        bVar.q(aVar2.f429525p);
        bVar.H(aVar2.f429526q);
        bVar.e(aVar2.f429527r);
        bVar.J(aVar2.f429528s);
        bVar.B(aVar2.f429529t);
        bVar.h(aVar2.f429530u);
        D6.H(c().getF282953c());
        D6.H(c().getF282933K());
        D6.w(c().getF282939Q());
        C47456b c47456b = aVar2.f429510a;
        boolean z12 = c47456b.f429509b;
        if (z12 && c47456b.f429508a) {
            c().getF282936N().animate().alpha(1.0f).setListener(new b(c().getF282936N()));
            c().getF282933K().animate().alpha(0.0f).setListener(new a(c().getF282933K()));
            D6.w(c().getF282934L());
            D6.w(c().getF282935M());
            D6.k(c().getF282932J());
            return;
        }
        if (z12) {
            D6.H(c().getF282934L());
            D6.H(c().getF282935M());
            D6.h(c().getF282932J());
            d();
            return;
        }
        d();
        D6.w(c().getF282934L());
        D6.w(c().getF282935M());
        D6.k(c().getF282932J());
    }

    public final j c() {
        return (j) this.f282988d.getValue();
    }

    public final void d() {
        c().getF282933K().animate().alpha(1.0f).setListener(new b(c().getF282933K()));
        c().getF282936N().animate().alpha(0.0f).setListener(new a(c().getF282936N()));
    }

    public final void e(StrSoftBookingContactFieldType strSoftBookingContactFieldType) {
        int top;
        if (c().getF282949a().isAttachedToWindow()) {
            int iOrdinal = strSoftBookingContactFieldType.ordinal();
            if (iOrdinal == 0) {
                top = c().getF282978t().getTop();
            } else if (iOrdinal == 1) {
                top = c().getF282980v().getTop();
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                top = c().getF282982x().getTop();
            }
            c().getF282951b().smoothScrollTo(0, top);
        }
    }
}
