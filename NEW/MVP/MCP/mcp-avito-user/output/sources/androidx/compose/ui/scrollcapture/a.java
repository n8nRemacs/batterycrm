package androidx.compose.ui.scrollcapture;

import Y41.p;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.foundation.text.input.internal.S;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.X0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.unit.s;
import j.X;
import java.util.function.Consumer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/scrollcapture/a;", "Landroid/view/ScrollCaptureCallback;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class a implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f41672a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f41673b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f41674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41675d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43238h f41676e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final i f41677f;

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/a$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.scrollcapture.a$a, reason: collision with other inner class name */
    public interface InterfaceC1680a {
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f41678q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Runnable f41680s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f41680s = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f41680s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f41678q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                i iVar = aVar.f41677f;
                this.f41678q = 1;
                Object objA = iVar.a(0.0f - iVar.f41707c, this);
                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objA = G0.f406611a;
                }
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((C22082i3) aVar.f41674c.f41710a).setValue(Boolean.FALSE);
            this.f41680s.run();
            return G0.f406611a;
        }
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f41681q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ScrollCaptureSession f41683s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Rect f41684t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Consumer<Rect> f41685u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f41683s = scrollCaptureSession;
            this.f41684t = rect;
            this.f41685u = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.f41683s, this.f41684t, this.f41685u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f41681q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.f41683s;
                Rect rect = this.f41684t;
                s sVar = new s(rect.left, rect.top, rect.right, rect.bottom);
                this.f41681q = 1;
                obj = a.a(a.this, scrollCaptureSession, sVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f41685u.accept(X0.a((s) obj));
            return G0.f406611a;
        }
    }

    public a(@Y61.k u uVar, @Y61.k s sVar, @Y61.k C43238h c43238h, @Y61.k m mVar, @Y61.k AndroidComposeView androidComposeView) {
        this.f41672a = uVar;
        this.f41673b = sVar;
        this.f41674c = mVar;
        this.f41675d = androidComposeView;
        this.f41676e = U.f(c43238h, g.f41700b);
        this.f41677f = new i(sVar.b(), new d(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.a r10, android.view.ScrollCaptureSession r11, androidx.compose.ui.unit.s r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.a.a(androidx.compose.ui.scrollcapture.a, android.view.ScrollCaptureSession, androidx.compose.ui.unit.s, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onScrollCaptureEnd(@Y61.k Runnable runnable) {
        C43259k.d(this.f41676e, C43135f1.f411090b, null, new b(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(@Y61.k ScrollCaptureSession scrollCaptureSession, @Y61.k CancellationSignal cancellationSignal, @Y61.k Rect rect, @Y61.k Consumer<Rect> consumer) {
        N0 n0D = C43259k.d(this.f41676e, null, null, new c(scrollCaptureSession, rect, consumer, null), 3);
        ((V0) n0D).k(new e(cancellationSignal));
        cancellationSignal.setOnCancelListener(new S(n0D, 2));
    }

    public final void onScrollCaptureSearch(@Y61.k CancellationSignal cancellationSignal, @Y61.k Consumer<Rect> consumer) {
        consumer.accept(X0.a(this.f41673b));
    }

    public final void onScrollCaptureStart(@Y61.k ScrollCaptureSession scrollCaptureSession, @Y61.k CancellationSignal cancellationSignal, @Y61.k Runnable runnable) {
        this.f41677f.f41707c = 0.0f;
        ((C22082i3) this.f41674c.f41710a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
