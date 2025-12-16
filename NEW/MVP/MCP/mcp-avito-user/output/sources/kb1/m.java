package kb1;

import androidx.compose.runtime.C22026a;
import h21.C40764a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* loaded from: classes9.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f406462a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f406463b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final lb1.g f406464c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final qb1.g f406465d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final V11.b f406466e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Ya1.b f406467f;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f406470i;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43238h f406468g = U.a(C43262l0.f411947c);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f406469h = new kotlinx.coroutines.sync.d();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayDeque f406471j = new ArrayDeque(10);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f406472a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f406473b;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.f406472a = str;
            this.f406473b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f406472a, aVar.f406472a) && L.f(this.f406473b, aVar.f406473b);
        }

        public final int hashCode() {
            String str = this.f406472a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f406473b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MessageKey(id=");
            sb2.append(this.f406472a);
            sb2.append(", token=");
            return C22026a.c(sb2, this.f406473b, ')');
        }
    }

    public m(@Y61.k f fVar, @Y61.k u uVar, @Y61.k lb1.g gVar, @Y61.k qb1.g gVar2, @Y61.k V11.b bVar, @Y61.k Ya1.b bVar2, @Y61.k T11.f fVar2) {
        this.f406462a = fVar;
        this.f406463b = uVar;
        this.f406464c = gVar;
        this.f406465d = gVar2;
        this.f406466e = bVar;
        this.f406467f = bVar2;
        this.f406470i = C42727D.c(new p(fVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #2 {all -> 0x00f8, blocks: (B:31:0x00bf, B:32:0x00ca, B:34:0x00d0, B:36:0x00e7, B:38:0x00f3, B:42:0x00fd, B:44:0x0107, B:46:0x010d, B:48:0x0119, B:50:0x011f, B:51:0x0123, B:59:0x0157), top: B:79:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: all -> 0x0155, LOOP:2: B:53:0x0132->B:55:0x0138, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0155, blocks: (B:14:0x0043, B:61:0x0160, B:63:0x0166, B:66:0x017d, B:35:0x00df, B:52:0x012b, B:53:0x0132, B:55:0x0138), top: B:77:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166 A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:14:0x0043, B:61:0x0160, B:63:0x0166, B:66:0x017d, B:35:0x00df, B:52:0x012b, B:53:0x0132, B:55:0x0138), top: B:77:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(kb1.m r17, java.util.ArrayList r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.m.g(kb1.m, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kb1.l
    public final void d(@Y61.k C40764a c40764a, @Y61.k ArrayList arrayList, @Y61.k com.vk.push.core.base.a aVar) {
        C43259k.d(this.f406468g, null, null, new o(this, c40764a, aVar, arrayList, null), 3);
    }

    @Override // c21.InterfaceC26930b
    public final void e() {
        ((T11.f) this.f406470i.getValue()).info("onDestroy");
        U.b(this.f406468g, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.vk.push.common.messaging.RemoteMessage r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.m.f(com.vk.push.common.messaging.RemoteMessage, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
