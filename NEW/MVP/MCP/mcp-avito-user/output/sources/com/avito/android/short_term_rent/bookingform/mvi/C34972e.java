package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import cw0.C39429f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleFooterButtonClick$1", f = "BookingFormActor.kt", i = {0, 0, 1, 1}, l = {163, 165, 189, 193, 194}, m = "invokeSuspend", n = {"$this$flow", "inputs", "$this$flow", "verdict"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34972e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f281784q;

    /* renamed from: r, reason: collision with root package name */
    public int f281785r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f281786s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281787t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34968a f281788u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a.e f281789v;

    /* compiled from: BookingFormActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.e$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FooterButtonItem.ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FooterButtonItem.ActionType actionType = FooterButtonItem.ActionType.f281827b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw0/f;", "page", "", "invoke", "(Lcw0/f;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.e$b */
    public static final class b extends N implements Y41.l<C39429f, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C39425b f281790l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C39425b c39425b) {
            super(1);
            this.f281790l = c39425b;
        }

        @Override // Y41.l
        public final Boolean invoke(C39429f c39429f) {
            return Boolean.valueOf(c39429f.f393088a == this.f281790l.f393068d);
        }
    }

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "item", "", "invoke", "(Lcom/avito/conveyor_item/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.e$c */
    public static final class c extends N implements Y41.l<com.avito.conveyor_item.a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f281791l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f281791l = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.avito.conveyor_item.a r2) {
            /*
                r1 = this;
                com.avito.conveyor_item.a r2 = (com.avito.conveyor_item.a) r2
                boolean r0 = r2 instanceof com.avito.android.short_term_rent.bookingform.items.input.FormInputItem
                if (r0 == 0) goto L14
                com.avito.android.short_term_rent.bookingform.items.input.FormInputItem r2 = (com.avito.android.short_term_rent.bookingform.items.input.FormInputItem) r2
                java.lang.String r0 = r1.f281791l
                java.lang.String r2 = r2.f281540c
                boolean r2 = kotlin.jvm.internal.L.f(r2, r0)
                if (r2 == 0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.C34972e.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34972e(C39425b c39425b, C34968a c34968a, a.e eVar, Continuation<? super C34972e> continuation) {
        super(2, continuation);
        this.f281787t = c39425b;
        this.f281788u = c34968a;
        this.f281789v = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34972e c34972e = new C34972e(this.f281787t, this.f281788u, this.f281789v, continuation);
        c34972e.f281786s = obj;
        return c34972e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34972e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.C34972e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
