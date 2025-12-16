package z60;

import Y61.k;
import Y61.l;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: Strings.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_payment_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: z60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50379a {
    @l
    public static final String a(@k String str) {
        String str2;
        Object bVar;
        InterfaceC43057n interfaceC43057nB = C43059p.b(new C43059p(".*/([^/?]+)(?:\\?.*)?$"), str);
        if (interfaceC43057nB == null || (str2 = interfaceC43057nB.d().get(1)) == null) {
            return null;
        }
        try {
            int i12 = Z.f406624c;
            bVar = UUID.fromString(str2);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            return str2;
        }
        return null;
    }
}
