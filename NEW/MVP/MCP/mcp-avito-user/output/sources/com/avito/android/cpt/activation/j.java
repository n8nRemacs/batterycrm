package com.avito.android.cpt.activation;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/j;", "Lcom/avito/android/cpt/activation/i;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f126283a;

    @Inject
    public j(@Y61.k Context context) {
        this.f126283a = context;
    }

    @Override // com.avito.android.cpt.activation.i
    @Y61.k
    public final Intent a(@Y61.k DeepLink deepLink, @Y61.k String str) {
        Intent intent = new Intent(this.f126283a, (Class<?>) CptActivationActivity.class);
        intent.putExtra("key_cpt_activation_item_id", str);
        intent.putExtra("key_cpt_activation_next_page_deeplink", deepLink);
        return intent;
    }
}
