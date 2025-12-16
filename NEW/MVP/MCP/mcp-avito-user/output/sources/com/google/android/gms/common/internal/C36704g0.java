package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36704g0 extends RemoteCreator {

    /* renamed from: b, reason: collision with root package name */
    public static final C36704g0 f349437b = new C36704g0();

    public static View c(Context context, int i12, int i13) throws RemoteCreator.RemoteCreatorException {
        C36704g0 c36704g0 = f349437b;
        try {
            zax zaxVar = new zax(1, i12, i13, null);
            return (View) com.google.android.gms.dynamic.f.g4(((W) c36704g0.b(context)).g4(new com.google.android.gms.dynamic.f(context), zaxVar));
        } catch (Exception e12) {
            throw new RemoteCreator.RemoteCreatorException(androidx.compose.foundation.H.j(i12, i13, "Could not get button with size ", " and color "), e12);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final W a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new W(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
