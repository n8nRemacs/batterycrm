package androidx.constraintlayout.core.widgets.analyzer;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f43512d;

    /* renamed from: f, reason: collision with root package name */
    public int f43514f;

    /* renamed from: g, reason: collision with root package name */
    public int f43515g;

    /* renamed from: a, reason: collision with root package name */
    public p f43509a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43510b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43511c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f43513e = a.f43521b;

    /* renamed from: h, reason: collision with root package name */
    public int f43516h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f43517i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43518j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f43519k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f43520l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DependencyNode.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f43521b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f43522c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f43523d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f43524e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f43525f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f43526g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f43527h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f43528i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ a[] f43529j;

        static {
            a aVar = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            f43521b = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            f43522c = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            f43523d = aVar3;
            a aVar4 = new a("LEFT", 3);
            f43524e = aVar4;
            a aVar5 = new a("RIGHT", 4);
            f43525f = aVar5;
            a aVar6 = new a("TOP", 5);
            f43526g = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            f43527h = aVar7;
            a aVar8 = new a("BASELINE", 7);
            f43528i = aVar8;
            f43529j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f43529j.clone();
        }
    }

    public f(p pVar) {
        this.f43512d = pVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f43520l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f43518j) {
                return;
            }
        }
        this.f43511c = true;
        p pVar = this.f43509a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f43510b) {
            this.f43512d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i12 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i12++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i12 == 1 && fVar.f43518j) {
            g gVar = this.f43517i;
            if (gVar != null) {
                if (!gVar.f43518j) {
                    return;
                } else {
                    this.f43514f = this.f43516h * gVar.f43515g;
                }
            }
            d(fVar.f43515g + this.f43514f);
        }
        p pVar2 = this.f43509a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f43519k.add(pVar);
        if (this.f43518j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f43520l.clear();
        this.f43519k.clear();
        this.f43518j = false;
        this.f43515g = 0;
        this.f43511c = false;
        this.f43510b = false;
    }

    public void d(int i12) {
        if (this.f43518j) {
            return;
        }
        this.f43518j = true;
        this.f43515g = i12;
        Iterator it = this.f43519k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43512d.f43546b.f43450k0);
        sb2.append(":");
        sb2.append(this.f43513e);
        sb2.append("(");
        sb2.append(this.f43518j ? Integer.valueOf(this.f43515g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f43520l.size());
        sb2.append(":d=");
        sb2.append(this.f43519k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
