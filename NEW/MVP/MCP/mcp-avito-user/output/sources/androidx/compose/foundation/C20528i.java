package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20528i implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C20525h f28127b;

    /* compiled from: AndroidOverscroll.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {783, 787}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.i$a */
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f28128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f28129r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20525h f28130s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20525h c20525h, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28130s = c20525h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f28130s, continuation);
            aVar.f28129r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f28128q
                androidx.compose.foundation.h r2 = r11.f28130s
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r1 = r11.f28129r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r12)
                goto L52
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                java.lang.Object r1 = r11.f28129r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r12)
                goto L3b
            L28:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f28129r
                r1 = r12
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                r11.f28129r = r1
                r11.f28128q = r4
                java.lang.Object r12 = androidx.compose.foundation.gestures.C20445d2.c(r1, r11, r3)
                if (r12 != r0) goto L3b
                return r0
            L3b:
                androidx.compose.ui.input.pointer.C r12 = (androidx.compose.ui.input.pointer.C) r12
                long r4 = r12.f40116a
                r2.f28113h = r4
                long r4 = r12.f40118c
                r2.f28107b = r4
            L45:
                r11.f28129r = r1
                r11.f28128q = r3
                androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
                java.lang.Object r12 = r1.N1(r12, r11)
                if (r12 != r0) goto L52
                return r0
            L52:
                androidx.compose.ui.input.pointer.s r12 = (androidx.compose.ui.input.pointer.C22340s) r12
                java.lang.Object r12 = r12.f40278a
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = r12.size()
                r4.<init>(r5)
                r5 = r12
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
                r7 = r6
            L68:
                if (r7 >= r5) goto L7b
                java.lang.Object r8 = r12.get(r7)
                r9 = r8
                androidx.compose.ui.input.pointer.C r9 = (androidx.compose.ui.input.pointer.C) r9
                boolean r9 = r9.f40119d
                if (r9 == 0) goto L78
                r4.add(r8)
            L78:
                int r7 = r7 + 1
                goto L68
            L7b:
                int r12 = r4.size()
            L7f:
                if (r6 >= r12) goto L96
                java.lang.Object r5 = r4.get(r6)
                r7 = r5
                androidx.compose.ui.input.pointer.C r7 = (androidx.compose.ui.input.pointer.C) r7
                long r7 = r7.f40116a
                long r9 = r2.f28113h
                boolean r7 = androidx.compose.ui.input.pointer.B.a(r7, r9)
                if (r7 == 0) goto L93
                goto L97
            L93:
                int r6 = r6 + 1
                goto L7f
            L96:
                r5 = 0
            L97:
                androidx.compose.ui.input.pointer.C r5 = (androidx.compose.ui.input.pointer.C) r5
                if (r5 != 0) goto La2
                java.lang.Object r12 = kotlin.collections.C42745f0.G(r4)
                r5 = r12
                androidx.compose.ui.input.pointer.C r5 = (androidx.compose.ui.input.pointer.C) r5
            La2:
                if (r5 == 0) goto Lac
                long r6 = r5.f40116a
                r2.f28113h = r6
                long r5 = r5.f40118c
                r2.f28107b = r5
            Lac:
                boolean r12 = r4.isEmpty()
                if (r12 == 0) goto L45
                r0 = -1
                r2.f28113h = r0
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20528i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C20528i(C20525h c20525h) {
        this.f28127b = c20525h;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        Object objC = C20444d1.c(k12, new a(this.f28127b, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
