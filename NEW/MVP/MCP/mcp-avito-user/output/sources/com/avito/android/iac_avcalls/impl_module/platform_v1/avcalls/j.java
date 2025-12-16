package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.remote.model.RawJson;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.avcalls.android.a;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: AvCallsExternalSignalingTransportImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/j;", "Lcom/avito/avcalls/android/a$e;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements a.e {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f164550e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f164551a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164552b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final F f164553c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f164554d;

    /* compiled from: AvCallsExternalSignalingTransportImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "requestCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f164550e = new AtomicInteger();
    }

    @Inject
    public j(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f164551a = interfaceC47842z;
        this.f164552b = interfaceC28373a;
        this.f164553c = f12;
        this.f164554d = interfaceC35745a5;
        new com.avito.android.util.rx3.concurrent.a(interfaceC35745a5.f());
    }

    @Override // com.avito.avcalls.android.a.e
    @Y61.k
    public final com.avito.android.iac_avcalls.impl_module.platform.avcalls.b a(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        int andIncrement = f164550e.getAndIncrement();
        return new com.avito.android.iac_avcalls.impl_module.platform.avcalls.b(A1.e(this.f164551a.callMethod(str, new RawJson(str2)).j(new k(str, andIncrement)).z(this.f164554d.a()), new l(this, str, andIncrement, lVar2), new m(andIncrement, lVar, str)), 1);
    }
}
