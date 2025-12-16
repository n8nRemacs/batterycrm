package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC43032o;

/* compiled from: MouseWheelScrollable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/o;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20492p1 extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f27908q;

    /* renamed from: r, reason: collision with root package name */
    public int f27909r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27910s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Object> f27911t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20492p1(Y41.a<Object> aVar, Continuation<? super C20492p1> continuation) {
        super(2, continuation);
        this.f27911t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20492p1 c20492p1 = new C20492p1(this.f27911t, continuation);
        c20492p1.f27910s = obj;
        return c20492p1;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC43032o<Object> abstractC43032o, Continuation<? super kotlin.G0> continuation) {
        return ((C20492p1) create(abstractC43032o, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f27909r
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r4.f27908q
            java.lang.Object r3 = r4.f27910s
            kotlin.sequences.o r3 = (kotlin.sequences.AbstractC43032o) r3
            kotlin.C42729a0.b(r5)
            goto L3d
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            kotlin.C42729a0.b(r5)
            java.lang.Object r5 = r4.f27910s
            kotlin.sequences.o r5 = (kotlin.sequences.AbstractC43032o) r5
            r3 = r5
        L25:
            Y41.a<java.lang.Object> r5 = r4.f27911t
            androidx.compose.foundation.gestures.o1 r5 = (androidx.compose.foundation.gestures.C20488o1) r5
            java.lang.Object r1 = r5.invoke()
            if (r1 == 0) goto L3c
            r4.f27910s = r3
            r4.f27908q = r1
            r4.f27909r = r2
            java.lang.Object r5 = r3.a(r1, r4)
            if (r5 != r0) goto L3d
            return r0
        L3c:
            r1 = 0
        L3d:
            if (r1 != 0) goto L25
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20492p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
