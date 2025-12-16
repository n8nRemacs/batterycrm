package com.avito.android.rating_form.interactor;

import Wg0.AbstractC15763a;
import android.util.Base64;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: JsonConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/a;", "Lcom/avito/android/rating_form/interactor/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f248209a;

    @Inject
    public a(@Y61.k Gson gson) {
        this.f248209a = gson;
    }

    @Override // com.avito.android.rating_form.interactor.c
    @Y61.k
    public final String a(@Y61.k AbstractC15763a abstractC15763a) {
        return Base64.encodeToString(this.f248209a.l(abstractC15763a).getBytes(C43047d.f410589b), 0);
    }
}
