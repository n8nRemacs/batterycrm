package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceFreemiumNpsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/domain/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a f313839a;

    public a(@k com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a aVar) {
        this.f313839a = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f313839a, ((a) obj).f313839a);
    }

    public final int hashCode() {
        return this.f313839a.hashCode();
    }

    @k
    public final String toString() {
        return "ServiceFreemiumNps(feedback=" + this.f313839a + ')';
    }
}
