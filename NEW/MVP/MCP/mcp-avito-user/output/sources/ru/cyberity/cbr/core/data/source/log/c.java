package ru.cyberity.cbr.core.data.source.log;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.cyberity.cbr.core.data.model.LogParams;
import ru.cyberity.cbr.core.data.model.LogType;
import ru.cyberity.cbr.core.data.model.s;
import ru.cyberity.cbr.core.data.source.applicant.remote.f;

/* compiled from: RealLogRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/source/log/c;", "Lru/cyberity/cbr/core/data/source/log/a;", "Lru/cyberity/cbr/core/data/model/LogType;", "type", "Lru/cyberity/cbr/core/data/model/LogParams;", "params", "Lru/cyberity/cbr/core/data/source/applicant/remote/f;", "a", "(Lru/cyberity/cbr/core/data/model/LogType;Lru/cyberity/cbr/core/data/model/LogParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/log/b;", "Lru/cyberity/cbr/core/data/source/log/b;", "remote", "<init>", "(Lru/cyberity/cbr/core/data/source/log/b;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final b remote;

    public c(@k b bVar) {
        this.remote = bVar;
    }

    @Override // ru.cyberity.cbr.core.data.source.log.a
    @l
    public Object a(@k LogType logType, @k LogParams logParams, @k Continuation<? super f> continuation) {
        return this.remote.a(logType.getValue(), s.a(logParams), continuation);
    }
}
