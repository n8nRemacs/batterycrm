package com.vk.push.core.ipc;

import android.os.SystemClock;
import com.vk.push.core.ipc.b;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f367029b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f367030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f367031d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(b bVar, Y41.l lVar) {
        this.f367030c = bVar;
        this.f367031d = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        switch (this.f367029b) {
            case 0:
                int i12 = b.f367032m;
                b bVar = this.f367030c;
                bVar.i().info("Sleeping 1000 ms before next bind attempt");
                SystemClock.sleep(1000L);
                b.C10839b c10839b = (b.C10839b) this.f367031d;
                T11.a aVar = c10839b.f367046a;
                boolean zD2 = bVar.d(aVar, c10839b.f367047b);
                bVar.i().info("bindService to " + aVar.f15306a + " result: " + zD2);
                if (zD2) {
                    return;
                }
                bVar.i().a("Failed to bind again. Giving up.", null);
                i iVar = new i(bVar);
                if (bVar.f367043k.isEmpty()) {
                    return;
                }
                bVar.f367042j.submit(new a(bVar, iVar));
                return;
            default:
                b bVar2 = this.f367030c;
                ?? r12 = (N) this.f367031d;
                synchronized (bVar2.f367043k) {
                    try {
                        Iterator it = bVar2.f367043k.iterator();
                        while (it.hasNext()) {
                            r12.invoke(it.next());
                        }
                        bVar2.f367043k.clear();
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ a(b bVar, b.C10839b c10839b) {
        this.f367030c = bVar;
        this.f367031d = c10839b;
    }
}
