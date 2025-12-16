package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36719o extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class a extends zzb implements InterfaceC36719o {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f349452a = 0;

        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean e4(int i12, @j.N Parcel parcel, @j.N Parcel parcel2) {
            if (i12 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
