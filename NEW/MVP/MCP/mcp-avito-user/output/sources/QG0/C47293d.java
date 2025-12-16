package qG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipData.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqG0/d;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qG0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47293d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f429147a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429148b;

    /* renamed from: c, reason: collision with root package name */
    public final long f429149c;

    /* compiled from: TooltipData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LqG0/d$a;", "", "<init>", "()V", "", "DEFAULT_SHOW_TOOLTIP_DELAY", "J", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qG0.d$a */
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

    public C47293d(String str, String str2, long j12, int i12, C42822w c42822w) {
        j12 = (i12 & 4) != 0 ? 1500L : j12;
        this.f429147a = str;
        this.f429148b = str2;
        this.f429149c = j12;
    }

    public final boolean a() {
        String str = this.f429147a;
        if (!(str == null || str.length() == 0)) {
            return true;
        }
        String str2 = this.f429148b;
        return !(str2 == null || str2.length() == 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47293d)) {
            return false;
        }
        C47293d c47293d = (C47293d) obj;
        return L.f(this.f429147a, c47293d.f429147a) && L.f(this.f429148b, c47293d.f429148b) && this.f429149c == c47293d.f429149c;
    }

    public final int hashCode() {
        String str = this.f429147a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f429148b;
        return Long.hashCode(this.f429149c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TooltipData(title=");
        sb2.append(this.f429147a);
        sb2.append(", text=");
        sb2.append(this.f429148b);
        sb2.append(", showTooltipDelay=");
        return r.u(sb2, this.f429149c, ')');
    }
}
