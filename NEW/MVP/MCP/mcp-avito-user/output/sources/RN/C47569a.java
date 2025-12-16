package rN;

import TV0.g;
import Y61.k;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34820s;
import com.avito.android.serp.adapter.E;
import kotlin.Metadata;

/* compiled from: ImvSimilarAdvertItemListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LrN/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/E;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47569a implements TV0.b<E, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C47573e f429768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34820s f429769b;

    public C47569a(@k C34820s c34820s, @k C47573e c47573e) {
        this.f429768a = c47573e;
        this.f429769b = c34820s;
    }

    @Override // TV0.b
    @k
    public final TV0.d<E, AdvertItem> a() {
        return this.f429768a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f429769b.f271467c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        this.f429769b.getClass();
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertItem;
    }
}
