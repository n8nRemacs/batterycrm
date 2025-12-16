package com.yandex.mobile.ads.embedded.guava.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.impl.iu0;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
final class g0<K, V> extends q<K, V> {

    /* renamed from: g, reason: collision with root package name */
    static final q<Object, Object> f382752g = new g0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    private final transient Object f382753d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f382754e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f382755f;

    public static class a<K, V> extends r<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private final transient q<K, V> f382756c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f382757d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f382758e = 0;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f382759f;

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$a$a, reason: collision with other inner class name */
        public class C10967a extends p<Map.Entry<K, V>> {
            public C10967a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.n
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i12) {
                iu0.a(i12, a.this.f382759f);
                int i13 = i12 * 2;
                Object obj = a.this.f382757d[a.this.f382758e + i13];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f382757d[i13 + (a.this.f382758e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f382759f;
            }
        }

        public a(q qVar, Object[] objArr, int i12) {
            this.f382756c = qVar;
            this.f382757d = objArr;
            this.f382759f = i12;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f382756c.get(key));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final p0<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r
        public final p<Map.Entry<K, V>> h() {
            return new C10967a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f382759f;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int a(int i12, Object[] objArr) {
            return b().a(i12, objArr);
        }
    }

    public static final class b<K> extends r<K> {

        /* renamed from: c, reason: collision with root package name */
        private final transient q<K, ?> f382761c;

        /* renamed from: d, reason: collision with root package name */
        private final transient p<K> f382762d;

        public b(q<K, ?> qVar, p<K> pVar) {
            this.f382761c = qVar;
            this.f382762d = pVar;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int a(int i12, Object[] objArr) {
            return this.f382762d.a(i12, objArr);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n
        public final p<K> b() {
            return this.f382762d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return this.f382761c.get(obj) != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final p0<K> iterator() {
            return this.f382762d.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f382761c.size();
        }
    }

    public static final class c extends p<Object> {

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f382763d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f382764e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f382765f;

        public c(Object[] objArr, int i12, int i13) {
            this.f382763d = objArr;
            this.f382764e = i12;
            this.f382765f = i13;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i12) {
            iu0.a(i12, this.f382765f);
            Object obj = this.f382763d[(i12 * 2) + this.f382764e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f382765f;
        }
    }

    private g0(@I41.a Object obj, Object[] objArr, int i12) {
        this.f382753d = obj;
        this.f382754e = objArr;
        this.f382755f = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> com.yandex.mobile.ads.embedded.guava.collect.g0<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.guava.collect.g0.a(int, java.lang.Object[]):com.yandex.mobile.ads.embedded.guava.collect.g0");
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final r<Map.Entry<K, V>> b() {
        return new a(this, this.f382754e, this.f382755f);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final r<K> c() {
        return new b(this, new c(this.f382754e, 0, this.f382755f));
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final n<V> d() {
        return new c(this.f382754e, 1, this.f382755f);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[EDGE_INSN: B:43:0x008d->B:35:0x008d BREAK  A[LOOP:0: B:15:0x0036->B:21:0x004c], EDGE_INSN: B:45:0x008d->B:35:0x008d BREAK  A[LOOP:1: B:25:0x0061->B:31:0x0078], EDGE_INSN: B:47:0x008d->B:35:0x008d BREAK  A[LOOP:2: B:33:0x0087->B:42:0x009f]] */
    @Override // com.yandex.mobile.ads.embedded.guava.collect.q, java.util.Map
    @I41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(@I41.a java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f382753d
            java.lang.Object[] r1 = r8.f382754e
            int r2 = r8.f382755f
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8d
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8d
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9b
        L21:
            if (r0 != 0) goto L24
            goto L8d
        L24:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.m.a(r0)
        L36:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            goto L8d
        L3f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L4c:
            int r0 = r0 + 1
            goto L36
        L4f:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7b
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.m.a(r0)
        L61:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6b
            goto L8d
        L6b:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L78
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L78:
            int r0 = r0 + 1
            goto L61
        L7b:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.yandex.mobile.ads.embedded.guava.collect.m.a(r5)
        L87:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L8f
        L8d:
            r9 = r3
            goto L9b
        L8f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L9f
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9b:
            if (r9 != 0) goto L9e
            return r3
        L9e:
            return r9
        L9f:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.guava.collect.g0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f382755f;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final void f() {
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i12) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + ContainerUtils.KEY_VALUE_DELIMITER + obj2 + " and " + objArr[i12] + ContainerUtils.KEY_VALUE_DELIMITER + objArr[i12 ^ 1]);
    }
}
