package d;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import sberid.sdk.ui.models.root.ELKRootTypes;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39444c extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public T f393108q;

    /* renamed from: r, reason: collision with root package name */
    public long f393109r;

    /* renamed from: s, reason: collision with root package name */
    public int f393110s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f393111t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39445d f393112u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C39446e f393113v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C39447f f393114w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f393115x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ELKRootTypes f393116y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39444c(C39445d c39445d, C39446e c39446e, Continuation continuation, C39447f c39447f, String str, ELKRootTypes eLKRootTypes) {
        super(2, continuation);
        this.f393112u = c39445d;
        this.f393113v = c39446e;
        this.f393114w = c39447f;
        this.f393115x = str;
        this.f393116y = eLKRootTypes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39444c c39444c = new C39444c(this.f393112u, this.f393113v, continuation, this.f393114w, this.f393115x, this.f393116y);
        c39444c.f393111t = obj;
        return c39444c;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39444c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:12:0x002c, B:36:0x008c, B:38:0x0092, B:47:0x00af, B:41:0x00a0, B:43:0x00a4, B:46:0x00aa, B:15:0x0034, B:29:0x0070, B:33:0x007d, B:21:0x004e), top: B:63:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:12:0x002c, B:36:0x008c, B:38:0x0092, B:47:0x00af, B:41:0x00a0, B:43:0x00a4, B:46:0x00aa, B:15:0x0034, B:29:0x0070, B:33:0x007d, B:21:0x004e), top: B:63:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [kotlinx.coroutines.T] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [d.d] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.C39444c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
