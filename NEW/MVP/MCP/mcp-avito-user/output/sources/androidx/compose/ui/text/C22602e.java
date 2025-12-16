package androidx.compose.ui.text;

import androidx.collection.C20247y0;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.ui.text.C;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: AnnotatedString.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/e;", "", "a", "b", "c", "d", "e", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22602e implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<C1684e<? extends a>> f42126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f42127c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ArrayList f42128d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ArrayList f42129e;

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/e$a;", "", "Landroidx/compose/ui/text/e$d;", "Landroidx/compose/ui/text/p;", "Landroidx/compose/ui/text/C;", "Landroidx/compose/ui/text/S;", "Landroidx/compose/ui/text/e0;", "Landroidx/compose/ui/text/h0;", "Landroidx/compose/ui/text/z0;", "Landroidx/compose/ui/text/A0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.e$a */
    public interface a {
    }

    /* compiled from: AnnotatedString.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/e$b;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.e$b */
    public static final class b implements Appendable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final StringBuilder f42130b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f42131c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f42132d;

        /* compiled from: AnnotatedString.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/e$b$a;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.e$b$a */
        public static final class a {
        }

        public b() {
            this(0, 1, null);
        }

        public final void a(int i12, int i13, @Y61.k String str, @Y61.k String str2) {
            this.f42132d.add(new C1683b(str, i12, i13, h0.a(str2)));
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            e(charSequence);
            return this;
        }

        public final void b(@Y61.k e0 e0Var, int i12, int i13) {
            this.f42132d.add(new C1683b(e0Var, i12, i13, null, 8, null));
        }

        @Y61.k
        public final void c(char c12) {
            this.f42130b.append(c12);
        }

        public final void d(@Y61.k C22602e c22602e) {
            StringBuilder sb2 = this.f42130b;
            int length = sb2.length();
            sb2.append(c22602e.f42127c);
            List<C1684e<? extends a>> list = c22602e.f42126b;
            if (list != null) {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C1684e<? extends a> c1684e = list.get(i12);
                    ArrayList arrayList = this.f42132d;
                    T t12 = c1684e.f42138a;
                    arrayList.add(new C1683b(c1684e.f42141d, c1684e.f42139b + length, c1684e.f42140c + length, t12));
                }
            }
        }

        @Y61.k
        public final void e(@Y61.l CharSequence charSequence) {
            if (charSequence instanceof C22602e) {
                d((C22602e) charSequence);
            } else {
                this.f42130b.append(charSequence);
            }
        }

        public final void f(@Y61.k String str) {
            this.f42130b.append(str);
        }

        public final void g() {
            ArrayList arrayList = this.f42131c;
            if (arrayList.isEmpty()) {
                C50028a.c("Nothing to pop.");
            }
            ((C1683b) C22026a.b(1, arrayList)).f42136c = this.f42130b.length();
        }

        public final void h(int i12) {
            ArrayList arrayList = this.f42131c;
            if (i12 >= arrayList.size()) {
                C50028a.c(i12 + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i12) {
                g();
            }
        }

        public final int i(@Y61.k C.a aVar) {
            C1683b c1683b = new C1683b(aVar, this.f42130b.length(), 0, null, 12, null);
            this.f42131c.add(c1683b);
            this.f42132d.add(c1683b);
            return r9.size() - 1;
        }

        public final void j(@Y61.k String str, @Y61.k String str2) {
            C1683b c1683b = new C1683b(h0.a(str2), this.f42130b.length(), 0, str, 4, null);
            ArrayList arrayList = this.f42131c;
            arrayList.add(c1683b);
            this.f42132d.add(c1683b);
            arrayList.size();
        }

        public final int k(@Y61.k S s5) {
            C1683b c1683b = new C1683b(s5, this.f42130b.length(), 0, null, 12, null);
            this.f42131c.add(c1683b);
            this.f42132d.add(c1683b);
            return r9.size() - 1;
        }

        public final int l(@Y61.k e0 e0Var) {
            C1683b c1683b = new C1683b(e0Var, this.f42130b.length(), 0, null, 12, null);
            this.f42131c.add(c1683b);
            this.f42132d.add(c1683b);
            return r9.size() - 1;
        }

        @Y61.k
        public final C22602e m() {
            StringBuilder sb2 = this.f42130b;
            String string = sb2.toString();
            ArrayList arrayList = this.f42132d;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList2.add(((C1683b) arrayList.get(i12)).a(sb2.length()));
            }
            return new C22602e(string, arrayList2);
        }

        public b(int i12, int i13, C42822w c42822w) {
            this.f42130b = new StringBuilder((i13 & 1) != 0 ? 16 : i12);
            this.f42131c = new ArrayList();
            this.f42132d = new ArrayList();
            new ArrayList();
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i12, int i13) {
            boolean z12 = charSequence instanceof C22602e;
            StringBuilder sb2 = this.f42130b;
            if (z12) {
                C22602e c22602e = (C22602e) charSequence;
                int length = sb2.length();
                sb2.append((CharSequence) c22602e.f42127c, i12, i13);
                List<C1684e<? extends a>> listB = C22662l.b(c22602e, i12, i13, null);
                if (listB != null) {
                    int size = listB.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        C1684e<? extends a> c1684e = listB.get(i14);
                        ArrayList arrayList = this.f42132d;
                        T t12 = c1684e.f42138a;
                        arrayList.add(new C1683b(c1684e.f42141d, c1684e.f42139b + length, c1684e.f42140c + length, t12));
                    }
                }
            } else {
                sb2.append(charSequence, i12, i13);
            }
            return this;
        }

        /* compiled from: AnnotatedString.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/e$b$b;", "T", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.e$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1683b<T> {

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public static final a f42133e = new a(null);

            /* renamed from: a, reason: collision with root package name */
            public final T f42134a;

            /* renamed from: b, reason: collision with root package name */
            public final int f42135b;

            /* renamed from: c, reason: collision with root package name */
            public int f42136c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f42137d;

            /* compiled from: AnnotatedString.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/e$b$b$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.ui.text.e$b$b$a */
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1683b(@Y61.k String str, int i12, int i13, Object obj) {
                this.f42134a = obj;
                this.f42135b = i12;
                this.f42136c = i13;
                this.f42137d = str;
            }

            @Y61.k
            public final C1684e<T> a(int i12) {
                int i13 = this.f42136c;
                if (i13 != Integer.MIN_VALUE) {
                    i12 = i13;
                }
                if (!(i12 != Integer.MIN_VALUE)) {
                    C50028a.c("Item.end should be set first");
                }
                return new C1684e<>(this.f42137d, this.f42135b, i12, this.f42134a);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1683b)) {
                    return false;
                }
                C1683b c1683b = (C1683b) obj;
                return kotlin.jvm.internal.L.f(this.f42134a, c1683b.f42134a) && this.f42135b == c1683b.f42135b && this.f42136c == c1683b.f42136c && kotlin.jvm.internal.L.f(this.f42137d, c1683b.f42137d);
            }

            public final int hashCode() {
                T t12 = this.f42134a;
                return this.f42137d.hashCode() + androidx.appcompat.app.r.e(this.f42136c, androidx.appcompat.app.r.e(this.f42135b, (t12 == null ? 0 : t12.hashCode()) * 31, 31), 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f42134a);
                sb2.append(", start=");
                sb2.append(this.f42135b);
                sb2.append(", end=");
                sb2.append(this.f42136c);
                sb2.append(", tag=");
                return C22026a.c(sb2, this.f42137d, ')');
            }

            public /* synthetic */ C1683b(Object obj, int i12, int i13, String str, int i14, C42822w c42822w) {
                this((i14 & 8) != 0 ? "" : str, i12, (i14 & 4) != 0 ? BeduinInputModel.MIN_TEXT_VERSION : i13, obj);
            }
        }

        public b(@Y61.k C22602e c22602e) {
            this(0, 1, null);
            d(c22602e);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c12) {
            this.f42130b.append(c12);
            return this;
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/e$c;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.e$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/e$d;", "Landroidx/compose/ui/text/e$a;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.e$d */
    public static final class d implements a {
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.e$f */
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((C1684e) t12).f42139b), Integer.valueOf(((C1684e) t13).f42139b));
        }
    }

    static {
        new c(null);
        androidx.compose.runtime.saveable.w wVar = C22579b0.f42046a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22602e(@Y61.l List<? extends C1684e<? extends a>> list, @Y61.k String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f42126b = list;
        this.f42127c = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                C1684e c1684e = (C1684e) list.get(i12);
                T t12 = c1684e.f42138a;
                if (t12 instanceof e0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1684e);
                } else if (t12 instanceof S) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1684e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f42128d = arrayList;
        this.f42129e = arrayList2;
        List listB0 = arrayList2 != null ? C42745f0.B0(arrayList2, new f()) : null;
        List list2 = listB0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i13 = ((C1684e) C42745f0.E(listB0)).f42140c;
        C20247y0 c20247y0 = androidx.collection.G.f25546a;
        C20247y0 c20247y02 = new C20247y0(1, null);
        c20247y02.d(i13);
        int size2 = listB0.size();
        for (int i14 = 1; i14 < size2; i14++) {
            C1684e c1684e2 = (C1684e) listB0.get(i14);
            while (true) {
                if (c20247y02.f25545b == 0) {
                    break;
                }
                int iB2 = c20247y02.b();
                if (c1684e2.f42139b >= iB2) {
                    c20247y02.f(c20247y02.f25545b - 1);
                } else {
                    int i15 = c1684e2.f42140c;
                    if (i15 > iB2) {
                        C50028a.a("Paragraph overlap not allowed, end " + i15 + " should be less than or equal to " + iB2);
                    }
                }
            }
            c20247y02.d(c1684e2.f42140c);
        }
    }

    @Y61.k
    public final C22602e a(@Y61.k Y41.l<? super C1684e<? extends a>, ? extends List<? extends C1684e<? extends a>>> lVar) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.f42132d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b.C1683b c1683b = (b.C1683b) arrayList.get(i12);
            b.C1683b.a aVar = b.C1683b.f42133e;
            List<? extends C1684e<? extends a>> listInvoke = lVar.invoke(c1683b.a(BeduinInputModel.MIN_TEXT_VERSION));
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i13 = 0; i13 < size2; i13++) {
                C1684e<? extends a> c1684e = listInvoke.get(i13);
                b.C1683b.f42133e.getClass();
                arrayList3.add(new b.C1683b(c1684e.f42141d, c1684e.f42139b, c1684e.f42140c, c1684e.f42138a));
            }
            C42745f0.h(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        return bVar.m();
    }

    @Y61.k
    public final List b(int i12) {
        List<C1684e<? extends a>> list = this.f42126b;
        if (list == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C1684e<? extends a> c1684e = list.get(i13);
            C1684e<? extends a> c1684e2 = c1684e;
            if ((c1684e2.f42138a instanceof C) && C22662l.c(0, i12, c1684e2.f42139b, c1684e2.f42140c)) {
                arrayList.add(c1684e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final List c(int i12, int i13, @Y61.k String str) {
        List<C1684e<? extends a>> list = this.f42126b;
        if (list == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            C1684e<? extends a> c1684e = list.get(i14);
            if (c1684e.f42138a instanceof h0) {
                String str2 = c1684e.f42141d;
                if (str.equals(str2)) {
                    int i15 = c1684e.f42139b;
                    int i16 = c1684e.f42140c;
                    if (C22662l.c(i12, i13, i15, i16)) {
                        arrayList.add(new C1684e(str2, i15, i16, ((h0) c1684e.f42138a).f42337a));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f42127c.charAt(i12);
    }

    @Y61.k
    public final C22602e d(@Y61.k Y41.l<? super C1684e<? extends a>, ? extends C1684e<? extends a>> lVar) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.f42132d;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b.C1683b c1683b = (b.C1683b) arrayList.get(i12);
            b.C1683b.a aVar = b.C1683b.f42133e;
            C1684e<? extends a> c1684eInvoke = lVar.invoke(c1683b.a(BeduinInputModel.MIN_TEXT_VERSION));
            b.C1683b.f42133e.getClass();
            arrayList.set(i12, new b.C1683b(c1684eInvoke.f42141d, c1684eInvoke.f42139b, c1684eInvoke.f42140c, c1684eInvoke.f42138a));
        }
        return bVar.m();
    }

    @Override // java.lang.CharSequence
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C22602e subSequence(int i12, int i13) {
        if (!(i12 <= i13)) {
            C50028a.a("start (" + i12 + ") should be less or equal to end (" + i13 + ')');
        }
        String str = this.f42127c;
        if (i12 == 0 && i13 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i12, i13);
        C22602e c22602e = C22662l.f42494a;
        if (i12 > i13) {
            C50028a.a("start (" + i12 + ") should be less than or equal to end (" + i13 + ')');
        }
        List<C1684e<? extends a>> list = this.f42126b;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                C1684e<? extends a> c1684e = list.get(i14);
                int i15 = c1684e.f42139b;
                int i16 = c1684e.f42140c;
                if (C22662l.c(i12, i13, i15, i16)) {
                    arrayList2.add(new C1684e(c1684e.f42141d, Math.max(i12, c1684e.f42139b) - i12, Math.min(i13, i16) - i12, c1684e.f42138a));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C22602e(arrayList, strSubstring);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22602e)) {
            return false;
        }
        C22602e c22602e = (C22602e) obj;
        return kotlin.jvm.internal.L.f(this.f42127c, c22602e.f42127c) && kotlin.jvm.internal.L.f(this.f42126b, c22602e.f42126b);
    }

    public final int hashCode() {
        int iHashCode = this.f42127c.hashCode() * 31;
        List<C1684e<? extends a>> list = this.f42126b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f42127c.length();
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final String toString() {
        return this.f42127c;
    }

    /* compiled from: AnnotatedString.kt */
    @H0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/e$e;", "T", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.e$e, reason: collision with other inner class name */
    public static final /* data */ class C1684e<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f42138a;

        /* renamed from: b, reason: collision with root package name */
        public final int f42139b;

        /* renamed from: c, reason: collision with root package name */
        public final int f42140c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f42141d;

        /* JADX WARN: Multi-variable type inference failed */
        public C1684e(@Y61.k String str, int i12, int i13, Object obj) {
            this.f42138a = obj;
            this.f42139b = i12;
            this.f42140c = i13;
            this.f42141d = str;
            if (i12 <= i13) {
                return;
            }
            C50028a.a("Reversed range is not supported");
        }

        public static C1684e a(C1684e c1684e, S s5, int i12, int i13, int i14) {
            if ((i14 & 1) != 0) {
                s5 = c1684e.f42138a;
            }
            if ((i14 & 2) != 0) {
                i12 = c1684e.f42139b;
            }
            if ((i14 & 4) != 0) {
                i13 = c1684e.f42140c;
            }
            return new C1684e(c1684e.f42141d, i12, i13, s5);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1684e)) {
                return false;
            }
            C1684e c1684e = (C1684e) obj;
            return kotlin.jvm.internal.L.f(this.f42138a, c1684e.f42138a) && this.f42139b == c1684e.f42139b && this.f42140c == c1684e.f42140c && kotlin.jvm.internal.L.f(this.f42141d, c1684e.f42141d);
        }

        public final int hashCode() {
            T t12 = this.f42138a;
            return this.f42141d.hashCode() + androidx.appcompat.app.r.e(this.f42140c, androidx.appcompat.app.r.e(this.f42139b, (t12 == null ? 0 : t12.hashCode()) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f42138a);
            sb2.append(", start=");
            sb2.append(this.f42139b);
            sb2.append(", end=");
            sb2.append(this.f42140c);
            sb2.append(", tag=");
            return C22026a.c(sb2, this.f42141d, ')');
        }

        public C1684e(int i12, int i13, Object obj) {
            this("", i12, i13, obj);
        }
    }

    public C22602e(String str, List list, int i12, C42822w c42822w) {
        this(str, (List<? extends C1684e<? extends a>>) ((i12 & 2) != 0 ? C42784z0.f406748b : list));
    }

    public C22602e(String str, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? C42784z0.f406748b : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C22602e(@Y61.k String str, @Y61.k List<C1684e<e0>> list, @Y61.k List<C1684e<S>> list2) {
        C22602e c22602e = C22662l.f42494a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(list.get(i12));
                }
                int size2 = list2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add((C1684e) list2.get(i13));
                }
                list = arrayList;
            }
        }
        this(list, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22602e(@Y61.k String str, @Y61.k List<? extends C1684e<? extends a>> list) {
        List<? extends C1684e<? extends a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
