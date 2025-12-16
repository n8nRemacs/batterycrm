package com.avito.android.messenger.conversation.mvi.data;

import arrow.core.Z0;
import com.avito.android.persistence.messenger.O1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MessageRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/persistence/messenger/O1;", "messages", "Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Ljava/util/List;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190423b;

    public K(d0 d0Var) {
        this.f190423b = d0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        O1 o12 = (O1) C42745f0.w0((List) obj);
        return Z0.b(o12 != null ? this.f190423b.f190458e.b(o12) : null);
    }
}
