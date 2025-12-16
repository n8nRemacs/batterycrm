package GP0;

import Y61.k;
import com.avito.android.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppVersionHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGP0/b;", "LGP0/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6495a;

    @Inject
    public b(@k P p12) {
        this.f6495a = p12.f().getValue();
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253498b() {
        return false;
    }

    @Override // hd.InterfaceC40915a
    @k
    public final String getKey() {
        return "X-AppVer";
    }

    @Override // hd.InterfaceC40915a
    @k
    /* renamed from: getValue, reason: from getter */
    public final String getF6495a() {
        return this.f6495a;
    }
}
