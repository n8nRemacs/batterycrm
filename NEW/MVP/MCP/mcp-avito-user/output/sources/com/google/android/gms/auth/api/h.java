package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes6.dex */
public final class h implements C36616a.d.f {

    /* renamed from: d, reason: collision with root package name */
    public static final h f348596d = new h(new g());

    /* renamed from: b, reason: collision with root package name */
    public final boolean f348597b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f348598c;

    public h(g gVar) {
        this.f348597b = gVar.f348594a.booleanValue();
        this.f348598c = gVar.f348595b;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        return C36727t.a(null, null) && this.f348597b == hVar.f348597b && C36727t.a(this.f348598c, hVar.f348598c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f348597b), this.f348598c});
    }
}
