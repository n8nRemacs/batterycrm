package io.ktor.http.parsing.regex;

import Y61.k;
import androidx.compose.runtime.C22026a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.ktor.http.parsing.e;
import io.ktor.http.parsing.h;
import io.ktor.http.parsing.i;
import io.ktor.http.parsing.j;
import io.ktor.http.parsing.q;
import io.ktor.http.parsing.r;
import io.ktor.http.parsing.t;
import io.ktor.http.parsing.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;

/* compiled from: RegexParserGenerator.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    @k
    public static final b a(@k io.ktor.http.parsing.k kVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new b(new C43059p(c(kVar, linkedHashMap, 0, 6).f400109a), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a b(e eVar, LinkedHashMap linkedHashMap, int i12, boolean z12) {
        char c12;
        if (eVar instanceof u) {
            C43059p.a aVar = C43059p.f410622c;
            String str = ((u) eVar).f400113a;
            aVar.getClass();
            return new a(Pattern.quote(str), 0, false, 6, null);
        }
        if (eVar instanceof r) {
            return new a(((r) eVar).f400108a, 0, false, 6, null);
        }
        if (eVar instanceof j) {
            ((j) eVar).getClass();
            a aVarC = c(null, linkedHashMap, i12 + 1, 4);
            if (!linkedHashMap.containsKey(null)) {
                linkedHashMap.put(null, new ArrayList());
            }
            ((Collection) linkedHashMap.get(null)).add(Integer.valueOf(i12));
            return new a(aVarC.f400109a, aVarC.f400110b, true);
        }
        if (eVar instanceof io.ktor.http.parsing.c) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = z12 ? i12 + 1 : i12;
            int i14 = 0;
            for (Object obj : ((io.ktor.http.parsing.c) eVar).b()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a aVarB = b((e) obj, linkedHashMap, i13, true);
                if (i14 != 0 && (eVar instanceof io.ktor.http.parsing.k)) {
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
                sb2.append(aVarB.f400109a);
                i13 += aVarB.f400110b;
                i14 = i15;
            }
            int i16 = i13 - i12;
            if (z12) {
                i16--;
            }
            return new a(sb2.toString(), i16, z12);
        }
        if (eVar instanceof t) {
            if (eVar instanceof i) {
                c12 = '?';
            } else if (eVar instanceof h) {
                c12 = '*';
            } else {
                if (!(eVar instanceof io.ktor.http.parsing.b)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + eVar).toString());
                }
                c12 = '+';
            }
            a aVarB2 = b(((t) eVar).getF400104a(), linkedHashMap, i12, true);
            return new a(C22026a.c(new StringBuilder(), aVarB2.f400109a, c12), aVarB2.f400110b, false, 4, null);
        }
        if (eVar instanceof io.ktor.http.parsing.a) {
            StringBuilder sb3 = new StringBuilder("[");
            C43059p.a aVar2 = C43059p.f410622c;
            ((io.ktor.http.parsing.a) eVar).getClass();
            aVar2.getClass();
            sb3.append(Pattern.quote(null));
            sb3.append(']');
            return new a(sb3.toString(), 0, false, 6, null);
        }
        if (!(eVar instanceof q)) {
            throw new IllegalStateException(("Unsupported grammar element: " + eVar).toString());
        }
        StringBuilder sb4 = new StringBuilder("[");
        q qVar = (q) eVar;
        sb4.append(qVar.f400106a);
        sb4.append('-');
        sb4.append(qVar.f400107b);
        sb4.append(']');
        return new a(sb4.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ a c(io.ktor.http.parsing.k kVar, LinkedHashMap linkedHashMap, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        return b(kVar, linkedHashMap, i12, false);
    }
}
