package s71;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.koin.core.logger.Level;

/* compiled from: Logger.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls71/b;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s71.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC48011b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Level f437492a;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC48011b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public abstract void a(@k Level level, @k String str);

    public final boolean b(@k Level level) {
        return this.f437492a.compareTo(level) <= 0;
    }

    public AbstractC48011b(@k Level level) {
        this.f437492a = level;
    }

    public /* synthetic */ AbstractC48011b(Level level, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Level.f421466c : level);
    }
}
