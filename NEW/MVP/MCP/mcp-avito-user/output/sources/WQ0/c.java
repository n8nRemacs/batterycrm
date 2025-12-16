package wQ0;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.PeerConnection;

/* compiled from: AudioDeviceControllerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LwQ0/c;", "LwQ0/b;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f441433a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Boolean f441434b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashMap<String, Boolean> f441435c = new HashMap<>();

    public c(@k d dVar) {
        this.f441433a = dVar;
        b();
    }

    public final void a(@k String str, boolean z12) {
        HashMap<String, Boolean> map = this.f441435c;
        if (map.get(str) == null) {
            return;
        }
        g.INSTANCE.getClass();
        g.Companion.c("AudioDeviceController", "setAudioDeviceEnabled clientId=" + str + ", isEnabled=" + z12 + ", isAudioDeviceExternallyEnabled=true");
        map.put(str, Boolean.valueOf(z12));
        b();
    }

    public final void b() {
        Collection<Boolean> collectionValues = this.f441435c.values();
        g.INSTANCE.getClass();
        g.Companion.c("AudioDeviceController", "updateAudioDevice, current client states=" + collectionValues);
        boolean z12 = true;
        if (!collectionValues.isEmpty()) {
            Collection<Boolean> collection = collectionValues;
            ArrayList arrayList = new ArrayList(C42745f0.q(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(((Boolean) it.next()).booleanValue()));
            }
            if (arrayList.isEmpty()) {
                z12 = false;
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        break;
                    }
                }
                z12 = false;
            }
        }
        if (L.f(this.f441434b, Boolean.valueOf(z12))) {
            return;
        }
        d dVar = this.f441433a;
        g.INSTANCE.getClass();
        g.Companion.c("AudioDevice", "setIsEnabled=" + z12);
        for (p pVar : (Iterable) dVar.f441436a) {
            pVar.getClass();
            g.Companion companion = g.INSTANCE;
            StringBuilder sb2 = new StringBuilder("id=");
            String str = pVar.f331968a;
            sb2.append(str);
            sb2.append(" setAudioRecordingEnabled=");
            sb2.append(z12);
            String string = sb2.toString();
            companion.getClass();
            g.Companion.c("PeerConnection", string);
            PeerConnection peerConnection = pVar.f331969b;
            peerConnection.setAudioRecording(z12);
            g.Companion.c("PeerConnection", "id=" + str + " setAudioPlayoutEnabled=" + z12);
            peerConnection.setAudioPlayout(z12);
        }
        this.f441434b = Boolean.valueOf(z12);
    }
}
