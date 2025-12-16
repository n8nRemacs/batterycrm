package com.avito.android.code_check.pre_request.mvi;

import To.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.code_check.pre_request.mvi.entity.PreRequestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC43160i<PreRequestInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f119193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.code_check.d f119194c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f119195b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.code_check.d f119196c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.code_check.pre_request.mvi.PreRequestBootstrapKt$mapResultToInternalAction$$inlined$map$1$2", f = "PreRequestBootstrap.kt", i = {0, 0}, l = {222, 219}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$2"})
        /* renamed from: com.avito.android.code_check.pre_request.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C3492a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f119197q;

            /* renamed from: r, reason: collision with root package name */
            public int f119198r;

            /* renamed from: s, reason: collision with root package name */
            public a f119199s;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f119201u;

            /* renamed from: v, reason: collision with root package name */
            public d.a f119202v;

            public C3492a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f119197q = obj;
                this.f119198r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, com.avito.android.code_check.d dVar) {
            this.f119195b = interfaceC43172j;
            this.f119196c = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.pre_request.mvi.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(InterfaceC43160i interfaceC43160i, com.avito.android.code_check.d dVar) {
        this.f119193b = interfaceC43160i;
        this.f119194c = dVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super PreRequestInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f119193b.collect(new a(interfaceC43172j, this.f119194c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
