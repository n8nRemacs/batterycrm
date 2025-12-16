package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.C36727t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class u implements C36616a.d.f {

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f348561b;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        new u(bundle, null);
    }

    public /* synthetic */ u(Bundle bundle, t tVar) {
        this.f348561b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        Bundle bundle = new Bundle(this.f348561b);
        uVar.getClass();
        Bundle bundle2 = new Bundle(uVar.f348561b);
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str) || !C36727t.a(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = new Bundle(this.f348561b);
        int size = bundle.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(bundle.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            String str = (String) arrayList2.get(i12);
            arrayList.add(str);
            arrayList.add(bundle.get(str));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
