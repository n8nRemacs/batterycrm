package com.avito.android.barcode_scanner_impl.deep_linking;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.barcode_scanner_public.BarcodeScannerLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BarcodeScannerDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/deep_linking/a;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes11.dex */
public final class a implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* compiled from: BarcodeScannerDeeplinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/deep_linking/a$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode_scanner_impl.deep_linking.a$a, reason: collision with other inner class name */
    public static final class C2979a {
        public /* synthetic */ C2979a(C42822w c42822w) {
            this();
        }

        public C2979a() {
        }
    }

    static {
        new C2979a(null);
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (!(bVar instanceof BarcodeScannerLink.b)) {
            return new j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        }
        BarcodeScannerLink.b bVar2 = (BarcodeScannerLink.b) bVar;
        if (bVar2 instanceof BarcodeScannerLink.b.C2983b) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("barcode", ((BarcodeScannerLink.b.C2983b) bVar).f99048b)};
        } else {
            if (!(bVar2 instanceof BarcodeScannerLink.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVarArr = null;
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        if (!(bVar instanceof BarcodeScannerLink.b)) {
            return ResultStatus.f337440d;
        }
        BarcodeScannerLink.b bVar2 = (BarcodeScannerLink.b) bVar;
        if (bVar2 instanceof BarcodeScannerLink.b.C2983b) {
            return ResultStatus.f337439c;
        }
        if (bVar2 instanceof BarcodeScannerLink.b.a) {
            return ResultStatus.f337440d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
