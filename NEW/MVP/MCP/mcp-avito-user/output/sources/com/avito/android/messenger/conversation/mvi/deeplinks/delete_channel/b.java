package com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import kotlin.Metadata;
import l41.g;

/* compiled from: DeleteChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f190520b;

    public b(d dVar) {
        this.f190520b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeleteChannelLink.b bVar = (DeleteChannelLink.b) obj;
        boolean z12 = bVar instanceof DeleteChannelLink.b.c;
        d dVar = this.f190520b;
        if (z12) {
            dVar.f190526j.Y1(R.string.channel_deleted);
        }
        dVar.j(bVar);
    }
}
