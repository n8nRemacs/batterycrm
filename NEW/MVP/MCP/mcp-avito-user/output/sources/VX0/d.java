package VX0;

import com.google.android.gms.common.internal.C36729v;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f17183a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final VX0.a f17184b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Executor f17185c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f17186a = new ArrayList();
    }

    public /* synthetic */ d(List list, VX0.a aVar, Executor executor, boolean z12, h hVar) {
        C36729v.k(list, "APIs must not be null.");
        C36729v.a("APIs must not be empty.", !list.isEmpty());
        if (executor != null) {
            C36729v.k(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f17183a = list;
        this.f17184b = aVar;
        this.f17185c = executor;
    }
}
