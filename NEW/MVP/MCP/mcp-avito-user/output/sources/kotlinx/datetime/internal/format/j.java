package kotlinx.datetime.internal.format;

import androidx.compose.runtime.C22026a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.C43376b;

/* compiled from: FormatStructure.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/j;", "T", "Lkotlinx/datetime/internal/format/t;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412526a;

    public j(@Y61.k String str) {
        this.f412526a = str;
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final J51.e<T> b() {
        return new J51.c();
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<T> c() {
        List listP;
        String strSubstring;
        String strSubstring2 = this.f412526a;
        if (strSubstring2.length() == 0) {
            listP = C42784z0.f406748b;
        } else {
            kotlin.collections.builders.b bVarT = C42745f0.t();
            String strSubstring3 = "";
            if (I51.h.a(strSubstring2.charAt(0))) {
                int length = strSubstring2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!I51.h.a(strSubstring2.charAt(i12))) {
                        strSubstring = strSubstring2.substring(0, i12);
                        break;
                    }
                    i12++;
                }
                bVarT.add(new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new C43376b(strSubstring))));
                int length2 = strSubstring2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!I51.h.a(strSubstring2.charAt(i13))) {
                        strSubstring2 = strSubstring2.substring(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (I51.h.a(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length3 = strSubstring2.length();
                    while (true) {
                        length3--;
                        if (-1 >= length3) {
                            break;
                        }
                        if (!I51.h.a(strSubstring2.charAt(length3))) {
                            strSubstring3 = strSubstring2.substring(0, length3 + 1);
                            break;
                        }
                    }
                    bVarT.add(new kotlinx.datetime.internal.format.parser.y(strSubstring3));
                    int length4 = strSubstring2.length() - 1;
                    while (true) {
                        if (-1 >= length4) {
                            break;
                        }
                        if (!I51.h.a(strSubstring2.charAt(length4))) {
                            strSubstring2 = strSubstring2.substring(length4 + 1);
                            break;
                        }
                        length4--;
                    }
                    bVarT.add(new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new C43376b(strSubstring2))));
                } else {
                    bVarT.add(new kotlinx.datetime.internal.format.parser.y(strSubstring2));
                }
            }
            listP = C42745f0.p(bVarT);
        }
        return new kotlinx.datetime.internal.format.parser.v<>(listP, C42784z0.f406748b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof j) {
            if (L.f(this.f412526a, ((j) obj).f412526a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412526a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ConstantFormatStructure("), this.f412526a, ')');
    }
}
