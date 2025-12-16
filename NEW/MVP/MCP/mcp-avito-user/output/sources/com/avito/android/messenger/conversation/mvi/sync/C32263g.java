package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: IncompleteMessageBodyLoader.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/g;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32263g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C32275m f194777b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194778c;

    @Inject
    public C32263g(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k C32275m c32275m, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f194776a = interfaceC32024m;
        this.f194777b = c32275m;
        this.f194778c = interfaceC35745a5;
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K a(@Y61.k String str, @Y61.l String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        hu.akarnokd.rxjava3.schedulers.c cVar = new hu.akarnokd.rxjava3.schedulers.c(this.f194778c.a());
        final InterfaceC32024m interfaceC32024m = this.f194776a;
        return new io.reactivex.rxjava3.internal.operators.maybe.D((str2 != null ? interfaceC32024m.i(str, str2, messengerUserHashInfo).d0(C32261f.f194774b).S() : interfaceC32024m.K(str, messengerUserHashInfo)).z(cVar).s(cVar).m(C32251a.f194744b).c(new C32253b(str, messengerUserHashInfo)).h(new C32255c(this, cVar)).k(cVar), new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.sync.d
            @Override // l41.o
            public final Object apply(Object obj) {
                return interfaceC32024m.n((List) obj);
            }
        }).k(new GL.a(14, str, messengerUserHashInfo)).l(new C32259e(str, messengerUserHashInfo));
    }
}
