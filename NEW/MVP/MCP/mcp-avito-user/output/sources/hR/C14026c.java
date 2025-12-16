package Hr;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContentBagIdGenerator.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHr/c;", "LHr/b;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hr.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14026c implements InterfaceC14025b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicLong f7761a = new AtomicLong();

    @Inject
    public C14026c() {
    }

    @Override // Hr.InterfaceC14025b
    public final long a() {
        return this.f7761a.incrementAndGet();
    }
}
