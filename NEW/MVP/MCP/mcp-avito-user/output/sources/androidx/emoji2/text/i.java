package androidx.emoji2.text;

import androidx.emoji2.text.e;
import j.N;
import j.P;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
class i extends e.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.k f46114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f46115b;

    public i(e.k kVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f46114a = kVar;
        this.f46115b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.e.k
    public final void a(@P Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f46115b;
        try {
            this.f46114a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.e.k
    public final void b(@N r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f46115b;
        try {
            this.f46114a.b(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
