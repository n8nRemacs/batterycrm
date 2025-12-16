package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.m;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class k implements Callable<m.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f44831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f44832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f44833e;

    public k(String str, Context context, List list, int i12) {
        this.f44830b = str;
        this.f44831c = context;
        this.f44832d = list;
        this.f44833e = i12;
    }

    @Override // java.util.concurrent.Callable
    public final m.a call() {
        try {
            return m.b(this.f44830b, this.f44831c, this.f44832d, this.f44833e);
        } catch (Throwable unused) {
            return new m.a(-3);
        }
    }
}
