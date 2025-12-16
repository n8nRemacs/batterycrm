package com.avito.android.item_map.geo_zones;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import tO.InterfaceC48584a;

/* compiled from: GeoZonesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LtO/a;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/util/P2;", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.l<TypedResult<InterfaceC48584a>, P2<? super InterfaceC48584a>> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f173347l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final P2<? super InterfaceC48584a> invoke(TypedResult<InterfaceC48584a> typedResult) {
        TypedResult<InterfaceC48584a> typedResult2 = typedResult;
        if (typedResult2 instanceof TypedResult.Success) {
            return new P2.b(((TypedResult.Success) typedResult2).getResult());
        }
        if (typedResult2 instanceof TypedResult.Error) {
            return new P2.a(((TypedResult.Error) typedResult2).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
