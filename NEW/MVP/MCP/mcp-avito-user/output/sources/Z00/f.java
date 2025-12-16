package z00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManagerUspState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz00/f;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443695a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f443696b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C50332a f443697c;

    public f(@k String str, @k ArrayList arrayList, @l C50332a c50332a) {
        this.f443695a = str;
        this.f443696b = arrayList;
        this.f443697c = c50332a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f443695a, fVar.f443695a) && this.f443696b.equals(fVar.f443696b) && L.f(this.f443697c, fVar.f443697c);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f443696b, this.f443695a.hashCode() * 31, 31);
        C50332a c50332a = this.f443697c;
        return iG2 + (c50332a == null ? 0 : c50332a.hashCode());
    }

    @k
    public final String toString() {
        return "MortgageUspData(title=" + this.f443695a + ", usp=" + this.f443696b + ", action=" + this.f443697c + ')';
    }
}
