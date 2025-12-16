package eY;

import Y61.k;
import com.avito.android.favorite.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoritePinsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeY/b;", "LeY/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40071b implements InterfaceC40070a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f395231a;

    @Inject
    public C40071b(@k h hVar) {
        this.f395231a = hVar;
    }

    @Override // eY.InterfaceC40070a
    @k
    public final Map<String, Boolean> a(@k List<String> list) {
        return this.f395231a.f(list);
    }

    @Override // eY.InterfaceC40070a
    @k
    public final List e(@k ArrayList arrayList) {
        return this.f395231a.e(arrayList);
    }
}
