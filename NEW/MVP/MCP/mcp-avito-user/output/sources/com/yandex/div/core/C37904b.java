package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CompositeDisposable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/b;", "Lcom/yandex/div/core/f;", "<init>", "()V", "div-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37904b implements InterfaceC37911f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f367283b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f367284c;

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() throws Exception {
        ArrayList arrayList = this.f367283b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC37911f) it.next()).close();
        }
        arrayList.clear();
        this.f367284c = true;
    }
}
