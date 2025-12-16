package CX0;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2219c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final List<LogEventDropped> f2221b;

    /* compiled from: LogSourceMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f2222a = "";

        /* renamed from: b, reason: collision with root package name */
        public List<LogEventDropped> f2223b = new ArrayList();
    }

    static {
        Collections.unmodifiableList(new a().f2223b);
    }

    public c(String str, List<LogEventDropped> list) {
        this.f2220a = str;
        this.f2221b = list;
    }
}
