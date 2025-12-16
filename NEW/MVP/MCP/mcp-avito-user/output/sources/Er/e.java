package eR;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.language_selector.presentation.Language;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LanguageSelectorState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeR/e;", "", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Language> f395197a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40040a f395199c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Language f395200d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k List<? extends Language> list, boolean z12, @k C40040a c40040a, @l Language language) {
        this.f395197a = list;
        this.f395198b = z12;
        this.f395199c = c40040a;
        this.f395200d = language;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(e eVar, ArrayList arrayList, boolean z12, C40040a c40040a, Language language, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = eVar.f395197a;
        }
        if ((i12 & 2) != 0) {
            z12 = eVar.f395198b;
        }
        if ((i12 & 4) != 0) {
            c40040a = eVar.f395199c;
        }
        if ((i12 & 8) != 0) {
            language = eVar.f395200d;
        }
        eVar.getClass();
        return new e(list, z12, c40040a, language);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f395197a, eVar.f395197a) && this.f395198b == eVar.f395198b && L.f(this.f395199c, eVar.f395199c) && this.f395200d == eVar.f395200d;
    }

    public final int hashCode() {
        int iHashCode = (this.f395199c.hashCode() + r.i(this.f395197a.hashCode() * 31, 31, this.f395198b)) * 31;
        Language language = this.f395200d;
        return iHashCode + (language == null ? 0 : language.hashCode());
    }

    @k
    public final String toString() {
        return "LanguageSelectorViewState(languages=" + this.f395197a + ", showSaveLanguageButton=" + this.f395198b + ", confirmationState=" + this.f395199c + ", selectedLanguage=" + this.f395200d + ')';
    }
}
