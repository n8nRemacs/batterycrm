package com.avito.android.publish.start_publish;

import com.avito.android.remote.model.PublishDraftResponse;
import com.avito.android.remote.model.PublishStartInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StartPublishInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/PublishStartInfo;", "result", "Lcom/avito/android/remote/model/PublishDraftResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final w<T, R> f245443b = new w<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        PublishDraftResponse publishDraftResponse = (PublishDraftResponse) obj;
        if (publishDraftResponse instanceof PublishDraftResponse.Ok) {
            PublishDraftResponse.Ok ok2 = (PublishDraftResponse.Ok) publishDraftResponse;
            return new PublishStartInfo.UserDraft(new PublishStartInfo.UserDraft.Draft(ok2.getDraft().getSessionId()), ok2.getDialogInfo());
        }
        if (publishDraftResponse instanceof PublishDraftResponse.NotFound) {
            return PublishStartInfo.Publish.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
