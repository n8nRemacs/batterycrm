package Be0;

import Cd0.C13255c0;
import Cd0.K0;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.x;
import com.avito.android.publish.scanner_v2.analytics.PermissionAction;
import com.avito.android.publish.scanner_v2.analytics.ScannerFromPage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import yc.C50213a;

/* compiled from: PublishVinScannerEventTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBe0/b;", "LBe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Be0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13141b implements InterfaceC13140a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f1571a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f1572b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f1573c;

    @Inject
    public C13141b(@k InterfaceC28373a interfaceC28373a, @k C50213a c50213a, @k x xVar) {
        this.f1571a = interfaceC28373a;
        this.f1572b = c50213a;
        this.f1573c = xVar;
    }

    @Override // Be0.InterfaceC13140a
    public final void a(@k int[] iArr, @k String[] strArr) {
        PermissionAction permissionAction = null;
        if (C42756l.H("android.permission.CAMERA", strArr) >= 0) {
            Integer numValueOf = iArr.length != 0 ? Integer.valueOf(iArr[0]) : null;
            permissionAction = (numValueOf != null && numValueOf.intValue() == -1) ? PermissionAction.f239326d : PermissionAction.f239325c;
        }
        if (permissionAction == null) {
            return;
        }
        this.f1571a.c(new d(this.f1572b.b(), permissionAction));
    }

    @Override // Be0.InterfaceC13140a
    public final void b(@k ScannerFromPage scannerFromPage) {
        this.f1571a.c(new C13255c0(this.f1572b.c(), scannerFromPage));
    }

    @Override // Be0.InterfaceC13140a
    public final void c() {
        this.f1571a.c(new K0(this.f1572b.c()));
    }

    @Override // Be0.InterfaceC13140a
    public final void d(boolean z12) {
        this.f1571a.c(new e(this.f1572b.b(), z12 ? ScannerFromPage.f239330c : !this.f1573c.b("android.permission.CAMERA") ? ScannerFromPage.f239332e : ScannerFromPage.f239331d));
    }
}
