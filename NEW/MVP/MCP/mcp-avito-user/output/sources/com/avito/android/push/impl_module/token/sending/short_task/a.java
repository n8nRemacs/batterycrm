package com.avito.android.push.impl_module.token.sending.short_task;

import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.avito.android.service.short_task.ShortTask;
import gg0.C40677a;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.o;

/* compiled from: SendPushTokenShortTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/short_task/a;", "Lcom/avito/android/service/short_task/ShortTask;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements ShortTask {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C7377a f246078c = new C7377a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SendPushTokenInteractor f246079a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246080b;

    /* compiled from: SendPushTokenShortTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/short_task/a$a;", "", "<init>", "()V", "", "KEY_REASON", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.push.impl_module.token.sending.short_task.a$a, reason: collision with other inner class name */
    public static final class C7377a {
        public /* synthetic */ C7377a(C42822w c42822w) {
            this();
        }

        public C7377a() {
        }
    }

    /* compiled from: SendPushTokenShortTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/service/short_task/ShortTask$Status;", "it", "Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor$TokenRegistrationResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f246081b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    @Inject
    public a(@k SendPushTokenInteractor sendPushTokenInteractor, @k InterfaceC28373a interfaceC28373a) {
        this.f246079a = sendPushTokenInteractor;
        this.f246080b = interfaceC28373a;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @k
    public final I<ShortTask.Status> start(@k Bundle bundle) {
        f246078c.getClass();
        AbstractC41398a.c cVar = AbstractC41398a.f398613b;
        String string = bundle.getString("key_reason", null);
        cVar.getClass();
        AbstractC41398a abstractC41398a = AbstractC41398a.b.f398616c;
        if (!string.equals(abstractC41398a.f398614a)) {
            abstractC41398a = AbstractC41398a.d.f398617c;
            if (!string.equals(abstractC41398a.f398614a)) {
                abstractC41398a = AbstractC41398a.f.f398619c;
                if (!string.equals(abstractC41398a.f398614a)) {
                    abstractC41398a = AbstractC41398a.e.f398618c;
                    if (!string.equals(abstractC41398a.f398614a)) {
                        abstractC41398a = AbstractC41398a.C11383a.f398615c;
                        if (!string.equals(abstractC41398a.f398614a)) {
                            abstractC41398a = null;
                        }
                    }
                }
            }
        }
        if (abstractC41398a != null) {
            return this.f246079a.a(abstractC41398a, false).r(b.f246081b).u(new C32102w0(23));
        }
        this.f246080b.c(new C40677a(null, false, "no_reason_in_short_task"));
        return I.q(ShortTask.Status.f274031c);
    }
}
