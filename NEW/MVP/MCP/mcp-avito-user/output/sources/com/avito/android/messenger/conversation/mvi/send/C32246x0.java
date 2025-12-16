package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.D;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00060\u0005R\u00020\u00062\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/P0;", "", "<name for destructuring parameter 0>", "Lcom/avito/android/messenger/conversation/mvi/send/D$m;", "Lcom/avito/android/messenger/conversation/mvi/send/D;", "apply", "(Lkotlin/Q;)Lcom/avito/android/messenger/conversation/mvi/send/D$m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32246x0<T, R> implements l41.o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        String str;
        com.avito.android.persistence.messenger.P0 p02 = (com.avito.android.persistence.messenger.P0) ((arrow.core.Y0) ((kotlin.Q) obj).f406619b).c();
        if (p02 == null || (str = p02.f215280d) == null) {
            str = "";
        }
        return new D.m(str);
    }
}
