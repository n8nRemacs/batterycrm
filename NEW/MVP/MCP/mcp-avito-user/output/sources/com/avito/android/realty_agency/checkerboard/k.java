package com.avito.android.realty_agency.checkerboard;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckerboardIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/k;", "Lcom/avito/android/realty_agency/checkerboard/j;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f251207a;

    @Inject
    public k(@Y61.k Context context) {
        this.f251207a = context;
    }

    @Override // com.avito.android.realty_agency.checkerboard.j
    @Y61.k
    public final Intent a(@Y61.k CheckerboardArguments checkerboardArguments) {
        CheckerboardActivity.f250899B.getClass();
        Intent intent = new Intent(this.f251207a, (Class<?>) CheckerboardActivity.class);
        C35961v3.b(intent, checkerboardArguments);
        return intent;
    }
}
