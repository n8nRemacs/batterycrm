package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.C36729v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f362456a = new HashMap();

    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @RX0.a
    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC10744a<DetectorT extends c, OptionsT extends b<DetectorT>> {
    }

    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @RX0.a
    public interface b<DetectorT> {
    }

    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @RX0.a
    public interface c {
    }

    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @RX0.a
    public static class d {
    }

    public a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            if (this.f362456a.containsKey(null)) {
                Integer num = (Integer) map.get(null);
                C36729v.j(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f362456a.put(null, null);
            map.put(null, 0);
        }
    }
}
