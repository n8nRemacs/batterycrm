package com.avito.android.publish.premoderation;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.premoderation.d;
import com.avito.android.publish.premoderation.di.e;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDuplicateFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/premoderation/AdvertDuplicateFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/publish/premoderation/d$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AdvertDuplicateFragment extends BaseDialogFragment implements d.a, InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public d f238263h0;

    /* renamed from: i0, reason: collision with root package name */
    public a f238264i0;

    public AdvertDuplicateFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        a aVar = this.f238264i0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.H0();
        super.onCancel(dialogInterface);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme_Avito_Dialog_FullScreen);
        Bundle arguments = getArguments();
        AdvertDuplicateResult advertDuplicateResult = arguments != null ? (AdvertDuplicateResult) arguments.getParcelable("key_advert_duplicate_data") : null;
        if (advertDuplicateResult == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.premoderation.di.f fVar = new com.avito.android.publish.premoderation.di.f(advertDuplicateResult);
        e.a aVarA = com.avito.android.publish.premoderation.di.c.a();
        aVarA.d((InterfaceC33816g) C29972i.a(C29972i.b(this), InterfaceC33816g.class));
        aVarA.a(fVar);
        aVarA.build().a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.advert_duplicate, (ViewGroup) null);
        j jVar = new j((ViewGroup) viewInflate);
        d dVar = this.f238263h0;
        (dVar != null ? dVar : null).b(jVar);
        this.f238264i0 = (a) getTargetFragment();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        d dVar = this.f238263h0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e0();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d dVar = this.f238263h0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        d dVar = this.f238263h0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        super.onStop();
    }
}
