package ch0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinishButtonModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lch0/a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ch0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C27195a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f58095a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f58096b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58097c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58098d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58099e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58100f;

    public C27195a(@l AttributedText attributedText, boolean z12, boolean z13, boolean z14, @l String str) {
        this.f58095a = str;
        this.f58096b = attributedText;
        this.f58097c = z12;
        this.f58098d = z13;
        this.f58099e = z14;
        this.f58100f = !z13 && z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27195a)) {
            return false;
        }
        C27195a c27195a = (C27195a) obj;
        return L.f(this.f58095a, c27195a.f58095a) && L.f(this.f58096b, c27195a.f58096b) && this.f58097c == c27195a.f58097c && this.f58098d == c27195a.f58098d && this.f58099e == c27195a.f58099e;
    }

    public final int hashCode() {
        String str = this.f58095a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f58096b;
        return Boolean.hashCode(this.f58099e) + r.i(r.i((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f58097c), 31, this.f58098d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FinishButtonModel(buttonText=");
        sb2.append(this.f58095a);
        sb2.append(", disclaimer=");
        sb2.append(this.f58096b);
        sb2.append(", redesignDisclaimerIsVisible=");
        sb2.append(this.f58097c);
        sb2.append(", isLoading=");
        sb2.append(this.f58098d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f58099e, ')');
    }
}
