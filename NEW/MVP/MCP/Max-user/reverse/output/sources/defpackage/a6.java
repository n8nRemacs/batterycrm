package defpackage;

import java.net.DatagramPacket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((HashMap) ((b6) this.b).h).containsKey((Long) obj);
            case 1:
                return ((Long) obj).longValue() <= ((Long) ((Optional) this.b).get()).longValue();
            case 2:
                sr3 sr3Var = (sr3) this.b;
                sr3Var.getClass();
                return Arrays.equals(((or3) ((Map.Entry) obj).getValue()).b, sr3Var.b);
            case 3:
                return ((Boolean) ((c46) this.b).invoke(obj)).booleanValue();
            case 4:
                return ((lbg) obj).a == ((lbg) this.b).a;
            case 5:
                return ((Boolean) ((kv) this.b).invoke(obj)).booleanValue();
            case 6:
                yga ygaVar = (yga) this.b;
                ygaVar.getClass();
                return ((tlb) obj).a.isAfter(ygaVar.f);
            case 7:
                ((wu7) this.b).invoke(obj);
                return Boolean.FALSE.booleanValue();
            case 8:
                return ((Boolean) ((uq) this.b).invoke(obj)).booleanValue();
            case 9:
                ysc yscVar = (ysc) this.b;
                DatagramPacket datagramPacket = (DatagramPacket) obj;
                yscVar.getClass();
                return datagramPacket.getAddress().equals(yscVar.K0) && datagramPacket.getPort() == yscVar.H0;
            case 10:
                return ((tlb) obj).b.m().longValue() == ((z5) this.b).b;
            case 11:
                return ((Boolean) ((c46) this.b).invoke(obj)).booleanValue();
            default:
                return ((ylf) obj).a == (((dlf) this.b).b & 3);
        }
    }
}
