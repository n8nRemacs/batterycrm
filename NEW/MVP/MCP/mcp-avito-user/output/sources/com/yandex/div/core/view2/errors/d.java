package com.yandex.div.core.view2.errors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: ErrorCollector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/errors/d;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f369066a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369067b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369068c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369069d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369070e = new ArrayList();

    public final void a(@Y61.k RuntimeException runtimeException) {
        this.f369067b.add(runtimeException);
        c();
    }

    public final void b(@Y61.k Throwable th2) {
        this.f369070e.add(th2);
        c();
    }

    public final void c() {
        ArrayList arrayList = this.f369069d;
        arrayList.clear();
        arrayList.addAll(this.f369068c);
        arrayList.addAll(this.f369067b);
        Iterator it = this.f369066a.iterator();
        while (it.hasNext()) {
            ((Y41.p) it.next()).invoke(arrayList, this.f369070e);
        }
    }
}
