package eR;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.language_selector.presentation.Language;
import kotlin.Metadata;

/* compiled from: LanguageSelectorAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LeR/b;", "", "a", "b", "c", "d", "e", "LeR/b$a;", "LeR/b$b;", "LeR/b$c;", "LeR/b$d;", "LeR/b$e;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC40041b {

    /* compiled from: LanguageSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/b$a;", "LeR/b;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.b$a */
    public static final /* data */ class a implements InterfaceC40041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395185a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2013322570;
        }

        @k
        public final String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* compiled from: LanguageSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/b$b;", "LeR/b;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11081b implements InterfaceC40041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11081b f395186a = new C11081b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11081b);
        }

        public final int hashCode() {
            return -1515532841;
        }

        @k
        public final String toString() {
            return "OnConfirmSaveLanguageClick";
        }
    }

    /* compiled from: LanguageSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/b$c;", "LeR/b;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.b$c */
    public static final /* data */ class c implements InterfaceC40041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f395187a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -463829919;
        }

        @k
        public final String toString() {
            return "OnDeclineSaveLanguageClick";
        }
    }

    /* compiled from: LanguageSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeR/b$d;", "LeR/b;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.b$d */
    public static final /* data */ class d implements InterfaceC40041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Language f395188a;

        public d(@k Language language) {
            this.f395188a = language;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f395188a == ((d) obj).f395188a;
        }

        public final int hashCode() {
            return this.f395188a.hashCode();
        }

        @k
        public final String toString() {
            return "OnLanguageClick(language=" + this.f395188a + ')';
        }
    }

    /* compiled from: LanguageSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/b$e;", "LeR/b;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.b$e */
    public static final /* data */ class e implements InterfaceC40041b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f395189a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1693746961;
        }

        @k
        public final String toString() {
            return "OnSaveLanguageClick";
        }
    }
}
