package CU0;

import CU0.g;
import SU0.m;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegacyApplicationJsonDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LCU0/c;", "LSU0/m$b;", "LCU0/g;", "a", "b", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class c implements m.b, g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m.b.InterfaceC1023b f2185a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.serialization.json.f f2186b;

    /* compiled from: LegacyApplicationJsonDeserializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCU0/c$a;", "", "<init>", "()V", "", "ARRAY_KEY", "Ljava/lang/String;", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LegacyApplicationJsonDeserializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCU0/c$b;", "LSU0/m$b$b;", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class b implements m.b.InterfaceC1023b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2187a = new b();

        @Override // SU0.m.b.InterfaceC1023b
        @k
        public final String a(int i12, @l com.avito.beduin.v2.engine.field.d dVar) {
            com.avito.beduin.v2.engine.field.m mVar;
            String strW;
            F.a aVar = F.f336593b;
            A a12 = dVar instanceof A ? (A) dVar : null;
            return (a12 == null || (mVar = a12.f336778b) == null || (strW = mVar.w(aVar, "status")) == null) ? String.valueOf(i12) : strW;
        }
    }

    static {
        new a(null);
    }

    public c(@k m.b.InterfaceC1023b interfaceC1023b, @k com.avito.beduin.v2.serialization.json.f fVar) {
        this.f2185a = interfaceC1023b;
        this.f2186b = fVar;
    }

    @Override // SU0.m.b
    @k
    public final com.avito.beduin.v2.engine.field.d a(int i12, @k String str, @k C36272i c36272i) {
        com.avito.beduin.v2.engine.field.d dVarA = this.f2186b.a(c36272i, str);
        boolean z12 = dVarA instanceof A;
        m.b.InterfaceC1023b interfaceC1023b = this.f2185a;
        return z12 ? g.b.a((A) dVarA, interfaceC1023b.a(i12, dVarA), c36272i) : dVarA instanceof C36268a ? g.b.a(new A(new Q("array", dVarA)), interfaceC1023b.a(i12, dVarA), c36272i) : dVarA instanceof v ? e.f2191a.a(i12, ((v) dVarA).getF336843b(), c36272i) : com.avito.beduin.v2.engine.field.entity.f.f336800b;
    }

    @Override // SU0.m.b
    @k
    public final com.avito.beduin.v2.engine.field.d b(@k C36272i c36272i, @k String str) {
        return a(200, str, c36272i);
    }

    public /* synthetic */ c(m.b.InterfaceC1023b interfaceC1023b, com.avito.beduin.v2.serialization.json.f fVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? b.f2187a : interfaceC1023b, fVar);
    }
}
