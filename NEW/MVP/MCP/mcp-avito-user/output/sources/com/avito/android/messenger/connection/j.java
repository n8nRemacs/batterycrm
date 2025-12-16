package com.avito.android.messenger.connection;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.Y0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47832o;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.internal.connection.InterfaceC47748a;
import ru.avito.messenger.o0;

/* compiled from: AvitoMessengerKeepConnectionProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/connection/j;", "Lru/avito/messenger/o;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements InterfaceC47832o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47748a f188853a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w0 f188854b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y0 f188855c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188856d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31860t f188857e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AL.b f188858f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32012a f188859g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final z<Boolean> f188860h;

    /* compiled from: AvitoMessengerKeepConnectionProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            if (!o0.b(messengerUserHashInfo)) {
                return z.c0(Boolean.FALSE);
            }
            j jVar = j.this;
            C41933a0 c41933a0D = jVar.f188855c.D(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            InterfaceC35745a5 interfaceC35745a5 = jVar.f188856d;
            return z.j(new C41934a1(c41933a0D.x0(interfaceC35745a5.a()), new com.avito.android.messenger.connection.a(jVar)).j0(interfaceC35745a5.c()).d0(b.f188847b).m0(c.f188848b), jVar.f188860h.j0(interfaceC35745a5.c()), z.k(jVar.f188857e.M0().d0(d.f188849b), jVar.f188858f.b(), new i()), new h()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new g(jVar));
        }
    }

    public j(@Y61.k InterfaceC47748a interfaceC47748a, @Y61.k w0 w0Var, @Y61.k Y0 y02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC31860t interfaceC31860t, @Y61.k AL.b bVar, @Y61.k InterfaceC32012a interfaceC32012a) {
        this.f188853a = interfaceC47748a;
        this.f188854b = w0Var;
        this.f188855c = y02;
        this.f188856d = interfaceC35745a5;
        this.f188857e = interfaceC31860t;
        this.f188858f = bVar;
        this.f188859g = interfaceC32012a;
        this.f188860h = interfaceC47748a.a(true);
    }

    @Override // ru.avito.messenger.InterfaceC47832o
    @Y61.k
    public final z<Boolean> a() {
        return this.f188854b.g().j0(this.f188856d.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new a());
    }
}
