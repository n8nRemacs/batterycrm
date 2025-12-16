package com.google.android.play.core.splitinstall.internal;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @j.B
    public final HashSet f358796a = new HashSet();

    public final synchronized void a(Object obj) {
        Iterator it = this.f358796a.iterator();
        while (it.hasNext()) {
            ((MY0.a) it.next()).a(obj);
        }
    }
}
