package com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags;

import com.avito.android.deep_linking.links.UpdateFolderTagsLink;
import com.avito.android.messenger.analytics.MessengerMoveToFolderEvent;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.g;

/* compiled from: UpdateFolderTagsLinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f190687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UpdateFolderTagsLink f190688c;

    public b(a aVar, UpdateFolderTagsLink updateFolderTagsLink) {
        this.f190687b = aVar;
        this.f190688c = updateFolderTagsLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        a aVar = this.f190687b;
        UpdateFolderTagsLink updateFolderTagsLink = this.f190688c;
        String str = updateFolderTagsLink.f133771b;
        String strO = C42745f0.O(updateFolderTagsLink.f133773d, ",", null, null, null, 62);
        MessengerMoveToFolderEvent.MovedFrom[] movedFromArr = MessengerMoveToFolderEvent.MovedFrom.f186236b;
        aVar.f190681g.c(new MessengerMoveToFolderEvent(str, updateFolderTagsLink.f133772c, strO));
    }
}
