package kotlinx.datetime.internal.format.parser;

import kotlin.G0;
import kotlin.Metadata;
import kotlinx.datetime.internal.format.parser.m;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/B;", "Output", "Lkotlinx/datetime/internal/format/parser/s;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B<Output> implements s<Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Output, Boolean, G0> f412533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412534b;

    public B(@Y61.k Y41.p pVar, @Y61.k String str) {
        this.f412533a = pVar;
        this.f412534b = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.s
    @Y61.k
    public final Object a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12) {
        if (i12 >= charSequence.length()) {
            m.f412573b.getClass();
            return Integer.valueOf(i12);
        }
        char cCharAt = charSequence.charAt(i12);
        Y41.p<Output, Boolean, G0> pVar = this.f412533a;
        if (cCharAt == '-') {
            pVar.invoke(interfaceC43377c, Boolean.TRUE);
            m.f412573b.getClass();
            return Integer.valueOf(i12 + 1);
        }
        if (cCharAt == '+') {
            pVar.invoke(interfaceC43377c, Boolean.FALSE);
            m.f412573b.getClass();
            return Integer.valueOf(i12 + 1);
        }
        m.a aVar = m.f412573b;
        A a12 = new A(this, cCharAt);
        aVar.getClass();
        return m.a.a(i12, a12);
    }

    @Y61.k
    /* renamed from: toString, reason: from getter */
    public final String getF412534b() {
        return this.f412534b;
    }
}
