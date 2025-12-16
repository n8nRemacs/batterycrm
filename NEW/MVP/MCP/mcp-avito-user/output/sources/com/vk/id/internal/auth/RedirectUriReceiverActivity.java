package com.vk.id.internal.auth;

import Y61.l;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: RedirectUriReceiverActivity.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/auth/RedirectUriReceiverActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedirectUriReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data != null) {
            startActivity(AuthActivity.INSTANCE.createRedirectUriHandlingIntent$vkid_release(this, data));
        }
        finish();
    }
}
