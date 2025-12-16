package com.avito.android.image_loader.fresco;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.avito.android.util.InterfaceC35874q1;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FrescoMemoryTrimmableRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/image_loader/fresco/h;", "LwW0/c;", "Landroid/content/ComponentCallbacks2;", "Lcom/avito/android/util/q1$a;", "<init>", "()V", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements wW0.c, ComponentCallbacks2, InterfaceC35874q1.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f169542b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f169543c;

    @Override // com.avito.android.util.InterfaceC35874q1.a
    public final void a() {
        this.f169543c = true;
    }

    @Override // wW0.c
    public final void b(@Y61.k wW0.b bVar) {
        this.f169542b.add(bVar);
    }

    @Override // com.avito.android.util.InterfaceC35874q1.a
    public final void c() {
        this.f169543c = false;
        d(MemoryTrimType.f339831e);
    }

    public final void d(MemoryTrimType memoryTrimType) {
        Iterator it = this.f169542b.iterator();
        while (it.hasNext()) {
            ((wW0.b) it.next()).c(memoryTrimType);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (this.f169543c) {
            d(MemoryTrimType.f339829c);
        } else {
            d(MemoryTrimType.f339830d);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        if (i12 != 15) {
            if (i12 != 40) {
                return;
            }
            c();
        } else if (this.f169543c) {
            d(MemoryTrimType.f339829c);
        } else {
            d(MemoryTrimType.f339830d);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
    }
}
