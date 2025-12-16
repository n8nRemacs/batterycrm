package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C23638w;
import androidx.work.InterfaceC23639x;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: WorkForeground.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", i = {}, l = {42, 50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class L extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Void>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f55949q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.work.F f55950r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.H f55951s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23639x f55952t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f55953u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(androidx.work.F f12, androidx.work.impl.model.H h12, InterfaceC23639x interfaceC23639x, Context context, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f55950r = f12;
        this.f55951s = h12;
        this.f55952t = interfaceC23639x;
        this.f55953u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new L(this.f55950r, this.f55951s, this.f55952t, this.f55953u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Void> continuation) {
        return ((L) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f55949q;
        androidx.work.F f12 = this.f55950r;
        if (i12 == 0) {
            C42729a0.b(obj);
            D0<C23638w> foregroundInfoAsync = f12.getForegroundInfoAsync();
            this.f55949q = 1;
            obj = androidx.work.impl.s0.a(foregroundInfoAsync, f12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        C23638w c23638w = (C23638w) obj;
        androidx.work.impl.model.H h12 = this.f55951s;
        if (c23638w == null) {
            throw new IllegalStateException(AK.c.s(new StringBuilder("Worker was marked important ("), h12.f55797c, ") but did not provide ForegroundInfo"));
        }
        int i13 = M.f55954a;
        androidx.work.G.a().getClass();
        D0<Void> d0A = this.f55952t.a(this.f55953u, f12.getId(), c23638w);
        this.f55949q = 2;
        obj = androidx.concurrent.futures.d.a(d0A, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
