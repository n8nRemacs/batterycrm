package com.avito.android.messenger.notification;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.w0;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.L;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: UnreadMsgNotificationHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/notification/c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w0 f196918a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC34350q f196919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC32024m f196920c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f196921d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f196922e = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f196923f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UnreadMsgNotificationHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            c cVar = c.this;
            cVar.f196923f.e();
            if (o0.b(messengerUserHashInfo)) {
                z<T> zVarQ0 = cVar.f196920c.O(messengerUserHashInfo).q0(1L);
                InterfaceC35745a5 interfaceC35745a5 = cVar.f196921d;
                cVar.f196923f.b(com.avito.android.util.rx3.arrow.b.a(zVarQ0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e())).v0(new com.avito.android.messenger.notification.a(cVar), com.avito.android.messenger.notification.b.f196917b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    /* compiled from: UnreadMsgNotificationHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f196925b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            X2.f318778a.a("MessengerNotificationHandler", "Error during userIdInteractor#currentUserIdToken observation", (Throwable) obj);
        }
    }

    public c(@k w0 w0Var, @k InterfaceC34350q interfaceC34350q, @k InterfaceC32024m interfaceC32024m, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f196918a = w0Var;
        this.f196919b = interfaceC34350q;
        this.f196920c = interfaceC32024m;
        this.f196921d = interfaceC35745a5;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f196922e;
        cVar.e();
        L lG2 = this.f196918a.g();
        InterfaceC35745a5 interfaceC35745a5 = this.f196921d;
        cVar.b(lG2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new a(), b.f196925b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
