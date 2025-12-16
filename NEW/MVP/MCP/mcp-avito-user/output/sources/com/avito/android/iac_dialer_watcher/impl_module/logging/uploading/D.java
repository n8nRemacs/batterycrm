package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacLogFileWriter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/D;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/A;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class D implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.a f167953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f167954b;

    @Inject
    public D(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.a aVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar) {
        this.f167953a = aVar;
        this.f167954b = eVar;
    }

    public static final String b(D d12, String str) {
        d12.getClass();
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        for (Object obj : C43066x.f0(str, new String[]{"\n"}, 0, 6)) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str2 = (String) obj;
            if (i12 == 0) {
                sb2.append(str2);
            } else {
                sb2.append("\n");
                sb2.append(C43066x.Z(70, " "));
                sb2.append(str2);
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.A
    @Y61.k
    public final C42026y a(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar) {
        io.reactivex.rxjava3.internal.operators.single.O oF2;
        long j12 = aVar.f167898f;
        if (j12 == 0) {
            oF2 = this.f167954b.e(aVar.f167893a);
        } else {
            oF2 = this.f167954b.f(aVar.f167893a, aVar.f167897e - 180000, j12 + 180000);
        }
        return oF2.r(new B(this, aVar, wVar)).n(new C(this));
    }
}
