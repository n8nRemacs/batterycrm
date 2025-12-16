package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.quick_replies.QuickReply;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickReply;", "quickReplies", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "apply", "(Ljava/util/List;)Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f194115b;

    public n(Image image) {
        this.f194115b = image;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return d.a.b.InterfaceC5745a.C5746a.f194093a;
        }
        List<QuickReply> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (QuickReply quickReply : list2) {
            arrayList.add(new a.c(quickReply.getId(), this.f194115b, quickReply.getReply()));
        }
        return new d.a.b.InterfaceC5745a.c(arrayList);
    }
}
