package yc1;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f443367q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f443368r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f443369s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f443370t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Zb1.b f443371u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z12, b bVar, Zb1.b bVar2, Continuation continuation) {
        super(2, continuation);
        this.f443369s = z12;
        this.f443370t = bVar;
        this.f443371u = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f443369s, this.f443370t, this.f443371u, continuation);
        aVar.f443368r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
