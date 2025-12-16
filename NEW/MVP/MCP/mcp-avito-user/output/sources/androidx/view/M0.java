package androidx.view;

import A1.h;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import j.K;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ViewModel.jvm.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0017\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/M0;", "", "<init>", "()V", "", "Ljava/io/Closeable;", "closeables", "([Ljava/io/Closeable;)V", "Lkotlin/G0;", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", "key", "Ljava/lang/AutoCloseable;", BeduinPromoBlockModel.SERIALIZED_NAME_CLOSEABLE, "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "LA1/h;", "impl", "LA1/h;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class M0 {

    @l
    private final h impl;

    public M0() {
        this.impl = new h();
    }

    public final void addCloseable(@k String key, @k AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        h hVar = this.impl;
        if (hVar != null) {
            if (hVar.f42d) {
                h.a(closeable);
                return;
            }
            synchronized (hVar.f39a) {
                autoCloseable = (AutoCloseable) hVar.f40b.put(key, closeable);
            }
            h.a(autoCloseable);
        }
    }

    @K
    public final void clear$lifecycle_viewmodel_release() {
        h hVar = this.impl;
        if (hVar != null && !hVar.f42d) {
            hVar.f42d = true;
            synchronized (hVar.f39a) {
                try {
                    Iterator it = hVar.f40b.values().iterator();
                    while (it.hasNext()) {
                        h.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = hVar.f41c.iterator();
                    while (it2.hasNext()) {
                        h.a((AutoCloseable) it2.next());
                    }
                    hVar.f41c.clear();
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        onCleared();
    }

    @l
    public final <T extends AutoCloseable> T getCloseable(@k String key) {
        T t12;
        h hVar = this.impl;
        if (hVar == null) {
            return null;
        }
        synchronized (hVar.f39a) {
            t12 = (T) hVar.f40b.get(key);
        }
        return t12;
    }

    public void addCloseable(@k AutoCloseable closeable) {
        h hVar = this.impl;
        if (hVar != null) {
            if (hVar.f42d) {
                h.a(closeable);
                return;
            }
            synchronized (hVar.f39a) {
                hVar.f41c.add(closeable);
                G0 g02 = G0.f406611a;
            }
        }
    }

    public void onCleared() {
    }
}
