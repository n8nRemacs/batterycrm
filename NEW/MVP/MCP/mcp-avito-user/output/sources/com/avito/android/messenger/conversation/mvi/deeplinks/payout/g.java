package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.B;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryCourierPayoutRedirectResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PayoutInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/g;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/k;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f190562a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190563b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f190564c;

    /* compiled from: PayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/delivery/DeliveryCourierPayoutRedirectResponse;", "it", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f190565b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((DeliveryCourierPayoutRedirectResponse) ((TypedResult.Success) typedResult).getResult()).getPayoutUrl());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(g.this.f190564c.a((Throwable) obj));
        }
    }

    public g(@Y61.k B b12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f190562a = b12;
        this.f190563b = interfaceC35745a5;
        this.f190564c = fVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.k
    @Y61.k
    public final z<P2<Uri>> a(@Y61.k String str, @Y61.l String str2) {
        return this.f190562a.e(str, str2).x0(this.f190563b.a()).d0(a.f190565b).m0(new b()).r0(P2.c.f318721a);
    }
}
