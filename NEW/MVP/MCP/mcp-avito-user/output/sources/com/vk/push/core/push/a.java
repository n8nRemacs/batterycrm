package com.vk.push.core.push;

import Qa1.j;
import T11.f;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.a;
import h21.C40764a;
import java.util.ArrayList;
import kb1.g;
import kb1.l;
import kb1.r;

/* compiled from: PushClient.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {

    /* compiled from: PushClient.java */
    /* renamed from: com.vk.push.core.push.a$a, reason: collision with other inner class name */
    public static class C10841a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: PushClient.java */
    public static class c {
    }

    /* compiled from: PushClient.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: PushClient.java */
        /* renamed from: com.vk.push.core.push.a$b$a, reason: collision with other inner class name */
        public static class C10842a implements a {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        public b() {
            attachInterface(this, "com.vk.push.core.push.PushClient");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.push.PushClient");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("com.vk.push.core.push.PushClient");
                return true;
            }
            if (i12 == 2) {
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(RemoteMessage.INSTANCE);
                com.vk.push.core.base.a aVarE4 = a.b.e4(parcel.readStrongBinder());
                r rVar = (r) this;
                if (j.f13811r != null) {
                    if (arrayListCreateTypedArrayList == null || arrayListCreateTypedArrayList.isEmpty() || aVarE4 == null) {
                        ((f) rVar.f406494p.getValue()).a("Callback or messages is null for some reason", null);
                    } else {
                        ((l) rVar.f406492a.getValue()).d(new C40764a(Binder.getCallingUid(), Binder.getCallingPid()), arrayListCreateTypedArrayList, aVarE4);
                    }
                }
            } else if (i12 == 3) {
                com.vk.push.core.base.a aVarE42 = a.b.e4(parcel.readStrongBinder());
                r rVar2 = (r) this;
                if (j.f13811r != null) {
                    if (aVarE42 == null) {
                        ((f) rVar2.f406494p.getValue()).a("Callback is null for some reason", null);
                    } else {
                        ((g) rVar2.f406493b.getValue()).b(new C40764a(Binder.getCallingUid(), Binder.getCallingPid()), aVarE42);
                    }
                }
            } else if (i12 == 4) {
                com.vk.push.core.base.a aVarE43 = a.b.e4(parcel.readStrongBinder());
                r rVar3 = (r) this;
                if (j.f13811r != null) {
                    if (aVarE43 == null) {
                        ((f) rVar3.f406494p.getValue()).a("Callback is null for some reason", null);
                    } else {
                        ((g) rVar3.f406493b.getValue()).c(new C40764a(Binder.getCallingUid(), Binder.getCallingPid()), aVarE43);
                    }
                }
            } else {
                if (i12 != 5) {
                    return super.onTransact(i12, parcel, parcel2, i13);
                }
                String string = parcel.readString();
                com.vk.push.core.base.a aVarE44 = a.b.e4(parcel.readStrongBinder());
                r rVar4 = (r) this;
                if (j.f13811r != null) {
                    if (aVarE44 == null || string == null) {
                        ((f) rVar4.f406494p.getValue()).a("Token or callback argument is null for some reason", null);
                    } else {
                        ((g) rVar4.f406493b.getValue()).a(new C40764a(Binder.getCallingUid(), Binder.getCallingPid()), string, aVarE44);
                    }
                }
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
