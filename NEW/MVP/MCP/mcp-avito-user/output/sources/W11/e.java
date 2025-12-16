package w11;

import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MultiResizer.java */
/* loaded from: classes7.dex */
public class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f441154a = new ArrayList();

    @Override // w11.g
    @N
    public final com.otaliastudios.transcoder.common.b a(@N com.otaliastudios.transcoder.common.b bVar) {
        Iterator it = this.f441154a.iterator();
        while (it.hasNext()) {
            bVar = ((g) it.next()).a(bVar);
        }
        return bVar;
    }
}
