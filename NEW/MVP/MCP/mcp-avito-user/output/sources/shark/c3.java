package shark;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okio.C44802l;

/* compiled from: RandomAccessHprofReader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/c3;", "Ljava/io/Closeable;", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c3 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f438262e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final C44802l f438263b;

    /* renamed from: c, reason: collision with root package name */
    public final C48349u2 f438264c;

    /* renamed from: d, reason: collision with root package name */
    public final d3 f438265d;

    /* compiled from: RandomAccessHprofReader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/c3$a;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public c3(d3 d3Var, C48236b2 c48236b2, C42822w c42822w) {
        this.f438265d = d3Var;
        C44802l c44802l = new C44802l();
        this.f438263b = c44802l;
        this.f438264c = new C48349u2(c48236b2, c44802l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f438265d.close();
    }
}
