package com.avito.android.messenger_unread_counter.impl_module;

import X81.o;
import X81.q;
import X81.t;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.r;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: UnreadChatsCounterSyncAgent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f197714b;

    public c(d dVar, String str) {
        this.f197714b = str;
    }

    @Override // l41.r
    public final boolean test(@Y61.k Object obj) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" shouldTriggerUpdate ");
        sb2.append(obj);
        v22.c("UnreadChatsCounterSyncAgent", sb2.toString(), null);
        if (!(obj instanceof ChatMessage)) {
            if (!(obj instanceof o ? true : obj instanceof t ? true : obj instanceof q ? true : obj instanceof X81.g ? true : obj instanceof X81.a ? true : obj instanceof X81.b)) {
                return false;
            }
        } else if (L.f(((ChatMessage) obj).getFromId(), this.f197714b)) {
            return false;
        }
        return true;
    }
}
