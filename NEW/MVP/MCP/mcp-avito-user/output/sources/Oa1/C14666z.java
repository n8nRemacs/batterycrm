package Oa1;

import android.content.Context;

/* renamed from: Oa1.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14666z {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12400c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static C14666z f12401d;

    /* renamed from: a, reason: collision with root package name */
    public final C14663w f12402a;

    /* renamed from: b, reason: collision with root package name */
    public final Na1.b f12403b;

    /* renamed from: Oa1.z$a */
    public static final class a {
        public final C14666z a(Context context) {
            C14666z c14666z;
            synchronized (this) {
                c14666z = C14666z.f12401d;
                if (c14666z == null) {
                    c14666z = new C14666z(context.getApplicationContext());
                    C14666z.f12401d = c14666z;
                }
            }
            return c14666z;
        }
    }

    /* renamed from: Oa1.z$b */
    public static final class b implements Q {
    }

    public C14666z(Context context) {
        D d12 = new D();
        b bVar = new b();
        A a12 = new A(context);
        new E();
        new i0();
        new j0();
        new C14642a();
        C14653l c14653l = new C14653l(new Z(context, new C14644c()), bVar);
        new f0();
        new I();
        C14655n c14655n = new C14655n();
        new f0();
        C14658q c14658q = new C14658q(c14653l, c14655n, new C14656o(), bVar);
        C14663w c14663w = new C14663w(c14658q, new C14662v(c14658q, new C14661u(new G(a12, new I()), new C14645d(context), new r(new e0(new H(), new C14660t(), bVar)), new M(context))));
        this.f12402a = c14663w;
        new N();
        this.f12403b = new Na1.b(new Y(c14663w, new J(c14658q), new C14664x(context, new L()), d12, bVar));
    }
}
