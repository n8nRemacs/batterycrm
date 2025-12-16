package androidx.view.compose;

import Y61.k;
import androidx.compose.runtime.saveable.l;
import androidx.view.C23060r0;
import androidx.view.M0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavBackStackEntryProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/a;", "Landroidx/lifecycle/M0;", "Landroidx/lifecycle/r0;", "handle", "<init>", "(Landroidx/lifecycle/r0;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23335a extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final UUID f52934E;

    /* renamed from: J, reason: collision with root package name */
    public WeakReference<l> f52935J;

    public C23335a(@k C23060r0 c23060r0) {
        UUID uuidRandomUUID = (UUID) c23060r0.b("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            c23060r0.e(uuidRandomUUID, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f52934E = uuidRandomUUID;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        WeakReference<l> weakReference = this.f52935J;
        if (weakReference == null) {
            weakReference = null;
        }
        l lVar = weakReference.get();
        if (lVar != null) {
            lVar.e(this.f52934E);
        }
        WeakReference<l> weakReference2 = this.f52935J;
        (weakReference2 != null ? weakReference2 : null).clear();
    }
}
