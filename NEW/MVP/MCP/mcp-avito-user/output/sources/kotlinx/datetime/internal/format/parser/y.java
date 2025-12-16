package kotlinx.datetime.internal.format.parser;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.m;

/* compiled from: ParserOperation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/y;", "Output", "Lkotlinx/datetime/internal/format/parser/s;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y<Output> implements s<Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412591a;

    public y(@Y61.k String str) {
        this.f412591a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (I51.h.a(str.charAt(0))) {
            throw new IllegalArgumentException(AK.c.k("String '", str, "' starts with a digit").toString());
        }
        if (I51.h.a(str.charAt(str.length() - 1))) {
            throw new IllegalArgumentException(AK.c.k("String '", str, "' ends with a digit").toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.s
    @Y61.k
    public final Object a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12) {
        String str = this.f412591a;
        if (str.length() + i12 > charSequence.length()) {
            m.a aVar = m.f412573b;
            w wVar = new w(this);
            aVar.getClass();
            return m.a.a(i12, wVar);
        }
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (charSequence.charAt(i12 + i13) != str.charAt(i13)) {
                m.a aVar2 = m.f412573b;
                x xVar = new x(this, charSequence, i12, i13);
                aVar2.getClass();
                return m.a.a(i12, xVar);
            }
        }
        m.a aVar3 = m.f412573b;
        int length2 = str.length() + i12;
        aVar3.getClass();
        return Integer.valueOf(length2);
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("'"), this.f412591a, '\'');
    }
}
