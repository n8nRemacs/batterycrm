package ru.rustore.sdk.activitylauncher;

import Y61.k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher;
import ub1.i;

/* compiled from: ContextExtension.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-activitylauncher_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {
    public static final void a(@k Context context, @k Intent intent, @k i iVar) {
        RuStoreActivityLauncher.a aVar = RuStoreActivityLauncher.f436748d;
        CallbackResultReceiver callbackResultReceiver = new CallbackResultReceiver(iVar);
        aVar.getClass();
        Intent intent2 = new Intent(context, (Class<?>) RuStoreActivityLauncher.class);
        if (!(context instanceof Activity)) {
            intent2.setFlags(268435456);
        }
        intent2.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, callbackResultReceiver);
        intent2.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context, 0, intent, 1140850688));
        context.startActivity(intent2);
    }
}
