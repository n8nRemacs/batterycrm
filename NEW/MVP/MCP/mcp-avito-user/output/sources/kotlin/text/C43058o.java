package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.sequences.o0;
import kotlin.text.InterfaceC43057n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/o;", "Lkotlin/text/n;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43058o implements InterfaceC43057n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Matcher f410615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CharSequence f410616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f410617c = new b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public a f410618d;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/text/o$a", "Lkotlin/collections/c;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.o$a */
    public static final class a extends AbstractC42738c<String> {
        public a() {
        }

        @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final Object get(int i12) {
            String strGroup = C43058o.this.f410615a.group(i12);
            return strGroup == null ? "" : strGroup;
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize */
        public final int getF406660f() {
            return C43058o.this.f410615a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"kotlin/text/o$b", "Lkotlin/text/m;", "Lkotlin/collections/a;", "Lkotlin/text/k;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.o$b */
    public static final class b extends AbstractC42734a<C43054k> implements InterfaceC43056m {

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/text/k;", "invoke", "(I)Lkotlin/text/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.text.o$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, C43054k> {
            public a() {
                super(1);
            }

            @Override // Y41.l
            public final C43054k invoke(Integer num) {
                return b.this.a(num.intValue());
            }
        }

        public b() {
        }

        public final C43054k a(int i12) {
            C43058o c43058o = C43058o.this;
            Matcher matcher = c43058o.f410615a;
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(matcher.start(i12), matcher.end(i12));
            if (lVarR.f406905b >= 0) {
                return new C43054k(c43058o.f410615a.group(i12), lVarR);
            }
            return null;
        }

        @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C43054k) {
                return super.contains((C43054k) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize */
        public final int getF406660f() {
            return C43058o.this.f410615a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC42734a, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<C43054k> iterator() {
            return new o0.a(new o0(new C42770s0(C42745f0.I(this)), new a()));
        }
    }

    public C43058o(@Y61.k Matcher matcher, @Y61.k CharSequence charSequence) {
        this.f410615a = matcher;
        this.f410616b = charSequence;
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.k
    public final kotlin.ranges.l b() {
        Matcher matcher = this.f410615a;
        return kotlin.ranges.s.r(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.k
    public final InterfaceC43057n.b c() {
        return new InterfaceC43057n.b(this);
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.k
    public final List<String> d() {
        if (this.f410618d == null) {
            this.f410618d = new a();
        }
        return this.f410618d;
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.k
    /* renamed from: getGroups, reason: from getter */
    public final b getF410617c() {
        return this.f410617c;
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.k
    public final String getValue() {
        return this.f410615a.group();
    }

    @Override // kotlin.text.InterfaceC43057n
    @Y61.l
    public final InterfaceC43057n next() {
        Matcher matcher = this.f410615a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f410616b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(iEnd)) {
            return new C43058o(matcher2, charSequence);
        }
        return null;
    }
}
