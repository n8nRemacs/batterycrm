package com.avito.android.hotel_booking.domain;

import Y41.p;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: HotelBookingUpdateParameterUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/domain/k;", "Lcom/avito/android/hotel_booking/domain/j;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f163468a;

    /* compiled from: HotelBookingUpdateParameterUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/T;", "", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.domain.HotelBookingUpdateParameterUseCaseImpl$invoke$2", f = "HotelBookingUpdateParameterUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super List<? extends HotelBookingFormItem>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<HotelBookingFormItem> f163469q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f163470r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f163471s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends HotelBookingFormItem> list, String str, T t12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163469q = list;
            this.f163470r = str;
            this.f163471s = t12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f163469q, this.f163470r, this.f163471s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super List<? extends HotelBookingFormItem>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.domain.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public k(@Y61.k R0 r02) {
        this.f163468a = r02;
    }

    @Override // com.avito.android.hotel_booking.domain.j
    @Y61.l
    public final <T> Object a(@Y61.k List<? extends HotelBookingFormItem> list, @Y61.l String str, @Y61.l T t12, @Y61.k Continuation<? super List<? extends HotelBookingFormItem>> continuation) {
        return C43259k.g(this.f163468a.c(), new a(list, str, t12, null), continuation);
    }
}
