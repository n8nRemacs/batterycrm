package nC;

import AK0.l;
import Y61.k;
import com.avito.android.fakedoor_dialog.storage.FakeDoorScreen;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;

/* compiled from: FakeDoorStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnC/b;", "LnC/a;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nC.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44229b implements InterfaceC44228a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f414920a;

    @Inject
    public C44229b(@k l lVar) {
        this.f414920a = lVar;
    }

    @Override // nC.InterfaceC44228a
    public final void a(@k String str) {
        l lVar = this.f414920a;
        Set<String> setF = lVar.f("viewedFakedoorProducts");
        if (setF == null) {
            setF = B0.f406639b;
        }
        lVar.putStringSet("viewedFakedoorProducts", b1.i(setF, str));
    }

    @Override // nC.InterfaceC44228a
    @Y61.l
    public final Q<String, String> b(@k FakeDoorScreen fakeDoorScreen) {
        Set<String> setF = this.f414920a.f("viewedFakedoorProducts");
        if (setF != null) {
            return new Q<>("viewedFakedoorProducts", C42745f0.O(setF, ",", null, null, null, 62));
        }
        return null;
    }
}
