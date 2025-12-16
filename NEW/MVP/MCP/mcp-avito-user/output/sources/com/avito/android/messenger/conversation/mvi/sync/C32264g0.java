package com.avito.android.messenger.conversation.mvi.sync;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "messages", "", "Lru/avito/messenger/api/entity/ChatMessage;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.g0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32264g0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends ChatMessage>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f194779l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32264g0(String str) {
        super(1);
        this.f194779l = str;
    }

    @Override // Y41.l
    public final Boolean invoke(List<? extends ChatMessage> list) {
        List<? extends ChatMessage> list2 = list;
        boolean z12 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.L.f(((ChatMessage) it.next()).getId(), this.f194779l)) {
                    z12 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
