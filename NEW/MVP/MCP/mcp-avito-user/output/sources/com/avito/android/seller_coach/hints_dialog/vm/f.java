package com.avito.android.seller_coach.hints_dialog.vm;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HintDialogViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/f;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f267610a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267611b;

    public f(@k String str, @k String str2) {
        this.f267610a = str;
        this.f267611b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f267610a, fVar.f267610a) && L.f(this.f267611b, fVar.f267611b);
    }

    public final int hashCode() {
        return this.f267611b.hashCode() + (this.f267610a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MenuData(textButton=");
        sb2.append(this.f267610a);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f267611b, ')');
    }
}
