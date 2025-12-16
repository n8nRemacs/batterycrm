package eR;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.language_selector.presentation.Language;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LanguageSelectorState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LeR/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f395192e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f395193f = new d(null, null, new e(C42784z0.f406748b, false, new C40040a(false, ""), null));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Language f395194b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Language f395195c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f395196d;

    /* compiled from: LanguageSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/d$a;", "", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l Language language, @l Language language2, @k e eVar) {
        this.f395194b = language;
        this.f395195c = language2;
        this.f395196d = eVar;
    }

    public static d a(d dVar, Language language, e eVar, int i12) {
        Language language2 = dVar.f395194b;
        if ((i12 & 2) != 0) {
            language = dVar.f395195c;
        }
        dVar.getClass();
        return new d(language2, language, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f395194b == dVar.f395194b && this.f395195c == dVar.f395195c && L.f(this.f395196d, dVar.f395196d);
    }

    public final int hashCode() {
        Language language = this.f395194b;
        int iHashCode = (language == null ? 0 : language.hashCode()) * 31;
        Language language2 = this.f395195c;
        return this.f395196d.hashCode() + ((iHashCode + (language2 != null ? language2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "LanguageSelectorState(currentLanguage=" + this.f395194b + ", selectedLanguage=" + this.f395195c + ", viewState=" + this.f395196d + ')';
    }
}
