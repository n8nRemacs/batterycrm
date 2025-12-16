package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import com.avito.android.remote.model.messenger.quick_replies.QuickReply;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: QuickRepliesPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickReply;", "it", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickRepliesResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final l<T, R> f194112b = new l<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List<QuickReply> replies = ((QuickRepliesResponse) obj).getReplies();
        return replies == null ? C42784z0.f406748b : replies;
    }
}
