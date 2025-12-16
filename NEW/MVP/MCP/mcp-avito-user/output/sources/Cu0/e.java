package CU0;

import CU0.g;
import SU0.m;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: LegacyPlainTextDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LCU0/e;", "LSU0/m$b;", "LCU0/g;", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class e implements m.b, g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f2191a = new e();

    @Override // SU0.m.b
    @k
    public final com.avito.beduin.v2.engine.field.d a(int i12, @k String str, @k C36272i c36272i) {
        return g.b.a(new A(new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("rawBody", c36272i.e(str))}), null, 2, null), String.valueOf(i12), c36272i);
    }

    @Override // SU0.m.b
    @k
    public final com.avito.beduin.v2.engine.field.d b(@k C36272i c36272i, @k String str) {
        return a(200, str, c36272i);
    }
}
