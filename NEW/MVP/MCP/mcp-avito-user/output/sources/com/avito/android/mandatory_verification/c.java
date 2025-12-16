package com.avito.android.mandatory_verification;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/c;", "Lcom/avito/android/mandatory_verification/b;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f184411a;

    @Inject
    public c(@k Context context) {
        this.f184411a = context;
    }

    @Override // com.avito.android.mandatory_verification.b
    @k
    public final Intent a(long j12) {
        Intent intent = new Intent(this.f184411a, (Class<?>) MandatoryVerificationActivity.class);
        intent.putExtra("key.mandatory_verification_item_id", j12);
        return intent;
    }
}
