package one.me.sdk.vendor.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.dd;
import defpackage.f0g;
import defpackage.fxa;
import defpackage.hwa;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.uzg;
import defpackage.w4e;
import defpackage.wqi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/sdk/vendor/push/FcmMessagingService;", "", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "google_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String Z = "FCM";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        wqi.c(this.Z, "onDeletedMessages", new Object[0]);
        f0g f0gVar = (f0g) uzg.a.getAccessor().c(90);
        String str = f0gVar.i;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onDeletedMessages", null);
            }
        }
        f0gVar.d().a().f(false, true);
        ((dd) f0gVar.c.getValue()).e("FCM_ON_DELETED_MESSAGES");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.skd r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.vendor.push.FcmMessagingService.d(skd):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        wqi.c(this.Z, "onNewToken", new Object[0]);
        f0g f0gVar = (f0g) uzg.a.getAccessor().c(90);
        ((w4e) f0gVar.b()).B(str);
        if (str.length() <= 0 || !((fxa) f0gVar.e.getValue()).b()) {
            return;
        }
        ((hwa) f0gVar.f.getValue()).n();
    }
}
