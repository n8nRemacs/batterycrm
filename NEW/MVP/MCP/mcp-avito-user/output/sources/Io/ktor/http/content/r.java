package io.ktor.http.content;

import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.content.p;
import io.ktor.utils.io.InterfaceC41649d1;
import java.io.Closeable;
import java.io.OutputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: OutputStreamContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/r;", "Lio/ktor/http/content/p$e;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r extends p.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<OutputStream, Continuation<? super G0>, Object> f399977a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41524i f399978b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399979c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f399980d;

    /* compiled from: OutputStreamContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.http.content.OutputStreamContent$writeTo$2", f = "OutputStreamContent.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f399981q;

        /* renamed from: r, reason: collision with root package name */
        public int f399982r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41649d1 f399983s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ r f399984t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC41649d1 interfaceC41649d1, r rVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f399983s = interfaceC41649d1;
            this.f399984t = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f399983s, this.f399984t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Closeable closeable;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f399982r;
            if (i12 == 0) {
                C42729a0.b(obj);
                OutputStream outputStreamC = io.ktor.utils.io.jvm.javaio.b.c(this.f399983s);
                try {
                    Y41.p<OutputStream, Continuation<? super G0>, Object> pVar = this.f399984t.f399977a;
                    this.f399981q = outputStreamC;
                    this.f399982r = 1;
                    if (pVar.invoke(outputStreamC, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = outputStreamC;
                } catch (Throwable th3) {
                    closeable = outputStreamC;
                    th2 = th3;
                    throw th2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f399981q;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(closeable, null);
            return G0.f406611a;
        }
    }

    public r() {
        throw null;
    }

    public r(Y41.p pVar, C41524i c41524i, C41535n0 c41535n0, Long l12, int i12, C42822w c42822w) {
        c41535n0 = (i12 & 4) != 0 ? null : c41535n0;
        l12 = (i12 & 8) != 0 ? null : l12;
        this.f399977a = pVar;
        this.f399978b = c41524i;
        this.f399979c = c41535n0;
        this.f399980d = l12;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399980d() {
        return this.f399980d;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399978b() {
        return this.f399978b;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399979c() {
        return this.f399979c;
    }

    @Override // io.ktor.http.content.p.e
    @Y61.l
    public final Object e(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k Continuation<? super G0> continuation) {
        Object objA = C41512a.a(new a(interfaceC41649d1, this, null), (SuspendLambda) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
