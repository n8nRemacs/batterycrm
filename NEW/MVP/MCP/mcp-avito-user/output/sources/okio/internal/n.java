package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okio.AbstractC44809t;
import okio.AbstractC44811v;
import okio.C44799i;
import okio.C44805o;
import okio.C44810u;
import okio.M;
import okio.S;
import okio.c0;
import okio.e0;

/* compiled from: ResourceFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/internal/n;", "Lokio/v;", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n extends AbstractC44811v {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f420095e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final S f420096f = S.a.b(S.f420033c, "/");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ClassLoader f420097b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC44811v f420098c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f420099d;

    /* compiled from: ResourceFileSystem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/internal/n$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final boolean a(a aVar, S s5) {
            aVar.getClass();
            s5.getClass();
            C44805o c44805o = h.f420085a;
            C44805o c44805o2 = h.f420085a;
            int i12 = C44799i.f420069b;
            C44805o c44805oQ = s5.f420035b;
            c44805oQ.getClass();
            int iL2 = c44805oQ.l(i12, c44805o2.data);
            if (iL2 == -1) {
                C44805o c44805o3 = h.f420086b;
                c44805oQ.getClass();
                iL2 = c44805oQ.l(i12, c44805o3.data);
            }
            if (iL2 != -1) {
                c44805oQ = C44805o.q(c44805oQ, iL2 + 1, 0, 2);
            } else if (s5.f() != null && c44805oQ.d() == 2) {
                c44805oQ = C44805o.f420140f;
            }
            return !C43066x.z(c44805oQ.t(), ".class", true);
        }

        @Y61.k
        public static S b(@Y61.k S s5, @Y61.k S s12) {
            return n.f420096f.d(C43066x.U(s12.f420035b.t(), s5.f420035b.t()).replace('\\', '/'));
        }

        public a() {
        }
    }

    public n(ClassLoader classLoader, boolean z12, AbstractC44811v abstractC44811v, int i12, C42822w c42822w) {
        abstractC44811v = (i12 & 4) != 0 ? AbstractC44811v.f420161a : abstractC44811v;
        this.f420097b = classLoader;
        this.f420098c = abstractC44811v;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new o(this));
        this.f420099d = interfaceC42726CC;
        if (z12) {
            ((List) interfaceC42726CC.getValue()).size();
        }
    }

    public static String j(S s5) {
        S s12 = f420096f;
        s12.getClass();
        return h.b(s12, s5, true).c(s12).f420035b.t();
    }

    @Override // okio.AbstractC44811v
    public final void a(@Y61.k S s5) throws IOException {
        throw new IOException(this + " is read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okio.AbstractC44811v
    @Y61.k
    public final List<S> c(@Y61.k S s5) throws FileNotFoundException {
        a aVar;
        String strJ = j(s5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z12 = false;
        for (Q q12 : (List) this.f420099d.getValue()) {
            AbstractC44811v abstractC44811v = (AbstractC44811v) q12.f406619b;
            S s12 = (S) q12.f406620c;
            try {
                List<S> listC = abstractC44811v.c(s12.d(strJ));
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listC.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = f420095e;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (a.a(aVar, (S) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    S s13 = (S) it2.next();
                    aVar.getClass();
                    arrayList2.add(a.b(s13, s12));
                }
                C42745f0.h(arrayList2, linkedHashSet);
                z12 = true;
            } catch (IOException unused) {
            }
        }
        if (z12) {
            return C42745f0.M0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + s5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okio.AbstractC44811v
    @Y61.l
    public final List<S> d(@Y61.k S s5) {
        a aVar;
        String strJ = j(s5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.f420099d.getValue()).iterator();
        boolean z12 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Q q12 = (Q) it.next();
            AbstractC44811v abstractC44811v = (AbstractC44811v) q12.f406619b;
            S s12 = (S) q12.f406620c;
            List<S> listD = abstractC44811v.d(s12.d(strJ));
            if (listD != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = listD.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    aVar = f420095e;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it2.next();
                    if (a.a(aVar, (S) next)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    S s13 = (S) it3.next();
                    aVar.getClass();
                    arrayList3.add(a.b(s13, s12));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                C42745f0.h(arrayList, linkedHashSet);
                z12 = true;
            }
        }
        if (z12) {
            return C42745f0.M0(linkedHashSet);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okio.AbstractC44811v
    @Y61.l
    public final C44810u f(@Y61.k S s5) {
        if (!a.a(f420095e, s5)) {
            return null;
        }
        String strJ = j(s5);
        for (Q q12 : (List) this.f420099d.getValue()) {
            C44810u c44810uF = ((AbstractC44811v) q12.f406619b).f(((S) q12.f406620c).d(strJ));
            if (c44810uF != null) {
                return c44810uF;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okio.AbstractC44811v
    @Y61.k
    public final AbstractC44809t g(@Y61.k S s5) throws FileNotFoundException {
        if (!a.a(f420095e, s5)) {
            throw new FileNotFoundException("file not found: " + s5);
        }
        String strJ = j(s5);
        for (Q q12 : (List) this.f420099d.getValue()) {
            try {
                return ((AbstractC44811v) q12.f406619b).g(((S) q12.f406620c).d(strJ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + s5);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final c0 h(@Y61.k S s5) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final e0 i(@Y61.k S s5) throws FileNotFoundException {
        if (!a.a(f420095e, s5)) {
            throw new FileNotFoundException("file not found: " + s5);
        }
        S s12 = f420096f;
        s12.getClass();
        InputStream resourceAsStream = this.f420097b.getResourceAsStream(h.b(s12, s5, false).c(s12).f420035b.t());
        if (resourceAsStream != null) {
            return M.g(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + s5);
    }
}
