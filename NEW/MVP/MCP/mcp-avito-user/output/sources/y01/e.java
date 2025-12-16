package Y01;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.s;

/* compiled from: Serializer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LY01/e;", "", "<init>", "()V", "a", "b", "LY01/e$b;", "LY01/e$a;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class e {

    /* compiled from: Serializer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY01/e$a;", "LY01/e;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
    public static final class a extends e {
    }

    /* compiled from: Serializer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY01/e$b;", "LY01/e;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC43443a f19257a;

        public b(@k AbstractC43443a abstractC43443a) {
            super(null);
            this.f19257a = abstractC43443a;
        }

        public final s a() {
            return this.f19257a;
        }
    }

    public e() {
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }
}
