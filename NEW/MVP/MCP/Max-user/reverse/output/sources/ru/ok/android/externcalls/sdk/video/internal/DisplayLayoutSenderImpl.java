package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.cdh;
import defpackage.em6;
import defpackage.hc8;
import defpackage.hd5;
import defpackage.ti1;
import defpackage.u61;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/DisplayLayoutSenderImpl;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "store", "", "Lu61;", "Lqqg;", "sender", "<init>", "(Lem6;Lem6;)V", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "condition", "applyFilter", "(Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;)V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", CallAnalyticsApiRequest.KEY_ITEMS, "sendDisplayLayouts", "(Ljava/util/Collection;)V", "Lem6;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisplayLayoutSenderImpl implements DisplayLayoutSender {
    private DisplayLayoutSender.SendFilter condition;
    private final em6 sender;
    private final em6 store;

    public DisplayLayoutSenderImpl(em6 em6Var, em6 em6Var2) {
        this.store = em6Var;
        this.sender = em6Var2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void applyFilter(DisplayLayoutSender.SendFilter condition) {
        this.condition = condition;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> items) {
        ti1 ti1Var;
        DisplayLayoutSender.SendFilter sendFilter = this.condition;
        if (sendFilter != null && !sendFilter.shouldSend()) {
            this.sender.invoke(hd5.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationDisplayLayoutItem conversationDisplayLayoutItem : items) {
            cdh type = conversationDisplayLayoutItem.getVideoTrackParticipantKey().getType();
            ConversationParticipant conversationParticipant = (ConversationParticipant) this.store.invoke(conversationDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            if (conversationParticipant != null && conversationParticipant.isUseable() && (ti1Var = conversationParticipant.getCallParticipant().a) != null) {
                hc8 hc8Var = new hc8(5);
                hc8Var.b = ti1Var;
                hc8Var.c = type;
                hc8Var.d = conversationDisplayLayoutItem.getVideoTrackParticipantKey().getMovieId();
                arrayList.add(new u61(hc8Var.u(), conversationDisplayLayoutItem.getLayout()));
            }
        }
        this.sender.invoke(arrayList);
    }
}
