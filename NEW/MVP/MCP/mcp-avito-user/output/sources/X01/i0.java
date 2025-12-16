package x01;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;

/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f442032c = new i0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f442033a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Context f442034b = AbstractC49722g.b();

    @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
    public final boolean a() {
        if (!this.f442033a) {
            Context context = this.f442034b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService(ChannelContext.UserToUser.TYPE);
            this.f442033a = userManager != null ? userManager.isUserUnlocked() : false;
        }
        return this.f442033a;
    }
}
