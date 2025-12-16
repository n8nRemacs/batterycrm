package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import com.avito.android.analytics.a0;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import com.avito.android.short_term_rent.bookingform.mvi.interactor.m;
import cw0.C39425b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcw0/b;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34968a implements com.avito.android.arch.mvi.a<com.avito.android.short_term_rent.bookingform.mvi.entity.a, BookingFormInternalAction, C39425b> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f281761f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BookingFormOpenParams f281762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.mvi.interactor.d f281763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.mvi.interactor.r f281764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.mvi.interactor.u f281765d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.mvi.interactor.a f281766e;

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/a$a;", "", "<init>", "()V", "", "ACTION_DEBOUNCE", "J", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a$a, reason: collision with other inner class name */
    public static final class C8398a {

        /* compiled from: BookingFormActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a;", "", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC8399a {

            /* compiled from: BookingFormActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8400a implements InterfaceC8399a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C8400a f281767a = new C8400a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C8400a);
                }

                public final int hashCode() {
                    return 1602544691;
                }

                @Y61.k
                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: BookingFormActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a$b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a$a$a$b */
            public static final /* data */ class b implements InterfaceC8399a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f281768a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -36919683;
                }

                @Y61.k
                public final String toString() {
                    return "WithDebounce";
                }
            }
        }

        public /* synthetic */ C8398a(C42822w c42822w) {
            this();
        }

        public C8398a() {
        }
    }

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$process$3", f = "BookingFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.short_term_rent.bookingform.mvi.entity.a f281770r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.short_term_rent.bookingform.mvi.entity.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f281770r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C34968a.this.new b(this.f281770r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C34968a.this.f281766e.a(a0.a(((a.l) this.f281770r).f281846a));
            return G0.f406611a;
        }
    }

    static {
        new C8398a(null);
    }

    @Inject
    public C34968a(@Y61.k BookingFormOpenParams bookingFormOpenParams, @Y61.k com.avito.android.short_term_rent.bookingform.mvi.interactor.d dVar, @Y61.k com.avito.android.short_term_rent.bookingform.mvi.interactor.r rVar, @Y61.k com.avito.android.short_term_rent.bookingform.mvi.interactor.u uVar, @Y61.k com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar) {
        this.f281762a = bookingFormOpenParams;
        this.f281763b = dVar;
        this.f281764c = rVar;
        this.f281765d = uVar;
        this.f281766e = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new r(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, q.f281994l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BookingFormInternalAction> b(@Y61.k com.avito.android.short_term_rent.bookingform.mvi.entity.a aVar, @Y61.k C39425b c39425b) {
        C43210w c43210w;
        if (aVar instanceof a.j) {
            return new C43210w(BookingFormInternalAction.CloseScreen.f281793b);
        }
        if (aVar instanceof a.i) {
            return C43175k.G(new C34976i(c39425b, (a.i) aVar, null));
        }
        if (aVar instanceof a.c) {
            c43210w = new C43210w(new BookingFormInternalAction.OpenDeepLink(((a.c) aVar).f281834a, null, 2, null));
        } else {
            if (aVar instanceof a.C8401a) {
                return C43175k.G(new C34969b(c39425b, null));
            }
            if (aVar instanceof a.e) {
                return C43175k.G(new C34972e(c39425b, this, (a.e) aVar, null));
            }
            if (aVar instanceof a.d) {
                C24186b c24186bA = c39425b.f393066b;
                if (c24186bA == null) {
                    com.avito.android.short_term_rent.bookingform.mvi.interactor.m.f281918e.getClass();
                    c24186bA = m.a.a(this.f281762a);
                }
                return this.f281763b.a(c24186bA);
            }
            if (aVar instanceof a.b) {
                return C43175k.G(new C34971d(this, (a.b) aVar, c39425b, null));
            }
            if (aVar instanceof a.f) {
                return C43175k.G(new C34973f(c39425b, this, (a.f) aVar, null));
            }
            if (aVar instanceof a.g) {
                return C43175k.G(new C34974g((a.g) aVar, c39425b, this, null));
            }
            if (aVar instanceof a.r) {
                return C43175k.G(new p((a.r) aVar, c39425b, this, null));
            }
            if (aVar instanceof a.p) {
                return C43175k.G(new m(c39425b, (a.p) aVar, this, null));
            }
            if (aVar instanceof a.q) {
                return C43175k.G(new n((a.q) aVar, c39425b, this, null));
            }
            if (aVar instanceof a.o) {
                return C43175k.G(new k(c39425b, ((a.o) aVar).f281850a, this, null));
            }
            if (aVar instanceof a.n) {
                a.n nVar = (a.n) aVar;
                return C43175k.G(new l(c39425b, this, nVar.f281848a, nVar.f281849b, null));
            }
            if (aVar instanceof a.m) {
                return C43175k.G(new C34977j(this, null));
            }
            if (!(aVar instanceof a.k)) {
                if (aVar instanceof a.h) {
                    return C43175k.G(new C34970c((a.h) aVar, this, null));
                }
                if (aVar instanceof a.l) {
                    return C43175k.G(new b(aVar, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new BookingFormInternalAction.ShowRetroBadgeHint(((a.k) aVar).f281845a));
        }
        return c43210w;
    }
}
