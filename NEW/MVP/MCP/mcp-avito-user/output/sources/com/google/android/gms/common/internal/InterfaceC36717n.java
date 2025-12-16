package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36717n extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* renamed from: com.google.android.gms.common.internal.n$a */
    public static abstract class a extends zzb implements InterfaceC36717n {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f349450a = 0;

        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean e4(int i12, @j.N Parcel parcel, @j.N Parcel parcel2) {
            if (i12 != 2) {
                return false;
            }
            throw null;
        }
    }

    @j.N
    Account zzb();
}
