package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MessageBodyResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "resolvedMessages", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final H<T, R> f194591b = new H<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return (LocalMessage) C42745f0.u0((List) obj);
    }
}
