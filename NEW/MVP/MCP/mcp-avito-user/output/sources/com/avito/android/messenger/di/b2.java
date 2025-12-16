package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.Executors;
import javax.inject.Provider;

/* compiled from: MessengerSyncModule_ProvideChannelsLockOperationsScheduler$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class b2 implements dagger.internal.h<io.reactivex.rxjava3.core.H> {

    /* renamed from: a, reason: collision with root package name */
    public final C30713g1 f195746a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195747b;

    public b2(C30713g1 c30713g1, Provider provider) {
        this.f195746a = c30713g1;
        this.f195747b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f195746a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195747b.get();
        int i12 = W1.f195723a;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[41];
        if (!((Boolean) c30277e1.f144975O.a().invoke()).booleanValue()) {
            return interfaceC35745a5.c();
        }
        int i13 = 4;
        try {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            if (iAvailableProcessors >= 4) {
                i13 = iAvailableProcessors;
            }
        } catch (Throwable unused) {
        }
        return interfaceC35745a5.g(Executors.newFixedThreadPool(i13));
    }
}
