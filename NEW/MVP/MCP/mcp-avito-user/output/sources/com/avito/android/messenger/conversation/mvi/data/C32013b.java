package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.messenger.channels.mvi.data.CallableC31710s;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: DatabaseErrorHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.data.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32013b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32016e f190443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f190444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f190445d;

    public C32013b(C32016e c32016e, String str, Map<String, ? extends Object> map) {
        this.f190443b = c32016e;
        this.f190444c = str;
        this.f190445d = map;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        C32016e c32016e = this.f190443b;
        c32016e.getClass();
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31710s(2, this.f190444c, c32016e, th2, this.f190445d));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = c32016e.f190462c;
        return g12.g(500L, timeUnit, interfaceC35745a5.c()).z(interfaceC35745a5.a());
    }
}
