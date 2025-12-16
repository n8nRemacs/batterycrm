package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import lj.d;

/* compiled from: BeduinValidateFormsActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_models/BeduinModel;", "model", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class z1 extends kotlin.jvm.internal.N implements Y41.l<BeduinModel, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f100529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f100530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ArrayList arrayList, Set set) {
        super(1);
        this.f100529l = set;
        this.f100530m = arrayList;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(BeduinModel beduinModel) {
        BeduinModel beduinModel2 = beduinModel;
        if (beduinModel2 instanceof com.avito.android.beduin.common.component.q) {
            String id2 = beduinModel2.getId();
            Set<String> set = this.f100529l;
            if (set == null || set.contains(id2)) {
                this.f100530m.add(new d.h(beduinModel2, ((com.avito.android.beduin.common.component.q) beduinModel2).validateModelByConstraints()));
            }
        }
        return kotlin.G0.f406611a;
    }
}
