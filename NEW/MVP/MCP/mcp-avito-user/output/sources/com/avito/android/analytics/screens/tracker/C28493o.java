package com.avito.android.analytics.screens.tracker;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ErrorDialogDiagnosticInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/o;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C28493o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f90897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f90898b;

    public C28493o(@Y61.k String str, @Y61.l String str2) {
        this.f90897a = str;
        this.f90898b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28493o)) {
            return false;
        }
        C28493o c28493o = (C28493o) obj;
        return kotlin.jvm.internal.L.f(this.f90897a, c28493o.f90897a) && kotlin.jvm.internal.L.f(this.f90898b, c28493o.f90898b);
    }

    public final int hashCode() {
        int iHashCode = this.f90897a.hashCode() * 31;
        String str = this.f90898b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorDialogDiagnosticInfo(screenRandomId=");
        sb2.append(this.f90897a);
        sb2.append(", networkDiagnosticContextId=");
        return C22026a.c(sb2, this.f90898b, ')');
    }
}
