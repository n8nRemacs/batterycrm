package kotlinx.datetime.internal.format.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ParserOperation.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/C;", "Output", "Lkotlinx/datetime/internal/format/parser/s;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C<Output> implements s<Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43375a<Output, String> f412535a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f412537c = new a(null, false, 3, null);

    /* compiled from: ParserOperation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/internal/format/parser/C$a;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Q<String, a>> f412538a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f412539b;

        public a() {
            this(null, false, 3, null);
        }

        public a(List list, boolean z12, int i12, C42822w c42822w) {
            list = (i12 & 1) != 0 ? new ArrayList() : list;
            z12 = (i12 & 2) != 0 ? false : z12;
            this.f412538a = list;
            this.f412539b = z12;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b((String) ((Q) t12).f406619b, (String) ((Q) t13).f406619b);
        }
    }

    /* compiled from: Collections.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Q<? extends String, ? extends a>, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f412540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f412540l = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Integer invoke(Q<? extends String, ? extends a> q12) {
            return Integer.valueOf(kotlin.comparisons.a.b((String) q12.f406619b, this.f412540l));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k Collection<String> collection, @Y61.k InterfaceC43375a<? super Output, String> interfaceC43375a, @Y61.k String str) {
        this.f412535a = interfaceC43375a;
        this.f412536b = str;
        for (String str2 : collection) {
            if (str2.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.f412536b).toString());
            }
            a aVar = this.f412537c;
            int length = str2.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str2.charAt(i12);
                List<Q<String, a>> list = aVar.f412538a;
                int iN2 = C42745f0.n(list, list.size(), new c(String.valueOf(cCharAt)));
                List<Q<String, a>> list2 = aVar.f412538a;
                if (iN2 < 0) {
                    a aVar2 = new a(null, false, 3, null);
                    list2.add((-iN2) - 1, new Q<>(String.valueOf(cCharAt), aVar2));
                    aVar = aVar2;
                } else {
                    aVar = list2.get(iN2).f406620c;
                }
            }
            if (aVar.f412539b) {
                throw new IllegalArgumentException(AK.c.k("The string '", str2, "' was passed several times").toString());
            }
            aVar.f412539b = true;
        }
        b(this.f412537c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a aVar) {
        Iterator<Q<String, a>> it = aVar.f412538a.iterator();
        while (it.hasNext()) {
            b(it.next().f406620c);
        }
        ArrayList arrayList = new ArrayList();
        List<Q<String, a>> list = aVar.f412538a;
        for (Q<String, a> q12 : list) {
            String str = q12.f406619b;
            a aVar2 = q12.f406620c;
            if (!aVar2.f412539b) {
                List<Q<String, a>> list2 = aVar2.f412538a;
                if (list2.size() == 1) {
                    Q q13 = (Q) C42745f0.u0(list2);
                    String str2 = (String) q13.f406619b;
                    arrayList.add(new Q(androidx.appcompat.app.r.q(str, str2), (a) q13.f406620c));
                }
            }
            arrayList.add(new Q(str, aVar2));
        }
        list.clear();
        list.addAll(C42745f0.B0(arrayList, new b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0.f406840b = r4.length() + r0.f406840b;
        r1 = r3;
     */
    @Override // kotlinx.datetime.internal.format.parser.s
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.datetime.internal.format.parser.InterfaceC43377c r7, @Y61.k java.lang.CharSequence r8, int r9) {
        /*
            r6 = this;
            kotlin.jvm.internal.l0$f r0 = new kotlin.jvm.internal.l0$f
            r0.<init>()
            r0.f406840b = r9
            kotlinx.datetime.internal.format.parser.C$a r1 = r6.f412537c
            r2 = 0
        La:
            int r3 = r0.f406840b
            int r4 = r8.length()
            if (r3 > r4) goto L49
            boolean r3 = r1.f412539b
            if (r3 == 0) goto L1c
            int r2 = r0.f406840b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L1c:
            java.util.List<kotlin.Q<java.lang.String, kotlinx.datetime.internal.format.parser.C$a>> r1 = r1.f412538a
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()
            kotlin.Q r3 = (kotlin.Q) r3
            A r4 = r3.f406619b
            java.lang.String r4 = (java.lang.String) r4
            B r3 = r3.f406620c
            kotlinx.datetime.internal.format.parser.C$a r3 = (kotlinx.datetime.internal.format.parser.C.a) r3
            int r5 = r0.f406840b
            boolean r5 = kotlin.text.C43066x.k0(r4, r8, r5)
            if (r5 == 0) goto L22
            int r1 = r0.f406840b
            int r4 = r4.length()
            int r4 = r4 + r1
            r0.f406840b = r4
            r1 = r3
            goto La
        L49:
            if (r2 == 0) goto L74
            int r0 = r2.intValue()
            java.lang.CharSequence r8 = r8.subSequence(r9, r0)
            java.lang.String r8 = r8.toString()
            kotlinx.datetime.internal.format.parser.a<Output, java.lang.String> r0 = r6.f412535a
            java.lang.Object r7 = r0.c(r7, r8)
            if (r7 != 0) goto L65
            kotlinx.datetime.internal.format.parser.m$a r7 = kotlinx.datetime.internal.format.parser.m.f412573b
            r7.getClass()
            goto L82
        L65:
            kotlinx.datetime.internal.format.parser.m$a r1 = kotlinx.datetime.internal.format.parser.m.f412573b
            kotlinx.datetime.internal.format.parser.t r2 = new kotlinx.datetime.internal.format.parser.t
            r2.<init>(r7, r8, r0)
            r1.getClass()
            kotlinx.datetime.internal.format.parser.l r2 = kotlinx.datetime.internal.format.parser.m.a.a(r9, r2)
            goto L82
        L74:
            kotlinx.datetime.internal.format.parser.m$a r7 = kotlinx.datetime.internal.format.parser.m.f412573b
            kotlinx.datetime.internal.format.parser.D r1 = new kotlinx.datetime.internal.format.parser.D
            r1.<init>(r6, r8, r9, r0)
            r7.getClass()
            kotlinx.datetime.internal.format.parser.l r2 = kotlinx.datetime.internal.format.parser.m.a.a(r9, r1)
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.internal.format.parser.C.a(kotlinx.datetime.internal.format.parser.c, java.lang.CharSequence, int):java.lang.Object");
    }
}
