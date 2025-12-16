package om0;

import Y61.k;
import Y61.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import rm0.InterfaceC47681a;

/* compiled from: RemoteDeviceIdHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lom0/a;", "Lrm0/a;", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: om0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44821a implements InterfaceC47681a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44824d f420168a;

    @Inject
    public C44821a(@k InterfaceC44824d interfaceC44824d) {
        this.f420168a = interfaceC44824d;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @k
    public final String getKey() {
        return "X-RemoteDeviceId";
    }

    @Override // hd.InterfaceC40915a
    @l
    /* renamed from: getValue */
    public final String getF253512a() {
        return this.f420168a.a();
    }
}
