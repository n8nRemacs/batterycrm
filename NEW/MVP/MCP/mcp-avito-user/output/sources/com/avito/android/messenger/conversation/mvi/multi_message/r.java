package com.avito.android.messenger.conversation.mvi.multi_message;

import com.avito.android.messenger.conversation.mvi.common.a;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MultiMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "it", "Lcom/avito/android/messenger/conversation/mvi/common/a$a;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;)Lcom/avito/android/messenger/conversation/mvi/common/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final r<T, R> f193755b = new r<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        m.b bVar = (m.b) obj;
        if (bVar instanceof m.b.a) {
            return a.InterfaceC5627a.c.f190149a;
        }
        if (bVar instanceof m.b.C5728b) {
            return a.InterfaceC5627a.b.f190148a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
