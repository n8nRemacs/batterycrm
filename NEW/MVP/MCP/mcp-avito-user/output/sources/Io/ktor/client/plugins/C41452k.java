package io.ktor.client.plugins;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/d;", "response", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {"response", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "response", "exceptionResponse", HiAnalyticsConstant.HaKey.BI_KEY_RESULT}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* renamed from: io.ktor.client.plugins.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41452k extends SuspendLambda implements Y41.p<io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.client.statement.d f399479q;

    /* renamed from: r, reason: collision with root package name */
    public int f399480r;

    /* renamed from: s, reason: collision with root package name */
    public int f399481s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f399482t;

    public C41452k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C41452k c41452k = new C41452k(2, continuation);
        c41452k.f399482t = obj;
        return c41452k;
    }

    @Override // Y41.p
    public final Object invoke(io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        return ((C41452k) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(10:6|61|7|36|40|(2:44|(1:(1:52)(1:51))(1:47))(1:43)|53|(1:55)|56|57)(2:9|10))(1:11))(2:12|(4:14|(1:16)|17|18)(2:19|(2:58|59)(2:24|(1:26)(1:27))))|28|(1:31)|63|32|(1:34)(8:35|36|40|(2:44|(1:(2:49|52)(0))(0))(0)|53|(0)|56|57)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r0 = r1;
        r3 = r4;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.C41452k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
