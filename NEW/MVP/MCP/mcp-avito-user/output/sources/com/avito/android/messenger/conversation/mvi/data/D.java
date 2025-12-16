package com.avito.android.messenger.conversation.mvi.data;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u00070\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/avito/android/persistence/messenger/O1;", "messageEntities", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Lcom/avito/android/persistence/messenger/Q1;", "Lcom/avito/android/messenger/conversation/mvi/data/MessageAndMetaInfo;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190414d;

    public D(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f190412b = d0Var;
        this.f190413c = messengerUserHashInfo;
        this.f190414d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String str = this.f190414d;
        return d0.a(this.f190412b, (List) obj, this.f190413c, str);
    }
}
