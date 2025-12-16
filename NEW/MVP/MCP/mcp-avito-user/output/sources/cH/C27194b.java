package ch;

import Y61.k;
import com.avito.android.permissions.u;
import kotlin.Metadata;

/* compiled from: CameraPermissionHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lch/b;", "Lch/a;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ch.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27194b implements InterfaceC27193a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f58093a;

    public C27194b(@k u uVar) {
        this.f58093a = uVar;
    }

    @Override // ch.InterfaceC27193a
    public final boolean d() {
        return this.f58093a.b("android.permission.CAMERA");
    }
}
