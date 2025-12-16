package com.avito.android.category_parameters;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "T", "", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class j<T extends Slot<?>> {
    @Y61.k
    public z<P2<SuccessResult>> c() {
        return z.c0(new P2.b(new SuccessResult(null)));
    }

    @Y61.k
    public f d(@Y61.k com.avito.conveyor_item.a aVar) {
        return f.c.f117644b;
    }

    @Y61.k
    public f e(@Y61.k ParameterSlot parameterSlot) {
        return f.c.f117644b;
    }

    @Y61.k
    public final String f() {
        return g().getId();
    }

    @Y61.k
    public abstract T g();

    @Y61.k
    public z<P2<G0>> h() {
        return z.c0(new P2.b(G0.f406611a));
    }

    public final void i() {
        g().setParameters(g().initParameters());
    }
}
