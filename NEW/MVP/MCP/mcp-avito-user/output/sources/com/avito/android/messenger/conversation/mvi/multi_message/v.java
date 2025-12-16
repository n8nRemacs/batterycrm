package com.avito.android.messenger.conversation.mvi.multi_message;

import androidx.compose.runtime.internal.P;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: MultiMessageStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/v;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/u;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f193768a;

    /* compiled from: MultiMessageStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/v$a;", "", "<init>", "()V", "", "MULTI_MESSAGE_BANNER_SHOW_TIME_KEY", "Ljava/lang/String;", "MULTI_MESSAGE_SHOWED_FOR_ITEM_ID_KEY", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public v(@Y61.k AK0.l lVar) {
        this.f193768a = lVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.u
    public final boolean a(long j12) {
        Set<String> setF = this.f193768a.f("MULTI_MESSAGE_SHOWED_FOR_ITEM_ID_KEY");
        if (setF == null) {
            setF = B0.f406639b;
        }
        return setF.contains(String.valueOf(j12));
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.u
    public final void b(long j12) {
        AK0.l lVar = this.f193768a;
        Set<String> setF = lVar.f("MULTI_MESSAGE_SHOWED_FOR_ITEM_ID_KEY");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(String.valueOf(j12));
        lVar.putStringSet("MULTI_MESSAGE_SHOWED_FOR_ITEM_ID_KEY", linkedHashSetO0);
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.u
    public final long c() {
        return this.f193768a.getLong("MULTI_MESSAGE_BANNER_SHOW_TIME_KEY", 0L);
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.u
    public final void d(long j12) {
        this.f193768a.putLong("MULTI_MESSAGE_BANNER_SHOW_TIME_KEY", j12);
    }
}
