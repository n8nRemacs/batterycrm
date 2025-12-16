package com.avito.android.tariff_cpt.configure.migration.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptMigrationRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/f;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/e;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final JC0.a f298076a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f298077b;

    @Inject
    public f(@Y61.k JC0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f298076a = aVar;
        this.f298077b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.viewmodel.e
    @Y61.k
    public final W a(@Y61.l String str) {
        return g1.a(this.f298076a.d(str)).z(this.f298077b.a());
    }
}
