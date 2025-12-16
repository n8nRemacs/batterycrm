package ru.cyberity.cbr.core.data.source.analythic;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;
import ru.cyberity.log.cacher.e;

/* compiled from: AnalyticRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/source/analythic/a;", "", "", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "events", "", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/log/cacher/e;", "Lru/cyberity/log/cacher/e;", "sink", "<init>", "(Lru/cyberity/log/cacher/e;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final e<List<CBRTrackEvents>> sink;

    public a(@k e<List<CBRTrackEvents>> eVar) {
        this.sink = eVar;
    }

    @l
    public final Object a(@k List<CBRTrackEvents> list, @k Continuation<? super Boolean> continuation) {
        return this.sink.send(list, continuation);
    }
}
