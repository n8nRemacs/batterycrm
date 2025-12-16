package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacLogBufferStream.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/f;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/e;", "Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/a;", "<init>", "()V", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class f implements e, com.avito.android.iac_dialer_watcher.public_module.logging.logger.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<j> f168077a = com.jakewharton.rxrelay3.e.O0(4096).M0();

    /* compiled from: IacLogBufferStream.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/f$a;", "", "<init>", "()V", "", "REPLAY_BUFFER_SIZE", "I", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f() {
    }

    @Override // com.avito.android.iac_dialer_watcher.public_module.logging.logger.a
    public final void a(int i12, @Y61.l String str, @Y61.k String str2, @Y61.l Throwable th2) {
        com.jakewharton.rxrelay3.d<j> dVar = this.f168077a;
        String name = Thread.currentThread().getName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        dVar.accept(new j(name, jCurrentTimeMillis, i12, str, str2, th2));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.writing.e
    public final io.reactivex.rxjava3.core.z l() {
        return this.f168077a;
    }
}
