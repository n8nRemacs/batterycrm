package ru.cyberity.input.infoproviders;

import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: CpuInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/k;", "Lru/cyberity/fingerprint/infoproviders/j;", "", "", "d", "a", "b", "", "c", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k implements j {

    /* compiled from: CpuInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f436022a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.SUPPORTED_ABIS[0];
        }
    }

    /* compiled from: CpuInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f436023a = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    /* compiled from: CpuInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<Map<String, ? extends String>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke() {
            return k.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> d() {
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
        while (scanner.hasNextLine()) {
            List listF0 = C43066x.f0(scanner.nextLine(), new String[]{": "}, 0, 6);
            if (listF0.size() > 1) {
                String str = (String) listF0.get(0);
                int length = str.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    boolean z13 = L.g(str.charAt(!z12 ? i12 : length), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length--;
                    } else if (z13) {
                        i12++;
                    } else {
                        z12 = true;
                    }
                }
                String string = str.subSequence(i12, length + 1).toString();
                String str2 = (String) listF0.get(1);
                int length2 = str2.length() - 1;
                int i13 = 0;
                boolean z14 = false;
                while (i13 <= length2) {
                    boolean z15 = L.g(str2.charAt(!z14 ? i13 : length2), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        }
                        length2--;
                    } else if (z15) {
                        i13++;
                    } else {
                        z14 = true;
                    }
                }
                map.put(string, str2.subSequence(i13, length2 + 1).toString());
            }
        }
        return map;
    }

    @Override // ru.cyberity.input.infoproviders.j
    @Y61.k
    public String b() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, a.f436022a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.j
    public int c() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, b.f436023a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = 0;
        }
        return ((Number) objA).intValue();
    }

    @Override // ru.cyberity.input.infoproviders.j
    @Y61.k
    public Map<String, String> a() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new c(), 1, null);
        Map mapC = P0.c();
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = mapC;
        }
        return (Map) objA;
    }
}
