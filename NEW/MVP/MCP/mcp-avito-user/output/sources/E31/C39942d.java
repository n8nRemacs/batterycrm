package e31;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import w31.k;

/* renamed from: e31.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39942d implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f394937b;

    public C39942d(f fVar) {
        this.f394937b = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        String str = (String) obj;
        boolean zK2 = C43066x.K(str);
        f fVar = this.f394937b;
        if (zK2) {
            fVar.f394945f = str;
            s2.c cVar = fVar.f394944e;
            cVar.getClass();
            k kVar = cVar.f437308b;
            if (kVar != null) {
                kVar.f441265e = str;
            }
        } else if (!C43066x.K(str)) {
            fVar.getClass();
            String strN = C42756l.N(MessageDigest.getInstance("SHA256").digest(str.concat("clickstream").getBytes(StandardCharsets.UTF_8)), sc1.k.f437930l);
            if (L.f(fVar.f394945f, strN)) {
                return G0.f406611a;
            }
            fVar.f394945f = strN;
            s2.c cVar2 = fVar.f394944e;
            cVar2.getClass();
            k kVar2 = cVar2.f437308b;
            if (kVar2 != null) {
                kVar2.f441265e = strN;
            }
        }
        return G0.f406611a;
    }
}
