package com.avito.android.auto_loans_composite_broker.v1;

import androidx.view.M0;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculator;
import kotlin.Metadata;

/* compiled from: CompositeBrokerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/q;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/auto_loans_composite_broker/v1/n;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends M0 implements n {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final a f95581E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public CompositeBrokerCalculator f95582J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public String f95583K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public l f95584L;

    public q(@Y61.k a aVar) {
        this.f95581E = aVar;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.n
    @Y61.l
    public final l L0() {
        String str;
        if (this.f95584L == null) {
            CompositeBrokerCalculator compositeBrokerCalculator = this.f95582J;
            l lVar = null;
            if (compositeBrokerCalculator != null && (str = this.f95583K) != null) {
                lVar = new l(compositeBrokerCalculator, str, this.f95581E);
            }
            this.f95584L = lVar;
        }
        return this.f95584L;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.n
    public final void ua(@Y61.k CompositeBrokerCalculator compositeBrokerCalculator, @Y61.l String str) {
        this.f95582J = compositeBrokerCalculator;
        this.f95583K = str;
    }
}
