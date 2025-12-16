package Pz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationSettingsChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPz/a;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14860a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13391a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13392b;

    public C14860a(@k String str, @k String str2) {
        this.f13391a = str;
        this.f13392b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14860a)) {
            return false;
        }
        C14860a c14860a = (C14860a) obj;
        return L.f(this.f13391a, c14860a.f13391a) && L.f(this.f13392b, c14860a.f13392b);
    }

    public final int hashCode() {
        return this.f13392b.hashCode() + (this.f13391a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationSettingsChangeEvent(section=");
        sb2.append(this.f13391a);
        sb2.append(", channel=");
        return C22026a.c(sb2, this.f13392b, ')');
    }
}
