package Cd0;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddItemEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LCd0/r;", "LQc/f;", "a", "b", "c", "d", "LCd0/r$a;", "LCd0/r$b;", "LCd0/r$c;", "LCd0/r$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class r implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f2465b;

    /* compiled from: AddItemEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCd0/r$a;", "LCd0/r;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends r {
        public a() {
            super(2, null);
        }
    }

    /* compiled from: AddItemEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCd0/r$b;", "LCd0/r;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends r {
        public b() {
            super(4, null);
        }
    }

    /* compiled from: AddItemEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCd0/r$c;", "LCd0/r;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends r {
        public c() {
            super(1, null);
        }
    }

    /* compiled from: AddItemEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCd0/r$d;", "LCd0/r;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends r {
        public d() {
            super(3, null);
        }
    }

    public r(int i12, C42822w c42822w) {
        this.f2465b = Qc.h.a("AddItem", Collections.singletonMap("step", String.valueOf(i12)));
    }

    @Override // Qc.f
    @Y61.k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f2465b.f13936b;
    }

    @Override // Qc.f
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f2465b.f13937c;
    }
}
