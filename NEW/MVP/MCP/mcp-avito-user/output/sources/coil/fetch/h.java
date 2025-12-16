package coil.fetch;

import coil.request.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Fetcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/fetch/h;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface h {

    /* compiled from: Fetcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/fetch/h$a;", "", "T", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<T> {
        @Y61.l
        h a(@Y61.k Object obj, @Y61.k t tVar);
    }

    @Y61.l
    Object b(@Y61.k Continuation<? super g> continuation);
}
