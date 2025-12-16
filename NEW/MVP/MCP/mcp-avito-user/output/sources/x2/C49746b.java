package x2;

import Y41.p;
import c31.C26934a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import s31.C47992b;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49746b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f442117q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f442118r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C49751g f442119s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49746b(C49751g c49751g, Continuation continuation) {
        super(2, continuation);
        this.f442119s = c49751g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C49746b c49746b = new C49746b(this.f442119s, continuation);
        c49746b.f442118r = obj;
        return c49746b;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C49746b) create((C41.c) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f442117q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C41.c cVar = (C41.c) this.f442118r;
            L41.b bVar = this.f442119s.f442130b;
            this.f442117q = 1;
            AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
            c11757a.getClass();
            String strC = c11757a.c(C41.c.INSTANCE.serializer(), cVar);
            C47992b c47992b = bVar.f9776b;
            C26934a c26934a = bVar.f9775a;
            int iCode = -1;
            try {
                Response responseExecute = ((z81.d) c47992b.f437457a).f443866b.newCall(new Request.Builder().url(c26934a.f57627a).post(RequestBody.INSTANCE.create(strC, MediaType.INSTANCE.get("application/json"))).build()).execute();
                try {
                    iCode = responseExecute.code();
                    G0 g02 = G0.f406611a;
                    kotlin.io.c.a(responseExecute, null);
                } finally {
                }
            } catch (Exception unused) {
            }
            N51.b bVar2 = c26934a.f57629c;
            if (200 > iCode || iCode < 207) {
                bVar2.getClass();
            } else {
                bVar2.getClass();
            }
            if (G0.f406611a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
