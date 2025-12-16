package com.avito.android.beduin.ui.screen.fragment;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import qi.InterfaceC47401b;

/* compiled from: ScreenViewModelFactoryProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/o;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f104275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<Class<? extends InterfaceC47401b>, j<InterfaceC47401b, i>> f104276b;

    @Inject
    public o(@Y61.k l lVar, @Y61.k Map<Class<? extends InterfaceC47401b>, j<InterfaceC47401b, i>> map) {
        this.f104275a = lVar;
        this.f104276b = map;
    }

    @Y61.k
    public final com.avito.android.beduin.ui.util.c a(@Y61.k Class cls, @Y61.k BeduinScreenOpenParams beduinScreenOpenParams) {
        j<InterfaceC47401b, i> jVar = this.f104276b.get(cls);
        j<InterfaceC47401b, i> jVar2 = jVar instanceof j ? jVar : null;
        if (jVar2 != null) {
            return new com.avito.android.beduin.ui.util.c(new n(this, jVar2, beduinScreenOpenParams));
        }
        throw new IllegalStateException(("Mapper for " + cls.getName() + " not found").toString());
    }
}
