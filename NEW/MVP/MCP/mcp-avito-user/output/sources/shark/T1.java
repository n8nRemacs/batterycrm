package shark;

import kotlin.Metadata;
import kotlin.jvm.internal.C42823x;
import kotlin.text.C43047d;
import shark.AbstractC48345t2;
import shark.M1;
import shark.q3;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/t2$b$c$a$a;", "fieldRecord", "Lshark/K1;", "invoke", "(Lshark/t2$b$c$a$a;)Lshark/K1;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class T1 extends kotlin.jvm.internal.N implements Y41.l<AbstractC48345t2.b.c.a.C12636a, K1> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U1 f438208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M1.b f438209m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(U1 u12, M1.b bVar) {
        super(1);
        this.f438208l = u12;
        this.f438209m = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final K1 invoke(AbstractC48345t2.b.c.a.C12636a c12636a) {
        q3 hVar;
        long jB2;
        int iC2;
        AbstractC48345t2.b.c.a.C12636a c12636a2 = c12636a;
        U1 u12 = this.f438208l;
        M1.c cVar = u12.f438213l;
        C48240c2 c48240c2 = cVar.f438149c;
        M1.b bVar = this.f438209m;
        long j12 = bVar.f438147e;
        c48240c2.getClass();
        long j13 = c12636a2.f438720a;
        shark.internal.P p12 = c48240c2.f438260i;
        String strA = p12.a(j13);
        a3 a3Var = p12.f438424i;
        if (a3Var != null) {
            String strA2 = p12.a(p12.f438418c.c(j12));
            String str = a3Var.f438236a.get(strA2 + '.' + strA);
            if (str != null) {
                strA = str;
            }
        }
        shark.internal.J j14 = (shark.internal.J) u12.f438214m.getValue();
        j14.getClass();
        AbstractC48345t2.b.c.C12638b c12638b = j14.f438380b;
        int i12 = c12636a2.f438721b;
        if (i12 == 2) {
            int i13 = j14.f438381c;
            if (i13 != 1) {
                if (i13 == 2) {
                    iC2 = j14.c();
                } else if (i13 == 4) {
                    iC2 = j14.a();
                } else {
                    if (i13 != 8) {
                        throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
                    }
                    jB2 = j14.b();
                }
                jB2 = iC2;
            } else {
                byte[] bArr = c12638b.f438728d;
                int i14 = j14.f438379a;
                byte b12 = bArr[i14];
                j14.f438379a = i14 + 1;
                jB2 = b12;
            }
            hVar = new q3.i(jB2);
        } else if (i12 == shark.internal.J.f438371d) {
            byte[] bArr2 = c12638b.f438728d;
            int i15 = j14.f438379a;
            byte b13 = bArr2[i15];
            j14.f438379a = i15 + 1;
            hVar = new q3.a(b13 != ((byte) 0));
        } else if (i12 == shark.internal.J.f438372e) {
            String str2 = new String(c12638b.f438728d, j14.f438379a, 2, C43047d.f410590c);
            j14.f438379a += 2;
            hVar = new q3.c(str2.charAt(0));
        } else if (i12 == shark.internal.J.f438373f) {
            int i16 = kotlin.jvm.internal.A.f406820a;
            hVar = new q3.f(Float.intBitsToFloat(j14.a()));
        } else if (i12 == shark.internal.J.f438374g) {
            int i17 = C42823x.f406860a;
            hVar = new q3.e(Double.longBitsToDouble(j14.b()));
        } else if (i12 == shark.internal.J.f438375h) {
            byte[] bArr3 = c12638b.f438728d;
            int i18 = j14.f438379a;
            byte b14 = bArr3[i18];
            j14.f438379a = i18 + 1;
            hVar = new q3.b(b14);
        } else if (i12 == shark.internal.J.f438376i) {
            hVar = new q3.j(j14.c());
        } else if (i12 == shark.internal.J.f438377j) {
            hVar = new q3.g(j14.a());
        } else {
            if (i12 != shark.internal.J.f438378k) {
                throw new IllegalStateException(AK.c.g(i12, "Unknown type "));
            }
            hVar = new q3.h(j14.b());
        }
        return new K1(bVar, strA, new X1(cVar.f438149c, hVar));
    }
}
