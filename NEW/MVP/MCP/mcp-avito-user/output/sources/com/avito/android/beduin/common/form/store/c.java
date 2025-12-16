package com.avito.android.beduin.common.form.store;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import lj.InterfaceC43779a;

/* compiled from: ComponentsFormStoreImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/store/c;", "Lcom/avito/android/beduin/common/form/store/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f103375a = new LinkedHashMap();

    @Inject
    public c() {
    }

    @Override // com.avito.android.beduin.common.form.store.b
    public final void a(@k String str, @k com.avito.android.beduin.common.form.c cVar) {
        this.f103375a.put(str, cVar);
    }

    @Override // lj.InterfaceC43780b
    @l
    public final InterfaceC43779a get(@k String str) {
        return (InterfaceC43779a) this.f103375a.get(str);
    }

    @Override // lj.InterfaceC43780b
    @k
    public final List<InterfaceC43779a> getAll() {
        return C42745f0.M0(this.f103375a.values());
    }
}
