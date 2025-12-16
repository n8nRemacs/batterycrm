package com.avito.android.messenger.connection;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: AvitoMessengerKeepConnectionProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "", "errors", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lio/reactivex/rxjava3/core/z;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f188846b;

    public a(j jVar) {
        this.f188846b = jVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f188846b.f188859g.a((z) obj, "pendingMessageCount", Collections.singletonMap(ChannelContext.Item.USER_ID, ChannelContext.Item.USER_ID));
    }
}
