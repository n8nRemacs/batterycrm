package defpackage;

import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public final /* synthetic */ class hwd implements sm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ hwd(int i) {
        this.a = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                n8a n8aVar = ((ww3) obj).a;
                int i = n8aVar.d;
                n8a n8aVar2 = ((ww3) obj2).a;
                n8a n8aVar3 = new n8a(i + n8aVar2.d);
                n8aVar3.b(n8aVar);
                n8aVar3.b(n8aVar2);
                return new ww3(n8aVar3);
            case 2:
                return qqg.a;
            case 3:
                return qqg.a;
            case 4:
                long j = ((xhe) obj).a;
                long j2 = ((xhe) obj2).a;
                return Integer.valueOf(j > j2 ? -1 : j == j2 ? 0 : 1);
            case 5:
                return Boolean.valueOf(((ttg) obj2).e <= ((ttg) obj).e);
            case 6:
                return ThreadContextKt.countAll$lambda$0(obj, (v74) obj2);
            default:
                return ThreadContextKt.findOne$lambda$1((o7g) obj, (v74) obj2);
        }
    }
}
