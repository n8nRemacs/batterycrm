package sb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReplacePhoneInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsb0/f;", "Lsb0/e;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC48150e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f437735a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f437736b;

    @Inject
    public f(@k InterfaceC34401z0 interfaceC34401z0, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f437735a = interfaceC34401z0;
        this.f437736b = interfaceC35745a5;
    }

    @Override // sb0.InterfaceC48146a
    @k
    public final I<G0> a(@k String str, @l String str2) {
        return str2 == null ? I.l(new IllegalArgumentException("Replacing phone must not be null")) : g1.a(this.f437735a.g(str, str2, false).z(this.f437736b.a()));
    }
}
