package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes6.dex */
public class a {

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    /* renamed from: com.google.android.gms.fido.u2f.api.common.a$a, reason: collision with other inner class name */
    public static class C10625a implements Cloneable {
        public C10625a() {
            Parcelable.Creator<ChannelIdValue> creator = ChannelIdValue.CREATOR;
        }

        @N
        public final Object clone() {
            return new C10625a();
        }
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
