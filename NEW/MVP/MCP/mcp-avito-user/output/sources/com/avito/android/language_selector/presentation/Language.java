package com.avito.android.language_selector.presentation;

import androidx.compose.runtime.F3;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Language.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/presentation/Language;", "", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Language {

    /* renamed from: d, reason: collision with root package name */
    public static final Language f174934d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Language[] f174935e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f174936f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Locale f174937b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f174938c;

    static {
        Language language = new Language("Ru", 0, Locale.forLanguageTag("ru"), "🇷🇺");
        f174934d = language;
        Language[] languageArr = {language, new Language("Uz", 1, Locale.forLanguageTag("uz"), "🇺🇿"), new Language("Hy", 2, Locale.forLanguageTag("hy"), "🇦🇲")};
        f174935e = languageArr;
        f174936f = kotlin.enums.c.a(languageArr);
    }

    public Language(String str, int i12, Locale locale, String str2) {
        this.f174937b = locale;
        this.f174938c = str2;
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) f174935e.clone();
    }

    @F3
    @Y61.k
    public final String a() {
        Locale locale = this.f174937b;
        String displayLanguage = locale.getDisplayLanguage(locale);
        if (displayLanguage.length() <= 0) {
            return displayLanguage;
        }
        return Character.toUpperCase(displayLanguage.charAt(0)) + displayLanguage.substring(1);
    }
}
