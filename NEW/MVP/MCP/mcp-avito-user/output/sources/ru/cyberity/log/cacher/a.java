package ru.cyberity.log.cacher;

import Y61.k;
import Y61.l;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CachableSink.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\fø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/cyberity/log/cacher/a;", "Payload", "Lru/cyberity/log/cacher/c;", "value", "Ljava/io/OutputStream;", "outputStream", "Lkotlin/G0;", "a", "(Ljava/lang/Object;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/InputStream;", "inputStream", "", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a<Payload> extends c<Payload> {
    @l
    Object a(@k InputStream inputStream, @k Continuation<? super Boolean> continuation);

    @l
    Object a(Payload payload, @k OutputStream outputStream, @k Continuation<? super G0> continuation);
}
