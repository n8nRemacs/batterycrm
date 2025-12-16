package com.avito.android.messenger.conversation.mvi.sync;

import arrow.core.C23703n1;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: IncompleteMessageBodyLoader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "message", "", "apply", "(Larrow/core/Y0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32261f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32261f<T, R> f194774b = new C32261f<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return C42784z0.f406748b;
        }
        if (y02 instanceof C23703n1) {
            return Collections.singletonList(((C23703n1) y02).f56288b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
