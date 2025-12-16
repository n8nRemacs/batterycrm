package com.avito.android.profile.edit;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoPickerCameraDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/f0;", "Lcom/avito/android/profile/edit/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f0 implements InterfaceC33312a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l90.c f222206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f222207b;

    @Inject
    public f0(@Y61.k l90.c cVar, @Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f222206a = cVar;
        this.f222207b = interfaceC35863o4;
    }

    @Override // com.avito.android.profile.edit.InterfaceC33312a
    @Y61.k
    public final Intent a() {
        return this.f222206a.a(this.f222207b.a());
    }

    @Override // com.avito.android.profile.edit.InterfaceC33312a
    @Y61.l
    public final Uri b(@Y61.l Intent intent) {
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    @Override // com.avito.android.profile.edit.InterfaceC33312a
    @Y61.k
    public final Intent c() {
        return this.f222206a.c(this.f222207b.a());
    }
}
