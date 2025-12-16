package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Regex.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/text/p;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43059p implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410622c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Pattern f410623b;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/p$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.p$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/text/p$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.p$b */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f410624b;

        /* renamed from: c, reason: collision with root package name */
        public final int f410625c;

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/p$b$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.p$b$a */
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

        public b(@Y61.k String str, int i12) {
            this.f410624b = str;
            this.f410625c = i12;
        }

        private final Object readResolve() {
            return new C43059p(Pattern.compile(this.f410624b, this.f410625c));
        }
    }

    @kotlin.X
    public C43059p(@Y61.k Pattern pattern) {
        this.f410623b = pattern;
    }

    public static InterfaceC43057n b(C43059p c43059p, CharSequence charSequence) {
        Matcher matcher = c43059p.f410623b.matcher(charSequence);
        if (matcher.find(0)) {
            return new C43058o(matcher, charSequence);
        }
        return null;
    }

    public static InterfaceC43030m c(C43059p c43059p, String str) {
        c43059p.getClass();
        if (str.length() >= 0) {
            return C43033p.t(new C43060q(c43059p, str), r.f410628b);
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(0, "Start index out of bounds: ", ", input length: ");
        sbJ.append(str.length());
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    private final Object writeReplace() {
        Pattern pattern = this.f410623b;
        return new b(pattern.pattern(), pattern.flags());
    }

    public final boolean a(@Y61.k CharSequence charSequence) {
        return this.f410623b.matcher(charSequence).find();
    }

    @Y61.l
    public final InterfaceC43057n d(@Y61.k CharSequence charSequence) {
        Matcher matcher = this.f410623b.matcher(charSequence);
        if (matcher.matches()) {
            return new C43058o(matcher, charSequence);
        }
        return null;
    }

    public final boolean e(@Y61.k CharSequence charSequence) {
        return this.f410623b.matcher(charSequence).matches();
    }

    @Y61.k
    public final String f(@Y61.k CharSequence charSequence, @Y61.k String str) {
        return this.f410623b.matcher(charSequence).replaceAll(str);
    }

    @Y61.k
    public final String g(@Y61.k String str, @Y61.k Y41.l lVar) {
        InterfaceC43057n interfaceC43057nB = b(this, str);
        if (interfaceC43057nB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        do {
            C43058o c43058o = (C43058o) interfaceC43057nB;
            sb2.append((CharSequence) str, i12, c43058o.b().f406905b);
            sb2.append((CharSequence) lVar.invoke(interfaceC43057nB));
            i12 = c43058o.b().f406906c + 1;
            interfaceC43057nB = c43058o.next();
            if (i12 >= length) {
                break;
            }
        } while (interfaceC43057nB != null);
        if (i12 < length) {
            sb2.append((CharSequence) str, i12, length);
        }
        return sb2.toString();
    }

    @Y61.k
    public final List h(@Y61.k CharSequence charSequence) {
        int iEnd = 0;
        P.g(0);
        Matcher matcher = this.f410623b.matcher(charSequence);
        if (!matcher.find()) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @Y61.k
    public final String toString() {
        return this.f410623b.toString();
    }

    public C43059p(@Y61.k String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C43059p(@Y61.k String str, @Y61.k RegexOption regexOption) {
        f410622c.getClass();
        int i12 = regexOption.f410586b;
        this(Pattern.compile(str, (i12 & 2) != 0 ? i12 | 64 : i12));
    }
}
