package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParseResult.kt */
@X41.g
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/m;", "", "a", "value", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f412573b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f412574a;

    /* compiled from: ParseResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/m$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static l a(int i12, @Y61.k Y41.a aVar) {
            l lVar = new l(i12, aVar);
            a aVar2 = m.f412573b;
            return lVar;
        }

        public a() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return L.f(this.f412574a, ((m) obj).f412574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f412574a.hashCode();
    }

    public final String toString() {
        return "ParseResult(value=" + this.f412574a + ')';
    }
}
