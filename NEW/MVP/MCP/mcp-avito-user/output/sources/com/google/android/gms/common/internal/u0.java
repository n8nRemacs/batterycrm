package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public Boolean f349467a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f349468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e f349469c;

    public u0(AbstractC36699e abstractC36699e) {
        Boolean bool = Boolean.TRUE;
        this.f349469c = abstractC36699e;
        this.f349467a = bool;
        this.f349468b = false;
    }

    public abstract void a();

    public final void b() {
        synchronized (this) {
            this.f349467a = null;
        }
        synchronized (this.f349469c.f349415s) {
            this.f349469c.f349415s.remove(this);
        }
    }
}
