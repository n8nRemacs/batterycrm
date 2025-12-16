package Ya1;

import Y61.k;
import com.vk.push.common.messaging.RemoteMessage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C42745f0;

/* loaded from: classes9.dex */
public final class b implements Z11.b, Z11.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f19524a = new ArrayList();

    @Override // Z11.a
    public final boolean a(@k RemoteMessage remoteMessage) {
        Object obj;
        boolean zBooleanValue;
        synchronized (this) {
            try {
                ArrayList arrayList = this.f19524a;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(((Z11.a) it.next()).a(remoteMessage)));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = Boolean.valueOf(((Boolean) next).booleanValue() | ((Boolean) it2.next()).booleanValue());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }
}
