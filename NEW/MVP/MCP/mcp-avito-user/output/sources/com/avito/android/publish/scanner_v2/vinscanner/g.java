package com.avito.android.publish.scanner_v2.vinscanner;

import Be0.InterfaceC13140a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VinScannerFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VinScannerFragment f239478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.scanner_v2.c f239479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(VinScannerFragment vinScannerFragment, com.avito.android.publish.scanner_v2.c cVar) {
        super(1);
        this.f239478l = vinScannerFragment;
        this.f239479m = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            VinScannerFragment vinScannerFragment = this.f239478l;
            InterfaceC13140a interfaceC13140a = vinScannerFragment.f239441s0;
            if (interfaceC13140a == null) {
                interfaceC13140a = null;
            }
            interfaceC13140a.b(vinScannerFragment.s5().f239279c);
            this.f239479m.f239363y = null;
        }
        return G0.f406611a;
    }
}
