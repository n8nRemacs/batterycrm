package iC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffCptColor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LiC0/c;", "", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C41269c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398440b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f398441a;

    /* compiled from: TariffCptColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iC0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41269c(@InterfaceC42156l int i12) {
        this.f398441a = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41269c) && this.f398441a == ((C41269c) obj).f398441a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f398441a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("TariffCptColor(value="), this.f398441a, ')');
    }
}
