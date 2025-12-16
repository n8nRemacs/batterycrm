package ru.cyberity.cbr.core.data.source.log;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.cyberity.cbr.core.data.model.LogParams;
import ru.cyberity.cbr.core.data.model.LogType;
import ru.cyberity.cbr.core.data.source.applicant.remote.f;

/* compiled from: LogRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/log/a;", "", "Lru/cyberity/cbr/core/data/model/LogType;", "type", "Lru/cyberity/cbr/core/data/model/LogParams;", "params", "Lru/cyberity/cbr/core/data/source/applicant/remote/f;", "a", "(Lru/cyberity/cbr/core/data/model/LogType;Lru/cyberity/cbr/core/data/model/LogParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a {
    @l
    Object a(@k LogType logType, @k LogParams logParams, @k Continuation<? super f> continuation);
}
