package dZ;

import Y61.k;
import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: InfoPersistHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdZ/e;", "LdZ/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f393912a;

    public e(Bundle bundle) {
        this.f393912a = bundle;
    }

    @Override // dZ.i
    public final void a(int i12, @k String str) {
        this.f393912a.putInt(str, i12);
    }

    @Override // dZ.i
    public final void b(boolean z12) {
        this.f393912a.putBoolean("userIsEmployee", z12);
    }

    @Override // dZ.i
    public final void putString(@k String str, @k String str2) {
        this.f393912a.putString(str, str2);
    }
}
