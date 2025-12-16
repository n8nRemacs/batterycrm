package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_permission.f;
import com.avito.android.publish.analytics.events.PhotoPermissionAccessEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishPhotoPermissionDialogEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/W;", "Lcom/avito/android/photo_permission/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class W implements com.avito.android.photo_permission.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232187a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232188b;

    @Inject
    public W(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232187a = interfaceC28373a;
        this.f232188b = c50213a;
    }

    @Override // com.avito.android.photo_permission.f
    public final void a(@Y61.k f.a aVar) {
        boolean zEquals = aVar.equals(f.a.C6569a.f218731a);
        InterfaceC28373a interfaceC28373a = this.f232187a;
        C50213a c50213a = this.f232188b;
        if (zEquals) {
            interfaceC28373a.c(new PhotoPermissionAccessEvent(c50213a, PhotoPermissionAccessEvent.AtType.f232229e));
        } else if (aVar.equals(f.a.b.f218732a)) {
            interfaceC28373a.c(new PhotoPermissionAccessEvent(c50213a, PhotoPermissionAccessEvent.AtType.f232228d));
        } else if (aVar.equals(f.a.c.f218733a)) {
            interfaceC28373a.c(new PhotoPermissionAccessEvent(c50213a, PhotoPermissionAccessEvent.AtType.f232227c));
        }
    }
}
