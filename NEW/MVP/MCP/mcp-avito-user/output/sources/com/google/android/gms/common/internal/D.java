package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C36616a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class D implements C36616a.d.f {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public static final D f349312c = new D(new a(null).f349314a, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f349313b;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f349314a;

        public a() {
        }

        public /* synthetic */ a(I i12) {
        }
    }

    public /* synthetic */ D(String str, J j12) {
        this.f349313b = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D) {
            return C36727t.a(this.f349313b, ((D) obj).f349313b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349313b});
    }
}
