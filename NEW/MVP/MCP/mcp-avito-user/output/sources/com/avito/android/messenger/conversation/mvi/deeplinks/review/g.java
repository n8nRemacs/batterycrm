package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.messenger.conversation.mvi.deeplinks.review.f;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.RequestReviewResult;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RequestReviewLinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/messenger/RequestReviewResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f190663b;

    public g(f fVar) {
        this.f190663b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        f fVar = this.f190663b;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                f.k(fVar, new f.a.C5640a(new a(z.k(error.getError()), error.getError(), null, 4, null)));
                return;
            }
            return;
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        String type = ((RequestReviewResult) success.getResult()).getMessage().getType();
        if (!L.f(type, RequestReviewResultKt.INFO_TYPE)) {
            if (L.f(type, "error")) {
                f.k(fVar, new f.a.C5640a(new a(((RequestReviewResult) success.getResult()).getMessage().getText(), null, null, 6, null)));
            }
        } else {
            f.a.b bVar = new f.a.b(((RequestReviewResult) success.getResult()).getMessage().getText());
            String str = bVar.f190662b;
            if (str != null) {
                a.i.C4057a.e(fVar.f190658h, str, f.a.f125253a, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            }
            fVar.j(bVar);
        }
    }
}
