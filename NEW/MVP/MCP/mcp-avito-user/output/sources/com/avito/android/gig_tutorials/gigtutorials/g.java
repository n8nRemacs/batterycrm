package com.avito.android.gig_tutorials.gigtutorials;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigTutorialsIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/g;", "Lcom/avito/android/gig_tutorials/gigtutorials/f;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f161134a;

    @Inject
    public g(@Y61.k Context context) {
        this.f161134a = context;
    }

    @Override // com.avito.android.gig_tutorials.gigtutorials.f
    @Y61.k
    public final Intent a(@Y61.k GigTutorialsOpenParams gigTutorialsOpenParams) {
        GigTutorialsActivity.f161099n.getClass();
        return new Intent(this.f161134a, (Class<?>) GigTutorialsActivity.class).putExtra("open_params", gigTutorialsOpenParams);
    }
}
