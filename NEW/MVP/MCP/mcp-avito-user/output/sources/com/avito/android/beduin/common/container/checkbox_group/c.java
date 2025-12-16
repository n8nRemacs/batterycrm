package com.avito.android.beduin.common.container.checkbox_group;

import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinCheckboxGroupContainer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/i;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/checkbox_group/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f102973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f102974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<BeduinAction> f102975n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<String> list, a aVar, List<? extends BeduinAction> list2) {
        super(1);
        this.f102973l = list;
        this.f102974m = aVar;
        this.f102975n = list2;
    }

    @Override // Y41.l
    public final G0 invoke(i iVar) {
        i iVar2 = iVar;
        List<String> list = this.f102973l;
        if (list != null) {
            iVar2.setChecked(list);
        }
        com.avito.android.beduin_shared.model.utils.a.a(this.f102974m.f102971i, this.f102975n);
        return G0.f406611a;
    }
}
