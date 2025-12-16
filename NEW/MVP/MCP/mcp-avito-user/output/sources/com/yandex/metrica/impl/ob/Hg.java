package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Eg;
import java.util.List;

/* loaded from: classes7.dex */
public class Hg extends Eg {

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private String f378265m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private String f378266n;

    public static abstract class a<T extends Hg, A extends Eg.a> extends Eg.b<T, A> {

        /* renamed from: c, reason: collision with root package name */
        private final C38987mn f378267c;

        public a(@j.N Context context, @j.N String str) {
            this(context, str, new C38987mn());
        }

        @j.N
        public T a(@j.N Eg.c<A> cVar) {
            T tA2 = a();
            tA2.a(U.a());
            C38717c2 c38717c2A = F0.g().n().a();
            tA2.a(c38717c2A);
            tA2.a(cVar.f378071a);
            String str = cVar.f378072b.f378066a;
            if (str == null) {
                str = c38717c2A.a() != null ? c38717c2A.a().f377560b : null;
            }
            tA2.c(str);
            String str2 = this.f378070b;
            String strA = cVar.f378072b.f378067b;
            Context context = this.f378069a;
            if (TextUtils.isEmpty(strA)) {
                strA = A2.a(context, str2);
            }
            tA2.b(strA);
            String str3 = this.f378070b;
            String strValueOf = cVar.f378072b.f378068c;
            Context context2 = this.f378069a;
            if (TextUtils.isEmpty(strValueOf)) {
                strValueOf = String.valueOf(A2.b(context2, str3));
            }
            tA2.a(strValueOf);
            tA2.e(this.f378070b);
            tA2.a(F0.g().r().a(this.f378069a));
            tA2.a(F0.g().a().a());
            List<String> listA = C38816g1.a(this.f378069a).a();
            tA2.d(listA.isEmpty() ? null : listA.get(0));
            T t12 = tA2;
            String packageName = this.f378069a.getPackageName();
            ApplicationInfo applicationInfoA = this.f378267c.a(this.f378069a, this.f378070b, 0);
            if (applicationInfoA != null) {
                t12.f((applicationInfoA.flags & 2) != 0 ? "1" : "0");
                t12.g((applicationInfoA.flags & 1) == 0 ? "0" : "1");
            } else if (TextUtils.equals(packageName, this.f378070b)) {
                t12.f((this.f378069a.getApplicationInfo().flags & 2) != 0 ? "1" : "0");
                t12.g((this.f378069a.getApplicationInfo().flags & 1) == 0 ? "0" : "1");
            } else {
                t12.f("0");
                t12.g("0");
            }
            return t12;
        }

        public a(@j.N Context context, @j.N String str, @j.N C38987mn c38987mn) {
            super(context, str);
            this.f378267c = c38987mn;
        }
    }

    public String A() {
        return this.f378266n;
    }

    public void f(@j.N String str) {
        this.f378265m = str;
    }

    public void g(@j.N String str) {
        this.f378266n = str;
    }

    @Override // com.yandex.metrica.impl.ob.Eg
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f378265m + "', mAppSystem='" + this.f378266n + "'} " + super.toString();
    }

    @j.N
    public String z() {
        return this.f378265m;
    }
}
