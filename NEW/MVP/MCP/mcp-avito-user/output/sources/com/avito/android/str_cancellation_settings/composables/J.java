package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: Explanation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/composables/J;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f288162a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f288163b;

    public J(@Y61.k String str, @Y61.k String str2) {
        this.f288162a = str;
        this.f288163b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j12 = (J) obj;
        return kotlin.jvm.internal.L.f(this.f288162a, j12.f288162a) && kotlin.jvm.internal.L.f(this.f288163b, j12.f288163b);
    }

    public final int hashCode() {
        return this.f288163b.hashCode() + (this.f288162a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExplanationPreviewState(textIconName=");
        sb2.append(this.f288162a);
        sb2.append(", explanationText=");
        return C22026a.c(sb2, this.f288163b, ')');
    }
}
