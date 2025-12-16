package com.avito.android.certificate_pinning;

import android.R;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.util.C35853n2;
import com.avito.android.util.C35974x2;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f117797b;

    public l(n nVar) {
        this.f117797b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        UnsafeNetworkActivity unsafeNetworkActivity;
        n nVar = this.f117797b;
        String str = nVar.f117848e;
        if (str == null || (unsafeNetworkActivity = nVar.f117847d) == null) {
            return;
        }
        C35853n2 c35853n2 = unsafeNetworkActivity.f117753m;
        if (c35853n2 == null) {
            c35853n2 = null;
        }
        Intent intentT = c35853n2.t(Uri.parse(str));
        C35974x2.d(intentT);
        try {
            unsafeNetworkActivity.startActivity(intentT);
        } catch (Exception unused) {
            com.avito.android.component.snackbar.h.d(unsafeNetworkActivity.findViewById(R.id.content), com.avito.android.R.string.no_application_installed_to_perform_this_action, null, 254);
        }
    }
}
