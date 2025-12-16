package io.ktor.http.content;

import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.http.C41524i;
import io.ktor.http.C41528k;
import io.ktor.http.C41535n0;
import io.ktor.http.content.p;
import io.ktor.utils.io.InterfaceC41649d1;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43047d;

/* compiled from: WriterContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/B;", "Lio/ktor/http/content/p$e;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B extends p.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Writer, Continuation<? super G0>, Object> f399945a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41524i f399946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f399948d;

    /* compiled from: WriterContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public OutputStreamWriter f399949q;

        /* renamed from: r, reason: collision with root package name */
        public int f399950r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41649d1 f399951s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Charset f399952t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ B f399953u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC41649d1 interfaceC41649d1, Charset charset, B b12, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f399951s = interfaceC41649d1;
            this.f399952t = charset;
            this.f399953u = b12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f399951s, this.f399952t, this.f399953u, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            OutputStreamWriter outputStreamWriter;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f399950r;
            if (i12 == 0) {
                C42729a0.b(obj);
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(io.ktor.utils.io.jvm.javaio.b.c(this.f399951s), this.f399952t);
                try {
                    Y41.p<Writer, Continuation<? super G0>, Object> pVar = this.f399953u.f399945a;
                    this.f399949q = outputStreamWriter2;
                    this.f399950r = 1;
                    if (pVar.invoke(outputStreamWriter2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    outputStreamWriter = outputStreamWriter2;
                } catch (Throwable th3) {
                    outputStreamWriter = outputStreamWriter2;
                    th2 = th3;
                    throw th2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                outputStreamWriter = this.f399949q;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(outputStreamWriter, th2);
                        throw th5;
                    }
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(outputStreamWriter, null);
            return G0.f406611a;
        }
    }

    public B() {
        throw null;
    }

    public B(Y41.p pVar, C41524i c41524i, C41535n0 c41535n0, Long l12, int i12, C42822w c42822w) {
        c41535n0 = (i12 & 4) != 0 ? null : c41535n0;
        l12 = (i12 & 8) != 0 ? null : l12;
        this.f399945a = pVar;
        this.f399946b = c41524i;
        this.f399947c = c41535n0;
        this.f399948d = l12;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399948d() {
        return this.f399948d;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399946b() {
        return this.f399946b;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399947c() {
        return this.f399947c;
    }

    @Override // io.ktor.http.content.p.e
    @Y61.l
    public final Object e(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k Continuation<? super G0> continuation) {
        Charset charsetA = C41528k.a(this.f399946b);
        if (charsetA == null) {
            charsetA = C43047d.f410589b;
        }
        Object objA = C41512a.a(new a(interfaceC41649d1, charsetA, this, null), (SuspendLambda) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
