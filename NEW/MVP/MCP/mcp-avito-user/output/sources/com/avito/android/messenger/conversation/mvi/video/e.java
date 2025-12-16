package com.avito.android.messenger.conversation.mvi.video;

import com.avito.android.messenger.conversation.mvi.video.b;
import com.avito.android.messenger.conversation.mvi.video.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/c$a;", "internalState", "Lcom/avito/android/messenger/conversation/mvi/video/b$b;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/video/c$a;)Lcom/avito/android/messenger/conversation/mvi/video/b$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f194996b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        c.a aVar = (c.a) obj;
        if (aVar instanceof c.a.b) {
            throw new IllegalStateException("Wrong compression state");
        }
        if (aVar instanceof c.a.C5758a) {
            return b.AbstractC5756b.a.f194886a;
        }
        if (aVar instanceof c.a.C5759c) {
            return new b.AbstractC5756b.C5757b(((c.a.C5759c) aVar).f194892a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
