package H00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LH00/a;", "", "a", "b", "c", "d", "LH00/a$a;", "LH00/a$b;", "LH00/a$c;", "LH00/a$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: SuggestionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH00/a$a;", "LH00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H00.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0392a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SuggestionContainer<? extends Suggestion> f6908a;

        public C0392a(@k SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f6908a = suggestionContainer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0392a) && L.f(this.f6908a, ((C0392a) obj).f6908a);
        }

        public final int hashCode() {
            return this.f6908a.hashCode();
        }

        @k
        public final String toString() {
            return "ApplySuggest(suggest=" + this.f6908a + ')';
        }
    }

    /* compiled from: SuggestionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH00/a$b;", "LH00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f6909a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1553284537;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: SuggestionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH00/a$c;", "LH00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6910a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -992337224;
        }

        @k
        public final String toString() {
            return "FillByHandsClick";
        }
    }

    /* compiled from: SuggestionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH00/a$d;", "LH00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6911a;

        public d(@k String str) {
            this.f6911a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6911a, ((d) obj).f6911a);
        }

        public final int hashCode() {
            return this.f6911a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Input(value="), this.f6911a, ')');
        }
    }
}
