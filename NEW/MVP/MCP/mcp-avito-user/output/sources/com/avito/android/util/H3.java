package com.avito.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Parcels.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/H3;", "Landroid/os/Parcelable$Creator;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H3 implements Parcelable.Creator<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Parcel, Object> f318626a;

    /* JADX WARN: Multi-variable type inference failed */
    public H3(Y41.l<? super Parcel, Object> lVar) {
        this.f318626a = lVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return (Parcelable) this.f318626a.invoke(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return (Parcelable[]) new Object[i12];
    }
}
