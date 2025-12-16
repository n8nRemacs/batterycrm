package com.avito.android.publish.scanner_v2.vinscanner;

import Be0.InterfaceC13140a;
import De0.InterfaceC13390a;
import com.avito.android.publish.scanner_v2.analytics.ScannerFromPage;
import com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VinScannerFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VinScannerFragment f239480l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(VinScannerFragment vinScannerFragment) {
        super(0);
        this.f239480l = vinScannerFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        VinScannerFragment.a aVar = VinScannerFragment.f239432D0;
        VinScannerFragment vinScannerFragment = this.f239480l;
        vinScannerFragment.t5().accept(InterfaceC13390a.g.f3319a);
        InterfaceC13140a interfaceC13140a = vinScannerFragment.f239441s0;
        if (interfaceC13140a == null) {
            interfaceC13140a = null;
        }
        interfaceC13140a.b(ScannerFromPage.f239330c);
        return G0.f406611a;
    }
}
