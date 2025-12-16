package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportFinishMergeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/domain/interactor/l;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f212341a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f212342b;

    public l() {
        this(null, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f212341a, lVar.f212341a) && L.f(this.f212342b, lVar.f212342b);
    }

    public final int hashCode() {
        int iHashCode = this.f212341a.hashCode() * 31;
        DeepLink deepLink = this.f212342b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportFinishMergeResult(mergeSuccessText=");
        sb2.append(this.f212341a);
        sb2.append(", unauthorizedZoneDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f212342b, ')');
    }

    public l(PrintableText printableText, DeepLink deepLink, int i12, C42822w c42822w) {
        printableText = (i12 & 1) != 0 ? com.avito.android.printable_text.b.c(R.string.passport_lib_public_passport_accounts_merge_finish_success_toast, new Serializable[0]) : printableText;
        deepLink = (i12 & 2) != 0 ? null : deepLink;
        this.f212341a = printableText;
        this.f212342b = deepLink;
    }
}
