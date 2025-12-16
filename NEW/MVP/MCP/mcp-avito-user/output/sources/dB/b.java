package Db;

import Y61.k;
import com.avito.android.advertising.splitter.YandexBadgeStyle;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: CommercialFeaturesImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDb/b;", "LDb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC13381a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.splitter.features.a f3251a;

    @Inject
    public b(@k com.avito.android.advertising.splitter.features.a aVar) {
        this.f3251a = aVar;
    }

    @Override // Db.InterfaceC13381a
    @k
    public final YandexBadgeStyle a() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object>[] nVarArr = com.avito.android.advertising.splitter.features.a.f88526i;
        n<Object> nVar = nVarArr[3];
        if (((Boolean) aVar.f88530e.a().invoke()).booleanValue()) {
            return YandexBadgeStyle.f88523d;
        }
        n<Object> nVar2 = nVarArr[2];
        return ((Boolean) aVar.f88529d.a().invoke()).booleanValue() ? YandexBadgeStyle.f88522c : YandexBadgeStyle.f88521b;
    }

    @Override // Db.InterfaceC13381a
    public final boolean b() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.advertising.splitter.features.a.f88526i[1];
        return ((Boolean) aVar.f88528c.a().invoke()).booleanValue();
    }

    @Override // Db.InterfaceC13381a
    public final boolean c() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.advertising.splitter.features.a.f88526i[0];
        return ((Boolean) aVar.f88527b.a().invoke()).booleanValue();
    }

    @Override // Db.InterfaceC13381a
    public final boolean d() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.advertising.splitter.features.a.f88526i[5];
        return ((Boolean) aVar.f88532g.a().invoke()).booleanValue();
    }

    @Override // Db.InterfaceC13381a
    public final boolean e() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.advertising.splitter.features.a.f88526i[6];
        return ((Boolean) aVar.f88533h.a().invoke()).booleanValue();
    }

    @Override // Db.InterfaceC13381a
    public final boolean f() {
        com.avito.android.advertising.splitter.features.a aVar = this.f3251a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.advertising.splitter.features.a.f88526i[4];
        return ((Boolean) aVar.f88531f.a().invoke()).booleanValue();
    }
}
