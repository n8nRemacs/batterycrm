package com.avito.android.push.rustore;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: RuStoreInitBlockingTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/rustore/e;", "LUa1/b;", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements Ua1.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f246091a;

    public e(@Y61.k String str) {
        this.f246091a = str;
    }

    @Override // T11.f
    public final void a(@Y61.k String str, @Y61.l Throwable th2) {
        V2.f318762a.j(this.f246091a, str, th2);
    }

    @Override // T11.f
    public final T11.f b(String str) {
        return str.equals(this.f246091a) ? this : new e(str);
    }

    @Override // T11.f
    @Y61.k
    public final T11.f c(@Y61.k Object obj) {
        return b(obj.getClass().getSimpleName());
    }

    @Override // T11.f
    public final void d() {
        V2.f318762a.c(this.f246091a, "Remove last message from recently received", null);
    }

    @Override // T11.f
    public final void error(@Y61.k String str, @Y61.l Throwable th2) {
        V2 v22 = V2.f318762a;
        if (th2 == null) {
            th2 = new Exception("Exception stub");
        }
        v22.a(this.f246091a, str, th2);
    }

    @Override // T11.f
    public final void info(@Y61.k String str) {
        V2.f318762a.g(this.f246091a, str);
    }
}
