package wX0;

import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.databind.p;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SimpleModule.java */
/* loaded from: classes4.dex */
public class d extends p implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f441536b = new AtomicInteger(1);
    private static final long serialVersionUID = 1;

    public d() {
        if (getClass() == d.class) {
            f441536b.getAndIncrement();
        }
        int i12 = q.f341215h;
    }
}
