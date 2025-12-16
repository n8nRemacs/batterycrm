package p31;

import android.content.Context;
import android.net.Uri;
import d31.AbstractC39501g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* loaded from: classes8.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f428177q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f428178r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f428179s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f428180t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, Uri uri, int i12, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f428177q = context;
        this.f428178r = uri;
        this.f428179s = i12;
        this.f428180t = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ?? r42 = this.f428180t;
        return new n(this.f428177q, this.f428178r, this.f428179s, r42, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Integer numBoxInt = Boxing.boxInt(this.f428179s);
        AbstractC39501g.c(this.f428177q, this.f428178r, numBoxInt);
        this.f428180t.invoke();
        return G0.f406611a;
    }
}
