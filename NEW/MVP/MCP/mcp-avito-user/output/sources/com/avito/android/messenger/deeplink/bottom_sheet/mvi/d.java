package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import VY.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BottomSheetInputActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LVY/a;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "LVY/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.a<VY.a, BottomSheetInputInternalAction, VY.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UY.a f195480a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChannelBottomSheetInputLink f195481b;

    @Inject
    public d(@Y61.k UY.a aVar, @Y61.k ChannelBottomSheetInputLink channelBottomSheetInputLink) {
        this.f195480a = aVar;
        this.f195481b = channelBottomSheetInputLink;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BottomSheetInputInternalAction> b(VY.a aVar, VY.c cVar) {
        VY.a aVar2 = aVar;
        VY.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(aVar2, cVar2, null));
        }
        if (aVar2 instanceof a.C1183a) {
            return new C43152f0(C43175k.G(new b(this, aVar2, null)), new c(3, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
