package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.g1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28558g1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91602c;

    public C28558g1(C28582o1 c28582o1, io.reactivex.rxjava3.core.H h12) {
        this.f91601b = c28582o1;
        this.f91602c = h12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!ru.avito.messenger.o0.b(messengerUserHashInfo)) {
            return new C41826q(new com.avito.android.advert_core.task.a(2));
        }
        V2.f318762a.i("PendingMessageHandler", "Started resending messages", null);
        C28582o1 c28582o1 = this.f91601b;
        C30277e1 c30277e1 = c28582o1.f91678k;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[13];
        boolean zBooleanValue = ((Boolean) c30277e1.f145029o.a().invoke()).booleanValue();
        io.reactivex.rxjava3.core.H h12 = this.f91602c;
        InterfaceC32024m interfaceC32024m = c28582o1.f91670c;
        return zBooleanValue ? new C41986s0(new io.reactivex.rxjava3.internal.operators.observable.N0(interfaceC32024m.d(), new C28552e1(c28582o1, h12, messengerUserHashInfo))) : c28582o1.b(interfaceC32024m.g0(messengerUserHashInfo), messengerUserHashInfo, h12);
    }
}
