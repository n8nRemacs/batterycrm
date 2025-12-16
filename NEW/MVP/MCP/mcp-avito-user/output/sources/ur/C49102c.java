package ur;

import Y61.k;
import com.avito.android.config.AppType;
import com.avito.android.region.Region;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AppTypeProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lur/c;", "Lur/b;", "_avito_config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ur.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49102c implements InterfaceC49101b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AppType f440309a;

    @Inject
    public C49102c(@k InterfaceC49100a interfaceC49100a) {
        this.f440309a = interfaceC49100a.getF125479a();
    }

    @Override // ur.InterfaceC49101b
    @k
    /* renamed from: a, reason: from getter */
    public final AppType getF440309a() {
        return this.f440309a;
    }

    @Override // ur.InterfaceC49101b
    @k
    public final Set<String> b() {
        Set<Region> set = getF440309a().f125478b;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((Region) it.next()).f252706b.f252701b);
        }
        return C42745f0.P0(arrayList);
    }

    @Override // ur.InterfaceC49101b
    public final boolean c() {
        return getF440309a() == AppType.f125475d;
    }

    @Override // ur.InterfaceC49101b
    public final boolean d() {
        return getF440309a() == AppType.f125474c;
    }
}
