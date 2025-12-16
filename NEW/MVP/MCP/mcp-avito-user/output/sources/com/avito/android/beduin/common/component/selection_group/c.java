package com.avito.android.beduin.common.component.selection_group;

import Y41.l;
import com.avito.android.beduin.common.component.g;
import com.avito.android.beduin_models.BeduinModel;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSelectionGroupModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "beduinModel", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements l<BeduinModel, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f102508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedHashSet linkedHashSet) {
        super(1);
        this.f102508l = linkedHashSet;
    }

    @Override // Y41.l
    public final Boolean invoke(BeduinModel beduinModel) {
        boolean z12;
        BeduinModel beduinModel2 = beduinModel;
        if (beduinModel2 instanceof BeduinSelectionGroupModel) {
            z12 = true;
        } else {
            if (beduinModel2 instanceof g) {
                this.f102508l.add(beduinModel2.getId());
            }
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
