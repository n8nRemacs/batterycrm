package com.yandex.div.core.view2;

import com.yandex.div2.H0;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ViewBindingProvider.kt */
@com.yandex.div.core.dagger.A
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/e0;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public C38023e f369056a = new C38023e(null, q21.c.f428994b);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369057b = new ArrayList();

    @Inject
    public e0() {
    }

    public final void a(@Y61.l H0 h02, @Y61.k q21.c cVar) {
        if (cVar.equals(this.f369056a.f369054a) && kotlin.jvm.internal.L.f(this.f369056a.f369055b, h02)) {
            return;
        }
        this.f369056a = new C38023e(h02, cVar);
        Iterator it = this.f369057b.iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(this.f369056a);
        }
    }
}
