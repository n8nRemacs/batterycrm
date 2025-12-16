package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
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
/* loaded from: classes6.dex */
public final class n implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.android.exoplayer2.analytics.h f344354d = new com.google.android.exoplayer2.analytics.h(17);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f344355a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f344356b;

    /* renamed from: c, reason: collision with root package name */
    public int f344357c;

    /* compiled from: FrameworkMediaDrm.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @InterfaceC42164u
        public static void b(MediaDrm mediaDrm, byte[] bArr, com.google.android.exoplayer2.analytics.p pVar) {
            LogSessionId logSessionIdA = pVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            androidx.media3.exoplayer.audio.n.e(playbackComponent).setLogSessionId(logSessionIdA);
        }
    }

    public n(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C36526i.f345418b;
        C36585a.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f344355a = uuid;
        MediaDrm mediaDrm = new MediaDrm((U.f348106a >= 27 || !C36526i.f345419c.equals(uuid)) ? uuid : uuid2);
        this.f344356b = mediaDrm;
        this.f344357c = 1;
        if (C36526i.f345420d.equals(uuid) && "ASUS_Z00AD".equals(U.f348109d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final Map<String, String> a(byte[] bArr) {
        return this.f344356b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f344356b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.k
    @P
    public final byte[] c(byte[] bArr, byte[] bArr2) throws JSONException {
        if (C36526i.f345419c.equals(this.f344355a) && U.f348106a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, C37262f.f359034c));
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
                C36605v.a("Failed to adjust response data: ".concat(new String(bArr2, C37262f.f359034c)), e12);
            }
        }
        return this.f344356b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void d(byte[] bArr) throws DeniedByServerException {
        this.f344356b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final com.google.android.exoplayer2.decoder.c e(byte[] bArr) {
        int i12 = U.f348106a;
        UUID uuid = this.f344355a;
        boolean z12 = i12 < 21 && C36526i.f345420d.equals(uuid) && "L3".equals(this.f344356b.getPropertyString("securityLevel"));
        if (i12 < 27 && C36526i.f345419c.equals(uuid)) {
            uuid = C36526i.f345418b;
        }
        return new l(uuid, bArr, z12);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void f(byte[] bArr) {
        this.f344356b.closeSession(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    @Override // com.google.android.exoplayer2.drm.k
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.drm.k.b g(byte[] r12, @j.P java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r13, int r14, @j.P java.util.HashMap<java.lang.String, java.lang.String> r15) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.n.g(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.k$b");
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final k.h h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f344356b.getProvisionRequest();
        return new k.h(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final byte[] i() {
        return this.f344356b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final boolean j(String str, byte[] bArr) {
        if (U.f348106a >= 31) {
            return a.a(this.f344356b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f344355a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final int k() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void l(@P final k.d dVar) {
        this.f344356b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.m
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i12, int i13, byte[] bArr2) {
                this.f344352a.getClass();
                DefaultDrmSessionManager.d dVar2 = DefaultDrmSessionManager.this.f344308w;
                dVar2.getClass();
                dVar2.obtainMessage(i12, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void m(byte[] bArr, com.google.android.exoplayer2.analytics.p pVar) {
        if (U.f348106a >= 31) {
            try {
                a.b(this.f344356b, bArr, pVar);
            } catch (UnsupportedOperationException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final synchronized void release() {
        int i12 = this.f344357c - 1;
        this.f344357c = i12;
        if (i12 == 0) {
            this.f344356b.release();
        }
    }
}
