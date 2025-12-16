package EE0;

import Y61.k;
import android.os.SystemClock;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TimeTracker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEE0/a;", "LEE0/g;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements g {
    @Inject
    public a() {
    }

    @Override // EE0.g
    public final void a(long j12, @k String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j12;
        V2.f318762a.c("AvitoResponseParserConverter", str + ": " + jElapsedRealtime, null);
    }

    @Override // EE0.g
    public final long start() {
        return SystemClock.elapsedRealtime();
    }
}
