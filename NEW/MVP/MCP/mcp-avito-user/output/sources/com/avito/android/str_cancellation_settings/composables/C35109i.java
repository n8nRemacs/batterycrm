package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: CancellationDiscountInput.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/composables/i;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_cancellation_settings.composables.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* data */ class C35109i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f288221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f288222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f288223c;

    public C35109i(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f288221a = str;
        this.f288222b = str2;
        this.f288223c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35109i)) {
            return false;
        }
        C35109i c35109i = (C35109i) obj;
        return kotlin.jvm.internal.L.f(this.f288221a, c35109i.f288221a) && kotlin.jvm.internal.L.f(this.f288222b, c35109i.f288222b) && kotlin.jvm.internal.L.f(this.f288223c, c35109i.f288223c);
    }

    public final int hashCode() {
        String str = this.f288221a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f288222b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f288223c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancellationDiscountInputPreviewState(value=");
        sb2.append(this.f288221a);
        sb2.append(", subtitle=");
        sb2.append(this.f288222b);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.f288223c, ')');
    }
}
