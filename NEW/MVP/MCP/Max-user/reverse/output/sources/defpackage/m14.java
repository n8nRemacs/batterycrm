package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class m14 {
    public final lrd a;
    public final ai b;
    public final bi c;
    public final bi d;
    public final bi e;
    public final bi f;
    public final bi g;
    public final bi h;

    public m14(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 3);
        this.c = new bi(oneMeRoomDatabase, 8);
        this.d = new bi(oneMeRoomDatabase, 9);
        this.e = new bi(oneMeRoomDatabase, 10);
        this.f = new bi(oneMeRoomDatabase, 11);
        this.g = new bi(oneMeRoomDatabase, 12);
        this.h = new bi(oneMeRoomDatabase, 13);
    }

    public static void a(m14 m14Var) {
        lrd lrdVar = m14Var.a;
        lrdVar.b();
        bi biVar = m14Var.e;
        vk6 vk6VarA = biVar.a();
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                biVar.r(vk6VarA);
                lrdVar.b();
                bi biVar2 = m14Var.h;
                vk6 vk6VarA2 = biVar2.a();
                try {
                    lrdVar.c();
                    try {
                        vk6VarA2.w();
                        lrdVar.q();
                    } finally {
                    }
                } finally {
                    biVar2.r(vk6VarA2);
                }
            } finally {
            }
        } catch (Throwable th) {
            biVar.r(vk6VarA);
            throw th;
        }
    }

    public final void b(long j, String str, String str2, String str3, String str4, String str5) {
        lrd lrdVar = this.a;
        lrdVar.b();
        bi biVar = this.f;
        vk6 vk6VarA = biVar.a();
        vk6VarA.k(1, j);
        if (str == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.f(2, str);
        }
        if (str2 == null) {
            vk6VarA.S(3);
        } else {
            vk6VarA.f(3, str2);
        }
        if (str3 == null) {
            vk6VarA.S(4);
        } else {
            vk6VarA.f(4, str3);
        }
        if (str4 == null) {
            vk6VarA.S(5);
        } else {
            vk6VarA.f(5, str4);
        }
        if (str5 == null) {
            vk6VarA.S(6);
        } else {
            vk6VarA.f(6, str5);
        }
        try {
            lrdVar.c();
            try {
                vk6VarA.l();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            biVar.r(vk6VarA);
        }
    }

    public final void c(zv3 zv3Var, ConcurrentHashMap concurrentHashMap) {
        long j = zv3Var.a;
        List list = zv3Var.f;
        if (zv3Var.j != 0) {
            lrd lrdVar = this.a;
            lrdVar.b();
            bi biVar = this.g;
            vk6 vk6VarA = biVar.a();
            vk6VarA.k(1, j);
            try {
                lrdVar.c();
                try {
                    vk6VarA.w();
                    lrdVar.q();
                    biVar.r(vk6VarA);
                    return;
                } finally {
                    lrdVar.k();
                }
            } catch (Throwable th) {
                biVar.r(vk6VarA);
                throw th;
            }
        }
        Object obj = concurrentHashMap.get(Long.valueOf(j));
        if (obj == null ? false : obj.equals(Integer.valueOf(list.hashCode()))) {
            return;
        }
        concurrentHashMap.remove(Long.valueOf(j));
        yid yidVar = xl6.a;
        vl6 vl6VarB = xl6.b(list);
        if (vl6VarB == null) {
            return;
        }
        String strB = m6g.b(zv3Var.p);
        if (l8g.c(strB)) {
            strB = "";
        }
        String strL = o7e.l(strB);
        String str = vl6VarB.a;
        String str2 = vl6VarB.b;
        vl6 vl6Var = vl6VarB.c;
        b(j, strL, str, str2, vl6Var != null ? vl6Var.a : null, vl6Var != null ? vl6Var.b : null);
        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
    }
}
