package com.google.android.gms.internal.common;

import aZ0.InterfaceC19845a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class zzad extends zzaa {
    @InterfaceC19845a
    public final zzad zzb(Object obj) {
        zza(obj);
        return this;
    }

    @InterfaceC19845a
    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            zza(it.next());
        }
        return this;
    }
}
