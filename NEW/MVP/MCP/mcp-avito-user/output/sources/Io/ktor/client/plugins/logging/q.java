package io.ktor.client.plugins.logging;

import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1", f = "Logging.kt", i = {0, 0, 1, 3, 5}, l = {222, JfifUtil.MARKER_APP1, 226, JfifUtil.MARKER_APP1, 226, JfifUtil.MARKER_APP1, 226}, m = "invokeSuspend", n = {"logger", "log", "logger", "logger", "logger"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes8.dex */
final class q extends SuspendLambda implements Y41.p<io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public StringBuilder f399551q;

    /* renamed from: r, reason: collision with root package name */
    public int f399552r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399553s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f399554t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f399554t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f399554t, continuation);
        qVar.f399553s = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        return ((q) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
