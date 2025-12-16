package com.avito.android.messenger.conversation.mvi.data;

import arrow.core.X0;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.persistence.messenger.Q1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00000\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Q1;", "metaInfosList", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Lkotlin/Q;", "Lcom/avito/android/persistence/messenger/x2;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190422e;

    public I(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str, String str2) {
        this.f190419b = d0Var;
        this.f190420c = messengerUserHashInfo;
        this.f190421d = str;
        this.f190422e = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Q1 q12 = (Q1) C42745f0.G((List) obj);
        if (q12 == null) {
            return io.reactivex.rxjava3.core.I.q(X0.f56264b);
        }
        InterfaceC33140y2 interfaceC33140y2 = this.f190419b.f190456c;
        MessengerUserHashInfo messengerUserHashInfo = this.f190420c;
        return interfaceC33140y2.g(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, this.f190421d, this.f190422e).r(new H(q12));
    }
}
