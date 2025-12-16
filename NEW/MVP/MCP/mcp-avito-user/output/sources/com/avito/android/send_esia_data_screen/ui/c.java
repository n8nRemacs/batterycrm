package com.avito.android.send_esia_data_screen.ui;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendEsiaDataIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/send_esia_data_screen/ui/c;", "Lcom/avito/android/send_esia_data_screen/ui/b;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f268298a;

    @Inject
    public c(@k Context context) {
        this.f268298a = context;
    }

    @Override // com.avito.android.send_esia_data_screen.ui.b
    @k
    public final Intent a(@k String str, @k String str2, @k String str3) {
        SendEsiaDataActivity.f268287p.getClass();
        Intent intent = new Intent(this.f268298a, (Class<?>) SendEsiaDataActivity.class);
        intent.putExtra("EXTRA_AUTH_CODE", str);
        intent.putExtra("EXTRA_AUTH_STATE", str2);
        intent.putExtra("EXTRA_RETRY_ESIA_LINK", str3);
        return intent;
    }
}
