package com.avito.android.change_specific;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileChangeSpecificIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/g;", "Lcom/avito/android/change_specific/f;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f117979a;

    @Inject
    public g(@Y61.k Context context) {
        this.f117979a = context;
    }

    @Override // com.avito.android.change_specific.f
    @Y61.k
    public final Intent a(@Y61.k ExtendedProfileChangeSpecificArguments extendedProfileChangeSpecificArguments) {
        return new Intent(this.f117979a, (Class<?>) ExtendedProfileChangeSpecificActivity.class).putExtra("change_specific_activity.args", extendedProfileChangeSpecificArguments);
    }
}
