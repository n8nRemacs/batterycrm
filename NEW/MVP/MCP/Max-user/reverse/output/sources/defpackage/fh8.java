package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class fh8 extends n2 {
    public fh8(String str, boolean z, byte[] bArr, long j, long j2, long j3, String str2, long j4, long j5, long j6, long j7) {
        super(xhb.x0);
        x(ApiProtocol.KEY_TOKEN, str);
        i("interactive", z);
        if (j > 0) {
            t(j, "chatsSync");
        }
        if (j2 > 0) {
            t(j2, "contactsSync");
        }
        if (j3 != 0) {
            t(j3, "presenceSync");
        }
        if (str2 != null && str2.length() != 0) {
            x("configHash", str2);
        }
        if (j4 > 0) {
            t(j4, "callsSync");
        }
        if (j5 > 0) {
            t(j5, "lastLogin");
        }
        if (j6 > 0) {
            t(j6, "draftsSync");
        }
        if (j7 > 0) {
            t(j7, "bannersSync");
        }
        if (bArr != null) {
            ((us) this.b).put("chatCacheFingerprint", bArr);
        }
    }

    @Override // defpackage.n2
    public final j0g S() {
        return lcj.y0;
    }

    @Override // defpackage.n2
    public final boolean Z() {
        return false;
    }
}
