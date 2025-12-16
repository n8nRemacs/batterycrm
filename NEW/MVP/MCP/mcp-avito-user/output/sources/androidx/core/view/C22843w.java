package androidx.core.view;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22843w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f45092a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<C> f45093b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f45094c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* renamed from: androidx.core.view.w$a */
    public static class a {
    }

    public C22843w(@j.N Runnable runnable) {
        this.f45092a = runnable;
    }

    public final void a(@j.N C c12) {
        this.f45093b.remove(c12);
        if (((a) this.f45094c.remove(c12)) != null) {
            throw null;
        }
        this.f45092a.run();
    }
}
