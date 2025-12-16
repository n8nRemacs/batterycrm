package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rA0.C47519a;

/* compiled from: SuggestInstitutesInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "", "a", "b", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m$a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m$b;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface m {

    /* compiled from: SuggestInstitutesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m$a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47519a f292071a;

        public a(@Y61.k C47519a c47519a) {
            this.f292071a = c47519a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f292071a, ((a) obj).f292071a);
        }

        public final int hashCode() {
            return this.f292071a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSuggestSelected(suggests=" + this.f292071a + ')';
        }
    }

    /* compiled from: SuggestInstitutesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m$b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<C47519a> f292072a;

        public b(@Y61.k List<C47519a> list) {
            this.f292072a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f292072a, ((b) obj).f292072a);
        }

        public final int hashCode() {
            return this.f292072a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ShowSuggests(suggests="), this.f292072a, ')');
        }
    }
}
