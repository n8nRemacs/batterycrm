package d;

import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: d.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39448g extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public Object f393125q;

    /* renamed from: r, reason: collision with root package name */
    public long f393126r;

    /* renamed from: s, reason: collision with root package name */
    public int f393127s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f393128t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39449h f393129u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C39450i f393130v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f393131w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f393132x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b f393133y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39448g(C39449h c39449h, C39450i c39450i, Continuation continuation, j jVar, String str, InterfaceC40658b interfaceC40658b) {
        super(2, continuation);
        this.f393129u = c39449h;
        this.f393130v = c39450i;
        this.f393131w = jVar;
        this.f393132x = str;
        this.f393133y = interfaceC40658b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39448g c39448g = new C39448g(this.f393129u, this.f393130v, continuation, this.f393131w, this.f393132x, this.f393133y);
        c39448g.f393128t = obj;
        return c39448g;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39448g) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.C39448g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
