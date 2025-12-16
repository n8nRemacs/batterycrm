package defpackage;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.externcalls.sdk.wt.WTSignaling$Builder$build$logger$1;

/* loaded from: classes3.dex */
public final class v87 {
    public final Duration a;
    public final WTSignaling$Builder$build$logger$1 c;
    public final xo8 d = new xo8(this);
    public final kk4 b = new kk4(22);
    public final ExecutorService e = Executors.newCachedThreadPool(new pc4("http3", 0));

    public v87(Duration duration, WTSignaling$Builder$build$logger$1 wTSignaling$Builder$build$logger$1) {
        this.a = duration;
        this.c = wTSignaling$Builder$build$logger$1;
    }
}
