package com.avito.android.publish.details.iac;

import androidx.compose.runtime.internal.P;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacPermissionChecker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/iac/b;", "Lcom/avito/android/publish/details/iac/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OL.a f234707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z f234708b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f234709c;

    @Inject
    public b(@Y61.k OL.a aVar, @Y61.k z zVar, @Y61.k com.avito.android.server_time.f fVar) {
        this.f234707a = aVar;
        this.f234708b = zVar;
        this.f234709c = fVar;
    }

    @Override // com.avito.android.publish.details.iac.a
    public final boolean a() {
        return !this.f234707a.i();
    }

    @Override // com.avito.android.publish.details.iac.a
    public final void b() {
        OL.a aVar = this.f234707a;
        aVar.b(true);
        aVar.k(this.f234709c.now() + d.f234713a);
    }

    @Override // com.avito.android.publish.details.iac.a
    @Y61.k
    public final PermissionState c() {
        return this.f234708b.b("android.permission.RECORD_AUDIO");
    }

    @Override // com.avito.android.publish.details.iac.a
    public final boolean d() {
        OL.a aVar = this.f234707a;
        return aVar.j() && aVar.q() < this.f234709c.now() && this.f234708b.b("android.permission.RECORD_AUDIO").c();
    }
}
