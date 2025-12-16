package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {114, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class R2 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Float>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f41260q;

    /* renamed from: r, reason: collision with root package name */
    public int f41261r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f41262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f41263t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f41264u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S2 f41265v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C43108m f41266w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f41267x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(ContentResolver contentResolver, Uri uri, S2 s22, C43108m c43108m, Context context, Continuation continuation) {
        super(2, continuation);
        this.f41263t = contentResolver;
        this.f41264u = uri;
        this.f41265v = s22;
        this.f41266w = c43108m;
        this.f41267x = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C43108m c43108m = this.f41266w;
        R2 r22 = new R2(this.f41263t, this.f41264u, this.f41265v, c43108m, this.f41267x, continuation);
        r22.f41262s = obj;
        return r22;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Float> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((R2) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:18:0x0044, B:22:0x0054, B:24:0x005c, B:14:0x002d, B:17:0x003e), top: B:31:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f41261r
            androidx.compose.ui.platform.S2 r2 = r10.f41265v
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f41263t
            if (r1 == 0) goto L31
            if (r1 == r4) goto L27
            if (r1 != r3) goto L1f
            kotlinx.coroutines.channels.y r1 = r10.f41260q
            java.lang.Object r6 = r10.f41262s
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L1d
        L1b:
            r11 = r6
            goto L44
        L1d:
            r11 = move-exception
            goto L84
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            kotlinx.coroutines.channels.y r1 = r10.f41260q
            java.lang.Object r6 = r10.f41262s
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L1d
            goto L54
        L31:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f41262s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            android.net.Uri r1 = r10.f41264u
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            kotlinx.coroutines.channels.m r1 = r10.f41266w     // Catch: java.lang.Throwable -> L1d
            kotlinx.coroutines.channels.y r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L44:
            r10.f41262s = r11     // Catch: java.lang.Throwable -> L1d
            r10.f41260q = r1     // Catch: java.lang.Throwable -> L1d
            r10.f41261r = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r6 = r1.a(r10)     // Catch: java.lang.Throwable -> L1d
            if (r6 != r0) goto L51
            return r0
        L51:
            r9 = r6
            r6 = r11
            r11 = r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r11 == 0) goto L7e
            r1.next()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r11 = r10.f41267x     // Catch: java.lang.Throwable -> L1d
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1d
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)     // Catch: java.lang.Throwable -> L1d
            r10.f41262s = r6     // Catch: java.lang.Throwable -> L1d
            r10.f41260q = r1     // Catch: java.lang.Throwable -> L1d
            r10.f41261r = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r11 = r6.emit(r11, r10)     // Catch: java.lang.Throwable -> L1d
            if (r11 != r0) goto L1b
            return r0
        L7e:
            r5.unregisterContentObserver(r2)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L84:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.R2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
