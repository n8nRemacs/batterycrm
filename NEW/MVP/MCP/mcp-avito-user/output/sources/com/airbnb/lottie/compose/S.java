package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.InterfaceC22204y1;
import com.airbnb.lottie.compose.x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: rememberLottieComposition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {93, 95}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes10.dex */
final class S extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Throwable f59411q;

    /* renamed from: r, reason: collision with root package name */
    public int f59412r;

    /* renamed from: s, reason: collision with root package name */
    public int f59413s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Integer, Throwable, Continuation<? super Boolean>, Object> f59414t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f59415u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x.e f59416v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<u> f59417w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Y41.q qVar, Context context, x.e eVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f59414t = qVar;
        this.f59415u = context;
        this.f59416v = eVar;
        this.f59417w = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new S(this.f59414t, this.f59415u, this.f59416v, this.f59417w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((S) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ac -> B:40:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.S.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
