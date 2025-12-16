package com.avito.android.feedback_adverts;

import android.app.Application;
import android.content.Intent;
import com.avito.android.feedback_adverts.c;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FeedbackAdvertsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/d;", "Lcom/avito/android/feedback_adverts/c;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f157777a;

    @Inject
    public d(@Y61.k Application application) {
        this.f157777a = application;
    }

    @Override // com.avito.android.feedback_adverts.c
    @Y61.k
    public final Intent a(@Y61.k c.a aVar) {
        return new Intent(this.f157777a, (Class<?>) FeedbackAdvertsActivity.class).putExtra("item_id_key", aVar.f157775a).putExtra("channel_id_key", aVar.f157776b);
    }
}
