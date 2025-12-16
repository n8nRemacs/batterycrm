package com.avito.android.messenger.conversation.mvi.video;

import com.avito.android.messenger.conversation.mvi.video.j;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: VideoMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f195020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.d f195021c;

    public k(j jVar, j.d dVar) {
        this.f195020b = jVar;
        this.f195021c = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2 x22 = X2.f318778a;
        j jVar = this.f195020b;
        String str = jVar.f207131E;
        StringBuilder sb2 = new StringBuilder("FileMessageCancelClicked: messageEraser.deleteLocalMessage() failed - userId = ");
        j.d dVar = this.f195021c;
        sb2.append(dVar.f195017d.getUserId());
        sb2.append(", channelId = ");
        sb2.append(jVar.f195002W);
        sb2.append(", localId = ");
        sb2.append(dVar.f195017d.getLocalId());
        x22.a(str, sb2.toString(), (Throwable) obj);
    }
}
