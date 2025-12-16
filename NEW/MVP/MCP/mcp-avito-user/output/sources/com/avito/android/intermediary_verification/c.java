package com.avito.android.intermediary_verification;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationArgs;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IntermediaryVerificationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/c;", "Lcom/avito/android/intermediary_verification/b;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f173086a;

    @Inject
    public c(@k Context context) {
        this.f173086a = context;
    }

    @Override // com.avito.android.intermediary_verification.b
    @k
    public final Intent a(@k IntermediaryVerificationArgs intermediaryVerificationArgs) {
        IntermediaryVerificationActivity.f173073r.getClass();
        Intent intent = new Intent(this.f173086a, (Class<?>) IntermediaryVerificationActivity.class);
        intent.putExtra("key.intermediary_verification_args", intermediaryVerificationArgs);
        return intent;
    }
}
