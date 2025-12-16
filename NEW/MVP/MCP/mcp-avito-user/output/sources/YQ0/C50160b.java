package yQ0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StunMessage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LyQ0/b;", "LyQ0/a;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yQ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C50160b implements InterfaceC50159a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f443098a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f443099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AbstractC50161c> f443100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443101d;

    /* JADX WARN: Multi-variable type inference failed */
    public C50160b(@k g gVar, @k e eVar, @k List<? extends AbstractC50161c> list) {
        this.f443098a = gVar;
        this.f443099b = eVar;
        this.f443100c = list;
        int i12 = 0;
        for (AbstractC50161c abstractC50161c : list) {
            int length = abstractC50161c.getF443102a().length + 4;
            int length2 = abstractC50161c.getF443102a().length % 4;
            i12 += (length2 == 0 ? 0 : 4 - length2) + length;
        }
        this.f443101d = 20 + i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50160b)) {
            return false;
        }
        C50160b c50160b = (C50160b) obj;
        return L.f(this.f443098a, c50160b.f443098a) && L.f(this.f443099b, c50160b.f443099b) && L.f(this.f443100c, c50160b.f443100c);
    }

    public final int hashCode() {
        return this.f443100c.hashCode() + ((this.f443099b.hashCode() + (this.f443098a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StunMessage(type=");
        sb2.append(this.f443098a);
        sb2.append(", transactionId=");
        sb2.append(this.f443099b);
        sb2.append(", attributes=");
        return H.p(sb2, this.f443100c, ')');
    }
}
