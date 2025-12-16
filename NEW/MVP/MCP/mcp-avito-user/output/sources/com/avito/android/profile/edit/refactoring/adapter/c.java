package com.avito.android.profile.edit.refactoring.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import kotlin.Metadata;

/* compiled from: AvatarItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/c;", "Lcom/avito/android/profile/edit/refactoring/adapter/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements InterfaceC33337a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f222242b;

    public c(@Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f222242b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.profile.edit.adapter.b bVar = (com.avito.android.profile.edit.adapter.b) eVar;
        AvatarItem avatarItem = (AvatarItem) aVar;
        ProfileAvatar profileAvatar = avatarItem.f222247c;
        if (profileAvatar != null) {
            bVar.z5(profileAvatar.Y());
        } else {
            bVar.Wr();
        }
        bVar.a(new b(this, avatarItem));
    }
}
