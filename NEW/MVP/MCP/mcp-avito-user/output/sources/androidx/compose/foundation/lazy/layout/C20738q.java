package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.R0;
import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.layer.C22267c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutItemAnimation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.lazy.layout.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20738q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f29519q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20737p f29520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ R0 f29521s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22267c f29522t;

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.q$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22267c f29523l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20737p f29524m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22267c c22267c, C20737p c20737p) {
            super(1);
            this.f29523l = c22267c;
            this.f29524m = c20737p;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
            this.f29523l.g(c20268c.f().floatValue());
            this.f29524m.f29484c.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20738q(C20737p c20737p, R0 r02, C22267c c22267c, Continuation continuation) {
        super(2, continuation);
        this.f29520r = c20737p;
        this.f29521s = r02;
        this.f29522t = c22267c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20738q(this.f29520r, this.f29521s, this.f29522t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20738q) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f29519q;
        C20737p c20737p = this.f29520r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c<Float, C20318t> c20268c = c20737p.f29497p;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                R0 r02 = this.f29521s;
                a aVar = new a(this.f29522t, c20737p);
                this.f29519q = 1;
                if (C20268c.c(c20268c, fBoxFloat, r02, null, aVar, this, 4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((C22082i3) c20737p.f29492k).setValue(Boolean.TRUE);
            c20737p.f(false);
            return kotlin.G0.f406611a;
        } catch (Throwable th2) {
            C20737p.b bVar = C20737p.f29480s;
            c20737p.f(false);
            throw th2;
        }
    }
}
