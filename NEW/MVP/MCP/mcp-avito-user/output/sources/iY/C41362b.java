package iY;

import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ViewedPinsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiY/b;", "LiY/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C41362b implements InterfaceC41361a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f398548a;

    @Inject
    public C41362b(@k e eVar) {
        this.f398548a = eVar;
    }

    @Override // iY.InterfaceC41361a
    public final void a(@k List<String> list) {
        this.f398548a.a(list);
    }

    @Override // iY.InterfaceC41361a
    public final boolean b(@k List<String> list) {
        return this.f398548a.b(list);
    }
}
