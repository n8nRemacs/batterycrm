package Cb;

import Y61.k;
import android.content.Intent;
import com.avito.android.L;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertisingCreativeIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCb/b;", "LCb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC13237a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f2283a;

    @Inject
    public b(@k L l12) {
        this.f2283a = l12;
    }

    @Override // Cb.InterfaceC13237a
    @k
    public final Intent a() {
        return L.a.a(this.f2283a, null, 3);
    }
}
