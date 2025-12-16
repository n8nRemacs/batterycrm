package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class p08 extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tid b;
    public final /* synthetic */ tid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p08(tid tidVar, tid tidVar2, int i) {
        super(1);
        this.a = i;
        this.b = tidVar;
        this.c = tidVar2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                h9f h9fVar = (h9f) obj;
                tid tidVar = this.b;
                long j = tidVar.a;
                BigInteger bigInteger = h9fVar.h;
                tidVar.a = j + (bigInteger != null ? bigInteger.longValue() : 0L);
                tid tidVar2 = this.c;
                long j2 = tidVar2.a;
                BigInteger bigInteger2 = h9fVar.i;
                tidVar2.a = j2 + (bigInteger2 != null ? bigInteger2.longValue() : 0L);
                break;
            default:
                i9f i9fVar = (i9f) obj;
                tid tidVar3 = this.b;
                long j3 = tidVar3.a;
                BigInteger bigInteger3 = i9fVar.h;
                tidVar3.a = j3 + (bigInteger3 != null ? bigInteger3.longValue() : 0L);
                tid tidVar4 = this.c;
                long j4 = tidVar4.a;
                BigInteger bigInteger4 = i9fVar.i;
                tidVar4.a = j4 + (bigInteger4 != null ? bigInteger4.longValue() : 0L);
                break;
        }
        return qqg.a;
    }
}
