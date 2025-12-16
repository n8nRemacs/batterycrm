package com.avito.android.remote.model.notification;

import X41.n;
import Y61.k;
import com.avito.android.deep_linking.x;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationResponseMapper_Factory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationResponseMapper_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/remote/model/notification/NotificationResponseMapper;", "Ljavax/inject/Provider;", "Lcom/avito/android/deep_linking/x;", "deeplinkFactory", "<init>", "(Ljavax/inject/Provider;)V", "get", "()Lcom/avito/android/remote/model/notification/NotificationResponseMapper;", "Ljavax/inject/Provider;", "Companion", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationResponseMapper_Factory implements h<NotificationResponseMapper> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final Provider<x> deeplinkFactory;

    /* compiled from: NotificationResponseMapper_Factory.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationResponseMapper_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/avito/android/deep_linking/x;", "deeplinkFactory", "Lcom/avito/android/remote/model/notification/NotificationResponseMapper_Factory;", "create", "(Ljavax/inject/Provider;)Lcom/avito/android/remote/model/notification/NotificationResponseMapper_Factory;", "Lcom/avito/android/remote/model/notification/NotificationResponseMapper;", "newInstance", "(Lcom/avito/android/deep_linking/x;)Lcom/avito/android/remote/model/notification/NotificationResponseMapper;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @n
        @k
        public final NotificationResponseMapper_Factory create(@k Provider<x> deeplinkFactory) {
            return new NotificationResponseMapper_Factory(deeplinkFactory);
        }

        @n
        @k
        public final NotificationResponseMapper newInstance(@k x deeplinkFactory) {
            return new NotificationResponseMapper(deeplinkFactory);
        }

        private Companion() {
        }
    }

    public NotificationResponseMapper_Factory(@k Provider<x> provider) {
        this.deeplinkFactory = provider;
    }

    @n
    @k
    public static final NotificationResponseMapper_Factory create(@k Provider<x> provider) {
        return INSTANCE.create(provider);
    }

    @n
    @k
    public static final NotificationResponseMapper newInstance(@k x xVar) {
        return INSTANCE.newInstance(xVar);
    }

    @Override // javax.inject.Provider
    @k
    public NotificationResponseMapper get() {
        return INSTANCE.newInstance(this.deeplinkFactory.get());
    }
}
