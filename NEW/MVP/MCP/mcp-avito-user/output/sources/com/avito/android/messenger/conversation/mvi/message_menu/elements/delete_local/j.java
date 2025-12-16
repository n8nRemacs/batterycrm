package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import l41.o;

/* compiled from: MessageEraser.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/Q1;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f191655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f191656c;

    public j(m mVar, LocalMessage localMessage) {
        this.f191655b = mVar;
        this.f191656c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Q1 q12 = (Q1) ((Y0) obj).c();
        m mVar = this.f191655b;
        InterfaceC32024m interfaceC32024m = mVar.f191660a;
        LocalMessage localMessage = this.f191656c;
        return interfaceC32024m.N(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).g(mVar.f191665f.a(new AbstractC32094s0.a(localMessage.getLocalId(), localMessage.getChannelId(), com.avito.android.messenger.util.i.c(localMessage)), q12, true));
    }
}
