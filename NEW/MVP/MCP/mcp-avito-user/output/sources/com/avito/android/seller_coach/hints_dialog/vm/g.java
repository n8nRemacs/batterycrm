package com.avito.android.seller_coach.hints_dialog.vm;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HintDialogViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/g;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f267612a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267613b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267614c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f267615d;

    public g(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f267612a = str;
        this.f267613b = str2;
        this.f267614c = str3;
        this.f267615d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f267612a, gVar.f267612a) && L.f(this.f267613b, gVar.f267613b) && L.f(this.f267614c, gVar.f267614c) && L.f(this.f267615d, gVar.f267615d);
    }

    public final int hashCode() {
        return this.f267615d.hashCode() + H.d(H.d(this.f267612a.hashCode() * 31, 31, this.f267613b), 31, this.f267614c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleHint(title=");
        sb2.append(this.f267612a);
        sb2.append(", description=");
        sb2.append(this.f267613b);
        sb2.append(", buttonText=");
        sb2.append(this.f267614c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f267615d, ')');
    }
}
