package com.avito.android.location_list;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.favorites.i1;
import com.avito.android.remote.model.Location;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationConfirmDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/location_list/LocationConfirmDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationConfirmDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    public T f181875h0;

    public LocationConfirmDialog() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        Location location;
        C31517k c31517k = new C31517k(requireActivity());
        T t12 = this.f181875h0;
        if (t12 == null) {
            t12 = null;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            location = (Location) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_location", Location.class) : arguments.getParcelable("key_location"));
        } else {
            location = null;
        }
        Resources resources = getResources();
        C31512f c31512f = new C31512f(t12, location, new C31514h(), c31517k);
        l.a aVar = c31517k.f182054a;
        if (location == null) {
            aVar.setMessage(resources.getString(R.string.no_found_location_message));
            aVar.setPositiveButton(resources.getString(R.string.yes), new DialogInterfaceOnClickListenerC31516j(0, null));
        } else {
            String name = location.getName(6);
            if (name == null) {
                name = "";
            }
            aVar.setMessage(resources.getString(R.string.your_location, name));
            aVar.setPositiveButton(resources.getString(R.string.yes), new DialogInterfaceOnClickListenerC31516j(0, new C31511e(c31512f)));
        }
        aVar.setNegativeButton(resources.getString(R.string.no), new i1(1));
        return aVar.create();
    }
}
