package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class u extends C37131a implements w {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void H(String str, Bundle bundle, Bundle bundle2, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeInt(1);
        bundle2.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void P(String str, Bundle bundle, Bundle bundle2, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeInt(1);
        bundle2.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void P0(String str, ArrayList arrayList, Bundle bundle, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeTypedList(arrayList);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void b3(String str, Bundle bundle, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void f3(String str, Bundle bundle, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void o(String str, Bundle bundle, Bundle bundle2, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeInt(1);
        bundle2.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void v(String str, Bundle bundle, Bundle bundle2, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeInt(1);
        bundle2.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void w3(String str, ArrayList arrayList, Bundle bundle, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeTypedList(arrayList);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.w
    public final void z(String str, Bundle bundle, Bundle bundle2, y yVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        parcelE4.writeInt(1);
        bundle2.writeToParcel(parcelE4, 0);
        parcelE4.writeStrongBinder(yVar);
        f4(parcelE4, 13);
    }
}
