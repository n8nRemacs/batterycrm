package hh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import ih0.InterfaceC41402a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonsModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhh0/a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40939a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f397353a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<InterfaceC41402a> f397354b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ButtonStyle f397355c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f397356d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f397357e;

    /* JADX WARN: Multi-variable type inference failed */
    public C40939a(@l String str, @k List<? extends InterfaceC41402a> list, @k ButtonStyle buttonStyle, boolean z12, boolean z13) {
        this.f397353a = str;
        this.f397354b = list;
        this.f397355c = buttonStyle;
        this.f397356d = z12;
        this.f397357e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40939a)) {
            return false;
        }
        C40939a c40939a = (C40939a) obj;
        return L.f(this.f397353a, c40939a.f397353a) && L.f(this.f397354b, c40939a.f397354b) && this.f397355c == c40939a.f397355c && this.f397356d == c40939a.f397356d && this.f397357e == c40939a.f397357e;
    }

    public final int hashCode() {
        String str = this.f397353a;
        return Boolean.hashCode(this.f397357e) + r.i((this.f397355c.hashCode() + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f397354b)) * 31, 31, this.f397356d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonModel(buttonText=");
        sb2.append(this.f397353a);
        sb2.append(", actions=");
        sb2.append(this.f397354b);
        sb2.append(", style=");
        sb2.append(this.f397355c);
        sb2.append(", isLoading=");
        sb2.append(this.f397356d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f397357e, ')');
    }

    public /* synthetic */ C40939a(String str, List list, ButtonStyle buttonStyle, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, list, buttonStyle, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? true : z13);
    }
}
