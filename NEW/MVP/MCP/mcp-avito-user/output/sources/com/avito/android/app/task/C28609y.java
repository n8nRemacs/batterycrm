package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: EmptyChatsCleaner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestReviewResultKt.INFO_TYPE, "Lru/avito/messenger/MessengerUserHashInfo;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28609y<T> implements l41.r {
    static {
        new C28609y();
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return ru.avito.messenger.o0.b((MessengerUserHashInfo) obj);
    }
}
