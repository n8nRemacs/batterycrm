package com.avito.android.messenger.conversation.mvi.data;

import arrow.core.X0;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/persistence/messenger/O1;", "foundMessages", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190411d;

    public B(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f190409b = d0Var;
        this.f190410c = messengerUserHashInfo;
        this.f190411d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        O1 o12 = (O1) C42745f0.G((List) obj);
        if (o12 == null) {
            return io.reactivex.rxjava3.core.I.q(X0.f56264b);
        }
        Y0 y02 = this.f190409b.f190454a;
        MessengerUserHashInfo messengerUserHashInfo = this.f190410c;
        String str = messengerUserHashInfo.f430682d;
        return y02.h(o12.f215241d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), str, this.f190411d).r(A.f190408b);
    }
}
