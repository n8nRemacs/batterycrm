package com.avito.android.beduin.common.form;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: ComponentsFormImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "beduinModel", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f103357l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f103358m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        super(1);
        this.f103357l = linkedHashMap;
        this.f103358m = linkedHashMap2;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModel2 = beduinModel;
        DisplayingPredicate displayingPredicate = beduinModel2.getDisplayingPredicate();
        if (displayingPredicate != null && !displayingPredicate.getVisibility(this.f103357l)) {
            return C42784z0.f406748b;
        }
        if (!(beduinModel2 instanceof com.avito.android.beduin.common.component.c)) {
            return beduinModel2 instanceof com.avito.android.beduin.common.component.d ? ((com.avito.android.beduin.common.component.d) beduinModel2).getInlinedModels() : Collections.singletonList(beduinModel2);
        }
        List<BeduinModel> listResolveChildren = ((com.avito.android.beduin.common.component.c) beduinModel2).resolveChildren(this.f103358m);
        return listResolveChildren == null ? C42784z0.f406748b : listResolveChildren;
    }
}
