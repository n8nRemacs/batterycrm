package androidx.compose.ui.window;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", i = {0}, l = {371}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* renamed from: androidx.compose.ui.window.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22731s extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f43112q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f43113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L f43114s;

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.window.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f43115l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Long l12) {
            l12.longValue();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22731s(L l12, Continuation<? super C22731s> continuation) {
        super(2, continuation);
        this.f43114s = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        C22731s c22731s = new C22731s(this.f43114s, continuation);
        c22731s.f43113r = obj;
        return c22731s;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C22731s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Path cross not found for [B:16:0x0048, B:18:0x004c], limit reached: 21 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f43112q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r8.f43113r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r9)
            goto L36
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f43113r
            kotlinx.coroutines.T r9 = (kotlinx.coroutines.T) r9
            r1 = r9
        L23:
            boolean r9 = kotlinx.coroutines.U.e(r1)
            if (r9 == 0) goto L50
            androidx.compose.ui.window.s$a r9 = androidx.compose.ui.window.C22731s.a.f43115l
            r8.f43113r = r1
            r8.f43112q = r2
            java.lang.Object r9 = androidx.compose.ui.platform.C22516q1.a(r9, r8)
            if (r9 != r0) goto L36
            return r0
        L36:
            androidx.compose.ui.window.L r9 = r8.f43114s
            int[] r3 = r9.f43035B
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f43039m
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L4c
            r3 = r3[r2]
            if (r6 == r3) goto L23
        L4c:
            r9.m()
            goto L23
        L50:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.C22731s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
