package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacLogSessionHistoryUpdater.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/Y;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/X;", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Y implements X {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final SimpleDateFormat f167985b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f167986a;

    /* compiled from: IacLogSessionHistoryUpdater.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/Y$a;", "", "<init>", "()V", "", "SPACES", "Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "timeFormat", "Ljava/text/SimpleDateFormat;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f167985b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    }

    @Inject
    public Y(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar) {
        this.f167986a = eVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.X
    @Y61.k
    public final C42026y a(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        return this.f167986a.b().n(new c0(wVar, this));
    }
}
