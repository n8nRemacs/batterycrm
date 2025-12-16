package com.avito.android.messenger.conversation.mvi.data;

import arrow.core.C23703n1;
import com.avito.android.persistence.messenger.Q1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessageRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/persistence/messenger/x2;", "messageUploadParts", "Larrow/core/Y0;", "Lkotlin/Q;", "Lcom/avito/android/persistence/messenger/Q1;", "apply", "(Ljava/util/List;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q1 f190418b;

    public H(Q1 q12) {
        this.f190418b = q12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C23703n1(new kotlin.Q(this.f190418b, (List) obj));
    }
}
