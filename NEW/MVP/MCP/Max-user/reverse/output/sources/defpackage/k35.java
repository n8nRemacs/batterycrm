package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class k35 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public k35(m35 m35Var, long j, String str) {
        this.d = m35Var;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                m35 m35Var = (m35) this.d;
                bi biVar = m35Var.c;
                OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl = m35Var.a;
                vk6 vk6VarA = biVar.a();
                vk6VarA.k(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    vk6VarA.S(2);
                } else {
                    vk6VarA.f(2, str);
                }
                try {
                    oneMeRoomDatabase_Impl.c();
                    try {
                        vk6VarA.w();
                        oneMeRoomDatabase_Impl.q();
                        biVar.r(vk6VarA);
                        return null;
                    } finally {
                        oneMeRoomDatabase_Impl.k();
                    }
                } catch (Throwable th) {
                    biVar.r(vk6VarA);
                    throw th;
                }
            default:
                StringBuilder sbM = az1.m("DELETE FROM messages WHERE chat_id = ? AND id in (");
                List<Long> list = (List) this.c;
                lc4.a(sbM, list.size());
                sbM.append(")");
                String string = sbM.toString();
                lrd lrdVar = ((lq9) this.d).a;
                vk6 vk6VarD = lrdVar.d(string);
                vk6VarD.k(1, this.b);
                int i = 2;
                for (Long l : list) {
                    if (l == null) {
                        vk6VarD.S(i);
                    } else {
                        vk6VarD.k(i, l.longValue());
                    }
                    i++;
                }
                lrdVar.c();
                try {
                    vk6VarD.w();
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } catch (Throwable th2) {
                    lrdVar.k();
                    throw th2;
                }
        }
    }

    public k35(lq9 lq9Var, List list, long j) {
        this.d = lq9Var;
        this.c = list;
        this.b = j;
    }
}
