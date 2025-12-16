package shark;

import kotlin.Metadata;
import shark.AbstractC48345t2;
import shark.M1;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/t2$b$c$a$b;", "fieldRecord", "Lshark/K1;", "invoke", "(Lshark/t2$b$c$a$b;)Lshark/K1;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class R1 extends kotlin.jvm.internal.N implements Y41.l<AbstractC48345t2.b.c.a.C12637b, K1> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1.b f438201l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(M1.b bVar) {
        super(1);
        this.f438201l = bVar;
    }

    @Override // Y41.l
    public final K1 invoke(AbstractC48345t2.b.c.a.C12637b c12637b) {
        AbstractC48345t2.b.c.a.C12637b c12637b2 = c12637b;
        M1.b bVar = this.f438201l;
        C48240c2 c48240c2 = bVar.f438145c;
        c48240c2.getClass();
        long j12 = c12637b2.f438722a;
        shark.internal.P p12 = c48240c2.f438260i;
        String strA = p12.a(j12);
        a3 a3Var = p12.f438424i;
        if (a3Var != null) {
            String strA2 = p12.a(p12.f438418c.c(bVar.f438147e));
            String str = a3Var.f438236a.get(strA2 + '.' + strA);
            if (str != null) {
                strA = str;
            }
        }
        return new K1(bVar, strA, new X1(bVar.f438145c, c12637b2.f438724c));
    }
}
