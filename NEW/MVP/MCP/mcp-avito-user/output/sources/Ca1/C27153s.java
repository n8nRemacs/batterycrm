package ca1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* renamed from: ca1.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27153s extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C27154t f57963q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f57964r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27153s(C27154t c27154t, String str, Continuation continuation) {
        super(2, continuation);
        this.f57963q = c27154t;
        this.f57964r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C27153s(this.f57963q, this.f57964r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C27153s) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C27154t c27154t = this.f57963q;
        N0 n02 = c27154t.f57966J;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        String str = this.f57964r;
        if (str == null || str.length() == 0 || C43066x.K(str)) {
            c27154t.f57967K.setValue(C27147m.f57951a);
        } else {
            c27154t.f57966J = C43259k.d(androidx.view.N0.a(c27154t), null, null, new C27152r(c27154t, str, null), 3);
        }
        return G0.f406611a;
    }
}
