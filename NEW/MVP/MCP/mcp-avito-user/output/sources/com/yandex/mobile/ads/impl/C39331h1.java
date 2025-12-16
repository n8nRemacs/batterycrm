package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C39334i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* renamed from: com.yandex.mobile.ads.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39331h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39334i1 f385879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ArrayList f385880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Object f385881c;

    public C39331h1(@Y61.k Context context, @Y61.k C39334i1 c39334i1) {
        this.f385879a = c39334i1;
        this.f385880b = new ArrayList();
        this.f385881c = new Object();
    }

    public final void a(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        synchronized (this.f385881c) {
            this.f385880b.add(interfaceC39337j1);
            this.f385879a.b(interfaceC39337j1);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public /* synthetic */ C39331h1(Context context) {
        this(context, C39334i1.a.a(context));
    }

    public final void a() {
        List listM0;
        synchronized (this.f385881c) {
            listM0 = C42745f0.M0(this.f385880b);
            this.f385880b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            this.f385879a.a((InterfaceC39337j1) it.next());
        }
    }
}
