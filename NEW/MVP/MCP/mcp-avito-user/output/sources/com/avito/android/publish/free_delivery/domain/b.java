package com.avito.android.publish.free_delivery.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import com.avito.android.util.R0;
import dl0.InterfaceC39749a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreeDeliveryDetailsUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/domain/b;", "Lcom/avito/android/publish/free_delivery/domain/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.free_delivery.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C0 f235784a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC39749a f235785b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f235786c;

    /* compiled from: FreeDeliveryDetailsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.free_delivery.domain.FreeDeliveryDetailsUseCaseImpl$invoke$1", f = "FreeDeliveryDetailsUseCase.kt", i = {0, 1}, l = {30, 37, 44, 47}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f235787q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f235788r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f235788r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.free_delivery.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k C0 c02, @k InterfaceC39749a interfaceC39749a, @k R0 r02) {
        this.f235784a = c02;
        this.f235785b = interfaceC39749a;
        this.f235786c = r02;
    }

    @Override // com.avito.android.publish.free_delivery.domain.a
    @k
    public final InterfaceC43160i<FreeDeliveryInternalAction> invoke() {
        return C43175k.I(this.f235786c.a(), C43175k.G(new a(null)));
    }
}
