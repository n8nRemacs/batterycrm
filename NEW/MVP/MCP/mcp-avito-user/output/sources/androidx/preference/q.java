package androidx.preference;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.rating_form.RatingFormActivity;
import com.avito.android.rating_form.activity.RatingFormFullScreenActivity;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements FragmentManager.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53467b;

    public /* synthetic */ q(Object obj, int i12) {
        this.f53466a = i12;
        this.f53467b = obj;
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public final void a() {
        Object next;
        Object obj = this.f53467b;
        switch (this.f53466a) {
            case 0:
                PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat = (PreferenceHeaderFragmentCompat) obj;
                preferenceHeaderFragmentCompat.f53393f0.d(preferenceHeaderFragmentCompat.getChildFragmentManager().L() == 0);
                break;
            case 1:
                RatingFormActivity.a aVar = RatingFormActivity.f247887w;
                ((RatingFormActivity) obj).b2();
                break;
            case 2:
                RatingFormFullScreenActivity.a aVar2 = RatingFormFullScreenActivity.f247942x;
                ((RatingFormFullScreenActivity) obj).k2();
                break;
            default:
                ClientRoomFragment.a aVar3 = ClientRoomFragment.f326248u0;
                ClientRoomFragment clientRoomFragment = (ClientRoomFragment) obj;
                Iterator<T> it = clientRoomFragment.getChildFragmentManager().P().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((Fragment) next).isResumed()) {
                        }
                    } else {
                        next = null;
                    }
                }
                Fragment fragment = (Fragment) next;
                if (fragment != null) {
                    clientRoomFragment.r5(fragment);
                    break;
                }
                break;
        }
    }
}
