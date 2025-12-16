package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.C37632a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class u extends PhantomReference implements C37632a.InterfaceC10741a {

    /* renamed from: b, reason: collision with root package name */
    public final Set f362389b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f362390c;

    public /* synthetic */ u(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, t tVar) {
        super(obj, referenceQueue);
        this.f362389b = set;
        this.f362390c = runnable;
    }
}
