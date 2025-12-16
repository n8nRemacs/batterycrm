package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import androidx.media3.common.C23097k;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.analytics.w;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.l;
import com.google.common.base.C37262f;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrameworkMediaDrm.java */
@X
/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: d, reason: collision with root package name */
    @J
    public static final androidx.media3.exoplayer.analytics.m f49130d = new androidx.media3.exoplayer.analytics.m(4);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f49131a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f49132b;

    /* renamed from: c, reason: collision with root package name */
    public int f49133c;

    /* compiled from: FrameworkMediaDrm.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @InterfaceC42164u
        public static void b(MediaDrm mediaDrm, byte[] bArr, w wVar) {
            LogSessionId logSessionIdA = wVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            androidx.media3.exoplayer.audio.n.e(playbackComponent).setLogSessionId(logSessionIdA);
        }
    }

    public o(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C23097k.f47667b;
        C23110a.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f49131a = uuid;
        MediaDrm mediaDrm = new MediaDrm((M.f47887a >= 27 || !C23097k.f47668c.equals(uuid)) ? uuid : uuid2);
        this.f49132b = mediaDrm;
        this.f49133c = 1;
        if (C23097k.f47669d.equals(uuid) && "ASUS_Z00AD".equals(M.f47890d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final Map<String, String> a(byte[] bArr) {
        return this.f49132b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f49132b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    @P
    public final byte[] c(byte[] bArr, byte[] bArr2) throws JSONException {
        if (C23097k.f47668c.equals(this.f49131a) && M.f47887a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(M.o(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    if (i12 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(C37262f.f359034c);
            } catch (JSONException e12) {
                androidx.media3.common.util.s.d("Failed to adjust response data: ".concat(M.o(bArr2)), e12);
            }
        }
        return this.f49132b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final void d(byte[] bArr) throws DeniedByServerException {
        this.f49132b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final androidx.media3.decoder.c e(byte[] bArr) {
        int i12 = M.f47887a;
        UUID uuid = this.f49131a;
        boolean z12 = i12 < 21 && C23097k.f47669d.equals(uuid) && "L3".equals(this.f49132b.getPropertyString("securityLevel"));
        if (i12 < 27 && C23097k.f47668c.equals(uuid)) {
            uuid = C23097k.f47667b;
        }
        return new m(uuid, bArr, z12);
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final void f(byte[] bArr) {
        this.f49132b.closeSession(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    @Override // androidx.media3.exoplayer.drm.l
    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.media3.common.util.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.drm.l.b g(byte[] r16, @j.P java.util.List<androidx.media3.common.DrmInitData.SchemeData> r17, int r18, @j.P java.util.HashMap<java.lang.String, java.lang.String> r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.o.g(byte[], java.util.List, int, java.util.HashMap):androidx.media3.exoplayer.drm.l$b");
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final l.h h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f49132b.getProvisionRequest();
        return new l.h(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final byte[] i() {
        return this.f49132b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final boolean j(String str, byte[] bArr) {
        if (M.f47887a >= 31) {
            return a.a(this.f49132b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f49131a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final int k() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final void l(byte[] bArr, w wVar) {
        if (M.f47887a >= 31) {
            try {
                a.b(this.f49132b, bArr, wVar);
            } catch (UnsupportedOperationException unused) {
                androidx.media3.common.util.s.g();
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final void m(@P final l.d dVar) {
        this.f49132b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i12, int i13, byte[] bArr2) {
                this.f49128a.getClass();
                DefaultDrmSessionManager.d dVar2 = DefaultDrmSessionManager.this.f49080x;
                dVar2.getClass();
                dVar2.obtainMessage(i12, bArr).sendToTarget();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.l
    @J
    public final synchronized void release() {
        int i12 = this.f49133c - 1;
        this.f49133c = i12;
        if (i12 == 0) {
            this.f49132b.release();
        }
    }
}
