package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class iz extends mw0 {

    /* renamed from: d, reason: collision with root package name */
    public static final rg.a<iz> f386700d = new L0(22);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f386701b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f386702c;

    public iz() {
        this.f386701b = false;
        this.f386702c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iz b(Bundle bundle) {
        db.a(bundle.getInt(Integer.toString(0, 36), -1) == 0);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new iz(bundle.getBoolean(Integer.toString(2, 36), false)) : new iz();
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof iz)) {
            return false;
        }
        iz izVar = (iz) obj;
        return this.f386702c == izVar.f386702c && this.f386701b == izVar.f386701b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f386701b), Boolean.valueOf(this.f386702c)});
    }

    public iz(boolean z12) {
        this.f386701b = true;
        this.f386702c = z12;
    }
}
