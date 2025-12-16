package kotlin.text;

import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HexFormat.kt */
@InterfaceC43017s
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/text/i;", "", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.text.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43052i {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f410604c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43052i f410605d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BytesHexFormat f410606a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NumberHexFormat f410607b;

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.i$a */
    public static final class a {
        @kotlin.X
        public a() {
            C43052i.f410604c.getClass();
            C43052i.f410605d.getClass();
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$b;", "", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.i$b, reason: from toString */
    public static final class BytesHexFormat {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11706b f410608a = new C11706b(null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final BytesHexFormat f410609b;

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$b$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.i$b$a */
        public static final class a {
            public a() {
                C11706b c11706b = BytesHexFormat.f410608a;
                c11706b.getClass();
                BytesHexFormat bytesHexFormat = BytesHexFormat.f410609b;
                bytesHexFormat.getClass();
                c11706b.getClass();
                bytesHexFormat.getClass();
                c11706b.getClass();
                bytesHexFormat.getClass();
                c11706b.getClass();
                bytesHexFormat.getClass();
                c11706b.getClass();
                bytesHexFormat.getClass();
                c11706b.getClass();
                bytesHexFormat.getClass();
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$b$b;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.i$b$b, reason: collision with other inner class name */
        public static final class C11706b {
            public /* synthetic */ C11706b(C42822w c42822w) {
                this();
            }

            public C11706b() {
            }
        }

        static {
            BytesHexFormat bytesHexFormat = new BytesHexFormat();
            if (!C43053j.a("  ") && !C43053j.a("") && !C43053j.a("")) {
                C43053j.a("");
            }
            f410609b = bytesHexFormat;
        }

        @Y61.k
        public final void a(@Y61.k StringBuilder sb2, @Y61.k String str) {
            sb2.append(str);
            sb2.append("bytesPerLine = ");
            sb2.append(Integer.MAX_VALUE);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytesPerGroup = ");
            sb2.append(Integer.MAX_VALUE);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("groupSeparator = \"");
            sb2.append("  ");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSeparator = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            androidx.media3.exoplayer.analytics.m.p(sb2, str, "bytePrefix = \"", "", "\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSuffix = \"");
            sb2.append("");
            sb2.append("\"");
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(\n");
            a(sb2, "    ");
            sb2.append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$c;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.i$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$d;", "", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.i$d, reason: from toString */
    public static final class NumberHexFormat {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f410610a = new b(null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NumberHexFormat f410611b;

        /* compiled from: HexFormat.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$d$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.i$d$a */
        public static final class a {
            public a() {
                b bVar = NumberHexFormat.f410610a;
                bVar.getClass();
                NumberHexFormat numberHexFormat = NumberHexFormat.f410611b;
                numberHexFormat.getClass();
                bVar.getClass();
                numberHexFormat.getClass();
                bVar.getClass();
                numberHexFormat.getClass();
                bVar.getClass();
                numberHexFormat.getClass();
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/i$d$b;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.i$d$b */
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            NumberHexFormat numberHexFormat = new NumberHexFormat();
            if (!C43053j.a("")) {
                C43053j.a("");
            }
            f410611b = numberHexFormat;
        }

        @Y61.k
        public final void a(@Y61.k StringBuilder sb2, @Y61.k String str) {
            androidx.media3.exoplayer.analytics.m.p(sb2, str, "prefix = \"", "", "\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("suffix = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("removeLeadingZeros = ");
            sb2.append(false);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(str);
            sb2.append("minLength = ");
            sb2.append(1);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(\n");
            a(sb2, "    ");
            sb2.append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        BytesHexFormat.f410608a.getClass();
        BytesHexFormat bytesHexFormat = BytesHexFormat.f410609b;
        NumberHexFormat.f410610a.getClass();
        f410605d = new C43052i(bytesHexFormat, NumberHexFormat.f410611b);
    }

    public C43052i(@Y61.k BytesHexFormat bytesHexFormat, @Y61.k NumberHexFormat numberHexFormat) {
        this.f410606a = bytesHexFormat;
        this.f410607b = numberHexFormat;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbR = androidx.compose.foundation.H.r("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.f410606a.a(sbR, "        ");
        sbR.append('\n');
        sbR.append("    ),");
        sbR.append('\n');
        sbR.append("    number = NumberHexFormat(");
        sbR.append('\n');
        this.f410607b.a(sbR, "        ");
        sbR.append('\n');
        sbR.append("    )");
        sbR.append('\n');
        sbR.append(")");
        return sbR.toString();
    }
}
