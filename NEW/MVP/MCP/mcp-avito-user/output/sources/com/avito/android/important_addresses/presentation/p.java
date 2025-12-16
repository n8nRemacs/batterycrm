package com.avito.android.important_addresses.presentation;

import com.avito.android.important_addresses.domain.TransportType;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImportantAddressesPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/important_addresses/domain/TransportType;", "type", "", CrashHianalyticsData.TIME, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/important_addresses/domain/TransportType;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p extends N implements Y41.p<TransportType, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f169676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DestinationInfo f169677m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, DestinationInfo destinationInfo) {
        super(2);
        this.f169676l = mVar;
        this.f169677m = destinationInfo;
    }

    @Override // Y41.p
    public final G0 invoke(TransportType transportType, String str) {
        this.f169676l.f169657l.accept(new a(this.f169677m.f169586b, transportType, str));
        return G0.f406611a;
    }
}
