package net.bytebuddy.jar.asm;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.C22026a;
import net.bytebuddy.jar.asm.A;
import net.bytebuddy.jar.asm.C44390c;
import okhttp3.internal.http2.Settings;
import shark.AndroidResourceIdNames;

/* compiled from: ClassWriter.java */
/* loaded from: classes7.dex */
public class g extends f {

    /* renamed from: A, reason: collision with root package name */
    public int f418176A;

    /* renamed from: B, reason: collision with root package name */
    public int f418177B;

    /* renamed from: C, reason: collision with root package name */
    public C44391d f418178C;

    /* renamed from: D, reason: collision with root package name */
    public int f418179D;

    /* renamed from: E, reason: collision with root package name */
    public C44391d f418180E;

    /* renamed from: F, reason: collision with root package name */
    public y f418181F;

    /* renamed from: G, reason: collision with root package name */
    public y f418182G;

    /* renamed from: H, reason: collision with root package name */
    public C44390c f418183H;

    /* renamed from: I, reason: collision with root package name */
    public int f418184I;

    /* renamed from: d, reason: collision with root package name */
    public int f418185d;

    /* renamed from: e, reason: collision with root package name */
    public final A f418186e;

    /* renamed from: f, reason: collision with root package name */
    public int f418187f;

    /* renamed from: g, reason: collision with root package name */
    public int f418188g;

    /* renamed from: h, reason: collision with root package name */
    public int f418189h;

    /* renamed from: i, reason: collision with root package name */
    public int f418190i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f418191j;

    /* renamed from: k, reason: collision with root package name */
    public n f418192k;

    /* renamed from: l, reason: collision with root package name */
    public n f418193l;

    /* renamed from: m, reason: collision with root package name */
    public t f418194m;

    /* renamed from: n, reason: collision with root package name */
    public t f418195n;

    /* renamed from: o, reason: collision with root package name */
    public int f418196o;

    /* renamed from: p, reason: collision with root package name */
    public C44391d f418197p;

    /* renamed from: q, reason: collision with root package name */
    public int f418198q;

    /* renamed from: r, reason: collision with root package name */
    public int f418199r;

    /* renamed from: s, reason: collision with root package name */
    public int f418200s;

    /* renamed from: t, reason: collision with root package name */
    public int f418201t;

    /* renamed from: u, reason: collision with root package name */
    public C44391d f418202u;

    /* renamed from: v, reason: collision with root package name */
    public C44389b f418203v;

    /* renamed from: w, reason: collision with root package name */
    public C44389b f418204w;

    /* renamed from: x, reason: collision with root package name */
    public C44389b f418205x;

    /* renamed from: y, reason: collision with root package name */
    public C44389b f418206y;

    /* renamed from: z, reason: collision with root package name */
    public v f418207z;

    public g(e eVar, int i12) {
        super(589824, null);
        this.f418186e = eVar == null ? new A(this) : new A(this, eVar);
        if ((i12 & 2) != 0) {
            this.f418184I = 4;
        } else if ((i12 & 1) != 0) {
            this.f418184I = 1;
        } else {
            this.f418184I = 0;
        }
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void c(int i12, int i13, String str, String str2, String str3, String[] strArr) {
        this.f418185d = i12;
        this.f418187f = i13;
        int i14 = i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        A a12 = this.f418186e;
        a12.f418123c = i14;
        a12.f418124d = str;
        this.f418188g = a12.k(7, str).f418364a;
        if (str2 != null) {
            this.f418200s = a12.j(str2);
        }
        this.f418189h = str3 == null ? 0 : a12.k(7, str3).f418364a;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f418190i = length;
            this.f418191j = new int[length];
            for (int i15 = 0; i15 < this.f418190i; i15++) {
                this.f418191j[i15] = a12.k(7, strArr[i15]).f418364a;
            }
        }
        if (this.f418184I != 1 || i14 < 51) {
            return;
        }
        this.f418184I = 2;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final AbstractC44388a d(String str, boolean z12) {
        A a12 = this.f418186e;
        if (z12) {
            C44389b c44389bJ = C44389b.j(a12, str, this.f418203v);
            this.f418203v = c44389bJ;
            return c44389bJ;
        }
        C44389b c44389bJ2 = C44389b.j(a12, str, this.f418204w);
        this.f418204w = c44389bJ2;
        return c44389bJ2;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void e(C44390c c44390c) {
        c44390c.f418162c = this.f418183H;
        this.f418183H = c44390c;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final m g(int i12, String str, String str2, String str3, Object obj) {
        n nVar = new n(this.f418186e, i12, str, str2, str3, obj);
        if (this.f418192k == null) {
            this.f418192k = nVar;
        } else {
            this.f418193l.f418235b = nVar;
        }
        this.f418193l = nVar;
        return nVar;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void h(int i12, String str, String str2, String str3) {
        if (this.f418197p == null) {
            this.f418197p = new C44391d();
        }
        A a12 = this.f418186e;
        A.a aVarK = a12.k(7, str);
        if (aVarK.f418370g == 0) {
            this.f418196o++;
            this.f418197p.j(aVarK.f418364a);
            this.f418197p.j(str2 == null ? 0 : a12.k(7, str2).f418364a);
            this.f418197p.j(str3 != null ? a12.j(str3) : 0);
            this.f418197p.j(i12);
            aVarK.f418370g = this.f418196o;
        }
    }

    @Override // net.bytebuddy.jar.asm.f
    public final s i(int i12, String str, String str2, String str3, String[] strArr) {
        t tVar = new t(this.f418186e, i12, str, str2, str3, strArr, this.f418184I);
        if (this.f418194m == null) {
            this.f418194m = tVar;
        } else {
            this.f418195n.f418282c = tVar;
        }
        this.f418195n = tVar;
        return tVar;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final u j(int i12, String str, String str2) {
        A a12 = this.f418186e;
        v vVar = new v(a12, a12.k(19, str).f418364a, i12, str2 == null ? 0 : a12.j(str2));
        this.f418207z = vVar;
        return vVar;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void k(String str) {
        this.f418176A = this.f418186e.k(7, str).f418364a;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void l(String str) {
        if (this.f418178C == null) {
            this.f418178C = new C44391d();
        }
        this.f418177B++;
        this.f418178C.j(this.f418186e.k(7, str).f418364a);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void m(String str, String str2, String str3) {
        A a12 = this.f418186e;
        this.f418198q = a12.k(7, str).f418364a;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f418199r = a12.i(str2, str3);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void n(String str) {
        if (this.f418180E == null) {
            this.f418180E = new C44391d();
        }
        this.f418179D++;
        this.f418180E.j(this.f418186e.k(7, str).f418364a);
    }

    @Override // net.bytebuddy.jar.asm.f
    public final x o(String str, String str2, String str3) {
        y yVar = new y(this.f418186e, str, str2, str3);
        if (this.f418181F == null) {
            this.f418181F = yVar;
        } else {
            this.f418182G.f418354b = yVar;
        }
        this.f418182G = yVar;
        return yVar;
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void p(String str, String str2) {
        if (str != null) {
            this.f418201t = this.f418186e.j(str);
        }
        if (str2 != null) {
            C44391d c44391d = new C44391d();
            c44391d.a(0, Integer.MAX_VALUE, str2);
            this.f418202u = c44391d;
        }
    }

    @Override // net.bytebuddy.jar.asm.f
    public final AbstractC44388a q(int i12, C c12, String str, boolean z12) {
        A a12 = this.f418186e;
        if (z12) {
            C44389b c44389bI = C44389b.i(a12, i12, c12, str, this.f418205x);
            this.f418205x = c44389bI;
            return c44389bI;
        }
        C44389b c44389bI2 = C44389b.i(a12, i12, c12, str, this.f418206y);
        this.f418206y = c44389bI2;
        return c44389bI2;
    }

    public String r(String str, String str2) throws ClassNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e12) {
                throw new TypeNotPresentException(str2, e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new TypeNotPresentException(str, e13);
        }
    }

    public final int s(String str) {
        return this.f418186e.k(19, str).f418364a;
    }

    public final int t(String str) {
        return this.f418186e.j(str);
    }

    public final byte[] u(byte[] bArr, boolean z12) {
        C44390c.a aVar = new C44390c.a();
        aVar.a(this.f418183H);
        for (n nVar = this.f418192k; nVar != null; nVar = (n) nVar.f418235b) {
            aVar.a(nVar.f418246m);
        }
        for (t tVar = this.f418194m; tVar != null; tVar = (t) tVar.f418282c) {
            aVar.a(tVar.f418296M);
            aVar.a(null);
        }
        for (y yVar = this.f418181F; yVar != null; yVar = (y) yVar.f418354b) {
            aVar.a(yVar.f418363k);
        }
        int i12 = aVar.f418163a;
        C44390c[] c44390cArr = new C44390c[i12];
        System.arraycopy(aVar.f418164b, 0, c44390cArr, 0, i12);
        this.f418192k = null;
        this.f418193l = null;
        this.f418194m = null;
        this.f418195n = null;
        this.f418203v = null;
        this.f418204w = null;
        this.f418205x = null;
        this.f418206y = null;
        this.f418207z = null;
        this.f418176A = 0;
        this.f418177B = 0;
        this.f418178C = null;
        this.f418179D = 0;
        this.f418180E = null;
        this.f418181F = null;
        this.f418182G = null;
        this.f418183H = null;
        this.f418184I = z12 ? 3 : 0;
        new e(bArr, false).b(this, c44390cArr, (z12 ? 8 : 0) | 256);
        return v();
    }

    public final byte[] v() {
        String str;
        String str2;
        int iF2;
        int i12;
        String str3;
        int i13;
        String str4;
        String str5;
        String str6;
        int i14;
        int i15;
        int i16;
        String str7;
        String str8;
        String str9;
        String str10;
        A a12;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        A a13;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i19;
        int i22;
        int i23;
        int i24;
        int i25;
        int iA2;
        int i26;
        int i27;
        g gVar = this;
        int i28 = (gVar.f418190i * 2) + 24;
        n nVar = gVar.f418192k;
        int i29 = 0;
        while (true) {
            str = "ConstantValue";
            if (nVar == null) {
                break;
            }
            i29++;
            int i32 = nVar.f418241h;
            A a14 = nVar.f418236c;
            if (i32 != 0) {
                a14.j("ConstantValue");
                i27 = 16;
            } else {
                i27 = 8;
            }
            int iA3 = C44390c.a(a14, nVar.f418237d, nVar.f418240g) + i27 + C44389b.g(nVar.f418242i, nVar.f418243j, nVar.f418244k, nVar.f418245l);
            C44390c c44390c = nVar.f418246m;
            if (c44390c != null) {
                g gVar2 = a14.f418121a;
                int i33 = 0;
                while (c44390c != null) {
                    a14.j(c44390c.f418160a);
                    i33 += c44390c.d(gVar2).f418166b + 6;
                    c44390c = c44390c.f418162c;
                }
                iA3 += i33;
            }
            i28 += iA3;
            nVar = (n) nVar.f418235b;
        }
        t tVar = gVar.f418194m;
        int i34 = 0;
        while (true) {
            String str18 = "LocalVariableTypeTable";
            String str19 = "LocalVariableTable";
            String str20 = "Code";
            String str21 = str;
            int i35 = i29;
            if (tVar == null) {
                int i36 = i28;
                C44391d c44391d = gVar.f418197p;
                A a15 = gVar.f418186e;
                if (c44391d != null) {
                    iF2 = c44391d.f418166b + 8 + i36;
                    a15.j("InnerClasses");
                    str2 = "InnerClasses";
                    i12 = 1;
                } else {
                    str2 = "InnerClasses";
                    iF2 = i36;
                    i12 = 0;
                }
                String str22 = "MethodParameters";
                if (gVar.f418198q != 0) {
                    i12++;
                    iF2 += 10;
                    a15.j("EnclosingMethod");
                }
                String str23 = "AnnotationDefault";
                if ((gVar.f418187f & 4096) != 0 && (gVar.f418185d & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
                    i12++;
                    iF2 += 6;
                    a15.j("Synthetic");
                }
                if (gVar.f418200s != 0) {
                    i12++;
                    iF2 += 8;
                    a15.j("Signature");
                }
                if (gVar.f418201t != 0) {
                    i12++;
                    iF2 += 8;
                    a15.j("SourceFile");
                }
                C44391d c44391d2 = gVar.f418202u;
                if (c44391d2 != null) {
                    i12++;
                    iF2 += c44391d2.f418166b + 6;
                    a15.j("SourceDebugExtension");
                }
                if ((gVar.f418187f & 131072) != 0) {
                    i12++;
                    iF2 += 6;
                    a15.j("Deprecated");
                }
                C44389b c44389b = gVar.f418203v;
                if (c44389b != null) {
                    i12++;
                    str3 = "Deprecated";
                    iF2 += c44389b.f("RuntimeVisibleAnnotations");
                } else {
                    str3 = "Deprecated";
                }
                C44389b c44389b2 = gVar.f418204w;
                if (c44389b2 != null) {
                    i12++;
                    iF2 += c44389b2.f("RuntimeInvisibleAnnotations");
                }
                C44389b c44389b3 = gVar.f418205x;
                if (c44389b3 != null) {
                    i12++;
                    iF2 += c44389b3.f("RuntimeVisibleTypeAnnotations");
                }
                C44389b c44389b4 = gVar.f418206y;
                if (c44389b4 != null) {
                    i12++;
                    iF2 += c44389b4.f("RuntimeInvisibleTypeAnnotations");
                }
                if (a15.f418130j != null) {
                    a15.j("BootstrapMethods");
                    i13 = a15.f418130j.f418166b + 8;
                } else {
                    i13 = 0;
                }
                if (i13 > 0) {
                    i12++;
                    if (a15.f418130j != null) {
                        a15.j("BootstrapMethods");
                        i23 = a15.f418130j.f418166b + 8;
                    } else {
                        i23 = 0;
                    }
                    iF2 += i23;
                }
                v vVar = gVar.f418207z;
                String str24 = "ModuleMainClass";
                String str25 = "ModulePackages";
                String str26 = "RuntimeInvisibleParameterAnnotations";
                if (vVar != null) {
                    str5 = "RuntimeVisibleParameterAnnotations";
                    i12 = (vVar.f418350p > 0 ? 1 : 0) + 1 + (vVar.f418352r > 0 ? 1 : 0) + i12;
                    A a16 = vVar.f418336b;
                    a16.j("Module");
                    str4 = "Module";
                    str6 = "Exceptions";
                    int i37 = vVar.f418341g.f418166b + 22 + vVar.f418343i.f418166b + vVar.f418345k.f418166b + vVar.f418347m.f418166b + vVar.f418349o.f418166b;
                    if (vVar.f418350p > 0) {
                        a16.j("ModulePackages");
                        i37 += vVar.f418351q.f418166b + 8;
                    }
                    if (vVar.f418352r > 0) {
                        a16.j("ModuleMainClass");
                        i37 += 8;
                    }
                    iF2 += i37;
                } else {
                    str4 = "Module";
                    str5 = "RuntimeVisibleParameterAnnotations";
                    str6 = "Exceptions";
                }
                if (gVar.f418176A != 0) {
                    i12++;
                    iF2 += 8;
                    a15.j("NestHost");
                }
                C44391d c44391d3 = gVar.f418178C;
                if (c44391d3 != null) {
                    i12++;
                    i14 = 8;
                    iF2 += c44391d3.f418166b + 8;
                    a15.j("NestMembers");
                } else {
                    i14 = 8;
                }
                C44391d c44391d4 = gVar.f418180E;
                if (c44391d4 != null) {
                    i12++;
                    iF2 += c44391d4.f418166b + i14;
                    a15.j("PermittedSubclasses");
                }
                if ((gVar.f418187f & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) == 0 && gVar.f418181F == null) {
                    str7 = "LocalVariableTable";
                    str8 = "ModulePackages";
                    str9 = "ModuleMainClass";
                    str10 = "LocalVariableTypeTable";
                    i15 = 0;
                    i16 = 0;
                } else {
                    y yVar = gVar.f418181F;
                    i15 = 0;
                    i16 = 0;
                    while (yVar != null) {
                        int i38 = i16 + 1;
                        int i39 = yVar.f418358f;
                        A a17 = yVar.f418355c;
                        String str27 = str24;
                        String str28 = str25;
                        String str29 = str18;
                        String str30 = str19;
                        int iA4 = C44390c.a(a17, 0, i39) + 6 + C44389b.g(yVar.f418359g, yVar.f418360h, yVar.f418361i, yVar.f418362j);
                        C44390c c44390c2 = yVar.f418363k;
                        if (c44390c2 != null) {
                            g gVar3 = a17.f418121a;
                            int i42 = 0;
                            while (c44390c2 != null) {
                                a17.j(c44390c2.f418160a);
                                i42 += c44390c2.d(gVar3).f418166b + 6;
                                c44390c2 = c44390c2.f418162c;
                            }
                            iA4 += i42;
                        }
                        i15 += iA4;
                        yVar = (y) yVar.f418354b;
                        i16 = i38;
                        str24 = str27;
                        str25 = str28;
                        str18 = str29;
                        str19 = str30;
                    }
                    str7 = str19;
                    str8 = str25;
                    str9 = str24;
                    str10 = str18;
                    i12++;
                    iF2 += i15 + 8;
                    a15.j("Record");
                }
                C44390c c44390c3 = gVar.f418183H;
                if (c44390c3 != null) {
                    int i43 = 0;
                    while (c44390c3 != null) {
                        i43++;
                        c44390c3 = c44390c3.f418162c;
                    }
                    i12 = i43 + i12;
                    C44390c c44390c4 = gVar.f418183H;
                    c44390c4.getClass();
                    int i44 = 0;
                    while (c44390c4 != null) {
                        a15.j(c44390c4.f418160a);
                        i44 += c44390c4.d(a15.f418121a).f418166b + 6;
                        c44390c4 = c44390c4.f418162c;
                    }
                    iF2 += i44;
                }
                int i45 = i12;
                int i46 = iF2 + a15.f418128h.f418166b;
                if (a15.f418127g > 65535) {
                    throw new ClassTooLargeException(G.f("Class too large: ", a15.f418124d));
                }
                C44391d c44391d5 = new C44391d(i46);
                c44391d5.i(-889275714);
                c44391d5.i(gVar.f418185d);
                c44391d5.j(a15.f418127g);
                C44391d c44391d6 = a15.f418128h;
                c44391d5.h(0, c44391d6.f418166b, c44391d6.f418165a);
                c44391d5.j((~((gVar.f418185d & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49 ? 4096 : 0)) & gVar.f418187f);
                c44391d5.j(gVar.f418188g);
                c44391d5.j(gVar.f418189h);
                c44391d5.j(gVar.f418190i);
                for (int i47 = 0; i47 < gVar.f418190i; i47++) {
                    c44391d5.j(gVar.f418191j[i47]);
                }
                c44391d5.j(i35);
                n nVar2 = gVar.f418192k;
                while (nVar2 != null) {
                    A a18 = nVar2.f418236c;
                    boolean z14 = a18.f418123c < 49;
                    int i48 = ~(z14 ? 4096 : 0);
                    int i49 = nVar2.f418237d;
                    c44391d5.j(i48 & i49);
                    c44391d5.j(nVar2.f418238e);
                    c44391d5.j(nVar2.f418239f);
                    int i52 = nVar2.f418241h;
                    int i53 = i52 != 0 ? 1 : 0;
                    int i54 = i16;
                    if ((i49 & 4096) != 0 && z14) {
                        i53++;
                    }
                    int i55 = nVar2.f418240g;
                    if (i55 != 0) {
                        i53++;
                    }
                    if ((i49 & 131072) != 0) {
                        i53++;
                    }
                    if (nVar2.f418242i != null) {
                        i53++;
                    }
                    if (nVar2.f418243j != null) {
                        i53++;
                    }
                    if (nVar2.f418244k != null) {
                        i53++;
                    }
                    if (nVar2.f418245l != null) {
                        i53++;
                    }
                    C44390c c44390c5 = nVar2.f418246m;
                    if (c44390c5 != null) {
                        int i56 = 0;
                        while (c44390c5 != null) {
                            i56++;
                            c44390c5 = c44390c5.f418162c;
                        }
                        i53 = i56 + i53;
                    }
                    c44391d5.j(i53);
                    String str31 = str21;
                    int i57 = i15;
                    if (i52 != 0) {
                        c44391d5.j(a18.j(str31));
                        c44391d5.i(2);
                        c44391d5.j(i52);
                    }
                    C44390c.b(a18, i49, i55, c44391d5);
                    C44389b.l(nVar2.f418236c, nVar2.f418242i, nVar2.f418243j, nVar2.f418244k, nVar2.f418245l, c44391d5);
                    C44390c c44390c6 = nVar2.f418246m;
                    if (c44390c6 != null) {
                        while (c44390c6 != null) {
                            C44391d c44391dD = c44390c6.d(a18.f418121a);
                            c44391d5.j(a18.j(c44390c6.f418160a));
                            c44391d5.i(c44391dD.f418166b);
                            c44391d5.h(0, c44391dD.f418166b, c44391dD.f418165a);
                            c44390c6 = c44390c6.f418162c;
                        }
                    }
                    nVar2 = (n) nVar2.f418235b;
                    i15 = i57;
                    str21 = str31;
                    i16 = i54;
                }
                int i58 = i15;
                int i59 = i16;
                c44391d5.j(i34);
                t tVar2 = gVar.f418194m;
                boolean z15 = false;
                boolean z16 = false;
                while (tVar2 != null) {
                    boolean z17 = z16 | (tVar2.f418329u > 0);
                    boolean z18 = z15 | tVar2.f418308Y;
                    A a19 = tVar2.f418312d;
                    boolean z19 = a19.f418123c < 49;
                    int i62 = ~(z19 ? 4096 : 0);
                    int i63 = tVar2.f418313e;
                    c44391d5.j(i62 & i63);
                    c44391d5.j(tVar2.f418314f);
                    c44391d5.j(tVar2.f418316h);
                    int i64 = tVar2.f418310a0;
                    if (i64 != 0) {
                        c44391d5.h(i64, tVar2.f418311b0, a19.f418122b.f418168b);
                        a13 = a15;
                        z12 = z18;
                        z13 = z17;
                        str17 = str22;
                        str16 = str23;
                        str15 = str26;
                        str13 = str6;
                        str11 = str10;
                    } else {
                        C44391d c44391d7 = tVar2.f418320l;
                        z12 = z18;
                        int i65 = c44391d7.f418166b > 0 ? 1 : 0;
                        int i66 = tVar2.f418333y;
                        if (i66 > 0) {
                            i65++;
                        }
                        z13 = z17;
                        if ((i63 & 4096) != 0 && z19) {
                            i65++;
                        }
                        int i67 = tVar2.f418284A;
                        if (i67 != 0) {
                            i65++;
                        }
                        if ((i63 & 131072) != 0) {
                            i65++;
                        }
                        if (tVar2.f418285B != null) {
                            i65++;
                        }
                        if (tVar2.f418286C != null) {
                            i65++;
                        }
                        if (tVar2.f418288E != null) {
                            i65++;
                        }
                        if (tVar2.f418290G != null) {
                            i65++;
                        }
                        if (tVar2.f418291H != null) {
                            i65++;
                        }
                        if (tVar2.f418292I != null) {
                            i65++;
                        }
                        if (tVar2.f418293J != null) {
                            i65++;
                        }
                        if (tVar2.f418295L != null) {
                            i65++;
                        }
                        C44390c c44390c7 = tVar2.f418296M;
                        if (c44390c7 != null) {
                            int i68 = 0;
                            while (c44390c7 != null) {
                                i68++;
                                c44390c7 = c44390c7.f418162c;
                            }
                            i65 = i68 + i65;
                        }
                        c44391d5.j(i65);
                        int i69 = c44391d7.f418166b;
                        if (i69 > 0) {
                            int i72 = i69 + 10;
                            a13 = a15;
                            int i73 = 0;
                            for (q qVar = tVar2.f418321m; qVar != null; qVar = qVar.f418266f) {
                                i73++;
                            }
                            int iA5 = C22026a.a(i73, 8, 2, i72);
                            C44391d c44391d8 = tVar2.f418330v;
                            if (c44391d8 != null) {
                                i19 = 8;
                                iA5 += c44391d8.f418166b + 8;
                                i22 = 1;
                            } else {
                                i19 = 8;
                                i22 = 0;
                            }
                            C44391d c44391d9 = tVar2.f418324p;
                            if (c44391d9 != null) {
                                iA5 += c44391d9.f418166b + i19;
                                i22++;
                            }
                            C44391d c44391d10 = tVar2.f418326r;
                            if (c44391d10 != null) {
                                iA5 += c44391d10.f418166b + i19;
                                i22++;
                            }
                            C44391d c44391d11 = tVar2.f418328t;
                            if (c44391d11 != null) {
                                iA5 += c44391d11.f418166b + i19;
                                i22++;
                            }
                            C44389b c44389b5 = tVar2.f418331w;
                            if (c44389b5 != null) {
                                iA5 += c44389b5.f("RuntimeVisibleTypeAnnotations");
                                i22++;
                            }
                            C44389b c44389b6 = tVar2.f418332x;
                            if (c44389b6 != null) {
                                iA5 += c44389b6.f("RuntimeInvisibleTypeAnnotations");
                                i22++;
                            }
                            c44391d5.j(a19.j(str20));
                            c44391d5.i(iA5);
                            c44391d5.j(tVar2.f418318j);
                            c44391d5.j(tVar2.f418319k);
                            c44391d5.i(c44391d7.f418166b);
                            c44391d5.h(0, c44391d7.f418166b, c44391d7.f418165a);
                            q qVar2 = tVar2.f418321m;
                            int i74 = 0;
                            for (q qVar3 = qVar2; qVar3 != null; qVar3 = qVar3.f418266f) {
                                i74++;
                            }
                            c44391d5.j(i74);
                            while (qVar2 != null) {
                                c44391d5.j(qVar2.f418261a.f418271d);
                                c44391d5.j(qVar2.f418262b.f418271d);
                                c44391d5.j(qVar2.f418263c.f418271d);
                                c44391d5.j(qVar2.f418264d);
                                qVar2 = qVar2.f418266f;
                            }
                            c44391d5.j(i22);
                            if (tVar2.f418330v != null) {
                                c44391d5.j(a19.j(a19.f418123c >= 50 ? "StackMapTable" : "StackMap"));
                                c44391d5.i(tVar2.f418330v.f418166b + 2);
                                c44391d5.j(tVar2.f418329u);
                                C44391d c44391d12 = tVar2.f418330v;
                                c44391d5.h(0, c44391d12.f418166b, c44391d12.f418165a);
                            }
                            if (tVar2.f418324p != null) {
                                c44391d5.j(a19.j("LineNumberTable"));
                                c44391d5.i(tVar2.f418324p.f418166b + 2);
                                c44391d5.j(tVar2.f418323o);
                                C44391d c44391d13 = tVar2.f418324p;
                                c44391d5.h(0, c44391d13.f418166b, c44391d13.f418165a);
                            }
                            if (tVar2.f418326r != null) {
                                str12 = str7;
                                c44391d5.j(a19.j(str12));
                                c44391d5.i(tVar2.f418326r.f418166b + 2);
                                c44391d5.j(tVar2.f418325q);
                                C44391d c44391d14 = tVar2.f418326r;
                                c44391d5.h(0, c44391d14.f418166b, c44391d14.f418165a);
                            } else {
                                str12 = str7;
                            }
                            if (tVar2.f418328t != null) {
                                str11 = str10;
                                c44391d5.j(a19.j(str11));
                                c44391d5.i(tVar2.f418328t.f418166b + 2);
                                c44391d5.j(tVar2.f418327s);
                                C44391d c44391d15 = tVar2.f418328t;
                                c44391d5.h(0, c44391d15.f418166b, c44391d15.f418165a);
                            } else {
                                str11 = str10;
                            }
                            C44389b c44389b7 = tVar2.f418331w;
                            if (c44389b7 != null) {
                                c44389b7.k(a19.j("RuntimeVisibleTypeAnnotations"), c44391d5);
                            }
                            C44389b c44389b8 = tVar2.f418332x;
                            if (c44389b8 != null) {
                                c44389b8.k(a19.j("RuntimeInvisibleTypeAnnotations"), c44391d5);
                            }
                        } else {
                            a13 = a15;
                            str11 = str10;
                            str12 = str7;
                        }
                        if (i66 > 0) {
                            str13 = str6;
                            c44391d5.j(a19.j(str13));
                            c44391d5.i((i66 * 2) + 2);
                            c44391d5.j(i66);
                            int[] iArr = tVar2.f418334z;
                            int length = iArr.length;
                            int i75 = 0;
                            while (true) {
                                str7 = str12;
                                if (i75 >= length) {
                                    break;
                                }
                                c44391d5.j(iArr[i75]);
                                i75++;
                                str12 = str7;
                            }
                        } else {
                            str7 = str12;
                            str13 = str6;
                        }
                        C44390c.b(a19, i63, i67, c44391d5);
                        C44389b.l(tVar2.f418312d, tVar2.f418285B, tVar2.f418286C, tVar2.f418291H, tVar2.f418292I, c44391d5);
                        if (tVar2.f418288E != null) {
                            str14 = str5;
                            int iJ2 = a19.j(str14);
                            C44389b[] c44389bArr = tVar2.f418288E;
                            int length2 = tVar2.f418287D;
                            if (length2 == 0) {
                                length2 = c44389bArr.length;
                            }
                            C44389b.m(iJ2, c44389bArr, length2, c44391d5);
                        } else {
                            str14 = str5;
                        }
                        str15 = str26;
                        if (tVar2.f418290G != null) {
                            int iJ3 = a19.j(str15);
                            C44389b[] c44389bArr2 = tVar2.f418290G;
                            int length3 = tVar2.f418289F;
                            if (length3 == 0) {
                                length3 = c44389bArr2.length;
                            }
                            C44389b.m(iJ3, c44389bArr2, length3, c44391d5);
                        }
                        str16 = str23;
                        if (tVar2.f418293J != null) {
                            c44391d5.j(a19.j(str16));
                            c44391d5.i(tVar2.f418293J.f418166b);
                            C44391d c44391d16 = tVar2.f418293J;
                            c44391d5.h(0, c44391d16.f418166b, c44391d16.f418165a);
                        }
                        if (tVar2.f418295L != null) {
                            str17 = str22;
                            c44391d5.j(a19.j(str17));
                            c44391d5.i(tVar2.f418295L.f418166b + 1);
                            c44391d5.g(tVar2.f418294K);
                            C44391d c44391d17 = tVar2.f418295L;
                            str5 = str14;
                            c44391d5.h(0, c44391d17.f418166b, c44391d17.f418165a);
                        } else {
                            str5 = str14;
                            str17 = str22;
                        }
                        C44390c c44390c8 = tVar2.f418296M;
                        if (c44390c8 != null) {
                            while (c44390c8 != null) {
                                C44391d c44391dD2 = c44390c8.d(a19.f418121a);
                                c44391d5.j(a19.j(c44390c8.f418160a));
                                c44391d5.i(c44391dD2.f418166b);
                                c44391d5.h(0, c44391dD2.f418166b, c44391dD2.f418165a);
                                c44390c8 = c44390c8.f418162c;
                                str20 = str20;
                            }
                        }
                    }
                    String str32 = str20;
                    tVar2 = (t) tVar2.f418282c;
                    str10 = str11;
                    str6 = str13;
                    str26 = str15;
                    str23 = str16;
                    z15 = z12;
                    str20 = str32;
                    z16 = z13;
                    a15 = a13;
                    str22 = str17;
                }
                A a22 = a15;
                c44391d5.j(i45);
                if (this.f418197p != null) {
                    a12 = a22;
                    c44391d5.j(a12.j(str2));
                    c44391d5.i(this.f418197p.f418166b + 2);
                    c44391d5.j(this.f418196o);
                    C44391d c44391d18 = this.f418197p;
                    c44391d5.h(0, c44391d18.f418166b, c44391d18.f418165a);
                } else {
                    a12 = a22;
                }
                if (this.f418198q != 0) {
                    c44391d5.j(a12.j("EnclosingMethod"));
                    c44391d5.i(4);
                    c44391d5.j(this.f418198q);
                    c44391d5.j(this.f418199r);
                }
                if ((this.f418187f & 4096) != 0 && (this.f418185d & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
                    c44391d5.j(a12.j("Synthetic"));
                    c44391d5.i(0);
                }
                if (this.f418200s != 0) {
                    c44391d5.j(a12.j("Signature"));
                    i17 = 2;
                    c44391d5.i(2);
                    c44391d5.j(this.f418200s);
                } else {
                    i17 = 2;
                }
                if (this.f418201t != 0) {
                    c44391d5.j(a12.j("SourceFile"));
                    c44391d5.i(i17);
                    c44391d5.j(this.f418201t);
                }
                C44391d c44391d19 = this.f418202u;
                if (c44391d19 != null) {
                    int i76 = c44391d19.f418166b;
                    c44391d5.j(a12.j("SourceDebugExtension"));
                    c44391d5.i(i76);
                    i18 = 0;
                    c44391d5.h(0, i76, this.f418202u.f418165a);
                } else {
                    i18 = 0;
                }
                if ((this.f418187f & 131072) != 0) {
                    c44391d5.j(a12.j(str3));
                    c44391d5.i(i18);
                }
                C44389b.l(this.f418186e, this.f418203v, this.f418204w, this.f418205x, this.f418206y, c44391d5);
                if (a12.f418130j != null) {
                    c44391d5.j(a12.j("BootstrapMethods"));
                    c44391d5.i(a12.f418130j.f418166b + 2);
                    c44391d5.j(a12.f418129i);
                    C44391d c44391d20 = a12.f418130j;
                    c44391d5.h(0, c44391d20.f418166b, c44391d20.f418165a);
                }
                v vVar2 = this.f418207z;
                if (vVar2 != null) {
                    C44391d c44391d21 = vVar2.f418341g;
                    int i77 = c44391d21.f418166b + 16;
                    C44391d c44391d22 = vVar2.f418343i;
                    int i78 = i77 + c44391d22.f418166b;
                    C44391d c44391d23 = vVar2.f418345k;
                    int i79 = i78 + c44391d23.f418166b;
                    C44391d c44391d24 = vVar2.f418347m;
                    int i82 = i79 + c44391d24.f418166b;
                    C44391d c44391d25 = vVar2.f418349o;
                    int i83 = i82 + c44391d25.f418166b;
                    A a23 = vVar2.f418336b;
                    c44391d5.j(a23.j(str4));
                    c44391d5.i(i83);
                    c44391d5.j(vVar2.f418337c);
                    c44391d5.j(vVar2.f418338d);
                    c44391d5.j(vVar2.f418339e);
                    c44391d5.j(vVar2.f418340f);
                    c44391d5.h(0, c44391d21.f418166b, c44391d21.f418165a);
                    c44391d5.j(vVar2.f418342h);
                    c44391d5.h(0, c44391d22.f418166b, c44391d22.f418165a);
                    c44391d5.j(vVar2.f418344j);
                    c44391d5.h(0, c44391d23.f418166b, c44391d23.f418165a);
                    c44391d5.j(vVar2.f418346l);
                    c44391d5.h(0, c44391d24.f418166b, c44391d24.f418165a);
                    c44391d5.j(vVar2.f418348n);
                    c44391d5.h(0, c44391d25.f418166b, c44391d25.f418165a);
                    if (vVar2.f418350p > 0) {
                        c44391d5.j(a23.j(str8));
                        C44391d c44391d26 = vVar2.f418351q;
                        c44391d5.i(c44391d26.f418166b + 2);
                        c44391d5.j(vVar2.f418350p);
                        c44391d5.h(0, c44391d26.f418166b, c44391d26.f418165a);
                    }
                    if (vVar2.f418352r > 0) {
                        c44391d5.j(a23.j(str9));
                        c44391d5.i(2);
                        c44391d5.j(vVar2.f418352r);
                    }
                }
                if (this.f418176A != 0) {
                    c44391d5.j(a12.j("NestHost"));
                    c44391d5.i(2);
                    c44391d5.j(this.f418176A);
                }
                if (this.f418178C != null) {
                    c44391d5.j(a12.j("NestMembers"));
                    c44391d5.i(this.f418178C.f418166b + 2);
                    c44391d5.j(this.f418177B);
                    C44391d c44391d27 = this.f418178C;
                    c44391d5.h(0, c44391d27.f418166b, c44391d27.f418165a);
                }
                if (this.f418180E != null) {
                    c44391d5.j(a12.j("PermittedSubclasses"));
                    c44391d5.i(this.f418180E.f418166b + 2);
                    c44391d5.j(this.f418179D);
                    C44391d c44391d28 = this.f418180E;
                    c44391d5.h(0, c44391d28.f418166b, c44391d28.f418165a);
                }
                if ((this.f418187f & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 || this.f418181F != null) {
                    c44391d5.j(a12.j("Record"));
                    c44391d5.i(i58 + 2);
                    c44391d5.j(i59);
                    for (y yVar2 = this.f418181F; yVar2 != null; yVar2 = (y) yVar2.f418354b) {
                        c44391d5.j(yVar2.f418356d);
                        c44391d5.j(yVar2.f418357e);
                        int i84 = yVar2.f418358f;
                        int i85 = i84 != 0 ? 1 : 0;
                        if (yVar2.f418359g != null) {
                            i85++;
                        }
                        if (yVar2.f418360h != null) {
                            i85++;
                        }
                        if (yVar2.f418361i != null) {
                            i85++;
                        }
                        if (yVar2.f418362j != null) {
                            i85++;
                        }
                        C44390c c44390c9 = yVar2.f418363k;
                        if (c44390c9 != null) {
                            int i86 = 0;
                            while (c44390c9 != null) {
                                i86++;
                                c44390c9 = c44390c9.f418162c;
                            }
                            i85 += i86;
                        }
                        c44391d5.j(i85);
                        A a24 = yVar2.f418355c;
                        C44390c.b(a24, 0, i84, c44391d5);
                        C44389b.l(yVar2.f418355c, yVar2.f418359g, yVar2.f418360h, yVar2.f418361i, yVar2.f418362j, c44391d5);
                        C44390c c44390c10 = yVar2.f418363k;
                        if (c44390c10 != null) {
                            g gVar4 = a24.f418121a;
                            while (c44390c10 != null) {
                                C44391d c44391dD3 = c44390c10.d(gVar4);
                                c44391d5.j(a24.j(c44390c10.f418160a));
                                c44391d5.i(c44391dD3.f418166b);
                                c44391d5.h(0, c44391dD3.f418166b, c44391dD3.f418165a);
                                c44390c10 = c44390c10.f418162c;
                            }
                        }
                    }
                }
                C44390c c44390c11 = this.f418183H;
                if (c44390c11 != null) {
                    while (c44390c11 != null) {
                        C44391d c44391dD4 = c44390c11.d(a12.f418121a);
                        c44391d5.j(a12.j(c44390c11.f418160a));
                        c44391d5.i(c44391dD4.f418166b);
                        c44391d5.h(0, c44391dD4.f418166b, c44391dD4.f418165a);
                        c44390c11 = c44390c11.f418162c;
                    }
                }
                return z15 ? u(c44391d5.f418165a, z16) : c44391d5.f418165a;
            }
            int i87 = i34 + 1;
            if (tVar.f418310a0 != 0) {
                i26 = tVar.f418311b0 + 6;
                i25 = i28;
                i24 = i87;
            } else {
                C44391d c44391d29 = tVar.f418320l;
                i24 = i87;
                int i88 = c44391d29.f418166b;
                A a25 = tVar.f418312d;
                i25 = i28;
                if (i88 <= 0) {
                    iA2 = 8;
                } else {
                    if (i88 > 65535) {
                        StringBuilder sbA = androidx.appcompat.app.r.A("Method too large: ", a25.f418124d, ".");
                        sbA.append(tVar.f418315g);
                        sbA.append(" ");
                        sbA.append(tVar.f418317i);
                        throw new MethodTooLargeException(sbA.toString());
                    }
                    a25.j("Code");
                    int i89 = c44391d29.f418166b + 16;
                    int i92 = 0;
                    for (q qVar4 = tVar.f418321m; qVar4 != null; qVar4 = qVar4.f418266f) {
                        i92++;
                    }
                    iA2 = (i92 * 8) + 2 + i89 + 8;
                    if (tVar.f418330v != null) {
                        a25.j(a25.f418123c >= 50 ? "StackMapTable" : "StackMap");
                        iA2 += tVar.f418330v.f418166b + 8;
                    }
                    if (tVar.f418324p != null) {
                        a25.j("LineNumberTable");
                        iA2 += tVar.f418324p.f418166b + 8;
                    }
                    if (tVar.f418326r != null) {
                        a25.j("LocalVariableTable");
                        iA2 += tVar.f418326r.f418166b + 8;
                    }
                    if (tVar.f418328t != null) {
                        a25.j("LocalVariableTypeTable");
                        iA2 += tVar.f418328t.f418166b + 8;
                    }
                    C44389b c44389b9 = tVar.f418331w;
                    if (c44389b9 != null) {
                        iA2 += c44389b9.f("RuntimeVisibleTypeAnnotations");
                    }
                    C44389b c44389b10 = tVar.f418332x;
                    if (c44389b10 != null) {
                        iA2 += c44389b10.f("RuntimeInvisibleTypeAnnotations");
                    }
                }
                int i93 = tVar.f418333y;
                if (i93 > 0) {
                    a25.j("Exceptions");
                    iA2 = C22026a.a(i93, 2, 8, iA2);
                }
                int iA6 = C44390c.a(a25, tVar.f418313e, tVar.f418284A) + iA2 + C44389b.g(tVar.f418285B, tVar.f418286C, tVar.f418291H, tVar.f418292I);
                C44389b[] c44389bArr3 = tVar.f418288E;
                if (c44389bArr3 != null) {
                    int length4 = tVar.f418287D;
                    if (length4 == 0) {
                        length4 = c44389bArr3.length;
                    }
                    iA6 += C44389b.h("RuntimeVisibleParameterAnnotations", c44389bArr3, length4);
                }
                C44389b[] c44389bArr4 = tVar.f418290G;
                if (c44389bArr4 != null) {
                    int length5 = tVar.f418289F;
                    if (length5 == 0) {
                        length5 = c44389bArr4.length;
                    }
                    iA6 += C44389b.h("RuntimeInvisibleParameterAnnotations", c44389bArr4, length5);
                }
                if (tVar.f418293J != null) {
                    a25.j("AnnotationDefault");
                    iA6 += tVar.f418293J.f418166b + 6;
                }
                if (tVar.f418295L != null) {
                    a25.j("MethodParameters");
                    iA6 += tVar.f418295L.f418166b + 7;
                }
                C44390c c44390c12 = tVar.f418296M;
                if (c44390c12 != null) {
                    g gVar5 = a25.f418121a;
                    int i94 = 0;
                    while (c44390c12 != null) {
                        a25.j(c44390c12.f418160a);
                        i94 += c44390c12.d(gVar5).f418166b + 6;
                        c44390c12 = c44390c12.f418162c;
                    }
                    i26 = i94 + iA6;
                } else {
                    i26 = iA6;
                }
            }
            i28 = i25 + i26;
            tVar = (t) tVar.f418282c;
            gVar = this;
            str = str21;
            i29 = i35;
            i34 = i24;
        }
    }

    @Override // net.bytebuddy.jar.asm.f
    public final void f() {
    }
}
