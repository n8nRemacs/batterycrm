package shark.internal;

import java.util.Map;
import kotlin.Metadata;
import shark.C48369z2;
import shark.K1;
import shark.M1;
import shark.X1;
import shark.g3;
import shark.q3;

/* compiled from: ClassReferenceReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/K1;", "staticField", "Lshark/internal/C0;", "invoke", "(Lshark/K1;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48302z extends kotlin.jvm.internal.N implements Y41.l<K1, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f438631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M1.b f438632m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48302z(Map map, M1.b bVar) {
        super(1);
        this.f438631l = map;
        this.f438632m = bVar;
    }

    @Override // Y41.l
    public final C0 invoke(K1 k12) {
        K1 k13 = k12;
        X1 x12 = k13.f438095c;
        if (!x12.g()) {
            return null;
        }
        String str = k13.f438094b;
        if (str.equals("$staticOverhead") || str.equals("$classOverhead")) {
            return null;
        }
        q3.i iVar = (q3.i) x12.f438228b;
        g3 g3Var = (g3) this.f438631l.get(str);
        if (g3Var instanceof C48369z2) {
            return null;
        }
        return new C0(iVar.f438688a, g3Var != null, new C48301y(str, this.f438632m.f438147e, g3Var));
    }
}
