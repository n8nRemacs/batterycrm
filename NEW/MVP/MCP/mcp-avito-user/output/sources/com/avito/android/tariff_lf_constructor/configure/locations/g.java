package com.avito.android.tariff_lf_constructor.configure.locations;

import android.widget.TextView;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qK0.C47313c;

/* compiled from: ConstructorConfigureLocationsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<List<? extends com.avito.conveyor_item.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureLocationsFragment f299919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ConstructorConfigureLocationsFragment constructorConfigureLocationsFragment) {
        super(1);
        this.f299919l = constructorConfigureLocationsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends com.avito.conveyor_item.a> list) {
        List<? extends com.avito.conveyor_item.a> list2 = list;
        ConstructorConfigureLocationsFragment constructorConfigureLocationsFragment = this.f299919l;
        com.avito.konveyor.adapter.a aVar = constructorConfigureLocationsFragment.f299858n0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list2);
        com.avito.konveyor.adapter.j jVar = constructorConfigureLocationsFragment.f299859o0;
        (jVar != null ? jVar : null).notifyDataSetChanged();
        C47313c c47313c = constructorConfigureLocationsFragment.f299869y0;
        kotlin.reflect.n<Object> nVar = ConstructorConfigureLocationsFragment.f299852G0[5];
        D6.G((TextView) c47313c.a(), list2.isEmpty());
        return G0.f406611a;
    }
}
