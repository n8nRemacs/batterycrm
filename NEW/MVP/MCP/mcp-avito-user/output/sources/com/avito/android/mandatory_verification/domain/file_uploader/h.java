package com.avito.android.mandatory_verification.domain.file_uploader;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$uploadFile$$inlined$transform$1", f = "FileUploaderInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class h extends SuspendLambda implements p<InterfaceC43172j<? super l>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43152f0 f184541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f184542t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f184543u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ PrintableText f184544v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f184545w;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<l> f184546b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f184547c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f184548d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ PrintableText f184549e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f184550f;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$uploadFile$$inlined$transform$1$1", f = "FileUploaderInteractor.kt", i = {2, 2}, l = {222, 228, 233, 238, 245}, m = "emit", n = {VoiceInfo.STATE, "$this$uploadFile_u24lambda_u241"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.mandatory_verification.domain.file_uploader.h$a$a, reason: collision with other inner class name */
        public static final class C5418a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f184551q;

            /* renamed from: r, reason: collision with root package name */
            public int f184552r;

            /* renamed from: t, reason: collision with root package name */
            public P2.a f184554t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f184555u;

            public C5418a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f184551q = obj;
                this.f184552r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, String str, long j12, PrintableText printableText, String str2) {
            this.f184547c = str;
            this.f184548d = j12;
            this.f184549e = printableText;
            this.f184550f = str2;
            this.f184546b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.domain.file_uploader.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C43152f0 c43152f0, Continuation continuation, String str, long j12, PrintableText printableText, String str2) {
        super(2, continuation);
        this.f184541s = c43152f0;
        this.f184542t = str;
        this.f184543u = j12;
        this.f184544v = printableText;
        this.f184545w = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f184541s, continuation, this.f184542t, this.f184543u, this.f184544v, this.f184545w);
        hVar.f184540r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super l> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184539q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f184540r, this.f184542t, this.f184543u, this.f184544v, this.f184545w);
            this.f184539q = 1;
            if (this.f184541s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
