package HV0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Uri.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHV0/e;", "", "utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f7125a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f7126b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f7127c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f7128d;

    public e(@k String str) {
        LinkedHashMap linkedHashMap;
        this.f7125a = str;
        String strP0 = C43066x.p0(str, '?');
        strP0 = C43066x.A(strP0, '/') ? androidx.compose.ui.graphics.colorspace.e.h(1, 0, strP0) : strP0;
        this.f7126b = strP0;
        this.f7127c = C43066x.m0(strP0, ":/", strP0);
        String strL0 = C43066x.l0('?', str, "");
        if (strL0.length() == 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            List<String> listE0 = C43066x.e0(strL0, new char[]{'&'});
            int iF2 = P0.f(C42745f0.q(listE0, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
            for (String str2 : listE0) {
                linkedHashMap2.put(C43066x.p0(str2, '='), C43066x.l0('=', str2, ""));
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        }
        this.f7128d = linkedHashMap;
    }

    @k
    public final void a(@k Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            this.f7128d.put(URLEncoder.encode(str, "utf-8"), URLEncoder.encode(str2, "utf-8"));
        }
    }

    @k
    public final String b() {
        LinkedHashMap linkedHashMap = this.f7128d;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        String str = this.f7126b;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('?');
        int i12 = 0;
        for (Object obj : linkedHashMap.entrySet()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            sb2.append((String) entry.getKey());
            sb2.append('=');
            sb2.append((String) entry.getValue());
            if (i12 < linkedHashMap.size() - 1) {
                sb2.append('&');
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f7125a, ((e) obj).f7125a);
    }

    public final int hashCode() {
        return this.f7125a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("Uri(initial="), this.f7125a, ')');
    }
}
