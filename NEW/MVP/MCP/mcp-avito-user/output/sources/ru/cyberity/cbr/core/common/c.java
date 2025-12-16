package ru.cyberity.cbr.core.common;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Bitap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/common/c;", "", "", "a", "Ljava/lang/String;", "pattern", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String pattern;

    /* compiled from: Bitap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/common/b;", "a", "()Lru/cyberity/cbr/core/common/b;"}, k = 3, mv = {1, 7, 1})
    final class b extends N implements Y41.a<C47846b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f432653a;

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C47846b invoke() {
            return ru.cyberity.cbr.core.common.d.a(this.f432653a.pattern, false, 2, null);
        }
    }

    /* compiled from: Bitap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.common.c$c, reason: collision with other inner class name */
    final class C12434c extends N implements Y41.l<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f432654a;

        @Y61.k
        public final Integer a(int i12) {
            return Integer.valueOf(ru.cyberity.cbr.core.common.d.a(i12, Math.min(this.f432654a.pattern.length(), 31)));
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: Bitap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    final class d extends N implements Y41.l<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f432655a;

        @Y61.k
        public final Integer a(int i12) {
            return Integer.valueOf(ru.cyberity.cbr.core.common.d.a(i12, Math.min(this.f432655a.pattern.length(), 31)));
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }
}
