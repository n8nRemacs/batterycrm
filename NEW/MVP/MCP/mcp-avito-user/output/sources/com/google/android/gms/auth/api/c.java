package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.InterfaceC36733z;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class c implements C36616a.d.f {

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final c f348592c = new c(new Bundle(), null);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f348593b;

    public /* synthetic */ c(Bundle bundle, j jVar) {
        this.f348593b = bundle;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f348593b;
        Bundle bundle2 = this.f348593b;
        if (bundle2 == null || bundle == null) {
            if (bundle2 == bundle) {
                return true;
            }
        } else if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!C36727t.a(bundle2.get(str), bundle.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348593b});
    }
}
