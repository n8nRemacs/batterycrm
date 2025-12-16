package com.avito.beduin.v2.parser;

import PU0.f;
import TU0.e;
import TU0.g;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import cU0.InterfaceC27108f;
import com.avito.beduin.v2.engine.component.z;
import com.avito.beduin.v2.engine.core.E;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.B;
import com.avito.beduin.v2.engine.field.entity.d;
import com.avito.beduin.v2.engine.field.entity.q;
import com.avito.beduin.v2.engine.field.entity.u;
import com.avito.beduin.v2.engine.field.entity.w;
import com.avito.beduin.v2.engine.field.entity.y;
import com.avito.beduin.v2.engine.field.h;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.l;
import com.avito.beduin.v2.engine.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser;", "LTU0/e;", "a", "b", "Modifier", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class JsonParser implements e {

    /* renamed from: a, reason: collision with root package name */
    public final PU0.b f337878a;

    /* renamed from: b, reason: collision with root package name */
    public final z f337879b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC27108f f337880c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "", "<init>", "()V", "a", "b", "c", "d", "Range", "e", "f", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier$a;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier$c;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier$d;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier$e;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier$f;", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Modifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f337881a = new b(null);

        /* renamed from: b, reason: collision with root package name */
        public static final Set<Character> f337882b = C42756l.l0(new Character[]{'&', '!', '+', '-'});

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$Range;", "", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Range {

            /* renamed from: b, reason: collision with root package name */
            public static final Range f337883b;

            /* renamed from: c, reason: collision with root package name */
            public static final Range f337884c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Range[] f337885d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f337886e;

            static {
                Range range = new Range("SELF", 0);
                f337883b = range;
                Range range2 = new Range("CHILD", 1);
                f337884c = range2;
                Range[] rangeArr = {range, range2};
                f337885d = rangeArr;
                f337886e = kotlin.enums.c.a(rangeArr);
            }

            public Range() {
                throw null;
            }

            public static Range valueOf(String str) {
                return (Range) Enum.valueOf(Range.class, str);
            }

            public static Range[] values() {
                return (Range[]) f337885d.clone();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$a;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends Modifier {

            /* renamed from: c, reason: collision with root package name */
            public final o f337887c;

            /* renamed from: d, reason: collision with root package name */
            public final String f337888d;

            /* renamed from: e, reason: collision with root package name */
            public final Range f337889e;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$a$a;", "", "<init>", "()V", "", "PREFIX", "C", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.beduin.v2.parser.JsonParser$Modifier$a$a, reason: collision with other inner class name */
            public static final class C10469a {
                public C10469a() {
                }

                public /* synthetic */ C10469a(C42822w c42822w) {
                    this();
                }
            }

            static {
                new C10469a(null);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public a(o oVar, String str, Range range, int i12, C42822w c42822w) {
                C42822w c42822w2 = null;
                str = (i12 & 2) != 0 ? null : str;
                range = (i12 & 4) != 0 ? Range.f337884c : range;
                super(c42822w2);
                this.f337887c = oVar;
                this.f337888d = str;
                this.f337889e = range;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: a, reason: from getter */
            public final String getF337898d() {
                return this.f337888d;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: b, reason: from getter */
            public final Range getF337899e() {
                return this.f337889e;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            public final com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar) {
                com.avito.beduin.v2.engine.field.f<?> eVar = fVar instanceof l ? ((l) fVar).getF336807d().f336867a.get("targetId") : fVar instanceof B ? ((B) fVar).f336781c.f336867a.get("targetId") : null;
                o oVar = this.f337887c;
                if (eVar == null) {
                    j jVarA = F.f336593b.A();
                    String strA = com.avito.beduin.v2.engine.utils.f.a();
                    oVar.getClass();
                    eVar = new w.e(jVarA, strA);
                }
                ArrayList arrayList = new ArrayList();
                F.a aVar = F.f336593b;
                j jVarA2 = aVar.A();
                oVar.getClass();
                arrayList.addAll(C42745f0.U(new Q("operation", new w.e(jVarA2, "AddToEnd")), new Q("targetId", eVar)));
                j jVarA3 = aVar.A();
                Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
                return new u((com.avito.beduin.v2.engine.field.o) aVar.r(str), fVar, new B(jVarA3, new h((Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) Arrays.copyOf(qArr, qArr.length))));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f337887c, aVar.f337887c) && L.f(this.f337888d, aVar.f337888d) && this.f337889e == aVar.f337889e;
            }

            public final int hashCode() {
                int iHashCode = this.f337887c.hashCode() * 31;
                String str = this.f337888d;
                return this.f337889e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "AddToEnd(fieldFactory=" + this.f337887c + ", id=" + this.f337888d + ", range=" + this.f337889e + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$b;", "", "<init>", "()V", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$c;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends Modifier {

            /* renamed from: c, reason: collision with root package name */
            public final String f337890c;

            /* renamed from: d, reason: collision with root package name */
            public final Range f337891d;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$c$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "", "PREFIX", "C", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }
            }

            static {
                new a(null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: a, reason: from getter */
            public final String getF337898d() {
                return this.f337890c;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: b, reason: from getter */
            public final Range getF337899e() {
                return this.f337891d;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            public final com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar) {
                return new q(F.f336593b.r(str), fVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f337890c, ((c) obj).f337890c);
            }

            public final int hashCode() {
                String str = this.f337890c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return C22026a.c(new StringBuilder("Mutable(id="), this.f337890c, ')');
            }

            public c(String str) {
                super(null);
                this.f337890c = str;
                this.f337891d = Range.f337883b;
            }

            public /* synthetic */ c(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$d;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends Modifier {

            /* renamed from: c, reason: collision with root package name */
            public final String f337892c;

            /* renamed from: d, reason: collision with root package name */
            public final B f337893d;

            /* renamed from: e, reason: collision with root package name */
            public final Range f337894e;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$d$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }
            }

            static {
                new a(null);
            }

            public d(String str, B b12, Range range) {
                super(null);
                this.f337892c = str;
                this.f337893d = b12;
                this.f337894e = range;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: a, reason: from getter */
            public final String getF337898d() {
                return this.f337892c;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: b, reason: from getter */
            public final Range getF337899e() {
                return this.f337894e;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            public final com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar) {
                return new u((com.avito.beduin.v2.engine.field.o) F.f336593b.r(str), fVar, this.f337893d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f337892c, dVar.f337892c) && L.f(this.f337893d, dVar.f337893d) && this.f337894e == dVar.f337894e;
            }

            public final int hashCode() {
                String str = this.f337892c;
                return this.f337894e.hashCode() + ((this.f337893d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
            }

            public final String toString() {
                return "Patch(id=" + this.f337892c + ", params=" + this.f337893d + ", range=" + this.f337894e + ')';
            }

            public /* synthetic */ d(String str, B b12, Range range, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, b12, range);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$e;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e extends Modifier {

            /* renamed from: c, reason: collision with root package name */
            public final String f337895c;

            /* renamed from: d, reason: collision with root package name */
            public final Range f337896d;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$e$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "", "PREFIX", "C", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }
            }

            static {
                new a(null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public e() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: a, reason: from getter */
            public final String getF337898d() {
                return this.f337895c;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: b, reason: from getter */
            public final Range getF337899e() {
                return this.f337896d;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            public final com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar) {
                return new y(F.f336593b.r(str), fVar, null, 4, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && L.f(this.f337895c, ((e) obj).f337895c);
            }

            public final int hashCode() {
                String str = this.f337895c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return C22026a.c(new StringBuilder("Raw(id="), this.f337895c, ')');
            }

            public e(String str) {
                super(null);
                this.f337895c = str;
                this.f337896d = Range.f337883b;
            }

            public /* synthetic */ e(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$f;", "Lcom/avito/beduin/v2/parser/JsonParser$Modifier;", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f extends Modifier {

            /* renamed from: c, reason: collision with root package name */
            public final o f337897c;

            /* renamed from: d, reason: collision with root package name */
            public final String f337898d;

            /* renamed from: e, reason: collision with root package name */
            public final Range f337899e;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$Modifier$f$a;", "", "<init>", "()V", "", "PREFIX", "C", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }
            }

            static {
                new a(null);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public f(o oVar, String str, Range range, int i12, C42822w c42822w) {
                C42822w c42822w2 = null;
                str = (i12 & 2) != 0 ? null : str;
                range = (i12 & 4) != 0 ? Range.f337884c : range;
                super(c42822w2);
                this.f337897c = oVar;
                this.f337898d = str;
                this.f337899e = range;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: a, reason: from getter */
            public final String getF337898d() {
                return this.f337898d;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            /* renamed from: b, reason: from getter */
            public final Range getF337899e() {
                return this.f337899e;
            }

            @Override // com.avito.beduin.v2.parser.JsonParser.Modifier
            public final com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar) {
                ArrayList arrayList = new ArrayList();
                F.a aVar = F.f336593b;
                j jVarA = aVar.A();
                this.f337897c.getClass();
                arrayList.addAll(C42745f0.U(new Q("operation", new w.e(jVarA, "Remove")), new Q("targetId", fVar)));
                j jVarA2 = aVar.A();
                Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
                return new u((com.avito.beduin.v2.engine.field.o) aVar.A(), fVar, new B(jVarA2, new h((Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) Arrays.copyOf(qArr, qArr.length))));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f337897c, fVar.f337897c) && L.f(this.f337898d, fVar.f337898d) && this.f337899e == fVar.f337899e;
            }

            public final int hashCode() {
                int iHashCode = this.f337897c.hashCode() * 31;
                String str = this.f337898d;
                return this.f337899e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "Remove(fieldFactory=" + this.f337897c + ", id=" + this.f337898d + ", range=" + this.f337899e + ')';
            }
        }

        public Modifier() {
        }

        /* renamed from: a */
        public abstract String getF337898d();

        /* renamed from: b */
        public abstract Range getF337899e();

        public abstract com.avito.beduin.v2.engine.field.f<?> c(String str, com.avito.beduin.v2.engine.field.f<?> fVar);

        public /* synthetic */ Modifier(C42822w c42822w) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$a;", "", "a", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C10470a f337900c = new C10470a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f337901a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f337902b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$a$a;", "", "<init>", "()V", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.parser.JsonParser$a$a, reason: collision with other inner class name */
        public static final class C10470a {
            public C10470a() {
            }

            public /* synthetic */ C10470a(C42822w c42822w) {
                this();
            }
        }

        public a(String str, ArrayList arrayList) {
            this.f337901a = str;
            this.f337902b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f337901a, aVar.f337901a) && this.f337902b.equals(aVar.f337902b);
        }

        public final int hashCode() {
            return this.f337902b.hashCode() + (this.f337901a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FieldAttr(name=");
            sb2.append(this.f337901a);
            sb2.append(", modifiers=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f337902b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/parser/JsonParser$b;", "", "parser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f337903a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Modifier> f337904b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(f fVar, List<? extends Modifier> list) {
            this.f337903a = fVar;
            this.f337904b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f337903a, bVar.f337903a) && L.f(this.f337904b, bVar.f337904b);
        }

        public final int hashCode() {
            f fVar = this.f337903a;
            return this.f337904b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullRecord(value=");
            sb2.append(this.f337903a);
            sb2.append(", modifiers=");
            return H.p(sb2, this.f337904b, ')');
        }
    }

    public JsonParser(PU0.b bVar, z zVar, InterfaceC27108f interfaceC27108f) {
        this.f337878a = bVar;
        this.f337879b = zVar;
        this.f337880c = interfaceC27108f;
    }

    public static String a(PU0.h hVar, String str) {
        OU0.j jVarE = ((f) P0.d(hVar, str)).e();
        if (jVarE != null) {
            return jVarE.f12294b.getF413144d();
        }
        throw new IllegalArgumentException("Value is either not primitive or is null");
    }

    public static boolean b(PU0.h hVar, FieldType fieldType) {
        f fVar = hVar.get("fieldType");
        OU0.j jVarE = fVar != null ? fVar.e() : null;
        return jVarE == null || L.f(jVarE.f12294b.getF413144d(), fieldType.f337877b);
    }

    public static String c(PU0.h hVar, String str) {
        OU0.j jVarE;
        f fVar = hVar.get(str);
        if (fVar == null || (jVarE = fVar.e()) == null) {
            return null;
        }
        return jVarE.f12294b.getF413144d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d d(PU0.h hVar, g gVar, o oVar) {
        String strA = null;
        if (!b(hVar, FieldType.f337872f) || !hVar.containsKey("componentType")) {
            return null;
        }
        Map<String, ? extends com.avito.beduin.v2.engine.field.f<?>> linkedHashMap = new LinkedHashMap<>();
        String strA2 = "";
        for (String str : hVar.keySet()) {
            if (L.f(str, "componentType")) {
                strA2 = a(hVar, str);
            } else if (L.f(str, "id")) {
                strA = a(hVar, str);
            } else {
                Q qE2 = e(str, (f) hVar.get(str), gVar, oVar);
                linkedHashMap.put(qE2.f406619b, qE2.f406620c);
            }
        }
        return oVar.a(E.a(F.f336593b, strA), strA2, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e2 A[PHI: r5
  0x02e2: PHI (r5v47 com.avito.beduin.v2.engine.field.f) = 
  (r5v6 com.avito.beduin.v2.engine.field.f)
  (r5v10 com.avito.beduin.v2.engine.field.f)
  (r5v14 com.avito.beduin.v2.engine.field.f)
 binds: [B:120:0x02e0, B:142:0x0372, B:163:0x03ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c0 A[PHI: r2
  0x04c0: PHI (r2v13 com.avito.beduin.v2.engine.field.f) = 
  (r2v12 com.avito.beduin.v2.engine.field.f)
  (r2v17 com.avito.beduin.v2.engine.field.f)
  (r2v20 com.avito.beduin.v2.engine.field.f)
 binds: [B:179:0x0462, B:203:0x04be, B:235:0x053f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.avito.beduin.v2.parser.JsonParser$Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v56, types: [T, kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v37, types: [com.avito.beduin.v2.parser.JsonParser$Modifier$a] */
    /* JADX WARN: Type inference failed for: r8v41, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Q e(java.lang.String r23, PU0.f r24, TU0.g r25, com.avito.beduin.v2.engine.o r26) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.parser.JsonParser.e(java.lang.String, PU0.f, TU0.g, com.avito.beduin.v2.engine.o):kotlin.Q");
    }

    public static h f(PU0.h hVar, g gVar, o oVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : hVar.keySet()) {
            arrayList.add(e(str, (f) hVar.get(str), gVar, oVar));
        }
        if (!arrayList.isEmpty()) {
            return new h((Map<String, ? extends com.avito.beduin.v2.engine.field.f<?>>) P0.p(arrayList));
        }
        h.f336865b.getClass();
        return h.f336866c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.avito.beduin.v2.engine.field.f g(com.avito.beduin.v2.engine.field.f fVar, ArrayList arrayList) {
        for (Modifier modifier : C42745f0.q0(arrayList)) {
            String f337898d = modifier.getF337898d();
            if (f337898d == null) {
                f337898d = com.avito.beduin.v2.engine.utils.f.a();
            }
            fVar = modifier.c(f337898d, fVar);
        }
        return fVar;
    }
}
