package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.GuestCountOption;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import gj.InterfaceC40691b;
import hw0.InterfaceC41182a;
import hw0.InterfaceC41183b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import pw0.C47157a;
import pw0.C47159c;
import pw0.C47160d;

/* compiled from: StrSoftBookingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/u;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements com.avito.android.arch.mvi.b<StrSoftBookingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.soft_booking.domain.k f282837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f282838b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f282839c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Date f282840d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Date f282841e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282842f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f282843g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f282844h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f282845i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f282846j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Boolean f282847k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f282848l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f282849m;

    /* compiled from: StrSoftBookingBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingBootstrap$produce$1", f = "StrSoftBookingBootstrap.kt", i = {0}, l = {52, 53}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282850q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f282851r;

        /* compiled from: Gsons.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.u$a$a, reason: collision with other inner class name */
        public static final class C8450a extends com.google.gson.reflect.a<GuestsDetailedValue> {
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = u.this.new a(continuation);
            aVar.f282851r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            GuestsDetailedValue guestsDetailedValue;
            boolean z12;
            Object objE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282850q;
            u uVar = u.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f282851r;
                if (!uVar.f282849m) {
                    StrSoftBookingInternalAction.SetupXHash setupXHash = new StrSoftBookingInternalAction.SetupXHash(uVar.f282846j);
                    this.f282851r = interfaceC43172j;
                    this.f282850q = 1;
                    if (interfaceC43172j.emit(setupXHash, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                z12 = true;
                uVar.f282849m = z12;
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f282851r;
            C42729a0.b(obj);
            com.avito.android.short_term_rent.soft_booking.domain.k kVar = uVar.f282837a;
            GuestCountOption guestCountOption = new GuestCountOption("", uVar.f282842f);
            String str = uVar.f282844h;
            if (str != null) {
                Gson gson = uVar.f282839c;
                try {
                    Type type = new C8450a().getType();
                    objE = gson.e(str, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                } catch (Throwable unused) {
                    objE = null;
                }
                guestsDetailedValue = (GuestsDetailedValue) objE;
            } else {
                guestsDetailedValue = null;
            }
            X xA2 = kVar.a(new C47157a(uVar.f282840d, uVar.f282841e, uVar.f282843g, guestCountOption, null, new C47160d(null, null, guestsDetailedValue, null, null, null, null, null, 251, null), uVar.f282845i, null), new C47159c(null, null, null, null), new pw0.j(uVar.f282838b.j()), new pw0.g(null, null), new pw0.i(null, null), new pw0.h(uVar.f282848l, null, null), uVar.f282847k);
            this.f282851r = null;
            this.f282850q = 2;
            if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z12 = true;
            uVar.f282849m = z12;
            return G0.f406611a;
        }
    }

    @Inject
    public u(@Y61.k com.avito.android.short_term_rent.soft_booking.domain.k kVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k Gson gson, @Y61.l @InterfaceC41183b Date date, @Y61.l @hw0.c Date date2, @hw0.e int i12, @InterfaceC41182a @Y61.k String str, @Y61.l @hw0.f String str2, @hw0.k boolean z12, @hw0.l @Y61.l String str3, @hw0.h @Y61.l Boolean bool, @Y61.l @hw0.g String str4) {
        this.f282837a = kVar;
        this.f282838b = interfaceC40691b;
        this.f282839c = gson;
        this.f282840d = date;
        this.f282841e = date2;
        this.f282842f = i12;
        this.f282843g = str;
        this.f282844h = str2;
        this.f282845i = z12;
        this.f282846j = str3;
        this.f282847k = bool;
        this.f282848l = str4;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSoftBookingInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
