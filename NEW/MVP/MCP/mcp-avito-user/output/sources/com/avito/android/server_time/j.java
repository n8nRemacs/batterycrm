package com.avito.android.server_time;

import Y61.k;
import Y61.l;
import java.util.TimeZone;
import kotlin.Metadata;

/* compiled from: UtcTimeSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/server_time/j;", "Lcom/avito/android/server_time/h;", "_common_server-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f274001a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TimeZone f274002b = TimeZone.getTimeZone("UTC");

    public j(@k f fVar) {
        this.f274001a = fVar;
    }

    @Override // com.avito.android.server_time.h
    @k
    /* renamed from: a, reason: from getter */
    public final TimeZone getF274002b() {
        return this.f274002b;
    }

    public final boolean equals(@l Object obj) {
        return obj instanceof j;
    }

    public final int hashCode() {
        return -398021140;
    }

    @Override // com.avito.android.server_time.h
    public final long now() {
        return this.f274001a.now();
    }

    @k
    public final String toString() {
        return "UtcTimeSource(now=" + this.f274001a.now() + ')';
    }
}
