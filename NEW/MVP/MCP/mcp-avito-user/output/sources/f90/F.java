package f90;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: ProfileNotificationStateStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/F;", "Lf90/E;", "_avito_preferences-profile-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class F implements InterfaceC40251E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395692a;

    @Inject
    public F(@Y61.k AK0.l lVar) {
        this.f395692a = lVar;
    }

    @Override // f90.InterfaceC40251E
    public final void a(@Y61.k String str) {
        AK0.l lVar = this.f395692a;
        Set<String> setF = lVar.f("closed_profile_notifications");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(str);
        lVar.putStringSet("closed_profile_notifications", linkedHashSetO0);
    }

    @Override // f90.InterfaceC40251E
    public final boolean b(@Y61.k String str) {
        Set<String> setF = this.f395692a.f("closed_profile_notifications");
        if (setF == null) {
            return false;
        }
        return setF.contains(str);
    }

    @Override // f90.InterfaceC40251E
    public final void clear() {
        this.f395692a.remove("closed_profile_notifications");
    }
}
