package ru.avito.messenger;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "Lru/avito/messenger/api/entity/ChatMessage;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class O extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<List<? extends ChatMessage>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f430688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D f430689m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f430690n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f430691o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f430692p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Long l12, D d12, String str, Integer num, MessengerUserHashInfo messengerUserHashInfo) {
        super(0);
        this.f430688l = l12;
        this.f430689m = d12;
        this.f430690n = str;
        this.f430691o = num;
        this.f430692p = messengerUserHashInfo;
    }

    @Override // Y41.a
    public final io.reactivex.rxjava3.core.I<List<? extends ChatMessage>> invoke() {
        io.reactivex.rxjava3.core.I iL2;
        Integer num = this.f430691o;
        Long l12 = this.f430688l;
        D d12 = this.f430689m;
        if (l12 == null) {
            iL2 = kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new K(d12, this.f430690n, num, null));
        } else if (l12 != null) {
            iL2 = kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new L(d12, this.f430690n, num, l12, null));
        } else {
            iL2 = io.reactivex.rxjava3.core.I.l(new IllegalArgumentException("Can't call history(before=" + l12 + ", after=null): Apico version of history() doesn't support both `before` and `after` parameters at the same time"));
        }
        return iL2.n(new N(d12, this.f430692p));
    }
}
