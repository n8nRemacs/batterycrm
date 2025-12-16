package com.avito.android.cv_validation_bottom_sheet.mvi;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.cv_validation_bottom_sheet.list.CvItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvValidationBottomSheetState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/s;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class s extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<CvItem> f131919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f131920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f131921d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f131922e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f131923f;

    public s() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f131919b, sVar.f131919b) && L.f(this.f131920c, sVar.f131920c) && L.f(this.f131921d, sVar.f131921d) && L.f(this.f131922e, sVar.f131922e) && L.f(this.f131923f, sVar.f131923f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f131919b.hashCode() * 31, 31, this.f131920c), 31, this.f131921d);
        AttributedText attributedText = this.f131922e;
        return this.f131923f.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvValidationBottomSheetState(cvList=");
        sb2.append(this.f131919b);
        sb2.append(", title=");
        sb2.append(this.f131920c);
        sb2.append(", description=");
        sb2.append(this.f131921d);
        sb2.append(", descriptionAttributedText=");
        sb2.append(this.f131922e);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f131923f, ')');
    }

    public s(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.k String str3, @Y61.k List list) {
        this.f131919b = list;
        this.f131920c = str;
        this.f131921d = str2;
        this.f131922e = attributedText;
        this.f131923f = str3;
    }

    public s(List list, String str, String str2, AttributedText attributedText, String str3, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? "" : str3, (i12 & 1) != 0 ? C42784z0.f406748b : list);
    }
}
