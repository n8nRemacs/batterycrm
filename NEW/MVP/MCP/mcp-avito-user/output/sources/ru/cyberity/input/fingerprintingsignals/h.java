package ru.cyberity.input.fingerprintingsignals;

import Y41.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ru.cyberity.input.fingerprintingsignals.r;
import ru.cyberity.input.infoproviders.w;
import ru.cyberity.input.signalproviders.StabilityLevel;

/* compiled from: FingerprintingSignals.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/h;", "Lru/cyberity/fingerprint/fingerprintingsignals/r;", "", "Lru/cyberity/fingerprint/infoproviders/w;", "value", "<init>", "(Ljava/util/List;)V", "", "a", "()Ljava/lang/String;", "", "d", "()Ljava/util/Map;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class h extends r<List<? extends w>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final r.a f435760c = new r.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<w> value;

    /* compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/fingerprint/fingerprintingsignals/h$a;", "", "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", RequestReviewResultKt.INFO_TYPE, "Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "a", "()Lru/cyberity/fingerprint/fingerprintingsignals/r$a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.fingerprintingsignals.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final r.a a() {
            return h.f435760c;
        }

        private Companion() {
        }
    }

    public h(@k List<w> list) {
        super(null);
        this.value = list;
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (w wVar : f()) {
            sb2.append(wVar.getName());
            Iterator<T> it = wVar.c().iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
        }
        return sb2.toString();
    }

    @Override // ru.cyberity.input.fingerprintingsignals.r
    @k
    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Object obj : f()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            w wVar = (w) obj;
            linkedHashMap.put(G.e(i12, "codec_info.", ".name"), wVar.getName());
            linkedHashMap.put("codec_info." + i12 + ".capabilities", C42745f0.O(wVar.c(), null, null, null, b.f435762a, 31));
            i12 = i13;
        }
        return linkedHashMap;
    }

    @k
    public List<w> f() {
        return this.value;
    }

    /* compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f435762a = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@k String str) {
            return str;
        }
    }
}
