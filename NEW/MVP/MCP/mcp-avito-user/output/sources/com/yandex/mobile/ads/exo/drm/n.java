package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import com.yandex.div2.D8;
import com.yandex.mobile.ads.exo.drm.c;
import com.yandex.mobile.ads.exo.drm.m;
import com.yandex.mobile.ads.impl.bx;
import com.yandex.mobile.ads.impl.cx;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.tm;
import com.yandex.mobile.ads.impl.tv0;
import com.yandex.mobile.ads.impl.xb1;
import com.yandex.mobile.ads.impl.xg;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.util.Map;
import java.util.UUID;

@X
/* loaded from: classes8.dex */
public final class n implements m {

    /* renamed from: d, reason: collision with root package name */
    private static final cx f382923d = tv0.b();

    /* renamed from: e, reason: collision with root package name */
    public static final m.c f382924e = new D8(12);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f382925a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f382926b;

    /* renamed from: c, reason: collision with root package name */
    private int f382927c;

    @X
    public static class a {
        @InterfaceC42164u
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @InterfaceC42164u
        public static void a(MediaDrm mediaDrm, byte[] bArr, jt0 jt0Var) {
            LogSessionId logSessionIdA = jt0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionIdA);
        }
    }

    private n(UUID uuid) {
        db.a(uuid);
        db.a("Use C.CLEARKEY_UUID instead", !xg.f391718b.equals(uuid));
        this.f382925a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f382926b = mediaDrm;
        this.f382927c = 1;
        if (xg.f391720d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static n c(UUID uuid) throws xb1 {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e12) {
            throw new xb1(e12);
        } catch (Exception e13) {
            throw new xb1(e13);
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(@P final m.b bVar) {
        this.f382926b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.yandex.mobile.ads.exo.drm.s
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i12, int i13, byte[] bArr2) {
                this.f382937a.a(bVar, mediaDrm, bArr, i12, i13, bArr2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final int b() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final synchronized void release() {
        int i12 = this.f382927c - 1;
        this.f382927c = i12;
        if (i12 == 0) {
            this.f382926b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m b(UUID uuid) {
        try {
            return c(uuid);
        } catch (xb1 unused) {
            ka0.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final tm d(byte[] bArr) {
        return new bx(a(this.f382925a), bArr, pc1.f388768a < 21 && xg.f391720d.equals(this.f382925a) && "L3".equals(this.f382926b.getPropertyString("securityLevel")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i12, int i13, byte[] bArr2) {
        c.HandlerC10969c handlerC10969c = c.this.f382889y;
        handlerC10969c.getClass();
        handlerC10969c.obtainMessage(i12, bArr).sendToTarget();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final byte[] c() {
        return this.f382926b.openSession();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void b(byte[] bArr) {
        this.f382926b.closeSession(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f382926b.provideProvisionResponse(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    @P
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (xg.f391719c.equals(this.f382925a)) {
            bArr2 = com.yandex.mobile.ads.exo.drm.a.a(bArr2);
        }
        return this.f382926b.provideKeyResponse(bArr, bArr2);
    }

    private static boolean d() {
        return f382923d.f().equals(pc1.f388771d);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(byte[] bArr, jt0 jt0Var) {
        if (pc1.f388768a >= 31) {
            try {
                a.a(this.f382926b, bArr, jt0Var);
            } catch (UnsupportedOperationException unused) {
                ka0.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    @Override // com.yandex.mobile.ads.exo.drm.m
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.exo.drm.m.a a(byte[] r16, @j.P java.util.List<com.yandex.mobile.ads.exo.drm.DrmInitData.SchemeData> r17, int r18, @j.P java.util.HashMap<java.lang.String, java.lang.String> r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.n.a(byte[], java.util.List, int, java.util.HashMap):com.yandex.mobile.ads.exo.drm.m$a");
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final m.d a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f382926b.getProvisionRequest();
        return new m.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final Map<String, String> a(byte[] bArr) {
        return this.f382926b.queryKeyStatus(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final boolean a(String str, byte[] bArr) {
        if (pc1.f388768a >= 31) {
            return a.a(this.f382926b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f382925a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f382926b.restoreKeys(bArr, bArr2);
    }

    private static UUID a(UUID uuid) {
        return (pc1.f388768a >= 27 || !xg.f391719c.equals(uuid)) ? uuid : xg.f391718b;
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
}
