package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class oq3 {
    public final Bundle a;

    public oq3(s5g s5gVar, Bundle bundle, f1e f1eVar) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", s5gVar);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (f1eVar != null) {
            bundle2.putString("stat_screen", f1eVar.name());
        }
    }

    public final void a(pq3... pq3VarArr) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        af3.t(parcelableArrayList, pq3VarArr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, s5g s5gVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new pq3(i, s5gVar, 1, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, s5g s5gVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new pq3(i, s5gVar, 2, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, s5g s5gVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new pq3(i, s5gVar, 3, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e() {
        return new ConfirmationBottomSheet(this.a);
    }

    public final void f(s5g s5gVar) {
        Bundle bundle = this.a;
        if (s5gVar == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", s5gVar);
        }
    }

    public final void g(Integer num) {
        this.a.putParcelable("icon", new rq3(num.intValue(), 1, 2));
    }
}
