package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import Y61.k;
import Y61.l;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.java.E;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes8.dex */
public class a implements z.c {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f408507i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f408508j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f408509a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f408510b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f408511c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String[] f408512d = null;

    /* renamed from: e, reason: collision with root package name */
    public String[] f408513e = null;

    /* renamed from: f, reason: collision with root package name */
    public String[] f408514f = null;

    /* renamed from: g, reason: collision with root package name */
    public KotlinClassHeader.Kind f408515g = null;

    /* renamed from: h, reason: collision with root package name */
    public String[] f408516h = null;

    static {
        try {
            f408507i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f408507i = false;
        }
        HashMap map = new HashMap();
        f408508j = map;
        map.put(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.f408499f);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.f408500g);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.f408502i);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.f408503j);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.f408501h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
    @l
    public final z.a b(@k kotlin.reflect.jvm.internal.impl.name.b bVar, @k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b bVar2) {
        KotlinClassHeader.Kind kind;
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVar.b();
        if (cVarB.equals(E.f407914a)) {
            return new c(null);
        }
        if (cVarB.equals(E.f407928o)) {
            return new d(null);
        }
        if (f408507i || this.f408515g != null || (kind = (KotlinClassHeader.Kind) f408508j.get(bVar)) == null) {
            return null;
        }
        this.f408515g = kind;
        return new e(null);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class c implements z.a {
        public c(C11670a c11670a) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void b(@l Object obj, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            String strB = fVar.b();
            boolean zEquals = "k".equals(strB);
            a aVar = a.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    KotlinClassHeader.Kind.f408496c.getClass();
                    KotlinClassHeader.Kind kind = (KotlinClassHeader.Kind) KotlinClassHeader.Kind.f408497d.get((Integer) obj);
                    if (kind == null) {
                        kind = KotlinClassHeader.Kind.f408498e;
                    }
                    aVar.f408515g = kind;
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    aVar.f408509a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    aVar.f408510b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    aVar.f408511c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strB) && (obj instanceof String) && !((String) obj).isEmpty()) {
                aVar.getClass();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.b c(@l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            String strB = fVar.b();
            if ("d1".equals(strB)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b(this);
            }
            if ("d2".equals(strB)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.c(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.a d(@k kotlin.reflect.jvm.internal.impl.name.b bVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void f(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void e(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.name.b bVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class d implements z.a {
        public d(C11670a c11670a) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.b c(@l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if ("b".equals(fVar.b())) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.d(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.a d(@k kotlin.reflect.jvm.internal.impl.name.b bVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void b(@l Object obj, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void f(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void e(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.name.b bVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class e implements z.a {
        public e(C11670a c11670a) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void b(@l Object obj, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            String strB = fVar.b();
            boolean zEquals = "version".equals(strB);
            a aVar = a.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    aVar.f408509a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                aVar.f408510b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.b c(@l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            String strB = fVar.b();
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.e(this);
            }
            if ("strings".equals(strB)) {
                return new f(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @l
        public final z.a d(@k kotlin.reflect.jvm.internal.impl.name.b bVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void f(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void e(@l kotlin.reflect.jvm.internal.impl.name.f fVar, @k kotlin.reflect.jvm.internal.impl.name.b bVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
    public final void a() {
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public static abstract class b implements z.b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f408517a = new ArrayList();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
        public final void a() {
            f((String[]) this.f408517a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
        public final void b(@l Object obj) {
            if (obj instanceof String) {
                this.f408517a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
        @l
        public final z.a c(@k kotlin.reflect.jvm.internal.impl.name.b bVar) {
            return null;
        }

        public abstract void f(@k String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
        public final void e(@k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
        public final void d(@k kotlin.reflect.jvm.internal.impl.name.b bVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        }
    }
}
