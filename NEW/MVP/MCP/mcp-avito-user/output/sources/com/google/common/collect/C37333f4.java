package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

/* compiled from: SortedLists.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37333f4 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortedLists.java */
    /* renamed from: com.google.common.collect.f4$b */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f359771b;

        /* renamed from: c, reason: collision with root package name */
        public static final C10670b f359772c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f359773d;

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$b$a */
        public enum a extends b {
            @Override // com.google.common.collect.C37333f4.b
            public final int a(int i12) {
                return i12 - 1;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$b$c */
        public enum c extends b {
            @Override // com.google.common.collect.C37333f4.b
            public final int a(int i12) {
                return ~i12;
            }
        }

        static {
            a aVar = new a("NEXT_LOWER", 0, null);
            f359771b = aVar;
            C10670b c10670b = new C10670b("NEXT_HIGHER", 1, null);
            f359772c = c10670b;
            f359773d = new b[]{aVar, c10670b, new c("INVERTED_INSERTION_INDEX", 2, null)};
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, a aVar) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f359773d.clone();
        }

        public abstract int a(int i12);

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$b$b, reason: collision with other inner class name */
        public enum C10670b extends b {
            @Override // com.google.common.collect.C37333f4.b
            public final int a(int i12) {
                return i12;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortedLists.java */
    /* renamed from: com.google.common.collect.f4$c */
    public static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f359774b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f359775c;

        /* renamed from: d, reason: collision with root package name */
        public static final C10671c f359776d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f359777e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c[] f359778f;

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$c$b */
        public enum b extends c {
            @Override // com.google.common.collect.C37333f4.c
            public final int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12) {
                int size = list.size() - 1;
                while (i12 < size) {
                    int i13 = ((i12 + size) + 1) >>> 1;
                    if (((C37392p3) comparator).compare(list.get(i13), comparable) > 0) {
                        size = i13 - 1;
                    } else {
                        i12 = i13;
                    }
                }
                return i12;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$c$c, reason: collision with other inner class name */
        public enum C10671c extends c {
            @Override // com.google.common.collect.C37333f4.c
            public final int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12) {
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = (i13 + i12) >>> 1;
                    if (((C37392p3) comparator).compare(list.get(i14), comparable) < 0) {
                        i13 = i14 + 1;
                    } else {
                        i12 = i14;
                    }
                }
                return i13;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$c$d */
        public enum d extends c {
            @Override // com.google.common.collect.C37333f4.c
            public final int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12) {
                return c.f359775c.a(comparator, comparable, list, i12) + 1;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$c$e */
        public enum e extends c {
            @Override // com.google.common.collect.C37333f4.c
            public final int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12) {
                return c.f359776d.a(comparator, comparable, list, i12) - 1;
            }
        }

        static {
            a aVar = new a("ANY_PRESENT", 0, null);
            f359774b = aVar;
            b bVar = new b("LAST_PRESENT", 1, null);
            f359775c = bVar;
            C10671c c10671c = new C10671c("FIRST_PRESENT", 2, null);
            f359776d = c10671c;
            d dVar = new d("FIRST_AFTER", 3, null);
            f359777e = dVar;
            f359778f = new c[]{aVar, bVar, c10671c, dVar, new e("LAST_BEFORE", 4, null)};
        }

        public c() {
            throw null;
        }

        public c(String str, int i12, a aVar) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f359778f.clone();
        }

        public abstract int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12);

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.f4$c$a */
        public enum a extends c {
            @Override // com.google.common.collect.C37333f4.c
            public final int a(Comparator comparator, @InterfaceC37434x3 Comparable comparable, List list, int i12) {
                return i12;
            }
        }
    }
}
