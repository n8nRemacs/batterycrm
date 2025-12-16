package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJZ/s;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "T", "", "", "Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "suggestions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class s<T extends Suggestion> {

    @com.google.gson.annotations.c("suggestions")
    @Y61.l
    private final List<SuggestionContainer<T>> suggestions;

    public s(@Y61.l List<SuggestionContainer<T>> list) {
        this.suggestions = list;
    }

    @Y61.l
    public final List<SuggestionContainer<T>> a() {
        return this.suggestions;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && L.f(this.suggestions, ((s) obj).suggestions);
    }

    public final int hashCode() {
        List<SuggestionContainer<T>> list = this.suggestions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("SuggestionsResponse(suggestions="), this.suggestions, ')');
    }
}
