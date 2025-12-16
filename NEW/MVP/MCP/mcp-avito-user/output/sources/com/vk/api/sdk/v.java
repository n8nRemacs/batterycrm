package com.vk.api.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.t;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VKDefaultValidationHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/v;", "Lcom/vk/api/sdk/t;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class v implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f366751a;

    public v(@Y61.k Context context) {
        this.f366751a = context;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, com.vk.api.sdk.t$b] */
    @Override // com.vk.api.sdk.t
    public final void b(@Y61.k String str, @Y61.k t.a<t.b> aVar) {
        boolean z12;
        G0 g02;
        VKWebViewAuthActivity.f366699e.getClass();
        VKWebViewAuthActivity.f366700f = null;
        Context context = this.f366751a;
        Intent intentPutExtra = new Intent(context, (Class<?>) VKWebViewAuthActivity.class).putExtra("vk_validation_url", str);
        Context baseContext = context;
        while (true) {
            z12 = baseContext instanceof Activity;
            if (z12 || !(baseContext instanceof ContextWrapper)) {
                break;
            } else {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        if ((z12 ? (Activity) baseContext : null) == null) {
            intentPutExtra.addFlags(268435456);
        }
        context.startActivity(intentPutExtra);
        com.vk.api.sdk.utils.o.f366748a.getClass();
        com.vk.api.sdk.utils.o.a();
        VKWebViewAuthActivity.f366699e.getClass();
        ?? r62 = VKWebViewAuthActivity.f366700f;
        if (r62 == 0) {
            g02 = null;
        } else {
            aVar.f366686b = r62;
            aVar.f366685a.countDown();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            aVar.f366685a.countDown();
        }
        VKWebViewAuthActivity.f366700f = null;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Boolean] */
    @Override // com.vk.api.sdk.t
    public final void c(@Y61.k String str, @Y61.k t.a<Boolean> aVar) {
        VKConfirmationActivity.f366697b.getClass();
        VKConfirmationActivity.f366698c = false;
        C.a(new J11.d(this.f366751a, 1, str));
        com.vk.api.sdk.utils.o.f366748a.getClass();
        com.vk.api.sdk.utils.o.a();
        aVar.f366686b = Boolean.valueOf(VKConfirmationActivity.f366698c);
        aVar.f366685a.countDown();
        VKConfirmationActivity.f366698c = false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // com.vk.api.sdk.t
    public final void d(@Y61.k String str, @Y61.k t.a<String> aVar) {
        VKCaptchaActivity.f366692e.getClass();
        C.a(new J11.d(this.f366751a, 0, str));
        com.vk.api.sdk.utils.o.f366748a.getClass();
        com.vk.api.sdk.utils.o.a();
        ?? r42 = VKCaptchaActivity.f366693f;
        if (r42 == 0) {
            aVar.f366685a.countDown();
        } else {
            aVar.f366686b = r42;
            aVar.f366685a.countDown();
        }
    }

    @Override // com.vk.api.sdk.t
    public final void a(@Y61.k VKApiExecutionException vKApiExecutionException) throws VKApiExecutionException {
        throw vKApiExecutionException;
    }
}
