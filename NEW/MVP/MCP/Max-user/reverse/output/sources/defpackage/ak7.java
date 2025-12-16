package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ak7 implements iv4 {
    public final k18 a;
    public final long b;
    public final tcf c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [ipd] */
    public ak7(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) throws IOException {
        UUID ipdVar;
        ArrayList arrayListT;
        String strN;
        this.a = k18Var;
        AtomicLong atomicLong = pu4.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        o98 o98VarD = ve3.d();
        ((eza) k18Var4.getValue()).getClass();
        ((eza) k18Var4.getValue()).getClass();
        o98VarD.add(new yg4(jIncrementAndGet2, new r5g("25.19.0(6468)"), 0, new n5g(j3d.oneme_settings_app_version), null, 20));
        o98VarD.add(new yg4(jIncrementAndGet, new r5g(String.valueOf(((w4e) ((pb3) k18Var2.getValue())).s())), 0, new n5g(j3d.oneme_settings_user_id), null, 20));
        String str = (String) ((lv4) k18Var3.getValue()).k.get();
        if (str != null) {
            try {
                ipdVar = UUID.fromString(str);
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            uuid = ipdVar instanceof ipd ? null : ipdVar;
        }
        if (uuid == null || (strN = uuid.toString()) == null) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() % 100);
            Iterable eb2Var = new eb2('a', 'z');
            eb2 eb2Var2 = new eb2('A', 'Z');
            if (eb2Var instanceof Collection) {
                arrayListT = ue3.T((Collection) eb2Var, eb2Var2);
            } else {
                ArrayList arrayList = new ArrayList();
                af3.v(arrayList, eb2Var);
                af3.v(arrayList, eb2Var2);
                arrayListT = arrayList;
            }
            ArrayList arrayListT2 = ue3.T(arrayListT, new eb2('0', '9'));
            ArrayList arrayList2 = new ArrayList(iCurrentTimeMillis);
            for (int i = 0; i < iCurrentTimeMillis; i++) {
                j7d j7dVar = k7d.a;
                if (arrayListT2.isEmpty()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Character ch = (Character) ue3.D(k7d.b.c(arrayListT2.size()), arrayListT2);
                ch.getClass();
                arrayList2.add(ch);
            }
            strN = ue3.N(arrayList2, "", null, null, null, 62);
        }
        o98VarD.add(new yg4(this.b, new r5g(strN), 0, new r5g(""), null, 20));
        this.c = ucf.a(ve3.a(o98VarD));
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.c;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        k18 k18Var = this.a;
        Context context = (Context) k18Var.getValue();
        CharSequence charSequenceB = yg4Var.b.b((Context) k18Var.getValue());
        xb3.a(context, charSequenceB != null ? charSequenceB.toString() : null);
    }
}
