package io.ktor.http;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: URLBuilder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class L0 {
    public static final void a(I0 i02, StringBuilder sb2) {
        List listSingletonList;
        sb2.append(i02.f399862a.f399889a);
        String str = i02.f399862a.f399889a;
        if (str.equals("file")) {
            CharSequence charSequence = i02.f399863b;
            String strC = c(i02);
            sb2.append("://");
            sb2.append(charSequence);
            if (!C43066x.j0(strC, '/')) {
                sb2.append('/');
            }
            sb2.append((CharSequence) strC);
            return;
        }
        if (str.equals("mailto")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = i02.f399866e;
            String str3 = i02.f399867f;
            if (str2 != null) {
                sb3.append(str2);
                if (str3 != null) {
                    sb3.append(':');
                    sb3.append(str3);
                }
                sb3.append("@");
            }
            CharSequence string = sb3.toString();
            CharSequence charSequence2 = i02.f399863b;
            sb2.append(":");
            sb2.append(string);
            sb2.append(charSequence2);
            return;
        }
        sb2.append("://");
        sb2.append(b(i02));
        String strC2 = c(i02);
        C41554x0 c41554x0 = i02.f399870i;
        boolean z12 = i02.f399865d;
        if (!C43066x.K(strC2) && !C43066x.h0(strC2, "/", false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) strC2);
        if (!c41554x0.f400385b.isEmpty() || z12) {
            sb2.append("?");
        }
        Set<Map.Entry<String, List<String>>> setB = c41554x0.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listSingletonList = Collections.singletonList(new kotlin.Q(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new kotlin.Q(str4, (String) it2.next()));
                }
                listSingletonList = arrayList2;
            }
            C42745f0.h(listSingletonList, arrayList);
        }
        C42745f0.N(arrayList, sb2, ContainerUtils.FIELD_DELIMITER, null, null, R0.f399896l, 60);
        if (i02.f399868g.length() > 0) {
            sb2.append('#');
            sb2.append(i02.f399868g);
        }
    }

    @Y61.k
    public static final String b(@Y61.k I0 i02) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = i02.f399866e;
        String str2 = i02.f399867f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        sb2.append(sb3.toString());
        sb2.append(i02.f399863b);
        int i12 = i02.f399864c;
        if (i12 != 0 && i12 != i02.f399862a.f399890b) {
            sb2.append(":");
            sb2.append(String.valueOf(i02.f399864c));
        }
        return sb2.toString();
    }

    @Y61.k
    public static final String c(@Y61.k I0 i02) {
        List<String> list = i02.f399869h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) C42745f0.E(list)).length() == 0 ? "/" : (String) C42745f0.E(list) : C42745f0.O(list, "/", null, null, null, 62);
    }

    public static final void d(@Y61.k I0 i02, @Y61.k String str) {
        i02.f399869h = C43066x.K(str) ? C42784z0.f406748b : str.equals("/") ? N0.f399880a : new ArrayList(C43066x.e0(str, new char[]{'/'}));
    }
}
