package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: InternalMutatorMutex.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/H8;", "", "<init>", "()V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<a> f34835a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f34836b = new kotlinx.coroutines.sync.d();

    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/H8$a;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MutatePriority f34837a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.N0 f34838b;

        public a(@Y61.k MutatePriority mutatePriority, @Y61.k kotlinx.coroutines.N0 n02) {
            this.f34837a = mutatePriority;
            this.f34838b = n02;
        }
    }
}
