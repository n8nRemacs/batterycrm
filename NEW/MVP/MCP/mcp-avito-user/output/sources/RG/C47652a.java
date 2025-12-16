package rg;

import Y61.k;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.InterfaceC28960a;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.location.u;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoForBusinessMainArgsProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrg/a;", "Lcom/avito/android/bxcontent/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47652a implements InterfaceC28960a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f430142a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f430143b;

    @Inject
    public C47652a(@k x xVar, @k u uVar) {
        this.f430142a = xVar;
        this.f430143b = uVar;
    }

    @Override // com.avito.android.bxcontent.InterfaceC28960a
    @k
    public final ItemsSearchLink a() {
        return c();
    }

    @k
    public final BxContentArguments b() {
        ItemsSearchLink itemsSearchLinkC = c();
        String str = itemsSearchLinkC.f133414m;
        if (str == null) {
            str = "";
        }
        return new BxContentArguments(null, itemsSearchLinkC.f133403b, itemsSearchLinkC.f133404c, null, itemsSearchLinkC.f133409h, itemsSearchLinkC.f133413l, null, str, null, itemsSearchLinkC.f133416o, itemsSearchLinkC.f133419r, null, null, null, null, null, null, null, null, null, null, null, null, 8386889, null);
    }

    public final ItemsSearchLink c() {
        String id2;
        Location locationF = this.f430143b.f();
        if (locationF == null || (id2 = locationF.getId()) == null) {
            id2 = "621540";
        }
        return (ItemsSearchLink) this.f430142a.b(AK.c.k("ru.avito://1/items/search?context=H4sIAAAAAAAA_0q0MrKqLrYyNLNSSi7KLy52TixJTc8vqgxJTFeyLrYyNoaKxydDJeITyzJL8uPT8ovik0qLM_NSi4tBCg1NrZQyi51BSsNSi0oykxNzlKyTrAytawEBAAD__5SiViZiAAAA&locationId=", id2, "&params%5B156912%5D=3266344&params%5B170371%5D=77354&presentationType=serp"));
    }
}
