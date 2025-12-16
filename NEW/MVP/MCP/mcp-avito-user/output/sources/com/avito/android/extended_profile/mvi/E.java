package com.avito.android.extended_profile.mvi;

import android.os.Parcelable;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ExtendedProfileReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQH/a;", "it", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "invoke", "(LQH/a;)Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<QH.a, ExtendedProfileWidgetItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(com.avito.android.extended_profile.mvi.entity.a aVar) {
        super(1);
        this.f150043l = aVar;
    }

    @Override // Y41.l
    public final ExtendedProfileWidgetItem invoke(QH.a aVar) {
        com.avito.android.extended_profile.mvi.entity.a aVar2;
        BaseInfoMlItem baseInfoMlItem = (BaseInfoMlItem) aVar;
        List<ExtendedProfileBaseInfoMl.Action> list = baseInfoMlItem.f154257l;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar2 = this.f150043l;
            if (!zHasNext) {
                break;
            }
            Parcelable parcelableCopy$default = (ExtendedProfileBaseInfoMl.Action) it.next();
            if (parcelableCopy$default instanceof ExtendedProfileBaseInfoMl.Subscribe) {
                ExtendedProfileBaseInfoMl.Subscribe subscribe = (ExtendedProfileBaseInfoMl.Subscribe) parcelableCopy$default;
                a.e eVar = aVar2.f150249k;
                parcelableCopy$default = ExtendedProfileBaseInfoMl.Subscribe.copy$default(subscribe, eVar.f150284c, Boolean.valueOf(eVar.f150283b), null, null, null, 28, null);
            }
            arrayList.add(parcelableCopy$default);
        }
        a.e eVar2 = aVar2.f150249k;
        return new BaseInfoMlItem(baseInfoMlItem.f154247b, baseInfoMlItem.f154248c, baseInfoMlItem.f154249d, baseInfoMlItem.f154250e, baseInfoMlItem.f154251f, baseInfoMlItem.f154252g, baseInfoMlItem.f154253h, eVar2.f150285d && !eVar2.f150289h, baseInfoMlItem.f154255j, baseInfoMlItem.f154256k, arrayList, baseInfoMlItem.f154258m);
    }
}
