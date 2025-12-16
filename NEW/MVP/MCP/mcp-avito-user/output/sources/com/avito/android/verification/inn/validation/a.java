package com.avito.android.verification.inn.validation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegexValidation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/validation/a;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Pattern f324142a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f324143b;

    public a(@k Pattern pattern, @k AttributedText attributedText) {
        this.f324142a = pattern;
        this.f324143b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324142a, aVar.f324142a) && L.f(this.f324143b, aVar.f324143b);
    }

    public final int hashCode() {
        return this.f324143b.hashCode() + (this.f324142a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegexValidation(pattern=");
        sb2.append(this.f324142a);
        sb2.append(", message=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f324143b, ')');
    }
}
