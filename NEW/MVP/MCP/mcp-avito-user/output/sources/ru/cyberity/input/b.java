package ru.cyberity.input;

import Y41.l;
import Y61.k;
import j.l0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.fingerprintingsignals.t;

/* compiled from: FingerprinterImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0010J*\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u000eH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lru/cyberity/fingerprint/b;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/t;", "fpSignalsProvider", "<init>", "(Lru/cyberity/fingerprint/fingerprintingsignals/t;)V", "Lru/cyberity/fingerprint/tools/hashers/a;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "fingerprintingSignals", "", "a", "(Lru/cyberity/fingerprint/tools/hashers/a;Ljava/util/List;)Ljava/lang/String;", "hasher", "Lkotlin/Z;", "(Lru/cyberity/fingerprint/tools/hashers/a;)Ljava/lang/Object;", "(Ljava/util/List;Lru/cyberity/fingerprint/tools/hashers/a;)Ljava/lang/Object;", "", "()Ljava/lang/Object;", "Lru/cyberity/fingerprint/fingerprintingsignals/t;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final t fpSignalsProvider;

    /* compiled from: FingerprinterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/r;", "it", "", "a", "(Lru/cyberity/fingerprint/fingerprintingsignals/r;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements l<r<?>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f435713a = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@k r<?> rVar) {
            return rVar.a();
        }
    }

    public b(@k t tVar) {
        this.fpSignalsProvider = tVar;
    }

    @k
    @l0
    public final Object a(@k ru.cyberity.input.tools.hashers.a hasher) {
        return a(this.fpSignalsProvider.H(), hasher);
    }

    @k
    @l0
    public final Object a() {
        int i12 = Z.f406624c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = this.fpSignalsProvider.H().iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((r) it.next()).d());
        }
        return linkedHashMap;
    }

    private final String a(ru.cyberity.input.tools.hashers.a aVar, List<? extends r<?>> list) {
        return aVar.a(C42745f0.O(list, "", null, null, a.f435713a, 30));
    }

    @k
    @l0
    public final Object a(@k List<? extends r<?>> fingerprintingSignals, @k ru.cyberity.input.tools.hashers.a hasher) {
        try {
            int i12 = Z.f406624c;
            return a(hasher, fingerprintingSignals);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            return new Z.b(th2);
        }
    }
}
