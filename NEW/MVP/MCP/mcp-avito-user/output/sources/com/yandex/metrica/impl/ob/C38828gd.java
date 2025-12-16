package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Eg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38828gd extends Eg {

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final C38976mc f380631m;

    /* renamed from: com.yandex.metrica.impl.ob.gd$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39057pi f380632a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C38976mc f380633b;

        public b(@j.N C39057pi c39057pi, @j.N C38976mc c38976mc) {
            this.f380632a = c39057pi;
            this.f380633b = c38976mc;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gd$c */
    public static class c implements Eg.d<C38828gd, b> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final Context f380634a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final Cg f380635b;

        public c(@j.N Context context, @j.N Cg cg2) {
            this.f380634a = context;
            this.f380635b = cg2;
        }

        @Override // com.yandex.metrica.impl.ob.Eg.d
        @j.N
        public C38828gd a(b bVar) {
            C38828gd c38828gd = new C38828gd(bVar.f380633b);
            Cg cg2 = this.f380635b;
            Context context = this.f380634a;
            cg2.getClass();
            c38828gd.b(A2.a(context, context.getPackageName()));
            Cg cg3 = this.f380635b;
            Context context2 = this.f380634a;
            cg3.getClass();
            c38828gd.a(String.valueOf(A2.b(context2, context2.getPackageName())));
            c38828gd.a(bVar.f380632a);
            c38828gd.a(U.a());
            c38828gd.a(F0.g().n().a());
            c38828gd.e(this.f380634a.getPackageName());
            c38828gd.a(F0.g().r().a(this.f380634a));
            c38828gd.a(F0.g().a().a());
            return c38828gd;
        }
    }

    @j.P
    public List<String> A() {
        return v().x();
    }

    @Override // com.yandex.metrica.impl.ob.Eg
    public String toString() {
        return "RequestConfig{mSuitableCollectionConfig=" + this.f380631m + "} " + super.toString();
    }

    @j.N
    public C38976mc z() {
        return this.f380631m;
    }

    private C38828gd(@j.N C38976mc c38976mc) {
        this.f380631m = c38976mc;
    }
}
