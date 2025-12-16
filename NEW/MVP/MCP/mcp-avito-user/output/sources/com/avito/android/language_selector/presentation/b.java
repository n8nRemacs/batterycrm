package com.avito.android.language_selector.presentation;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LanguageMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/language_selector/presentation/b;", "", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @Inject
    public b() {
    }

    @Y61.k
    public static Language a(@Y61.k Locale locale) {
        Object next;
        Iterator it = ((AbstractC42738c) Language.f174936f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Language) next).f174937b.getLanguage(), locale.getLanguage())) {
                break;
            }
        }
        Language language = (Language) next;
        return language == null ? Language.f174934d : language;
    }
}
