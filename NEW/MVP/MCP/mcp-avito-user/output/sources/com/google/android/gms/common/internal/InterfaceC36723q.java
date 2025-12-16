package com.google.android.gms.common.internal;

import aZ0.InterfaceC19845a;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36723q extends IInterface {
    @RX0.a
    void V1(@j.N v0 v0Var, @j.P GetServiceRequest getServiceRequest);

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static abstract class a extends Binder implements InterfaceC36723q {
        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onTransact(int r5, @j.N android.os.Parcel r6, @j.P android.os.Parcel r7, int r8) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.InterfaceC36723q.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        @Override // android.os.IInterface
        @InterfaceC19845a
        @j.N
        @RX0.a
        public final IBinder asBinder() {
            return this;
        }
    }
}
