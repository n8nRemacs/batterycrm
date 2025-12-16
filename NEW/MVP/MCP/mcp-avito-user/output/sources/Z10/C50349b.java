package z10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferDescription.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/b;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50349b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443767a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C50350c f443768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B10.c f443769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f443770d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC50348a f443771e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f443772f;

    public C50349b(@k String str, @l C50350c c50350c, @k B10.c cVar, @k AttributedText attributedText, @k InterfaceC50348a interfaceC50348a, @k String str2) {
        this.f443767a = str;
        this.f443768b = c50350c;
        this.f443769c = cVar;
        this.f443770d = attributedText;
        this.f443771e = interfaceC50348a;
        this.f443772f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50349b)) {
            return false;
        }
        C50349b c50349b = (C50349b) obj;
        return L.f(this.f443767a, c50349b.f443767a) && L.f(this.f443768b, c50349b.f443768b) && L.f(this.f443769c, c50349b.f443769c) && L.f(this.f443770d, c50349b.f443770d) && L.f(this.f443771e, c50349b.f443771e) && L.f(this.f443772f, c50349b.f443772f);
    }

    public final int hashCode() {
        int iHashCode = this.f443767a.hashCode() * 31;
        C50350c c50350c = this.f443768b;
        return this.f443772f.hashCode() + ((this.f443771e.hashCode() + com.avito.android.actions_sheet.a.b((this.f443769c.hashCode() + ((iHashCode + (c50350c == null ? 0 : c50350c.hashCode())) * 31)) * 31, 31, this.f443770d)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfferDescription(tabTitle=");
        sb2.append(this.f443767a);
        sb2.append(", dynamicDescription=");
        sb2.append(this.f443768b);
        sb2.append(", requirementsBlock=");
        sb2.append(this.f443769c);
        sb2.append(", description=");
        sb2.append(this.f443770d);
        sb2.append(", action=");
        sb2.append(this.f443771e);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f443772f, ')');
    }
}
