package com.avito.android.beduin.common.component.selection_group;

import Y41.l;
import com.avito.android.beduin.common.component.g;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSelectionGroupModelPreparer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "beduinModel", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class d extends N implements l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f102509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set<String> f102510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LinkedHashSet linkedHashSet, Set set) {
        super(1);
        this.f102509l = linkedHashSet;
        this.f102510m = set;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel selected = beduinModel;
        if (selected instanceof g) {
            if (this.f102509l.contains(selected.getId())) {
                Set<String> set = this.f102510m;
                selected = ((g) selected).setSelected(set != null ? set.contains(selected.getId()) : false);
            }
        }
        return Collections.singletonList(selected);
    }
}
