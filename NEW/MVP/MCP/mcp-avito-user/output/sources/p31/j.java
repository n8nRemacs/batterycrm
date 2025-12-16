package p31;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.view.C23288F0;
import androidx.view.C23397v;
import androidx.view.C23404y0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import u31.C48788c;

/* loaded from: classes8.dex */
public final class j extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public String f428170q;

    /* renamed from: r, reason: collision with root package name */
    public int f428171r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f428172s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f428173t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC22204y1 interfaceC22204y1, C23404y0 c23404y0, Continuation continuation) {
        super(2, continuation);
        this.f428172s = interfaceC22204y1;
        this.f428173t = c23404y0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f428172s, this.f428173t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f428171r;
        if (i12 == 0) {
            C42729a0.b(obj);
            g31.f fVar = ((C48788c) this.f428172s.getF42167b()).f439758b;
            String str2 = fVar != null ? fVar.f396281a : null;
            this.f428170q = str2;
            this.f428171r = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f428170q;
            C42729a0.b(obj);
        }
        if (str == null) {
            return G0.f406611a;
        }
        i iVar = i.f428169l;
        C23404y0 c23404y0 = this.f428173t;
        c23404y0.getClass();
        C23397v.n(c23404y0, str, C23288F0.a(iVar), 4);
        return G0.f406611a;
    }
}
