package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final UUID f55432a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C23544h f55433b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final HashSet f55434c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final a f55435d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55436e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final ExecutorService f55437f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final kotlinx.coroutines.M f55438g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final androidx.work.impl.utils.taskexecutor.c f55439h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final C23634s f55440i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final T f55441j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final InterfaceC23639x f55442k;

    /* renamed from: l, reason: collision with root package name */
    public final int f55443l;

    @RestrictTo
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public List<String> f55444a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public List<Uri> f55445b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        @j.P
        @j.X
        public Network f55446c;
    }

    @RestrictTo
    public WorkerParameters(@j.N UUID uuid, @j.N C23544h c23544h, @j.N AbstractCollection abstractCollection, @j.N a aVar, @j.F int i12, @j.F int i13, @j.N ExecutorService executorService, @j.N kotlinx.coroutines.M m12, @j.N androidx.work.impl.utils.taskexecutor.c cVar, @j.N C23634s c23634s, @j.N T t12, @j.N InterfaceC23639x interfaceC23639x) {
        this.f55432a = uuid;
        this.f55433b = c23544h;
        this.f55434c = new HashSet(abstractCollection);
        this.f55435d = aVar;
        this.f55436e = i12;
        this.f55443l = i13;
        this.f55437f = executorService;
        this.f55438g = m12;
        this.f55439h = cVar;
        this.f55440i = c23634s;
        this.f55441j = t12;
        this.f55442k = interfaceC23639x;
    }
}
