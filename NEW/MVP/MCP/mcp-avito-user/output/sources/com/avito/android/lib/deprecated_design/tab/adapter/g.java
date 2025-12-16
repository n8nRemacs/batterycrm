package com.avito.android.lib.deprecated_design.tab.adapter;

import android.content.Context;
import android.database.DataSetObservable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import j.I;
import kotlin.Metadata;

/* compiled from: TabAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/i;", "TIV", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g<T, TIV extends i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j<T> f178152a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178153b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f178154c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DataSetObservable f178155d = new DataSetObservable();

    public g(@Y61.k j<T> jVar, @Y61.k Context context, @I int i12) {
        this.f178152a = jVar;
        this.f178153b = i12;
        this.f178154c = LayoutInflater.from(context);
    }

    public abstract void a(@Y61.k TIV tiv, T t12);

    @Y61.k
    public abstract TIV b(@Y61.k View view);

    @Y61.k
    public final TIV c(int i12) {
        T item = this.f178152a.getItem(i12);
        TIV tiv = (TIV) b(this.f178154c.inflate(this.f178153b, (ViewGroup) null, false));
        a(tiv, item);
        return tiv;
    }

    public final void d() {
        this.f178155d.notifyChanged();
    }

    @Y61.k
    public i e(@Y61.k i iVar, int i12) {
        return c(i12);
    }
}
