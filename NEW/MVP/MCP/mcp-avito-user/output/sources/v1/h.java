package V1;

import X41.n;
import Y61.l;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.H;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LV1/h;", "", "a", "b", "c", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f16868e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f16869a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Map<String, a> f16870b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Set<d> f16871c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @l
    public final Set<f> f16872d;

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LV1/h$a;", "", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final C1160a f16873h = new C1160a(null);

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16874a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16875b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        public final boolean f16876c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        public final int f16877d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @l
        public final String f16878e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        public final int f16879f;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        public final int f16880g;

        /* compiled from: TableInfo.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV1/h$a$a;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: V1.h$a$a, reason: collision with other inner class name */
        public static final class C1160a {
            public /* synthetic */ C1160a(C42822w c42822w) {
                this();
            }

            @n
            @k0
            public static boolean a(@Y61.k String str, @l String str2) {
                if (str.equals(str2)) {
                    return true;
                }
                if (str.length() != 0) {
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i12 < str.length()) {
                            char cCharAt = str.charAt(i12);
                            int i15 = i14 + 1;
                            if (i14 == 0 && cCharAt != '(') {
                                break;
                            }
                            if (cCharAt != '(') {
                                if (cCharAt == ')' && i13 - 1 == 0 && i14 != str.length() - 1) {
                                    break;
                                }
                            } else {
                                i13++;
                            }
                            i12++;
                            i14 = i15;
                        } else if (i13 == 0) {
                            return L.f(C43066x.A0(str.substring(1, str.length() - 1)).toString(), str2);
                        }
                    }
                }
                return false;
            }

            public C1160a() {
            }
        }

        public a(int i12, @Y61.k String str, @Y61.k String str2, @l String str3, boolean z12, int i13) {
            this.f16874a = str;
            this.f16875b = str2;
            this.f16876c = z12;
            this.f16877d = i12;
            this.f16878e = str3;
            this.f16879f = i13;
            String upperCase = str2.toUpperCase(Locale.US);
            this.f16880g = C43066x.q(upperCase, "INT", false) ? 3 : (C43066x.q(upperCase, "CHAR", false) || C43066x.q(upperCase, "CLOB", false) || C43066x.q(upperCase, "TEXT", false)) ? 2 : C43066x.q(upperCase, "BLOB", false) ? 5 : (C43066x.q(upperCase, "REAL", false) || C43066x.q(upperCase, "FLOA", false) || C43066x.q(upperCase, "DOUB", false)) ? 4 : 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        
            if (V1.h.a.C1160a.a(r6, r3) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        
            if (r3 != null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@Y61.l java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 1
                if (r9 != r10) goto L4
                return r0
            L4:
                boolean r1 = r10 instanceof V1.h.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                V1.h$a r10 = (V1.h.a) r10
                int r1 = r10.f16877d
                int r3 = r9.f16877d
                if (r3 == r1) goto L13
                return r2
            L13:
                java.lang.String r1 = r10.f16874a
                java.lang.String r3 = r9.f16874a
                boolean r1 = kotlin.jvm.internal.L.f(r3, r1)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                boolean r1 = r9.f16876c
                boolean r3 = r10.f16876c
                if (r1 == r3) goto L25
                return r2
            L25:
                int r1 = r10.f16879f
                java.lang.String r3 = r10.f16878e
                r4 = 2
                V1.h$a$a r5 = V1.h.a.f16873h
                java.lang.String r6 = r9.f16878e
                int r7 = r9.f16879f
                if (r7 != r0) goto L40
                if (r1 != r4) goto L40
                if (r6 == 0) goto L40
                r5.getClass()
                boolean r8 = V1.h.a.C1160a.a(r6, r3)
                if (r8 != 0) goto L40
                return r2
            L40:
                if (r7 != r4) goto L50
                if (r1 != r0) goto L50
                if (r3 == 0) goto L50
                r5.getClass()
                boolean r4 = V1.h.a.C1160a.a(r3, r6)
                if (r4 != 0) goto L50
                return r2
            L50:
                if (r7 == 0) goto L63
                if (r7 != r1) goto L63
                if (r6 == 0) goto L60
                r5.getClass()
                boolean r1 = V1.h.a.C1160a.a(r6, r3)
                if (r1 != 0) goto L63
                goto L62
            L60:
                if (r3 == 0) goto L63
            L62:
                return r2
            L63:
                int r1 = r9.f16880g
                int r10 = r10.f16880g
                if (r1 != r10) goto L6a
                goto L6b
            L6a:
                r0 = r2
            L6b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: V1.h.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((this.f16874a.hashCode() * 31) + this.f16880g) * 31) + (this.f16876c ? 1231 : 1237)) * 31) + this.f16877d;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f16874a);
            sb2.append("', type='");
            sb2.append(this.f16875b);
            sb2.append("', affinity='");
            sb2.append(this.f16880g);
            sb2.append("', notNull=");
            sb2.append(this.f16876c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f16877d);
            sb2.append(", defaultValue='");
            String str = this.f16878e;
            if (str == null) {
                str = "undefined";
            }
            return AK.c.s(sb2, str, "'}");
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LV1/h$b;", "", "<init>", "()V", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV1/h$c;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface c {
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV1/h$d;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16881a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16882b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16883c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final List<String> f16884d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final List<String> f16885e;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list, @Y61.k List<String> list2) {
            this.f16881a = str;
            this.f16882b = str2;
            this.f16883c = str3;
            this.f16884d = list;
            this.f16885e = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (L.f(this.f16881a, dVar.f16881a) && L.f(this.f16882b, dVar.f16882b) && L.f(this.f16883c, dVar.f16883c) && L.f(this.f16884d, dVar.f16884d)) {
                return L.f(this.f16885e, dVar.f16885e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16885e.hashCode() + H.e(H.d(H.d(this.f16881a.hashCode() * 31, 31, this.f16882b), 31, this.f16883c), 31, this.f16884d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForeignKey{referenceTable='");
            sb2.append(this.f16881a);
            sb2.append("', onDelete='");
            sb2.append(this.f16882b);
            sb2.append(" +', onUpdate='");
            sb2.append(this.f16883c);
            sb2.append("', columnNames=");
            sb2.append(this.f16884d);
            sb2.append(", referenceColumnNames=");
            return H.p(sb2, this.f16885e, '}');
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"LV1/h$e;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements Comparable<e> {

        /* renamed from: b, reason: collision with root package name */
        public final int f16886b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16887c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f16888d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f16889e;

        public e(int i12, int i13, @Y61.k String str, @Y61.k String str2) {
            this.f16886b = i12;
            this.f16887c = i13;
            this.f16888d = str;
            this.f16889e = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(e eVar) {
            e eVar2 = eVar;
            int i12 = this.f16886b - eVar2.f16886b;
            return i12 == 0 ? this.f16887c - eVar2.f16887c : i12;
        }
    }

    /* compiled from: TableInfo.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LV1/h$f;", "", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f16890a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        public final boolean f16891b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final List<String> f16892c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final List<String> f16893d;

        /* compiled from: TableInfo.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LV1/h$f$a;", "", "<init>", "()V", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        public f(@Y61.k String str, boolean z12, @Y61.k List<String> list, @Y61.k List<String> list2) {
            this.f16890a = str;
            this.f16891b = z12;
            this.f16892c = list;
            this.f16893d = list2;
            List<String> arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add("ASC");
                }
            }
            this.f16893d = (List) arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f16891b != fVar.f16891b || !L.f(this.f16892c, fVar.f16892c) || !L.f(this.f16893d, fVar.f16893d)) {
                return false;
            }
            String str = this.f16890a;
            boolean zH02 = C43066x.h0(str, "index_", false);
            String str2 = fVar.f16890a;
            return zH02 ? C43066x.h0(str2, "index_", false) : str.equals(str2);
        }

        public final int hashCode() {
            String str = this.f16890a;
            return this.f16893d.hashCode() + H.e((((C43066x.h0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f16891b ? 1 : 0)) * 31, 31, this.f16892c);
        }

        @Y61.k
        public final String toString() {
            return "Index{name='" + this.f16890a + "', unique=" + this.f16891b + ", columns=" + this.f16892c + ", orders=" + this.f16893d + "'}";
        }
    }

    public h(@Y61.k String str, @Y61.k Map<String, a> map, @Y61.k Set<d> set, @l Set<f> set2) {
        this.f16869a = str;
        this.f16870b = map;
        this.f16871c = set;
        this.f16872d = set2;
    }

    /* JADX WARN: Finally extract failed */
    @n
    @Y61.k
    public static final h a(@Y61.k androidx.sqlite.db.framework.b bVar, @Y61.k String str) {
        Map mapB;
        kotlin.collections.builders.j jVarA;
        kotlin.collections.builders.j jVar;
        f16868e.getClass();
        Cursor cursorR5 = bVar.R5("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = cursorR5;
            if (cursor.getColumnCount() <= 0) {
                mapB = P0.c();
                kotlin.io.c.a(cursorR5, null);
            } else {
                int columnIndex = cursor.getColumnIndex("name");
                int columnIndex2 = cursor.getColumnIndex("type");
                int columnIndex3 = cursor.getColumnIndex("notnull");
                int columnIndex4 = cursor.getColumnIndex("pk");
                int columnIndex5 = cursor.getColumnIndex("dflt_value");
                kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(columnIndex);
                    dVar.put(string, new a(cursor.getInt(columnIndex4), string, cursor.getString(columnIndex2), cursor.getString(columnIndex5), cursor.getInt(columnIndex3) != 0, 2));
                }
                mapB = dVar.b();
                kotlin.io.c.a(cursorR5, null);
            }
            cursorR5 = bVar.R5("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                Cursor cursor2 = cursorR5;
                int columnIndex6 = cursor2.getColumnIndex("id");
                int columnIndex7 = cursor2.getColumnIndex("seq");
                int columnIndex8 = cursor2.getColumnIndex("table");
                int columnIndex9 = cursor2.getColumnIndex("on_delete");
                int columnIndex10 = cursor2.getColumnIndex("on_update");
                List<e> listA = i.a(cursor2);
                cursor2.moveToPosition(-1);
                kotlin.collections.builders.j jVar2 = new kotlin.collections.builders.j();
                while (cursor2.moveToNext()) {
                    if (cursor2.getInt(columnIndex7) == 0) {
                        int i12 = cursor2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        int i13 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listA) {
                            List<e> list = listA;
                            Map map = mapB;
                            if (((e) obj).f16886b == i12) {
                                arrayList3.add(obj);
                            }
                            listA = list;
                            mapB = map;
                        }
                        Map map2 = mapB;
                        List<e> list2 = listA;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            e eVar = (e) it.next();
                            arrayList.add(eVar.f16888d);
                            arrayList2.add(eVar.f16889e);
                        }
                        jVar2.add(new d(cursor2.getString(columnIndex8), cursor2.getString(columnIndex9), cursor2.getString(columnIndex10), arrayList, arrayList2));
                        columnIndex6 = i13;
                        columnIndex7 = i14;
                        listA = list2;
                        mapB = map2;
                    }
                }
                Map map3 = mapB;
                kotlin.collections.builders.j jVarA2 = b1.a(jVar2);
                kotlin.io.c.a(cursorR5, null);
                cursorR5 = bVar.R5("PRAGMA index_list(`" + str + "`)");
                try {
                    Cursor cursor3 = cursorR5;
                    int columnIndex11 = cursor3.getColumnIndex("name");
                    int columnIndex12 = cursor3.getColumnIndex("origin");
                    int columnIndex13 = cursor3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        jVarA = null;
                        kotlin.io.c.a(cursorR5, null);
                    } else {
                        kotlin.collections.builders.j jVar3 = new kotlin.collections.builders.j();
                        while (cursor3.moveToNext()) {
                            if ("c".equals(cursor3.getString(columnIndex12))) {
                                f fVarB = i.b(bVar, cursor3.getString(columnIndex11), cursor3.getInt(columnIndex13) == 1);
                                if (fVarB == null) {
                                    kotlin.io.c.a(cursorR5, null);
                                    jVar = null;
                                    break;
                                }
                                jVar3.add(fVarB);
                            }
                        }
                        jVarA = b1.a(jVar3);
                        kotlin.io.c.a(cursorR5, null);
                    }
                    jVar = jVarA;
                    return new h(str, map3, jVarA2, jVar);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(@l Object obj) {
        Set<f> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!L.f(this.f16869a, hVar.f16869a) || !L.f(this.f16870b, hVar.f16870b) || !L.f(this.f16871c, hVar.f16871c)) {
            return false;
        }
        Set<f> set2 = this.f16872d;
        if (set2 == null || (set = hVar.f16872d) == null) {
            return true;
        }
        return L.f(set2, set);
    }

    public final int hashCode() {
        return this.f16871c.hashCode() + AK.c.c(this.f16869a.hashCode() * 31, 31, this.f16870b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TableInfo{name='");
        sb2.append(this.f16869a);
        sb2.append("', columns=");
        sb2.append(this.f16870b);
        sb2.append(", foreignKeys=");
        sb2.append(this.f16871c);
        sb2.append(", indices=");
        return AK.c.u(sb2, this.f16872d, '}');
    }

    public /* synthetic */ h(String str, Map map, Set set, Set set2, int i12, C42822w c42822w) {
        this(str, map, set, (i12 & 8) != 0 ? null : set2);
    }
}
