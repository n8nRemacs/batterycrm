package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C36727t;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36680y0 {

    /* renamed from: a, reason: collision with root package name */
    public final C36628c f349250a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f349251b;

    public /* synthetic */ C36680y0(C36628c c36628c, Feature feature, C36678x0 c36678x0) {
        this.f349250a = c36628c;
        this.f349251b = feature;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj != null && (obj instanceof C36680y0)) {
            C36680y0 c36680y0 = (C36680y0) obj;
            if (C36727t.a(this.f349250a, c36680y0.f349250a) && C36727t.a(this.f349251b, c36680y0.f349251b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349250a, this.f349251b});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f349250a, "key");
        aVarB.a(this.f349251b, "feature");
        return aVarB.toString();
    }
}
