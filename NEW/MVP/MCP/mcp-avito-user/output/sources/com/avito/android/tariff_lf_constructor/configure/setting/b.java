package com.avito.android.tariff_lf_constructor.configure.setting;

import Y41.l;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: ConstructorSettingFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072<\u0010\u0006\u001a8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000j\u0004\u0018\u0001`\u00040\u0000j\u0002`\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/conveyor_item/a;", "Landroidx/recyclerview/widget/o$e;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/ListUpdate;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<Q<? extends List<? extends com.avito.conveyor_item.a>, ? extends C23424o.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorSettingFragment f300039l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstructorSettingFragment constructorSettingFragment) {
        super(1);
        this.f300039l = constructorSettingFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends List<? extends com.avito.conveyor_item.a>, ? extends C23424o.e> q12) {
        Q<? extends List<? extends com.avito.conveyor_item.a>, ? extends C23424o.e> q13 = q12;
        List list = (List) q13.f406619b;
        C23424o.e eVar = (C23424o.e) q13.f406620c;
        ConstructorSettingFragment constructorSettingFragment = this.f300039l;
        com.avito.konveyor.adapter.a aVar = constructorSettingFragment.f300024n0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
        n<Object> nVar = ConstructorSettingFragment.f300023B0[0];
        RecyclerView.Adapter adapter = ((RecyclerView) constructorSettingFragment.f300031u0.a()).getAdapter();
        if (adapter != null) {
            eVar.b(adapter);
        }
        return G0.f406611a;
    }
}
