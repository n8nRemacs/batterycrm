package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: UrlDecodedParametersBuilder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b1 {
    @Y61.k
    public static final InterfaceC41550v0 a(@Y61.k InterfaceC41552w0 interfaceC41552w0) {
        C41554x0 c41554x0A = C41558z0.a();
        for (String str : interfaceC41552w0.names()) {
            List<String> listA = interfaceC41552w0.a(str);
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            String strE = C41508b.e(0, 0, str, 15);
            List<String> list = listA;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C41508b.e(0, 0, (String) it.next(), 11));
            }
            c41554x0A.c(arrayList, strE);
        }
        return new C41556y0(true, c41554x0A.f400385b);
    }
}
