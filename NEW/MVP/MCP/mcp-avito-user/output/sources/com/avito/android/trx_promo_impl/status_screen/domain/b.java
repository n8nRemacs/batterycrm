package com.avito.android.trx_promo_impl.status_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TrxPromoStatusUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_impl.status_screen.domain.TrxPromoStatusUseCaseImpl$invoke$1", f = "TrxPromoStatusUseCase.kt", i = {0, 1, 4}, l = {AvailableCode.ERROR_NO_ACTIVITY, 30, 31, 32, 37, 38, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f304434q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f304435r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f304436s;

    /* compiled from: TrxPromoStatusUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TrxPromoStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<TrxPromoStatus> creator = TrxPromoStatus.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f304436s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f304436s, continuation);
        bVar.f304435r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.status_screen.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
