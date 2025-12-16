package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.C21057u1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.W1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: TextFieldSelectionManager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o1 {

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "<anonymous>", "()Ll0/g;"}, k = 3, mv = {1, 9, 0})
    public static final class a implements InterfaceC21039u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32092b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f32093c;

        public a(C21011f1 c21011f1, boolean z12) {
            this.f32092b = c21011f1;
            this.f32093c = z12;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21039u
        public final long a() {
            return this.f32092b.l(this.f32093c);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W1 f32094b;

        public b(W1 w12) {
            this.f32094b = w12;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objA = C21057u1.a(k12, this.f32094b, continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f32095l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f32096m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32097n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f32098o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, ResolvedTextDirection resolvedTextDirection, C21011f1 c21011f1, int i12) {
            super(2);
            this.f32095l = z12;
            this.f32096m = resolvedTextDirection;
            this.f32097n = c21011f1;
            this.f32098o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f32098o | 1);
            C21011f1 c21011f1 = this.f32097n;
            o1.a(this.f32095l, this.f32096m, c21011f1, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32099a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.f30328b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.f30328b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.f30328b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32099a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r18, @Y61.k androidx.compose.ui.text.style.ResolvedTextDirection r19, @Y61.k androidx.compose.foundation.text.selection.C21011f1 r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.o1.a(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.f1, androidx.compose.runtime.A, int):void");
    }

    public static final boolean b(@Y61.k C21011f1 c21011f1, boolean z12) {
        androidx.compose.ui.layout.A aC2;
        C20985q1 c20985q1 = c21011f1.f31986d;
        if (c20985q1 == null || (aC2 = c20985q1.c()) == null) {
            return false;
        }
        return M0.a(c21011f1.l(z12), M0.c(aC2));
    }
}
