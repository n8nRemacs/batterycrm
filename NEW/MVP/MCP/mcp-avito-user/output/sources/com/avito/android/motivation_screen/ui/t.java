package com.avito.android.motivation_screen.ui;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.motivation_screen.models.MotivationParams;
import com.avito.android.motivation_screen.ui.MotivationActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MotivationIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/ui/t;", "Lcom/avito/android/motivation_screen/ui/s;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f206453a;

    @Inject
    public t(@Y61.k Context context) {
        this.f206453a = context;
    }

    @Override // com.avito.android.motivation_screen.ui.s
    @Y61.k
    public final Intent a(@Y61.k String str) {
        MotivationActivity.a aVar = MotivationActivity.f206395p;
        MotivationParams motivationParams = new MotivationParams(str);
        aVar.getClass();
        return new Intent(this.f206453a, (Class<?>) MotivationActivity.class).putExtra("open_params", motivationParams);
    }
}
