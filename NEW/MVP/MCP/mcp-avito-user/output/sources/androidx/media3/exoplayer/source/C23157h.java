package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.source.C23158i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.source.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23157h implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC23154e f49764c;

    public /* synthetic */ C23157h(AbstractC23154e abstractC23154e, int i12) {
        this.f49763b = i12;
        this.f49764c = abstractC23154e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f49763b) {
            case 0:
                androidx.media3.common.z zVar = C23158i.f49765o;
                C23158i c23158i = (C23158i) this.f49764c;
                c23158i.getClass();
                int i12 = message.what;
                if (i12 == 0) {
                    Object obj = message.obj;
                    int i13 = androidx.media3.common.util.M.f47887a;
                    ((C23158i.f) obj).getClass();
                    throw null;
                }
                if (i12 == 1) {
                    Object obj2 = message.obj;
                    int i14 = androidx.media3.common.util.M.f47887a;
                    ((C23158i.f) obj2).getClass();
                    throw null;
                }
                if (i12 == 2) {
                    Object obj3 = message.obj;
                    int i15 = androidx.media3.common.util.M.f47887a;
                    S s5 = c23158i.f49768n;
                    ((C23158i.f) obj3).getClass();
                    c23158i.f49768n = s5.f(0, 1);
                    throw null;
                }
                if (i12 == 3) {
                    Object obj4 = message.obj;
                    int i16 = androidx.media3.common.util.M.f47887a;
                    ((C23158i.f) obj4).getClass();
                    c23158i.f49768n = null;
                    if (!c23158i.f49767m) {
                        c23158i.f49766l.obtainMessage(4).sendToTarget();
                        c23158i.f49767m = true;
                    }
                    return true;
                }
                if (i12 == 4) {
                    c23158i.f49767m = false;
                    new HashSet();
                    new C23158i.b(c23158i.f49768n);
                    throw null;
                }
                if (i12 != 5) {
                    throw new IllegalStateException();
                }
                Object obj5 = message.obj;
                int i17 = androidx.media3.common.util.M.f47887a;
                Set set = (Set) obj5;
                synchronized (c23158i) {
                    try {
                        Iterator it = set.iterator();
                        if (!it.hasNext()) {
                            throw null;
                        }
                        ((C23158i.d) it.next()).getClass();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                C23159j c23159j = (C23159j) this.f49764c;
                c23159j.getClass();
                if (message.what == 0) {
                    c23159j.f49773p = false;
                    c23159j.z(c23159j.M());
                }
                return true;
        }
    }
}
