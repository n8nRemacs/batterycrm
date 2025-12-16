package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qme extends dtf implements sm6 {
    public final /* synthetic */ tme o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qme(tme tmeVar, Continuation continuation) {
        super(2, continuation);
        this.o = tmeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qme qmeVar = (qme) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qmeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qme(this.o, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [foe] */
    /* JADX WARN: Type inference failed for: r23v3 */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        String title;
        Ringtone ringtone;
        Object value;
        g8j.b(obj);
        o98 o98VarD = ve3.d();
        tme tmeVar = this.o;
        dna dnaVar = tmeVar.b;
        nqd nqdVar = dnaVar.c;
        Throwable th = null;
        if (fni.a(nqdVar, lqd.a) || (nqdVar instanceof kqd)) {
            title = null;
        } else {
            if (!(nqdVar instanceof mqd)) {
                throw new NoWhenBranchMatchedException();
            }
            Uri uri = Uri.parse(((mqd) nqdVar).a);
            Context context = dnaVar.a;
            title = (uri == null || uri.equals(Uri.EMPTY) || (ringtone = RingtoneManager.getRingtone(context, uri)) == null) ? null : ringtone.getTitle(context);
            if (title == null) {
                title = "";
            }
        }
        o98VarD.add(new t8e(1, new n5g(sbb.h), 0, rbb.c, nqdVar instanceof lqd ? new zne(true) : null, null, null, 944));
        o98VarD.add(new t8e(3, new n5g(sbb.j), 0, rbb.e, title != null ? new boe(new r5g(title), null) : yne.a, null, null, 944));
        o98VarD.add(new s8e(new n5g(sbb.d)));
        nqd nqdVar2 = dnaVar.c;
        ConcurrentHashMap concurrentHashMap = tmeVar.v0;
        List listX = ue3.X(concurrentHashMap.values(), new vs6(tmeVar));
        int i = 0;
        for (Object obj2 : listX) {
            int i2 = i + 1;
            if (i < 0) {
                Throwable th2 = th;
                ve3.p();
                throw th2;
            }
            File file = (File) obj2;
            Throwable th3 = th;
            concurrentHashMap.put(file.getAbsolutePath(), file);
            s18 s18Var = new s18(ivd.q0, 0, 6);
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            long jHashCode = file.getAbsolutePath().hashCode();
            String name = file.getName();
            int iH = vmf.H(".", name, 6);
            if (iH != -1) {
                name = name.substring(0, iH);
            }
            o98VarD.add(new t8e(i == 0 ? 1 : (i == ve3.i(listX) && listX.size() == 10) ? 3 : 2, new r5g(name), 1, jHashCode, ((nqdVar2 instanceof kqd) && fni.a(((kqd) nqdVar2).a, file.getAbsolutePath())) ? new zne(true) : th3, s18Var, file.getAbsolutePath(), 48));
            th = th3;
            i = i2;
            concurrentHashMap = concurrentHashMap2;
        }
        ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
        if (listX.size() < 10) {
            o98VarD.add(new t8e(listX.isEmpty() ? 4 : 3, new n5g(sbb.a), 1, rbb.b, null, new s18(ivd.w, 0, 6), null, 864));
        }
        n5g n5gVar = concurrentHashMap3.size() != 10 ? new n5g(sbb.b) : new n5g(sbb.c);
        int i3 = rbb.f;
        o98VarD.add(new r8e(n5gVar));
        o98 o98VarA = ve3.a(o98VarD);
        tcf tcfVar = tmeVar.s0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, o98VarA));
        return qqg.a;
    }
}
