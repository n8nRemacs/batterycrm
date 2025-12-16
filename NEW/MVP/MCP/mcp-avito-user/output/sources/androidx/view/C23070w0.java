package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.C23066u0;
import androidx.view.C23485c;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SavedStateHandleSupport.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/w0;", "Landroidx/savedstate/c$c;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23070w0 implements C23485c.InterfaceC1922c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C23485c f46909a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46910b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Bundle f46911c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f46912d;

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/x0;", "invoke", "()Landroidx/lifecycle/x0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.w0$a */
    public static final class a extends N implements Y41.a<C23072x0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T0 f46913l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T0 t02) {
            super(0);
            this.f46913l = t02;
        }

        @Override // Y41.a
        public final C23072x0 invoke() {
            T0 t02 = this.f46913l;
            C23066u0.b bVar = C23066u0.f46894a;
            return (C23072x0) new P0(t02, new C23068v0()).b(C23072x0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
    }

    public C23070w0(@k C23485c c23485c, @k T0 t02) {
        this.f46909a = c23485c;
        this.f46912d = C42727D.c(new a(t02));
    }

    @Override // androidx.view.C23485c.InterfaceC1922c
    @k
    public final Bundle H() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f46911c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C23072x0) this.f46912d.getValue()).f46923E.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((C23060r0) entry.getValue()).f46880e.H();
            if (!L.f(bundleH, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleH);
            }
        }
        this.f46910b = false;
        return bundle;
    }

    public final void a() {
        if (this.f46910b) {
            return;
        }
        Bundle bundleA = this.f46909a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f46911c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f46911c = bundle;
        this.f46910b = true;
    }
}
