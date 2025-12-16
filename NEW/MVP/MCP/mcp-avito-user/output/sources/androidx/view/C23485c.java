package androidx.view;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.view.C23484b;
import j.K;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedStateRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/c;", "", "<init>", "()V", "a", "b", "c", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23485c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f54425g = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f54427b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Bundle f54428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54429d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C23484b.C1921b f54430e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final androidx.arch.core.internal.b<String, InterfaceC1922c> f54426a = new androidx.arch.core.internal.b<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f54431f = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/c$a;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$a */
    public interface a {
        void a(@k InterfaceC23487e interfaceC23487e);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/c$b;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/c$c;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$c, reason: collision with other inner class name */
    public interface InterfaceC1922c {
        @k
        Bundle H();
    }

    static {
        new b(null);
    }

    @l
    @K
    public final Bundle a(@k String str) {
        if (!this.f54429d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f54428c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f54428c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f54428c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f54428c = null;
        }
        return bundle2;
    }

    @l
    public final InterfaceC1922c b() {
        Iterator<Map.Entry<String, InterfaceC1922c>> it = this.f54426a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC1922c> next = it.next();
            String key = next.getKey();
            InterfaceC1922c value = next.getValue();
            if (L.f(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return value;
            }
        }
        return null;
    }

    @K
    public final void c(@k String str, @k InterfaceC1922c interfaceC1922c) {
        if (this.f54426a.b(str, interfaceC1922c) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @K
    public final void d(@k Class<? extends a> cls) {
        if (!this.f54431f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C23484b.C1921b c1921b = this.f54430e;
        if (c1921b == null) {
            c1921b = new C23484b.C1921b(this);
        }
        this.f54430e = c1921b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            C23484b.C1921b c1921b2 = this.f54430e;
            if (c1921b2 != null) {
                c1921b2.f54424a.add(cls.getName());
            }
        } catch (NoSuchMethodException e12) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
        }
    }
}
