package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {703, 704}, m = "animateToCurrent$material3_release", n = {"this", "end"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
final class Tk extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Sk f35514q;

    /* renamed from: r, reason: collision with root package name */
    public float f35515r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f35516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Sk f35517t;

    /* renamed from: u, reason: collision with root package name */
    public int f35518u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tk(Sk sk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35517t = sk2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            r9.f35516s = r10
            int r10 = r9.f35518u
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.f35518u = r10
            androidx.compose.material3.Sk r10 = r9.f35517t
            r10.getClass()
            boolean r0 = r9 instanceof androidx.compose.material3.Tk
            if (r0 == 0) goto L1f
            int r0 = r9.f35518u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r9.f35518u = r0
            r6 = r9
            goto L25
        L1f:
            androidx.compose.material3.Tk r0 = new androidx.compose.material3.Tk
            r0.<init>(r10, r9)
            r6 = r0
        L25:
            java.lang.Object r0 = r6.f35516s
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f35518u
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4d
            if (r1 == r4) goto L43
            if (r1 != r3) goto L3b
            kotlin.C42729a0.b(r0)
            goto Lc5
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L43:
            float r10 = r6.f35515r
            androidx.compose.material3.Sk r1 = r6.f35514q
            kotlin.C42729a0.b(r0)
            r0 = r10
            r10 = r1
            goto La7
        L4d:
            kotlin.C42729a0.b(r0)
            int r0 = r10.b()
            androidx.compose.material3.Ee$a r1 = androidx.compose.material3.Ee.f34679b
            r1.getClass()
            boolean r0 = androidx.compose.material3.Ee.b(r0, r2)
            androidx.compose.runtime.v1 r1 = r10.f35429g
            androidx.compose.runtime.v1 r5 = r10.f35430h
            if (r0 == 0) goto L74
            androidx.compose.runtime.c3 r5 = (androidx.compose.runtime.C22040c3) r5
            float r0 = r5.f()
            androidx.compose.runtime.c3 r1 = (androidx.compose.runtime.C22040c3) r1
            float r1 = r1.f()
            kotlin.Q r0 = androidx.compose.material3.Ok.a(r0, r1)
            goto L84
        L74:
            androidx.compose.runtime.c3 r1 = (androidx.compose.runtime.C22040c3) r1
            float r0 = r1.f()
            androidx.compose.runtime.c3 r5 = (androidx.compose.runtime.C22040c3) r5
            float r1 = r5.f()
            kotlin.Q r0 = androidx.compose.material3.Ok.a(r0, r1)
        L84:
            A r1 = r0.f406619b
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            B r0 = r0.f406620c
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r6.f35514q = r10
            r6.f35515r = r0
            r6.f35518u = r4
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r4 = r10.f35433k
            java.lang.Object r1 = r4.h(r1, r6)
            if (r1 != r8) goto La7
            goto Lc7
        La7:
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r10.f35433k
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r0 = 200(0xc8, float:2.8E-43)
            r4 = 0
            r5 = 6
            androidx.compose.animation.core.G1 r0 = androidx.compose.animation.core.C20310q.e(r0, r2, r4, r5)
            r6.f35514q = r4
            r6.f35518u = r3
            r5 = 0
            r7 = 12
            r2 = r10
            r3 = r0
            java.lang.Object r10 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r8) goto Lc5
            goto Lc7
        Lc5:
            kotlin.G0 r8 = kotlin.G0.f406611a
        Lc7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Tk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
