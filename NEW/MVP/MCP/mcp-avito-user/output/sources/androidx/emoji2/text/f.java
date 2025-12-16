package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.e;
import androidx.emoji2.text.k;
import j.N;
import j.P;
import java.util.ArrayList;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
class f extends e.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.b f46084a;

    public f(e.b bVar) {
        this.f46084a = bVar;
    }

    @Override // androidx.emoji2.text.e.k
    public final void a(@P Throwable th2) {
        this.f46084a.f46078a.i(th2);
    }

    @Override // androidx.emoji2.text.e.k
    public final void b(@N r rVar) {
        e.b bVar = this.f46084a;
        bVar.f46077c = rVar;
        r rVar2 = bVar.f46077c;
        e eVar = bVar.f46078a;
        bVar.f46076b = new l(rVar2, eVar.f46073g, eVar.f46075i, Build.VERSION.SDK_INT >= 34 ? k.a.a() : k.b.a());
        e eVar2 = bVar.f46078a;
        eVar2.getClass();
        ArrayList arrayList = new ArrayList();
        eVar2.f46067a.writeLock().lock();
        try {
            eVar2.f46069c = 1;
            arrayList.addAll(eVar2.f46068b);
            eVar2.f46068b.clear();
            eVar2.f46067a.writeLock().unlock();
            eVar2.f46070d.post(new e.h(arrayList, eVar2.f46069c, null));
        } catch (Throwable th2) {
            eVar2.f46067a.writeLock().unlock();
            throw th2;
        }
    }
}
