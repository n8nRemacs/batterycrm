package com.avito.android.messenger.conversation.adapter.text;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SafeUrlSpan.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/SafeUrlSpan;", "Landroid/text/style/URLSpan;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SafeUrlSpan extends URLSpan {
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        Uri uri = Uri.parse(getURL());
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            try {
                context.startActivity(Intent.createChooser(intent, null));
            } catch (Exception e12) {
                V2.f318762a.b("SafeUrlSpan", e12);
            }
        }
    }
}
