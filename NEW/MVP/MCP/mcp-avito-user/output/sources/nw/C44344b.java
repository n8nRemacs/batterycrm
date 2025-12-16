package nW;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: BackNavigationLocationInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnW/b;", "LnW/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44344b implements InterfaceC44343a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f415168a;

    @Inject
    public C44344b(@k e eVar) {
        this.f415168a = eVar;
    }

    @Override // nW.InterfaceC44343a
    public final void a(@k Location location, @k String str) {
        this.f415168a.a(location, str);
    }

    @Override // nW.InterfaceC44343a
    @l
    public final Location b(@k String str) {
        return this.f415168a.b(str);
    }
}
