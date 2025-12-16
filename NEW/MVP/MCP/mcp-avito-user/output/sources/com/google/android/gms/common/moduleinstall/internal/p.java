package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements InterfaceC36673v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ApiFeatureRequest f349528a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
    public final void accept(Object obj, Object obj2) {
        y yVar = new y((C37028k) obj2);
        h hVar = (h) ((B) obj).getService();
        Parcel parcelE4 = hVar.e4();
        zac.zad(parcelE4, yVar);
        zac.zac(parcelE4, this.f349528a);
        hVar.f4(parcelE4, 3);
    }
}
