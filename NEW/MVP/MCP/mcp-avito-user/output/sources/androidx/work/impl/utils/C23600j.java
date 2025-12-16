package androidx.work.impl.utils;

import androidx.view.C23034e0;
import androidx.view.InterfaceC23040h0;

/* compiled from: LiveDataUtils.java */
/* renamed from: androidx.work.impl.utils.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23600j implements InterfaceC23040h0<Object> {

    /* renamed from: b, reason: collision with root package name */
    public Object f56016b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.taskexecutor.c f56017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.processing.j f56019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C23034e0 f56020f;

    /* compiled from: LiveDataUtils.java */
    /* renamed from: androidx.work.impl.utils.j$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f56021b;

        public a(Object obj) {
            this.f56021b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C23600j.this.f56018d) {
                try {
                    Object objApply = C23600j.this.f56019e.apply(this.f56021b);
                    C23600j c23600j = C23600j.this;
                    Object obj = c23600j.f56016b;
                    if (obj == null && objApply != null) {
                        c23600j.f56016b = objApply;
                        c23600j.f56020f.postValue(objApply);
                    } else if (obj != null && !obj.equals(objApply)) {
                        C23600j c23600j2 = C23600j.this;
                        c23600j2.f56016b = objApply;
                        c23600j2.f56020f.postValue(objApply);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C23600j(androidx.work.impl.utils.taskexecutor.c cVar, Object obj, androidx.camera.core.processing.j jVar, C23034e0 c23034e0) {
        this.f56017c = cVar;
        this.f56018d = obj;
        this.f56019e = jVar;
        this.f56020f = c23034e0;
    }

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(@j.P Object obj) {
        this.f56017c.b(new a(obj));
    }
}
