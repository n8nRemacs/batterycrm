package pf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlot;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlotConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LinkSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpf0/d;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/link/LinkSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pf0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47074d extends k<LinkSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkSlot f428712b;

    public C47074d(@Y61.k LinkSlot linkSlot) {
        this.f428712b = linkSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f428712b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        LinkSlot linkSlot = this.f428712b;
        return C42745f0.e0(new com.avito.android.publish.slots.link.item.c(linkSlot.getId(), ((LinkSlotConfig) linkSlot.getWidget().getConfig()).getText(), ((LinkSlotConfig) linkSlot.getWidget().getConfig()).getAlert()));
    }
}
