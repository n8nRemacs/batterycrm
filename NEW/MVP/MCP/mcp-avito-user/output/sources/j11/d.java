package J11;

import android.content.Context;
import android.content.Intent;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f8724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8725d;

    public /* synthetic */ d(Context context, int i12, String str) {
        this.f8723b = i12;
        this.f8724c = context;
        this.f8725d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8723b) {
            case 0:
                Context context = this.f8724c;
                context.startActivity(new Intent(context, (Class<?>) VKCaptchaActivity.class).addFlags(268435456).putExtra("key_url", this.f8725d));
                break;
            default:
                Context context2 = this.f8724c;
                context2.startActivity(new Intent(context2, (Class<?>) VKConfirmationActivity.class).addFlags(268435456).putExtra("key_message", this.f8725d));
                break;
        }
    }
}
