package com.avito.android.publish.screen.objects.mvi;

import Ge0.f;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ObjectFillFormReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "LGe0/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements u<ObjectFillFormInternalAction, Ge0.f> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ge0.f a(ObjectFillFormInternalAction objectFillFormInternalAction, Ge0.f fVar) {
        ObjectFillFormInternalAction objectFillFormInternalAction2 = objectFillFormInternalAction;
        Ge0.f fVar2 = fVar;
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowContent) {
            return Ge0.f.a(fVar2, f.c.a(fVar2.f6688b, f.d.b.f6697a, false, null, null, false, WebSocketProtocol.PAYLOAD_SHORT), null, 2);
        }
        return objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.UpdateValidationProgress ? Ge0.f.a(fVar2, f.c.a(fVar2.f6688b, null, ((ObjectFillFormInternalAction.UpdateValidationProgress) objectFillFormInternalAction2).f240219b, null, null, false, 123), null, 2) : objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ItemsUpdate ? Ge0.f.a(fVar2, null, ((ObjectFillFormInternalAction.ItemsUpdate) objectFillFormInternalAction2).f240197b, 1) : objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.SetupObjectView ? Ge0.f.a(fVar2, f.c.a(fVar2.f6688b, null, false, ((ObjectFillFormInternalAction.SetupObjectView) objectFillFormInternalAction2).f240204b, null, false, 119), null, 2) : objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.UpdatedInstantMarketValue ? Ge0.f.a(fVar2, f.c.a(fVar2.f6688b, null, false, null, ((ObjectFillFormInternalAction.UpdatedInstantMarketValue) objectFillFormInternalAction2).f240220b, false, 95), null, 2) : objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.PriceListInputFocusChanged ? Ge0.f.a(fVar2, f.c.a(fVar2.f6688b, null, false, null, null, ((ObjectFillFormInternalAction.PriceListInputFocusChanged) objectFillFormInternalAction2).f240202b, 63), null, 2) : fVar2;
    }
}
