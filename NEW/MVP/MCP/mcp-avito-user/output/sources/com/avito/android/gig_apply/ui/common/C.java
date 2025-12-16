package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TutorialsWidget.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/C;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f159889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f159890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f159891c;

    public C() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return L.f(this.f159889a, c12.f159889a) && L.f(this.f159890b, c12.f159890b) && L.f(this.f159891c, c12.f159891c);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f159889a;
        return this.f159891c.hashCode() + H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.f159890b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TutorialsWidgetState(image=");
        sb2.append(this.f159889a);
        sb2.append(", title=");
        sb2.append(this.f159890b);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f159891c, ')');
    }

    public C(@Y61.l UniversalImage universalImage, @Y61.k String str, @Y61.k String str2) {
        this.f159889a = universalImage;
        this.f159890b = str;
        this.f159891c = str2;
    }

    public /* synthetic */ C(UniversalImage universalImage, String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalImage, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2);
    }
}
