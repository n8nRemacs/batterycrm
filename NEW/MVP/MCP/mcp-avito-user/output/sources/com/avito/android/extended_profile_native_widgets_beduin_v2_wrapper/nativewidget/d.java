package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileNativeWidgetState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/nativewidget/d;", "", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f151428a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ET0.b f151429b;

    public d(@k String str, @l ET0.b bVar) {
        this.f151428a = str;
        this.f151429b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f151428a, dVar.f151428a) && L.f(this.f151429b, dVar.f151429b);
    }

    public final int hashCode() {
        int iHashCode = this.f151428a.hashCode() * 31;
        ET0.b bVar = this.f151429b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @k
    public final String toString() {
        return "ExtendedProfileNativeWidgetState(identifier=" + this.f151428a + ", padding=" + this.f151429b + ')';
    }
}
