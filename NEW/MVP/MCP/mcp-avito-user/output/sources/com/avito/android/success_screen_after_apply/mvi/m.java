package com.avito.android.success_screen_after_apply.mvi;

import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessScreenAfterApplyState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/m;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class m extends q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f291745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f291746c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f291747d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f291748e;

    public m(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l UniversalImage universalImage) {
        this.f291745b = str;
        this.f291746c = str2;
        this.f291747d = str3;
        this.f291748e = universalImage;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f291745b, mVar.f291745b) && L.f(this.f291746c, mVar.f291746c) && L.f(this.f291747d, mVar.f291747d) && L.f(this.f291748e, mVar.f291748e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f291745b.hashCode() * 31, 31, this.f291746c), 31, this.f291747d);
        UniversalImage universalImage = this.f291748e;
        return iD2 + (universalImage == null ? 0 : universalImage.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessScreenAfterApplyState(title=");
        sb2.append(this.f291745b);
        sb2.append(", description=");
        sb2.append(this.f291746c);
        sb2.append(", buttonText=");
        sb2.append(this.f291747d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f291748e, ')');
    }
}
