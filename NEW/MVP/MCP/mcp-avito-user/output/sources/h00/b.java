package H00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LH00/b;", "", "a", "LH00/b$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SuggestionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH00/b$a;", "LH00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SuggestionResult f6912a;

        public a(@k SuggestionResult suggestionResult) {
            this.f6912a = suggestionResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f6912a, ((a) obj).f6912a);
        }

        public final int hashCode() {
            return this.f6912a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreen(result=" + this.f6912a + ')';
        }
    }
}
