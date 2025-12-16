package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/text/f;", "Lkotlin/sequences/m;", "Lkotlin/ranges/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43049f implements InterfaceC43030m<kotlin.ranges.l> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f410595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410596b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f410597c;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/text/f$a", "", "Lkotlin/ranges/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.f$a */
    public static final class a implements Iterator<kotlin.ranges.l>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public int f410598b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f410599c;

        /* renamed from: d, reason: collision with root package name */
        public int f410600d;

        /* renamed from: e, reason: collision with root package name */
        public kotlin.ranges.l f410601e;

        /* renamed from: f, reason: collision with root package name */
        public int f410602f;

        public a() {
            int iG2 = kotlin.ranges.s.g(0, 0, C43049f.this.f410595a.length());
            this.f410599c = iG2;
            this.f410600d = iG2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r8 = this;
                int r0 = r8.f410600d
                r1 = 0
                if (r0 >= 0) goto Lb
                r8.f410598b = r1
                r0 = 0
                r8.f410601e = r0
                goto L75
            Lb:
                kotlin.text.f r2 = kotlin.text.C43049f.this
                java.lang.CharSequence r3 = r2.f410595a
                int r4 = r2.f410596b
                r5 = -1
                r6 = 1
                if (r4 <= 0) goto L1c
                int r7 = r8.f410602f
                int r7 = r7 + r6
                r8.f410602f = r7
                if (r7 >= r4) goto L22
            L1c:
                int r4 = r3.length()
                if (r0 <= r4) goto L32
            L22:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r8.f410599c
                int r2 = kotlin.text.C43066x.F(r3)
                r0.<init>(r1, r2, r6)
                r8.f410601e = r0
                r8.f410600d = r5
                goto L73
            L32:
                kotlin.jvm.internal.N r0 = r2.f410597c
                int r2 = r8.f410600d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r0 = r0.invoke(r3, r2)
                kotlin.Q r0 = (kotlin.Q) r0
                if (r0 != 0) goto L52
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r8.f410599c
                int r2 = kotlin.text.C43066x.F(r3)
                r0.<init>(r1, r2, r6)
                r8.f410601e = r0
                r8.f410600d = r5
                goto L73
            L52:
                A r2 = r0.f406619b
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f406620c
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r8.f410599c
                kotlin.ranges.l r3 = kotlin.ranges.s.r(r3, r2)
                r8.f410601e = r3
                int r2 = r2 + r0
                r8.f410599c = r2
                if (r0 != 0) goto L70
                r1 = r6
            L70:
                int r2 = r2 + r1
                r8.f410600d = r2
            L73:
                r8.f410598b = r6
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C43049f.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f410598b == -1) {
                a();
            }
            return this.f410598b == 1;
        }

        @Override // java.util.Iterator
        public final kotlin.ranges.l next() {
            if (this.f410598b == -1) {
                a();
            }
            if (this.f410598b == 0) {
                throw new NoSuchElementException();
            }
            kotlin.ranges.l lVar = this.f410601e;
            this.f410601e = null;
            this.f410598b = -1;
            return lVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43049f(@Y61.k CharSequence charSequence, int i12, @Y61.k Y41.p pVar) {
        this.f410595a = charSequence;
        this.f410596b = i12;
        this.f410597c = (kotlin.jvm.internal.N) pVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<kotlin.ranges.l> iterator() {
        return new a();
    }
}
