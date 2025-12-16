package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MissingUsersSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;", "kotlin.jvm.PlatformType", "request", "Lkotlin/Q;", "", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194581b;

    public B0(C32293v0 c32293v0) {
        this.f194581b = c32293v0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessageBody body;
        boolean z12;
        boolean z13;
        C32293v0.c cVar = (C32293v0.c) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = cVar.f194861c.iterator();
        while (true) {
            if (!it.hasNext()) {
                V2 v22 = V2.f318762a;
                int i12 = C32293v0.f194852a0;
                v22.c(this.f194581b.f207131E, "Filtering users. Keep only unique without myself = " + linkedHashSet, null);
                return new kotlin.Q(cVar.f194860b, linkedHashSet);
            }
            LocalMessage localMessage = (LocalMessage) it.next();
            boolean z14 = false;
            if (!kotlin.jvm.internal.L.f(localMessage.getFromId(), localMessage.getUserId())) {
                MessageBody body2 = localMessage.getBody();
                if (body2 instanceof MessageBody.ItemReference ? true : body2 instanceof MessageBody.Item ? true : body2 instanceof MessageBody.LocalImage ? true : body2 instanceof MessageBody.ImageReference ? true : body2 instanceof MessageBody.ImageBody ? true : body2 instanceof MessageBody.Link ? true : body2 instanceof MessageBody.Location ? true : body2 instanceof MessageBody.Text.Regular ? true : body2 instanceof MessageBody.File ? true : body2 instanceof MessageBody.Video ? true : body2 instanceof MessageBody.Voice ? true : body2 instanceof MessageBody.Text.Reaction ? true : body2 instanceof MessageBody.Call ? true : body2 instanceof MessageBody.AppCall ? true : body2 instanceof MessageBody.Deleted ? true : body2 instanceof MessageBody.Unknown ? true : body2 instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
                    z13 = true;
                } else {
                    if (!(body2 instanceof MessageBody.SystemMessageBody.Platform.FromAvito ? true : body2 instanceof MessageBody.SystemMessageBody.Text ? true : body2 instanceof MessageBody.SystemMessageBody.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z13 = false;
                }
                if (z13) {
                    linkedHashSet.add(localMessage.getFromId());
                }
            }
            Quote quote = localMessage.getQuote();
            String fromId = quote != null ? quote.getFromId() : null;
            boolean zF2 = kotlin.jvm.internal.L.f(fromId, localMessage.getUserId());
            if (fromId != null && !zF2) {
                Quote quote2 = localMessage.getQuote();
                if (quote2 != null && (body = quote2.getBody()) != null) {
                    if (body instanceof MessageBody.ItemReference ? true : body instanceof MessageBody.Item ? true : body instanceof MessageBody.LocalImage ? true : body instanceof MessageBody.ImageReference ? true : body instanceof MessageBody.ImageBody ? true : body instanceof MessageBody.Link ? true : body instanceof MessageBody.Location ? true : body instanceof MessageBody.Text.Regular ? true : body instanceof MessageBody.File ? true : body instanceof MessageBody.Video ? true : body instanceof MessageBody.Voice ? true : body instanceof MessageBody.Text.Reaction ? true : body instanceof MessageBody.Call ? true : body instanceof MessageBody.AppCall ? true : body instanceof MessageBody.Deleted ? true : body instanceof MessageBody.Unknown ? true : body instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
                        z12 = true;
                    } else {
                        if (!(body instanceof MessageBody.SystemMessageBody.Platform.FromAvito ? true : body instanceof MessageBody.SystemMessageBody.Text ? true : body instanceof MessageBody.SystemMessageBody.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z12 = false;
                    }
                    if (z12) {
                        z14 = true;
                    }
                }
                if (z14) {
                    linkedHashSet.add(fromId);
                }
            }
        }
    }
}
