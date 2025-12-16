package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13391b;
import De0.d;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.category_parameters.VinScanner;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VinScannerReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LDe0/b;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements u<InterfaceC13391b, De0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VinScanner f239517b;

    @Inject
    public l(@Y61.k VinScanner vinScanner) {
        this.f239517b = vinScanner;
    }

    @Override // com.avito.android.arch.mvi.u
    public final De0.d a(InterfaceC13391b interfaceC13391b, De0.d dVar) {
        De0.d bVar;
        InterfaceC13391b interfaceC13391b2 = interfaceC13391b;
        De0.d dVar2 = dVar;
        if (interfaceC13391b2 instanceof InterfaceC13391b.g) {
            String title = ((InterfaceC13391b.g) interfaceC13391b2).f3326a;
            VinScanner vinScanner = this.f239517b;
            if (title == null) {
                title = vinScanner.getFailPage().getTitle();
            }
            bVar = new d.a(title, vinScanner.getFailPage().getInstructionButtonTitle(), vinScanner.getFailPage().getAgainButtonTitle(), vinScanner.getSkipButtonTitle(), d.f.a(dVar2.getF3335a(), null, null, true, false, 63));
        } else if (interfaceC13391b2 instanceof InterfaceC13391b.i) {
            InterfaceC13391b.i iVar = (InterfaceC13391b.i) interfaceC13391b2;
            bVar = new d.e(d.f.a(dVar2.getF3335a(), iVar.f3329b, iVar.f3328a, false, false, 29));
        } else {
            if (!(interfaceC13391b2 instanceof InterfaceC13391b.c)) {
                return interfaceC13391b2 instanceof InterfaceC13391b.f ? new d.C0179d(d.f.a(dVar2.getF3335a(), null, Uri.EMPTY, false, true, 31)) : dVar2;
            }
            bVar = new d.b(d.f.a(dVar2.getF3335a(), ((InterfaceC13391b.c) interfaceC13391b2).f3322a, null, false, false, 253));
        }
        return bVar;
    }
}
