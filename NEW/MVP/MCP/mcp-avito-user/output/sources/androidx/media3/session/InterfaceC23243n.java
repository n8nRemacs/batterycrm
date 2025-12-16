package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.media3.common.H;
import androidx.media3.common.util.C23114e;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.BinderC23267v0;

/* compiled from: IMediaController.java */
/* renamed from: androidx.media3.session.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23243n extends IInterface {
    void L3(int i12, Bundle bundle);

    void M1(int i12, Bundle bundle, boolean z12);

    void N3(int i12, Bundle bundle, Bundle bundle2);

    void a2(int i12, Bundle bundle);

    void b1(int i12, Bundle bundle);

    void f();

    void g(int i12);

    void m2(int i12, Bundle bundle);

    void t0(int i12, Bundle bundle);

    /* compiled from: IMediaController.java */
    /* renamed from: androidx.media3.session.n$a */
    public static class a implements InterfaceC23243n {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void f() {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void g(int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void L3(int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void a2(int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void b1(int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void m2(int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void t0(int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void M1(int i12, Bundle bundle, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23243n
        public final void N3(int i12, Bundle bundle, Bundle bundle2) {
        }
    }

    /* compiled from: IMediaController.java */
    /* renamed from: androidx.media3.session.n$b */
    public static abstract class b extends Binder implements InterfaceC23243n {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f52588a = 0;

        /* compiled from: IMediaController.java */
        /* renamed from: androidx.media3.session.n$b$a */
        public static class a implements InterfaceC23243n {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f52589a;

            @Override // androidx.media3.session.InterfaceC23243n
            public final void L3(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3008, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void M1(int i12, Bundle bundle, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(z12 ? 1 : 0);
                    if (!this.f52589a.transact(3007, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void N3(int i12, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundle2.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3013, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void a2(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3001, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f52589a;
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void b1(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3003, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void f() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(0);
                    if (!this.f52589a.transact(3006, parcelObtain, null, 1)) {
                        int i12 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void g(int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    if (!this.f52589a.transact(3011, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void m2(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3002, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.InterfaceC23243n
            public final void t0(int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52589a.transact(3009, parcelObtain, null, 1)) {
                        int i13 = b.f52588a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "androidx.media3.session.IMediaController");
        }

        public static InterfaceC23243n e4(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23243n)) {
                return (InterfaceC23243n) iInterfaceQueryLocalInterface;
            }
            a aVar = new a();
            aVar.f52589a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 4001) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
                parcel.readInt();
                final String string = parcel.readString();
                final int i14 = parcel.readInt();
                final Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                BinderC23267v0 binderC23267v0 = (BinderC23267v0) this;
                if (!TextUtils.isEmpty(string) && i14 >= 0) {
                    final int i15 = 1;
                    binderC23267v0.f4(new BinderC23267v0.a() { // from class: androidx.media3.session.r0
                        @Override // androidx.media3.session.BinderC23267v0.a
                        public final void a(C23229i0 c23229i0) {
                            Bundle bundle2 = bundle;
                            switch (i15) {
                                case 0:
                                    A a12 = (A) c23229i0;
                                    int i16 = BinderC23267v0.f52647p;
                                    AbstractServiceC23270w0.b bVar = bundle2 == null ? null : (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle2);
                                    if (a12.isConnected()) {
                                        new M1(a12, string, i14, bVar, 7);
                                        throw null;
                                    }
                                    return;
                                default:
                                    A a13 = (A) c23229i0;
                                    int i17 = BinderC23267v0.f52647p;
                                    AbstractServiceC23270w0.b bVar2 = bundle2 == null ? null : (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle2);
                                    if (a13.isConnected()) {
                                        new M1(a13, string, i14, bVar2, 8);
                                        throw null;
                                    }
                                    return;
                            }
                        }
                    });
                } else {
                    androidx.media3.common.util.s.g();
                }
                return true;
            }
            if (i12 == 4002) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
                parcel.readInt();
                final String string2 = parcel.readString();
                final int i16 = parcel.readInt();
                final Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                BinderC23267v0 binderC23267v02 = (BinderC23267v0) this;
                if (!TextUtils.isEmpty(string2) && i16 >= 0) {
                    final int i17 = 0;
                    binderC23267v02.f4(new BinderC23267v0.a() { // from class: androidx.media3.session.r0
                        @Override // androidx.media3.session.BinderC23267v0.a
                        public final void a(C23229i0 c23229i0) {
                            Bundle bundle22 = bundle2;
                            switch (i17) {
                                case 0:
                                    A a12 = (A) c23229i0;
                                    int i162 = BinderC23267v0.f52647p;
                                    AbstractServiceC23270w0.b bVar = bundle22 == null ? null : (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle22);
                                    if (a12.isConnected()) {
                                        new M1(a12, string2, i16, bVar, 7);
                                        throw null;
                                    }
                                    return;
                                default:
                                    A a13 = (A) c23229i0;
                                    int i172 = BinderC23267v0.f52647p;
                                    AbstractServiceC23270w0.b bVar2 = bundle22 == null ? null : (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle22);
                                    if (a13.isConnected()) {
                                        new M1(a13, string2, i16, bVar2, 8);
                                        throw null;
                                    }
                                    return;
                            }
                        }
                    });
                } else {
                    androidx.media3.common.util.s.g();
                }
                return true;
            }
            if (i12 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaController");
                return true;
            }
            switch (i12) {
                case 3001:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).a2(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3002:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).m2(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3003:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).b1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3004:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    try {
                        ((BinderC23267v0) this).f4(new x1(parcel.readInt(), C23114e.a(C23213d.f52422n, parcel.createTypedArrayList(Bundle.CREATOR))));
                    } catch (RuntimeException e12) {
                        androidx.media3.common.util.s.h("Ignoring malformed Bundle for CommandButton", e12);
                    }
                    return true;
                case 3005:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    int i18 = parcel.readInt();
                    Bundle bundle3 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle4 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    BinderC23267v0 binderC23267v03 = (BinderC23267v0) this;
                    if (bundle4 == null) {
                        androidx.media3.common.util.s.g();
                    } else {
                        try {
                            binderC23267v03.f4(new C23261t0(i18, (K1) K1.f52114j.fromBundle(bundle3), bundle4));
                        } catch (RuntimeException e13) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionCommand", e13);
                        }
                    }
                    return true;
                case 3006:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    parcel.readInt();
                    ((BinderC23267v0) this).f();
                    return true;
                case 3007:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).M1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    return true;
                case 3008:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).L3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3009:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).t0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3010:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    parcel.readInt();
                    try {
                        try {
                            ((BinderC23267v0) this).f4(new N(7, (L1) L1.f52125e.fromBundle(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null), (H.c) H.c.f47241e.fromBundle(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null)));
                        } catch (RuntimeException e14) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for Commands", e14);
                        }
                    } catch (RuntimeException e15) {
                        androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionCommands", e15);
                    }
                    return true;
                case 3011:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).g(parcel.readInt());
                    return true;
                case 3012:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    parcel.readInt();
                    ((BinderC23267v0) this).f4(new C23228i(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 5));
                    return true;
                case 3013:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).N3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3014:
                    parcel.enforceInterface("androidx.media3.session.IMediaController");
                    ((BinderC23267v0) this).f4(new C23228i(parcel.readInt(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null));
                    return true;
                default:
                    return super.onTransact(i12, parcel, parcel2, i13);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
