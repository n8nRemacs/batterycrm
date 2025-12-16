package com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;
import l41.o;
import ru.avito.messenger.api.entity.AddQuickReplyResponse;

/* compiled from: AddQuickReplyElementProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/AddQuickReplyResponse;", "response", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/api/entity/AddQuickReplyResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f191726b;

    public a(c cVar) {
        this.f191726b = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String message;
        AddQuickReplyResponse addQuickReplyResponse = (AddQuickReplyResponse) obj;
        boolean isSuccess = addQuickReplyResponse.getIsSuccess();
        c cVar = this.f191726b;
        if (isSuccess) {
            cVar.f191729b.f9();
        } else {
            AddQuickReplyResponse.Error error = addQuickReplyResponse.getError();
            if (error == null || (message = error.getMessage()) == null || !(!C43066x.K(message))) {
                throw new IllegalStateException("Error response with no message");
            }
            cVar.f191729b.G4(addQuickReplyResponse.getError().getMessage());
        }
        return G0.f406611a;
    }
}
