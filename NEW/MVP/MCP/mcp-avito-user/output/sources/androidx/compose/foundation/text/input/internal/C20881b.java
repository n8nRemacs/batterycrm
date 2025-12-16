package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.input.internal.C20879a;
import androidx.compose.foundation.text.input.internal.C20912q0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.platform.U1;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/U1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/U1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.input.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20881b extends SuspendLambda implements Y41.p<U1, Continuation<?>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31034q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31035r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C20946v0, kotlin.G0> f31036s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20879a f31037t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C20902l0 f31038u;

    /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.b$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<?>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31039q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f31040r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ U1 f31041s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C20946v0, kotlin.G0> f31042t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C20879a f31043u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C20902l0 f31044v;

        /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {140, 141}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.b$a$a, reason: collision with other inner class name */
        public static final class C1613a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31045q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C20879a f31046r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C20898j0 f31047s;

            /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.input.internal.b$a$a$a, reason: collision with other inner class name */
            public static final class C1614a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final C1614a f31048l = new C1614a();

                public C1614a() {
                    super(1);
                }

                @Override // Y41.l
                public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Long l12) {
                    l12.longValue();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.input.internal.b$a$a$b, reason: collision with other inner class name */
            public static final class C1615b<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C20898j0 f31049b;

                public C1615b(C20898j0 c20898j0) {
                    this.f31049b = c20898j0;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    C20898j0 c20898j0 = this.f31049b;
                    if (Build.VERSION.SDK_INT >= 34) {
                        C20905n c20905n = C20905n.f31174a;
                        InputMethodManager inputMethodManagerA = c20898j0.a();
                        c20905n.getClass();
                        inputMethodManagerA.startStylusHandwriting(c20898j0.f31124a);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1613a(C20879a c20879a, C20898j0 c20898j0, Continuation continuation) {
                super(2, continuation);
                this.f31046r = c20879a;
                this.f31047s = c20898j0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new C1613a(this.f31046r, this.f31047s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1613a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31045q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C1614a c1614a = C1614a.f31048l;
                    this.f31045q = 1;
                    if (androidx.compose.runtime.X0.a(getF411447c()).N(new androidx.compose.runtime.W0(c1614a), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    C42729a0.b(obj);
                }
                Y1<kotlin.G0> y1K = this.f31046r.k();
                if (y1K == null) {
                    return kotlin.G0.f406611a;
                }
                C1615b c1615b = new C1615b(this.f31047s);
                this.f31045q = 2;
                if (e2.g((e2) y1K, c1615b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
        }

        /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.b$a$b, reason: collision with other inner class name */
        public /* synthetic */ class C1616b extends kotlin.jvm.internal.H implements Y41.l<androidx.compose.ui.graphics.A0, kotlin.G0> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C20902l0 f31050b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1616b(C20902l0 c20902l0) {
                super(1, L.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.f31050b = c20902l0;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(androidx.compose.ui.graphics.A0 a02) {
                float[] fArr = a02.f39216a;
                androidx.compose.ui.layout.A a12 = (androidx.compose.ui.layout.A) ((C22082i3) this.f31050b.f31168s).getF42167b();
                if (a12 != null) {
                    if (!a12.m()) {
                        a12 = null;
                    }
                    if (a12 != null) {
                        a12.a0(fArr);
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U1 u12, Y41.l lVar, C20879a c20879a, C20902l0 c20902l0, Continuation continuation) {
            super(2, continuation);
            this.f31041s = u12;
            this.f31042t = lVar;
            this.f31043u = c20879a;
            this.f31044v = c20902l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f31041s, this.f31042t, this.f31043u, this.f31044v, continuation);
            aVar.f31040r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<?> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31039q;
            C20879a c20879a = this.f31043u;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31040r;
                    Y41.l<? super View, ? extends InterfaceC20896i0> lVar = C20912q0.f31207a;
                    U1 u12 = this.f31041s;
                    View f41418b = u12.getF41418b();
                    ((C20912q0.a) lVar).getClass();
                    C20898j0 c20898j0 = new C20898j0(f41418b);
                    C20946v0 c20946v0 = new C20946v0(u12.getF41418b(), new C1616b(this.f31044v), c20898j0);
                    if (androidx.compose.foundation.text.handwriting.j.f30741a) {
                        C43259k.d(t12, null, null, new C1613a(c20879a, c20898j0, null), 3);
                    }
                    Y41.l<C20946v0, kotlin.G0> lVar2 = this.f31042t;
                    if (lVar2 != null) {
                        ((C20879a.C1612a) lVar2).invoke(c20946v0);
                    }
                    c20879a.f31023c = c20946v0;
                    this.f31039q = 1;
                    if (u12.b(c20946v0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                c20879a.f31023c = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20881b(Y41.l lVar, C20879a c20879a, C20902l0 c20902l0, Continuation continuation) {
        super(2, continuation);
        this.f31036s = lVar;
        this.f31037t = c20879a;
        this.f31038u = c20902l0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20881b c20881b = new C20881b(this.f31036s, this.f31037t, this.f31038u, continuation);
        c20881b.f31035r = obj;
        return c20881b;
    }

    @Override // Y41.p
    public final Object invoke(U1 u12, Continuation<?> continuation) {
        return ((C20881b) create(u12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31034q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((U1) this.f31035r, this.f31036s, this.f31037t, this.f31038u, null);
            this.f31034q = 1;
            if (kotlinx.coroutines.U.c(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
