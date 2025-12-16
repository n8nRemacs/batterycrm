package com.avito.android.lib.compose.design.shared.navigation;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.view.AbstractC23292H0;
import kotlin.Metadata;

/* compiled from: NavType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/navigation/e;", "Landroid/os/Parcelable;", "T", "Landroidx/navigation/H0;", "_design-modules_compose_shared_navigation_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e<T extends Parcelable> extends AbstractC23292H0<T> {
    @Override // androidx.view.AbstractC23292H0
    public final Object a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, null) : bundle.getParcelable(str);
    }

    @Override // androidx.view.AbstractC23292H0
    @k
    public final String b() {
        throw null;
    }

    @Override // androidx.view.AbstractC23292H0
    /* renamed from: d */
    public final Object f(String str) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArrDecode = Base64.decode(str, 10);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
        try {
            throw null;
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // androidx.view.AbstractC23292H0
    public final void e(String str, Bundle bundle, Object obj) {
        throw null;
    }
}
