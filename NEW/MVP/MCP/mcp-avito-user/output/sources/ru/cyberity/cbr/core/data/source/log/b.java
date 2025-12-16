package ru.cyberity.cbr.core.data.source.log;

import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.cyberity.cbr.core.data.source.applicant.remote.f;

/* compiled from: LogService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/log/b;", "", "", "type", "", "data", "Lru/cyberity/cbr/core/data/source/applicant/remote/f;", "a", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface b {
    @o("resources/serviceLogger/{type}")
    @l
    Object a(@s("type") @k String str, @J81.a @k Map<String, String> map, @k Continuation<? super f> continuation);
}
