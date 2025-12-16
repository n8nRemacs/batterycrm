package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.R;
import com.avito.android.hotel_booking.Input;
import com.avito.android.hotel_booking.InputConstraint;
import com.avito.android.hotel_booking.enter_data.mvi.v;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: EnterDataValidateInputsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/q;", "Lcom/avito/android/hotel_booking/enter_data/mvi/p;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f163590a;

    /* compiled from: EnterDataValidateInputsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/hotel_booking/enter_data/mvi/v;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/hotel_booking/enter_data/mvi/v;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.mvi.EnterDataValidateInputsUseCaseImpl$invoke$2", f = "EnterDataValidateInputsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super v>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Input f163591q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ q f163592r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Input input, q qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163591q = input;
            this.f163592r = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f163591q, this.f163592r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super v> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Input input = this.f163591q;
            List<InputConstraint> listC = input.c();
            if (listC != null) {
                for (InputConstraint inputConstraint : listC) {
                    String text2 = input.getText();
                    this.f163592r.getClass();
                    if (!(inputConstraint instanceof InputConstraint.Pattern)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Pattern patternCompile = Pattern.compile(((InputConstraint.Pattern) inputConstraint).getPattern(), 2);
                    if (text2 == null) {
                        text2 = "";
                    }
                    if (!patternCompile.matcher(text2).matches()) {
                        return new v.a(com.avito.android.printable_text.b.f(((InputConstraint.Pattern) inputConstraint).getErrorText()));
                    }
                }
            }
            return (input.e() && ((text = input.getText()) == null || C43066x.K(text))) ? new v.a(com.avito.android.printable_text.b.c(R.string.hotel_booking_empty_input_error_message, new Serializable[0])) : v.b.f163596a;
        }
    }

    @Inject
    public q(@Y61.k R0 r02) {
        this.f163590a = r02;
    }

    @Override // com.avito.android.hotel_booking.enter_data.mvi.p
    @Y61.l
    public final Object a(@Y61.k Input input, @Y61.k Continuation<? super v> continuation) {
        return C43259k.g(this.f163590a.c(), new a(input, this, null), continuation);
    }
}
