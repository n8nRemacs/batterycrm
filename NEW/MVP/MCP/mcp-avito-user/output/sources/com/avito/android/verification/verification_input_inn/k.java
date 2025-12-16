package com.avito.android.verification.verification_input_inn;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationInputInnScreenData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/k;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f325624a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f325625b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f325626c;

    public k(@Y61.k String str, @Y61.k DeepLink deepLink, boolean z12) {
        this.f325624a = str;
        this.f325625b = deepLink;
        this.f325626c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f325624a, kVar.f325624a) && L.f(this.f325625b, kVar.f325625b) && this.f325626c == kVar.f325626c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325626c) + com.avito.android.actions_sheet.a.e(this.f325625b, this.f325624a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationInputInnScreenData(buttonText=");
        sb2.append(this.f325624a);
        sb2.append(", buttonDeepLink=");
        sb2.append(this.f325625b);
        sb2.append(", isClosable=");
        return androidx.appcompat.app.r.x(sb2, this.f325626c, ')');
    }
}
