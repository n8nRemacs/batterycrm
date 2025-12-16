package com.avito.android.bxcontent;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.InterfaceC28963b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$special$$inlined$transform$2", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29081f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC28963b.InterfaceC3268b>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111059q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111060r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f111061s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28969d f111062t;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.f$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC28963b.InterfaceC3268b> f111063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28969d f111064c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$special$$inlined$transform$2$1", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.f$a$a, reason: collision with other inner class name */
        public static final class C3276a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f111065q;

            /* renamed from: r, reason: collision with root package name */
            public int f111066r;

            public C3276a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f111065q = obj;
                this.f111066r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C28969d c28969d) {
            this.f111064c = c28969d;
            this.f111063b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.C29081f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29081f(InterfaceC43160i interfaceC43160i, Continuation continuation, C28969d c28969d) {
        super(2, continuation);
        this.f111061s = interfaceC43160i;
        this.f111062t = c28969d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29081f c29081f = new C29081f(this.f111061s, continuation, this.f111062t);
        c29081f.f111060r = obj;
        return c29081f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC28963b.InterfaceC3268b> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29081f) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111059q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f111060r, this.f111062t);
            this.f111059q = 1;
            if (this.f111061s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
