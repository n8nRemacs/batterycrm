package uB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoCardContentBadgeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48873a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f439841a;

    public C48873a(@k ArrayList arrayList) {
        this.f439841a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48873a) && this.f439841a.equals(((C48873a) obj).f439841a);
    }

    public final int hashCode() {
        return this.f439841a.hashCode();
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("TariffCpxInfoCardContentBadgeItem(badges="), this.f439841a, ')');
    }
}
