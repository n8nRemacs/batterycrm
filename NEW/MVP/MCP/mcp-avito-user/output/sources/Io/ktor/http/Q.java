package io.ktor.http;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: HeaderValueWithParameters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/Q;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f399893c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399894a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<P> f399895b;

    /* compiled from: HeaderValueWithParameters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/Q$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public Q(@Y61.k String str, @Y61.k List<P> list) {
        this.f399894a = str;
        this.f399895b = list;
    }

    @Y61.l
    public final String a(@Y61.k String str) {
        List<P> list = this.f399895b;
        int iJ2 = C42745f0.J(list);
        if (iJ2 < 0) {
            return null;
        }
        int i12 = 0;
        while (true) {
            P p12 = list.get(i12);
            if (C43066x.C(p12.f399891a, str, true)) {
                return p12.f399892b;
            }
            if (i12 == iJ2) {
                return null;
            }
            i12++;
        }
    }

    @Y61.k
    public final String toString() {
        List<P> list = this.f399895b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f399894a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int i12 = 0;
        int length2 = 0;
        for (P p12 : list) {
            length2 += p12.f399892b.length() + p12.f399891a.length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(str);
        int iJ2 = C42745f0.J(list);
        if (iJ2 >= 0) {
            while (true) {
                P p13 = list.get(i12);
                sb2.append("; ");
                sb2.append(p13.f399891a);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                String str2 = p13.f399892b;
                if (S.a(str2)) {
                    sb2.append(S.b(str2));
                } else {
                    sb2.append(str2);
                }
                if (i12 == iJ2) {
                    break;
                }
                i12++;
            }
        }
        return sb2.toString();
    }

    public Q(String str, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
