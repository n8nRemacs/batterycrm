package com.avito.android.publish.drafts;

import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.T;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoStorageCleaner.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/m;", "Lcom/avito/android/publish/drafts/i;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.drafts.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33847m implements InterfaceC33843i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f235392a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.i f235393b;

    @Inject
    public C33847m(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k com.avito.android.photo_storage.i iVar) {
        this.f235392a = bVar;
        this.f235393b = iVar;
    }

    @Override // com.avito.android.publish.drafts.InterfaceC33843i
    @Y61.k
    public final T a(@Y61.l String str) {
        com.avito.android.photo_cache.b bVar = this.f235392a;
        return (str == null ? bVar.e(NotificationsSettings.Section.SECTION_MESSENGER) : io.reactivex.rxjava3.core.z.g0(bVar.a(str), bVar.e(NotificationsSettings.Section.SECTION_MESSENGER))).d0(C33844j.f235389b).d0(C33845k.f235390b).d0(new C33846l(this)).P(G0.f406611a);
    }
}
