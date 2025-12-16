package ue;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MasksFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue/a;", "", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ue.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49040a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440189a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MaskInfo f440190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f440191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440193e;

    public C49040a(@k String str, @k MaskInfo maskInfo, @k String str2, int i12, int i13) {
        this.f440189a = str;
        this.f440190b = maskInfo;
        this.f440191c = str2;
        this.f440192d = i12;
        this.f440193e = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49040a)) {
            return false;
        }
        C49040a c49040a = (C49040a) obj;
        return L.f(this.f440189a, c49040a.f440189a) && L.f(this.f440190b, c49040a.f440190b) && L.f(this.f440191c, c49040a.f440191c) && this.f440192d == c49040a.f440192d && this.f440193e == c49040a.f440193e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f440193e) + r.e(this.f440192d, H.d((this.f440190b.hashCode() + (this.f440189a.hashCode() * 31)) * 31, 31, this.f440191c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaskApplyingResult(sourceText=");
        sb2.append(this.f440189a);
        sb2.append(", mask=");
        sb2.append(this.f440190b);
        sb2.append(", resultText=");
        sb2.append(this.f440191c);
        sb2.append(", cursorPosition=");
        sb2.append(this.f440192d);
        sb2.append(", matchedStartLength=");
        return r.t(sb2, this.f440193e, ')');
    }
}
