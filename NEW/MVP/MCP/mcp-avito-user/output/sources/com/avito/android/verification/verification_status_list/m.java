package com.avito.android.verification.verification_status_list;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusListScreenData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_status_list/m;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f325781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f325782b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f325783c;

    public m(@Y61.k ArrayList arrayList, @Y61.l AttributedText attributedText, boolean z12) {
        this.f325781a = arrayList;
        this.f325782b = attributedText;
        this.f325783c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f325781a.equals(mVar.f325781a) && L.f(this.f325782b, mVar.f325782b) && this.f325783c == mVar.f325783c;
    }

    public final int hashCode() {
        int iHashCode = this.f325781a.hashCode() * 31;
        AttributedText attributedText = this.f325782b;
        return Boolean.hashCode(this.f325783c) + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusListScreenData(list=");
        sb2.append(this.f325781a);
        sb2.append(", footer=");
        sb2.append(this.f325782b);
        sb2.append(", isClosable=");
        return r.x(sb2, this.f325783c, ')');
    }
}
