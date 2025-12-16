package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rA0.C47519a;

/* compiled from: SuggestInstitutesState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/s;", "", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<C47519a> f292077a;

    public s(@Y61.k List<C47519a> list) {
        this.f292077a = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && L.f(this.f292077a, ((s) obj).f292077a);
    }

    public final int hashCode() {
        return this.f292077a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("SuggestInstitutesState(suggests="), this.f292077a, ')');
    }
}
