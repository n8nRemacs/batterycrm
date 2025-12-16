package T10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/d;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15285a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f15286b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15287c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y10.a f15288d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y10.a f15289e;

    public d(@k String str, @k AttributedText attributedText, @k String str2, @k Y10.a aVar, @k Y10.a aVar2) {
        this.f15285a = str;
        this.f15286b = attributedText;
        this.f15287c = str2;
        this.f15288d = aVar;
        this.f15289e = aVar2;
    }

    public static d a(d dVar, Y10.a aVar, Y10.a aVar2, int i12) {
        String str = dVar.f15285a;
        AttributedText attributedText = dVar.f15286b;
        String str2 = dVar.f15287c;
        if ((i12 & 8) != 0) {
            aVar = dVar.f15288d;
        }
        Y10.a aVar3 = aVar;
        if ((i12 & 16) != 0) {
            aVar2 = dVar.f15289e;
        }
        dVar.getClass();
        return new d(str, attributedText, str2, aVar3, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f15285a, dVar.f15285a) && L.f(this.f15286b, dVar.f15286b) && L.f(this.f15287c, dVar.f15287c) && L.f(this.f15288d, dVar.f15288d) && L.f(this.f15289e, dVar.f15289e);
    }

    public final int hashCode() {
        return this.f15289e.hashCode() + ((this.f15288d.hashCode() + H.d(com.avito.android.actions_sheet.a.b(this.f15285a.hashCode() * 31, 31, this.f15286b), 31, this.f15287c)) * 31);
    }

    @k
    public final String toString() {
        return "ClientFormNew(screenTitle=" + this.f15285a + ", title=" + this.f15286b + ", actionButton=" + this.f15287c + ", clientBlock=" + this.f15288d + ", agentBlock=" + this.f15289e + ')';
    }
}
