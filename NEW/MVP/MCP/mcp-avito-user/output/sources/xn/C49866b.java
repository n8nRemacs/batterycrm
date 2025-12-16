package xN;

import Y61.k;
import com.avito.android.info.di.d;
import com.avito.android.remote.InterfaceC34322j0;
import com.avito.android.remote.model.Info;
import hD.C40806a;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;

/* compiled from: InfoInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxN/b;", "LxN/a;", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49866b implements InterfaceC49865a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34322j0 f442451a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40806a f442453c;

    @Inject
    public C49866b(@k InterfaceC34322j0 interfaceC34322j0, @d.b @k String str, @k C40806a c40806a) {
        this.f442451a = interfaceC34322j0;
        this.f442452b = str;
        this.f442453c = c40806a;
    }

    @Override // xN.InterfaceC49865a
    @k
    public final z<Info> load() {
        String str = this.f442452b;
        boolean zF2 = L.f(str, "user_agreement");
        InterfaceC34322j0 interfaceC34322j0 = this.f442451a;
        if (!zF2) {
            C40806a c40806a = this.f442453c;
            c40806a.getClass();
            n<Object> nVar = C40806a.f397105l[4];
            if (!((Boolean) c40806a.f397110f.a().invoke()).booleanValue() || !L.f(str, "data_policy")) {
                return interfaceC34322j0.a(str);
            }
        }
        return interfaceC34322j0.b(str);
    }
}
