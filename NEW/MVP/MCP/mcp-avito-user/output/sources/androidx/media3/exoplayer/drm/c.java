package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.z;
import androidx.media3.datasource.r;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import com.google.common.collect.N4;
import j.B;
import j.X;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* compiled from: DefaultDrmSessionManagerProvider.java */
@J
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f49102a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @B
    public z.f f49103b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public DefaultDrmSessionManager f49104c;

    @X
    public static DefaultDrmSessionManager a(z.f fVar) {
        r.b bVar = new r.b();
        Uri uri = fVar.f48029c;
        p pVar = new p(uri == null ? null : uri.toString(), fVar.f48033g, bVar);
        N4<Map.Entry<String, String>> it = fVar.f48030d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (pVar.f49137d) {
                pVar.f49137d.put(key, value);
            }
        }
        DefaultDrmSessionManager.b bVar2 = new DefaultDrmSessionManager.b();
        UUID uuid = fVar.f48028b;
        androidx.media3.exoplayer.analytics.m mVar = o.f49130d;
        uuid.getClass();
        bVar2.f49082b = uuid;
        bVar2.f49083c = mVar;
        bVar2.f49084d = fVar.f48031e;
        bVar2.f49086f = fVar.f48032f;
        int[] iArrG = com.google.common.primitives.l.g(fVar.f48034h);
        for (int i12 : iArrG) {
            boolean z12 = true;
            if (i12 != 2 && i12 != 1) {
                z12 = false;
            }
            C23110a.b(z12);
        }
        bVar2.f49085e = (int[]) iArrG.clone();
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(bVar2.f49082b, bVar2.f49083c, pVar, bVar2.f49081a, bVar2.f49084d, bVar2.f49085e, bVar2.f49086f, bVar2.f49087g, bVar2.f49088h, null);
        byte[] bArr = fVar.f48035i;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        C23110a.g(defaultDrmSessionManager.f49069m.isEmpty());
        defaultDrmSessionManager.f49078v = bArrCopyOf;
        return defaultDrmSessionManager;
    }
}
