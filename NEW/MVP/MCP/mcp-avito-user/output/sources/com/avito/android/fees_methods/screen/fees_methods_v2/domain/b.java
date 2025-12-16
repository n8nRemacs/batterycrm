package com.avito.android.fees_methods.screen.fees_methods_v2.domain;

import CE.a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity.FeesMethodsV2InternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: FeesMethodsV2UseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/domain/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/domain/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.fees_methods.screen.fees_methods_v2.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f158256a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AE.a f158257b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.fees_methods.common.domain.a f158258c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f158259d;

    /* compiled from: FeesMethodsV2UseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.fees_methods.screen.fees_methods_v2.domain.FeesMethodsV2UseCaseImpl$invoke$1", f = "FeesMethodsV2UseCase.kt", i = {0, 1, 2, 2}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 33, 37, 41, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super FeesMethodsV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public a.b f158260q;

        /* renamed from: r, reason: collision with root package name */
        public int f158261r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f158262s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f158262s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FeesMethodsV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.fees_methods.screen.fees_methods_v2.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k String str, @k AE.a aVar, @k com.avito.android.fees_methods.common.domain.a aVar2, @k R0 r02) {
        this.f158256a = str;
        this.f158257b = aVar;
        this.f158258c = aVar2;
        this.f158259d = r02;
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.domain.a
    @k
    public final InterfaceC43160i<FeesMethodsV2InternalAction> invoke() {
        return C43175k.I(this.f158259d.a(), C43175k.G(new a(null)));
    }
}
