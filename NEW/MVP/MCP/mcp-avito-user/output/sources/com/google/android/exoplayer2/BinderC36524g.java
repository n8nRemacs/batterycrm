package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import shark.AndroidResourceIdNames;

/* compiled from: BundleListRetriever.java */
/* renamed from: com.google.android.exoplayer2.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC36524g extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public static final int f345415a;

    static {
        f345415a = com.google.android.exoplayer2.util.U.f348106a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i12, Parcel parcel, @j.P Parcel parcel2, int i13) {
        if (i12 != 1) {
            return super.onTransact(i12, parcel, parcel2, i13);
        }
        if (parcel2 == null) {
            return false;
        }
        throw null;
    }
}
