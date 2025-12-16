package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.UpdateFolderTagsLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideUpdateFolderTagsLinkDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class B0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195292a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.e f195293b;

    public B0(C32379e0 c32379e0, com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.e eVar) {
        this.f195292a = c32379e0;
        this.f195293b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.e eVar = this.f195293b;
        this.f195292a.getClass();
        return new C43834a(UpdateFolderTagsLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UpdateFolderTagsLink.class), eVar));
    }
}
