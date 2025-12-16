package RM;

import com.avito.android.important_addresses_selection.data.i;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MarkAddressesUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f14411a;

    /* renamed from: b, reason: collision with root package name */
    public final l f14412b;

    public e(i iVar, l lVar) {
        this.f14411a = iVar;
        this.f14412b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((c) this.f14411a.get(), (ImportantAddressesSelectionData) this.f14412b.f393949a);
    }
}
