package H00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LH00/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f6913k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6914b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f6915c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f6916d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f6917e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SuggestFormSuggestType f6918f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<SuggestionContainer<? extends Suggestion>> f6919g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final SuggestionContainer<? extends Suggestion> f6920h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6921i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6922j;

    /* compiled from: SuggestionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH00/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k String str2, @k String str3, @k String str4, @k SuggestFormSuggestType suggestFormSuggestType, @l List<? extends SuggestionContainer<? extends Suggestion>> list, @l SuggestionContainer<? extends Suggestion> suggestionContainer, boolean z12) {
        this.f6914b = str;
        this.f6915c = str2;
        this.f6916d = str3;
        this.f6917e = str4;
        this.f6918f = suggestFormSuggestType;
        this.f6919g = list;
        this.f6920h = suggestionContainer;
        this.f6921i = z12;
        this.f6922j = z12 && list == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, String str, ArrayList arrayList, SuggestionContainer suggestionContainer, boolean z12, int i12) {
        String str2 = cVar.f6914b;
        String str3 = cVar.f6915c;
        if ((i12 & 4) != 0) {
            str = cVar.f6916d;
        }
        String str4 = str;
        String str5 = cVar.f6917e;
        SuggestFormSuggestType suggestFormSuggestType = cVar.f6918f;
        List list = arrayList;
        if ((i12 & 32) != 0) {
            list = cVar.f6919g;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            suggestionContainer = cVar.f6920h;
        }
        SuggestionContainer suggestionContainer2 = suggestionContainer;
        if ((i12 & 128) != 0) {
            z12 = cVar.f6921i;
        }
        cVar.getClass();
        return new c(str2, str3, str4, str5, suggestFormSuggestType, list2, suggestionContainer2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6914b, cVar.f6914b) && L.f(this.f6915c, cVar.f6915c) && L.f(this.f6916d, cVar.f6916d) && L.f(this.f6917e, cVar.f6917e) && this.f6918f == cVar.f6918f && L.f(this.f6919g, cVar.f6919g) && L.f(this.f6920h, cVar.f6920h) && this.f6921i == cVar.f6921i;
    }

    public final int hashCode() {
        int iHashCode = (this.f6918f.hashCode() + H.d(H.d(H.d(this.f6914b.hashCode() * 31, 31, this.f6915c), 31, this.f6916d), 31, this.f6917e)) * 31;
        List<SuggestionContainer<? extends Suggestion>> list = this.f6919g;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SuggestionContainer<? extends Suggestion> suggestionContainer = this.f6920h;
        return Boolean.hashCode(this.f6921i) + ((iHashCode2 + (suggestionContainer != null ? suggestionContainer.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionState(fieldId=");
        sb2.append(this.f6914b);
        sb2.append(", fieldTitle=");
        sb2.append(this.f6915c);
        sb2.append(", fieldValue=");
        sb2.append(this.f6916d);
        sb2.append(", fieldHint=");
        sb2.append(this.f6917e);
        sb2.append(", fieldContentType=");
        sb2.append(this.f6918f);
        sb2.append(", suggestions=");
        sb2.append(this.f6919g);
        sb2.append(", lastAppliedSuggestion=");
        sb2.append(this.f6920h);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f6921i, ')');
    }
}
