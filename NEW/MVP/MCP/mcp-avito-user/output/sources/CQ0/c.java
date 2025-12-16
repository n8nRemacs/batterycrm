package CQ0;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ManualAudioSessionControllerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCQ0/c;", "LCQ0/b;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f2175d = new com.avito.avcalls.utils.logs.a("ManualAudioSessionController");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f2176a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Boolean f2177b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashMap<String, Boolean> f2178c = new HashMap<>();

    public c(@k d dVar) {
        this.f2176a = dVar;
        b();
    }

    public final void a(@k String str, boolean z12) {
        HashMap<String, Boolean> map = this.f2178c;
        if (map.get(str) == null) {
            return;
        }
        f2175d.b("setClientAudioEnabled", str, Boolean.valueOf(z12));
        map.put(str, Boolean.valueOf(z12));
        b();
    }

    public final void b() {
        Collection<Boolean> collectionValues = this.f2178c.values();
        com.avito.avcalls.utils.logs.a aVar = f2175d;
        aVar.b("updateAudioSession", "isAudioSessionExternallyEnabled=true", "clientStates=" + collectionValues);
        boolean z12 = true;
        if (!collectionValues.isEmpty()) {
            Collection<Boolean> collection = collectionValues;
            if (collection.isEmpty()) {
                z12 = false;
            } else {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                z12 = false;
            }
        }
        aVar.c(f.l("shouldBeEnabled=", z12), "updateAudioSession", new Object[0]);
        Boolean boolValueOf = Boolean.valueOf(z12);
        aVar.b("set.isManualAudioSessionEnabled", boolValueOf);
        if (!L.f(this.f2177b, boolValueOf)) {
            this.f2176a.I(z12);
            this.f2177b = boolValueOf;
        } else {
            aVar.c("it is already " + this.f2177b, "set.isManualAudioSessionEnabled", new Object[0]);
        }
    }
}
