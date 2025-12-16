package Rb0;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsDiffCallback.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LRb0/e;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof SelectionsItem) || !(aVar4 instanceof SelectionsItem)) {
            return aVar3.equals(aVar4);
        }
        SelectionsItem selectionsItem = (SelectionsItem) aVar3;
        SelectionsItem selectionsItem2 = (SelectionsItem) aVar4;
        return L.f(selectionsItem.f229521c, selectionsItem2.f229521c) && L.f(selectionsItem.f229522d, selectionsItem2.f229522d) && L.f(selectionsItem.f229523e, selectionsItem2.f229523e) && L.f(selectionsItem.f229524f, selectionsItem2.f229524f);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return ((aVar3 instanceof com.avito.conveyor_item.a) && (aVar4 instanceof com.avito.conveyor_item.a)) ? L.f(((com.avito.conveyor_item.a) aVar3).getF323985b(), ((com.avito.conveyor_item.a) aVar4).getF323985b()) : aVar3.getF171235b() == aVar4.getF171235b();
    }
}
