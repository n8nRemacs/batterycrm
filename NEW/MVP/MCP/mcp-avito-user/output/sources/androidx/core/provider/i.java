package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class i implements Callable<m.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f44826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f44827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f44828e;

    public i(String str, Context context, h hVar, int i12) {
        this.f44825b = str;
        this.f44826c = context;
        this.f44827d = hVar;
        this.f44828e = i12;
    }

    @Override // java.util.concurrent.Callable
    public final m.a call() {
        Object[] objArr = {this.f44827d};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return m.b(this.f44825b, this.f44826c, Collections.unmodifiableList(arrayList), this.f44828e);
    }
}
