package ee0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditRequestState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lee0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ee0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40097d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f395302d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C40097d f395303e = new C40097d(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f395304a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395305b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f395306c;

    /* compiled from: EditRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lee0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40097d(boolean z12, @l String str, @l String str2) {
        this.f395304a = z12;
        this.f395305b = str;
        this.f395306c = str2;
    }

    public static C40097d a(C40097d c40097d, boolean z12, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c40097d.f395304a;
        }
        if ((i12 & 2) != 0) {
            str = c40097d.f395305b;
        }
        if ((i12 & 4) != 0) {
            str2 = c40097d.f395306c;
        }
        c40097d.getClass();
        return new C40097d(z12, str, str2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40097d)) {
            return false;
        }
        C40097d c40097d = (C40097d) obj;
        return this.f395304a == c40097d.f395304a && L.f(this.f395305b, c40097d.f395305b) && L.f(this.f395306c, c40097d.f395306c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f395304a) * 31;
        String str = this.f395305b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f395306c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditRequestState(isLoading=");
        sb2.append(this.f395304a);
        sb2.append(", error=");
        sb2.append(this.f395305b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f395306c, ')');
    }
}
