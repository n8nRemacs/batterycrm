package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import RN0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.entity.CreateInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreateOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "LRN0/b;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements t<CreateInternalAction, RN0.b> {
    @Inject
    public f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final RN0.b b(CreateInternalAction createInternalAction) {
        CreateInternalAction createInternalAction2 = createInternalAction;
        if (createInternalAction2 instanceof CreateInternalAction.ClientSelected) {
            return new b.a(((CreateInternalAction.ClientSelected) createInternalAction2).f326859b);
        }
        PN0.a aVar = null;
        Object[] objArr = 0;
        if (createInternalAction2.equals(CreateInternalAction.CloseClicked.f326860b)) {
            return new b.a(aVar, 1, objArr == true ? 1 : 0);
        }
        if (createInternalAction2 instanceof CreateInternalAction.SubmitFailure) {
            return new b.C0963b(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_client_creation_client_error, new Serializable[0]));
        }
        if (createInternalAction2 instanceof CreateInternalAction.LoadingSuggestError) {
            return new b.C0963b(com.avito.android.printable_text.b.c(R.string.virtual_deal_room_client_creation_client_error, new Serializable[0]));
        }
        if (createInternalAction2 instanceof CreateInternalAction.SubmitSuccess) {
            return new b.a(((CreateInternalAction.SubmitSuccess) createInternalAction2).f326871b);
        }
        return null;
    }
}
