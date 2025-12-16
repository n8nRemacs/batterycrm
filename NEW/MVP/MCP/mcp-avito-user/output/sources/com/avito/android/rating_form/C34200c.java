package com.avito.android.rating_form;

import android.text.Html;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HtmlFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/c;", "Lcom/avito/android/rating_form/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.rating_form.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34200c implements InterfaceC34199b {
    @Inject
    public C34200c() {
    }

    @Override // com.avito.android.rating_form.InterfaceC34199b
    @Y61.k
    public final String a(@Y61.k String str) {
        return Html.fromHtml(str, 63).toString();
    }
}
