package s71;

import Y61.k;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.koin.core.logger.Level;

/* compiled from: PrintLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls71/d;", "Ls71/b;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d extends AbstractC48011b {

    /* renamed from: b, reason: collision with root package name */
    public final PrintStream f437493b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // s71.AbstractC48011b
    public final void a(@k Level level, @k String str) {
        this.f437493b.println("[" + level + "] [Koin] " + str);
    }

    public d(@k Level level) {
        super(level);
        this.f437493b = level.compareTo(Level.f421467d) >= 0 ? System.err : System.out;
    }

    public /* synthetic */ d(Level level, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Level.f421466c : level);
    }
}
