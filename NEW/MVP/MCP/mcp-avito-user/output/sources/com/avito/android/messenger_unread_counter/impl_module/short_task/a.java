package com.avito.android.messenger_unread_counter.impl_module.short_task;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import j31.InterfaceC42189a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import pZ.C47037b;
import pZ.InterfaceC47038c;
import rZ.InterfaceC47619a;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UpdateUnreadMessagesCounterShortTask.kt */
@C11.a
@InterfaceC42189a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/short_task/a;", "Lcom/avito/android/service/short_task/n;", "a", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47842z f197731a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC47038c f197732b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f197733c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f197734d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC47619a f197735e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final JY.a f197736f;

    /* compiled from: UpdateUnreadMessagesCounterShortTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/short_task/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger_unread_counter.impl_module.short_task.a$a, reason: collision with other inner class name */
    public static final class C5827a {
        public /* synthetic */ C5827a(C42822w c42822w) {
            this();
        }

        public C5827a() {
        }
    }

    static {
        new C5827a(null);
    }

    @Inject
    public a(@k InterfaceC47842z interfaceC47842z, @k InterfaceC47038c interfaceC47038c, @k E e12, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC47619a interfaceC47619a, @k JY.a aVar, @k R0 r02) {
        super(r02.a());
        this.f197731a = interfaceC47842z;
        this.f197732b = interfaceC47038c;
        this.f197733c = e12;
        this.f197734d = interfaceC35745a5;
        this.f197735e = interfaceC47619a;
        this.f197736f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        C42022u c42022uK = this.f197733c.o().n(new c(this)).k(new d(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f197734d;
        this.f197732b.b((C47037b) c42022uK.z(interfaceC35745a5.c()).B(10L, TimeUnit.SECONDS, interfaceC35745a5.c(), null).e());
    }

    @Override // com.avito.android.service.short_task.n
    @l
    public final Object suspendedStart(@k Bundle bundle, @k Continuation<? super ShortTask.Status> continuation) {
        X2.f318778a.i("UpdateUnreadMessagesCountWorker", "START", null);
        try {
            a();
            V2.f318762a.i("UpdateUnreadMessagesCountWorker", "SUCCESS", null);
            return ShortTask.Status.f274030b;
        } catch (Throwable th2) {
            V2.f318762a.j("UpdateUnreadMessagesCountWorker", "RETRY", th2);
            return ShortTask.Status.f274032d;
        }
    }
}
