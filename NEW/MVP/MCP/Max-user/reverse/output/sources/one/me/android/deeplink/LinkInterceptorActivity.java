package one.me.android.deeplink;

import android.content.Intent;
import defpackage.fd1;
import defpackage.ln;
import defpackage.wha;
import kotlin.Metadata;
import one.me.android.MainActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorActivity;", "Lln;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinkInterceptorActivity extends ln {
    public final boolean E(Intent intent) {
        String action = intent.getAction();
        if (action == null || wha.l(action).equals(fd1.a)) {
            return false;
        }
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        startActivity(intent2);
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.deeplink.LinkInterceptorActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.nl3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        E(intent);
    }
}
