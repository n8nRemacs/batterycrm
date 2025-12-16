package fm;

import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinDeeplinkCreatorImpl_Factory.java */
@e
@y
@x
/* renamed from: fm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40443c implements h<C40442b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f396069a;

    /* renamed from: b, reason: collision with root package name */
    public final l f396070b;

    public C40443c(l lVar, l lVar2) {
        this.f396069a = lVar;
        this.f396070b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40442b((CampaignsSaleArguments) this.f396069a.f393949a, (String) this.f396070b.f393949a);
    }
}
