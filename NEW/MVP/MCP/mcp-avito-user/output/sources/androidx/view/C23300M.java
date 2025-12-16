package androidx.view;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NavControllerViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/M;", "Landroidx/lifecycle/M0;", "Landroidx/navigation/I0;", "<init>", "()V", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23300M extends M0 implements InterfaceC23294I0 {

    /* renamed from: J, reason: collision with root package name */
    @k
    public static final b f52804J = new b(null);

    /* renamed from: K, reason: collision with root package name */
    @k
    public static final a f52805K = new a();

    /* renamed from: E, reason: collision with root package name */
    @k
    public final LinkedHashMap f52806E = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/navigation/M$a", "Landroidx/lifecycle/P0$c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.M$a */
    public static final class a implements P0.c {
        @Override // androidx.lifecycle.P0.c
        @k
        public final <T extends M0> T create(@k Class<T> cls) {
            return new C23300M();
        }
    }

    /* compiled from: NavControllerViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/M$b;", "", "<init>", "()V", "Landroidx/lifecycle/P0$c;", "FACTORY", "Landroidx/lifecycle/P0$c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.M$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f52806E;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((S0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f52806E.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // androidx.view.InterfaceC23294I0
    @k
    public final S0 xb(@k String str) {
        LinkedHashMap linkedHashMap = this.f52806E;
        S0 s02 = (S0) linkedHashMap.get(str);
        if (s02 != null) {
            return s02;
        }
        S0 s03 = new S0();
        linkedHashMap.put(str, s03);
        return s03;
    }
}
