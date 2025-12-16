package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;

/* compiled from: SendMessageInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "localMessage", "Lio/reactivex/rxjava3/core/a;", "invoke", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32241v extends kotlin.jvm.internal.N implements Y41.l<LocalMessage, AbstractC41768a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f194559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f194560m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f194561n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f194562o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32241v(A a12, Uri uri, String str, String str2) {
        super(1);
        this.f194559l = a12;
        this.f194560m = uri;
        this.f194561n = str;
        this.f194562o = str2;
    }

    @Override // Y41.l
    public final AbstractC41768a invoke(LocalMessage localMessage) {
        return this.f194559l.f194163g.T(localMessage, this.f194560m.toString(), this.f194561n, this.f194562o);
    }
}
