package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.util.C23114e;
import androidx.media3.session.A1;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: IMediaSession.java */
/* renamed from: androidx.media3.session.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23246o extends IInterface {
    void A0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, boolean z12);

    void B3(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14);

    void C3(InterfaceC23243n interfaceC23243n, int i12, boolean z12);

    void D0(InterfaceC23243n interfaceC23243n, int i12);

    void D2(InterfaceC23243n interfaceC23243n);

    void E0(InterfaceC23243n interfaceC23243n, int i12, boolean z12);

    void E2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14);

    void H1(InterfaceC23243n interfaceC23243n, int i12, int i13);

    void J3(InterfaceC23243n interfaceC23243n, int i12, Surface surface);

    void K2(InterfaceC23243n interfaceC23243n, int i12);

    void K3(InterfaceC23243n interfaceC23243n, int i12);

    void L0(InterfaceC23243n interfaceC23243n, int i12, boolean z12, int i13);

    void M0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, Bundle bundle2);

    void N0(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, int i13, long j12);

    void O2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, IBinder iBinder);

    void Q1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void T1(InterfaceC23243n interfaceC23243n, int i12);

    void W0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void Z(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, long j12);

    void Z0(InterfaceC23243n interfaceC23243n, int i12);

    void a0(InterfaceC23243n interfaceC23243n, int i12, long j12);

    void a1(InterfaceC23243n interfaceC23243n, int i12, int i13);

    void a3(InterfaceC23243n interfaceC23243n, int i12, boolean z12);

    void b4(InterfaceC23243n interfaceC23243n, int i12);

    void e3(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, boolean z12);

    void h0(InterfaceC23243n interfaceC23243n, int i12, int i13);

    void i2(InterfaceC23243n interfaceC23243n, int i12, int i13);

    void j2(InterfaceC23243n interfaceC23243n, int i12, float f12);

    void k1(InterfaceC23243n interfaceC23243n, int i12);

    void k2(InterfaceC23243n interfaceC23243n, int i12, float f12);

    void m1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void n0(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, int i15);

    void n3(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void q0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void q2(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle);

    void r(InterfaceC23243n interfaceC23243n, int i12);

    void z1(InterfaceC23243n interfaceC23243n, int i12, int i13, IBinder iBinder);

    /* compiled from: IMediaSession.java */
    /* renamed from: androidx.media3.session.o$b */
    public static abstract class b extends Binder implements InterfaceC23246o {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f52593a = 0;

        /* compiled from: IMediaSession.java */
        /* renamed from: androidx.media3.session.o$b$a */
        public static class a implements InterfaceC23246o {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f52594a;

            @Override // androidx.media3.session.InterfaceC23246o
            public final void A0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    if (!this.f52594a.transact(3009, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void B3(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    if (!this.f52594a.transact(3051, parcelObtain, null, 1)) {
                        int i15 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void C3(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z12 ? 1 : 0);
                    if (!this.f52594a.transact(3006, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void D0(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3024, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void D2(InterfaceC23243n interfaceC23243n) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    if (!this.f52594a.transact(3045, parcelObtain, null, 1)) {
                        int i12 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void E0(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z12 ? 1 : 0);
                    if (!this.f52594a.transact(3013, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void E2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    if (!this.f52594a.transact(3020, parcelObtain, null, 1)) {
                        int i15 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void H1(InterfaceC23243n interfaceC23243n, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    if (!this.f52594a.transact(3052, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void J3(InterfaceC23243n interfaceC23243n, int i12, Surface surface) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (surface != null) {
                        parcelObtain.writeInt(1);
                        surface.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f52594a.transact(3044, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void K2(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3034, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void K3(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3026, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void L0(InterfaceC23243n interfaceC23243n, int i12, boolean z12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z12 ? 1 : 0);
                    parcelObtain.writeInt(i13);
                    if (!this.f52594a.transact(3054, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void M0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (bundle2 != null) {
                        parcelObtain.writeInt(1);
                        bundle2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f52594a.transact(3016, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void N0(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, int i13, long j12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeLong(j12);
                    if (!this.f52594a.transact(3012, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void O2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.f52594a.transact(3056, parcelObtain, null, 1)) {
                        int i15 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void Q1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f52594a.transact(3048, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void T1(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3025, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void W0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52594a.transact(3007, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void Z(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, long j12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeLong(j12);
                    if (!this.f52594a.transact(3008, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void Z0(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3035, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void a0(InterfaceC23243n interfaceC23243n, int i12, long j12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeLong(j12);
                    if (!this.f52594a.transact(3038, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void a1(InterfaceC23243n interfaceC23243n, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    if (!this.f52594a.transact(3003, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void a3(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z12 ? 1 : 0);
                    if (!this.f52594a.transact(3018, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f52594a;
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void b4(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3005, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void e3(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, boolean z12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(1);
                    if (!this.f52594a.transact(3011, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void h0(InterfaceC23243n interfaceC23243n, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    if (!this.f52594a.transact(3017, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void i2(InterfaceC23243n interfaceC23243n, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    if (!this.f52594a.transact(3053, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void j2(InterfaceC23243n interfaceC23243n, int i12, float f12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeFloat(f12);
                    if (!this.f52594a.transact(3002, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void k1(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3036, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void k2(InterfaceC23243n interfaceC23243n, int i12, float f12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeFloat(f12);
                    if (!this.f52594a.transact(3028, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void m1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52594a.transact(3014, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void n0(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, int i15) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    parcelObtain.writeInt(i15);
                    if (!this.f52594a.transact(3023, parcelObtain, null, 1)) {
                        int i16 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void n3(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52594a.transact(3015, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void q0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52594a.transact(3033, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void q2(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f52594a.transact(3027, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void r(InterfaceC23243n interfaceC23243n, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    if (!this.f52594a.transact(3004, parcelObtain, null, 1)) {
                        int i13 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.media3.session.InterfaceC23246o
            public final void z1(InterfaceC23243n interfaceC23243n, int i12, int i13, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC23243n != null ? interfaceC23243n.asBinder() : null);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.f52594a.transact(3032, parcelObtain, null, 1)) {
                        int i14 = b.f52593a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public b() {
            attachInterface(this, "androidx.media3.session.IMediaSession");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSession");
                return true;
            }
            switch (i12) {
                case 3002:
                    ((A1) this).j2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    ((A1) this).a1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    ((A1) this).r(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3005:
                    ((A1) this).b4(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3006:
                    ((A1) this).C3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    ((A1) this).A0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, true);
                    return true;
                case 3008:
                    ((A1) this).Z(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    return true;
                case 3009:
                    ((A1) this).A0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    return true;
                case 3010:
                    ((A1) this).e3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readStrongBinder(), true);
                    return true;
                case 3011:
                    ((A1) this).e3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    ((A1) this).N0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    ((A1) this).E0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    ((A1) this).m1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3015:
                    ((A1) this).n3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3016:
                    ((A1) this).M0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3017:
                    ((A1) this).h0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    ((A1) this).a3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3019:
                    InterfaceC23243n interfaceC23243nA = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i14 = parcel.readInt();
                    int i15 = parcel.readInt();
                    A1 a12 = (A1) this;
                    if (interfaceC23243nA != null) {
                        a12.j4(interfaceC23243nA, i14, 20, new C23264u0(new C23224g1(a12, i15, 4), 6));
                    }
                    return true;
                case 3020:
                    ((A1) this).E2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    InterfaceC23243n interfaceC23243nA2 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i16 = parcel.readInt();
                    A1 a13 = (A1) this;
                    if (interfaceC23243nA2 != null) {
                        a13.j4(interfaceC23243nA2, i16, 20, A1.l4(new C23228i(25)));
                    }
                    return true;
                case 3022:
                    InterfaceC23243n interfaceC23243nA3 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i17 = parcel.readInt();
                    int i18 = parcel.readInt();
                    int i19 = parcel.readInt();
                    A1 a14 = (A1) this;
                    if (interfaceC23243nA3 != null) {
                        a14.j4(interfaceC23243nA3, i17, 20, A1.l4(new C23251p1(i18, i19, 1)));
                    }
                    return true;
                case 3023:
                    ((A1) this).n0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3024:
                    ((A1) this).D0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3025:
                    ((A1) this).T1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3026:
                    ((A1) this).K3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3027:
                    ((A1) this).q2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3028:
                    ((A1) this).k2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3029:
                    InterfaceC23243n interfaceC23243nA4 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i22 = parcel.readInt();
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    A1 a15 = (A1) this;
                    if (interfaceC23243nA4 != null && bundle != null) {
                        try {
                            final androidx.media3.common.z zVar = (androidx.media3.common.z) androidx.media3.common.z.f47977o.fromBundle(bundle);
                            final int i23 = 2;
                            a15.j4(interfaceC23243nA4, i22, 20, new C23268v1(new N(12, new A1.e() { // from class: androidx.media3.session.k1
                                @Override // androidx.media3.session.A1.e
                                public final Object d(T0 t02, O0.g gVar, int i24) {
                                    androidx.media3.common.z zVar2 = zVar;
                                    switch (i23) {
                                        case 0:
                                            int i25 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar2));
                                        case 1:
                                            int i26 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar2));
                                        default:
                                            int i27 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar2));
                                    }
                                }
                            }, new C23228i(20)), 1));
                        } catch (RuntimeException e12) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
                        }
                    }
                    return true;
                case 3030:
                    InterfaceC23243n interfaceC23243nA5 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i24 = parcel.readInt();
                    int i25 = parcel.readInt();
                    Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    A1 a16 = (A1) this;
                    if (interfaceC23243nA5 != null && bundle2 != null) {
                        try {
                            final androidx.media3.common.z zVar2 = (androidx.media3.common.z) androidx.media3.common.z.f47977o.fromBundle(bundle2);
                            final int i26 = 0;
                            a16.j4(interfaceC23243nA5, i24, 20, new C23268v1(new N(12, new A1.e() { // from class: androidx.media3.session.k1
                                @Override // androidx.media3.session.A1.e
                                public final Object d(T0 t02, O0.g gVar, int i242) {
                                    androidx.media3.common.z zVar22 = zVar2;
                                    switch (i26) {
                                        case 0:
                                            int i252 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                        case 1:
                                            int i262 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                        default:
                                            int i27 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                    }
                                }
                            }, new C23224g1(a16, i25, 1)), 1));
                        } catch (RuntimeException e13) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e13);
                        }
                    }
                    return true;
                case 3031:
                    InterfaceC23243n interfaceC23243nA6 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i27 = parcel.readInt();
                    IBinder strongBinder = parcel.readStrongBinder();
                    A1 a17 = (A1) this;
                    if (interfaceC23243nA6 != null && strongBinder != null) {
                        try {
                            a17.j4(interfaceC23243nA6, i27, 20, new C23268v1(new N(12, new C23245n1(C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(strongBinder)), 1), new C23228i(19)), 1));
                        } catch (RuntimeException e14) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e14);
                        }
                    }
                    return true;
                case 3032:
                    ((A1) this).z1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3033:
                    ((A1) this).q0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3034:
                    ((A1) this).K2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3035:
                    ((A1) this).Z0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3036:
                    ((A1) this).k1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt());
                    return true;
                case 3037:
                    InterfaceC23243n interfaceC23243nA7 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i28 = parcel.readInt();
                    int i29 = parcel.readInt();
                    A1 a18 = (A1) this;
                    if (interfaceC23243nA7 != null) {
                        a18.j4(interfaceC23243nA7, i28, 10, new C23264u0(new C23224g1(a18, i29, 0), 6));
                    }
                    return true;
                case 3038:
                    ((A1) this).a0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readLong());
                    return true;
                case 3039:
                    InterfaceC23243n interfaceC23243nA8 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i32 = parcel.readInt();
                    int i33 = parcel.readInt();
                    long j12 = parcel.readLong();
                    A1 a19 = (A1) this;
                    if (interfaceC23243nA8 != null) {
                        a19.j4(interfaceC23243nA8, i32, 10, new C23264u0(new C23233j1(i33, j12, a19), 6));
                    }
                    return true;
                case 3040:
                    InterfaceC23243n interfaceC23243nA9 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i34 = parcel.readInt();
                    A1 a110 = (A1) this;
                    if (interfaceC23243nA9 != null) {
                        a110.j4(interfaceC23243nA9, i34, 11, A1.l4(new C23228i(9)));
                    }
                    return true;
                case 3041:
                    InterfaceC23243n interfaceC23243nA10 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i35 = parcel.readInt();
                    A1 a111 = (A1) this;
                    if (interfaceC23243nA10 != null) {
                        a111.j4(interfaceC23243nA10, i35, 12, A1.l4(new C23228i(16)));
                    }
                    return true;
                case 3042:
                    InterfaceC23243n interfaceC23243nA11 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i36 = parcel.readInt();
                    A1 a112 = (A1) this;
                    if (interfaceC23243nA11 != null) {
                        a112.j4(interfaceC23243nA11, i36, 6, A1.l4(new C23228i(13)));
                    }
                    return true;
                case 3043:
                    InterfaceC23243n interfaceC23243nA12 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i37 = parcel.readInt();
                    A1 a113 = (A1) this;
                    if (interfaceC23243nA12 != null) {
                        a113.j4(interfaceC23243nA12, i37, 8, A1.l4(new C23228i(10)));
                    }
                    return true;
                case 3044:
                    ((A1) this).J3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Surface) Surface.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3045:
                    ((A1) this).D2(M1.a("androidx.media3.session.IMediaSession", parcel));
                    return true;
                case 3046:
                    InterfaceC23243n interfaceC23243nA13 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i38 = parcel.readInt();
                    A1 a114 = (A1) this;
                    if (interfaceC23243nA13 != null) {
                        a114.j4(interfaceC23243nA13, i38, 7, A1.l4(new C23228i(24)));
                    }
                    return true;
                case 3047:
                    InterfaceC23243n interfaceC23243nA14 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i39 = parcel.readInt();
                    A1 a115 = (A1) this;
                    if (interfaceC23243nA14 != null) {
                        a115.j4(interfaceC23243nA14, i39, 9, A1.l4(new C23228i(22)));
                    }
                    return true;
                case 3048:
                    ((A1) this).Q1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3049:
                    InterfaceC23243n interfaceC23243nA15 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i42 = parcel.readInt();
                    String string = parcel.readString();
                    Bundle bundle3 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    A1 a116 = (A1) this;
                    if (interfaceC23243nA15 != null && bundle3 != null) {
                        if (TextUtils.isEmpty(string)) {
                            androidx.media3.common.util.s.g();
                        } else {
                            try {
                                a116.f4(interfaceC23243nA15, i42, null, 40010, new C23268v1(new C23228i(string, (androidx.media3.common.J) androidx.media3.common.J.f47264c.fromBundle(bundle3), 18), 1));
                            } catch (RuntimeException e15) {
                                androidx.media3.common.util.s.h("Ignoring malformed Bundle for Rating", e15);
                            }
                        }
                    }
                    return true;
                case 3050:
                    InterfaceC23243n interfaceC23243nA16 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i43 = parcel.readInt();
                    Bundle bundle4 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    A1 a117 = (A1) this;
                    if (interfaceC23243nA16 != null && bundle4 != null) {
                        try {
                            a117.f4(interfaceC23243nA16, i43, null, 40010, new C23268v1(new C23228i((androidx.media3.common.J) androidx.media3.common.J.f47264c.fromBundle(bundle4), 28), 1));
                        } catch (RuntimeException e16) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for Rating", e16);
                        }
                    }
                    return true;
                case 3051:
                    ((A1) this).B3(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3052:
                    ((A1) this).H1(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt());
                    return true;
                case 3053:
                    ((A1) this).i2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt());
                    return true;
                case 3054:
                    ((A1) this).L0(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 3055:
                    InterfaceC23243n interfaceC23243nA17 = M1.a("androidx.media3.session.IMediaSession", parcel);
                    int i44 = parcel.readInt();
                    int i45 = parcel.readInt();
                    Bundle bundle5 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    A1 a118 = (A1) this;
                    if (interfaceC23243nA17 != null && bundle5 != null) {
                        try {
                            final androidx.media3.common.z zVar3 = (androidx.media3.common.z) androidx.media3.common.z.f47977o.fromBundle(bundle5);
                            final int i46 = 1;
                            a118.j4(interfaceC23243nA17, i44, 20, new C23268v1(new N(12, new A1.e() { // from class: androidx.media3.session.k1
                                @Override // androidx.media3.session.A1.e
                                public final Object d(T0 t02, O0.g gVar, int i242) {
                                    androidx.media3.common.z zVar22 = zVar3;
                                    switch (i46) {
                                        case 0:
                                            int i252 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                        case 1:
                                            int i262 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                        default:
                                            int i272 = A1.f51915u;
                                            return t02.f52290d.b(AbstractC37401r1.E(zVar22));
                                    }
                                }
                            }, new C23224g1(a118, i45, 2)), 1));
                        } catch (RuntimeException e17) {
                            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e17);
                        }
                    }
                    return true;
                case 3056:
                    ((A1) this).O2(M1.a("androidx.media3.session.IMediaSession", parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                default:
                    switch (i12) {
                        case 4001:
                            InterfaceC23243n interfaceC23243nA18 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i47 = parcel.readInt();
                            Bundle bundle6 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                            A1 a119 = (A1) this;
                            if (interfaceC23243nA18 != null) {
                                a119.f4(interfaceC23243nA18, i47, null, 50000, new C23268v1(new C23264u0(bundle6 != null ? (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle6) : null, 5), 0));
                            }
                            return true;
                        case 4002:
                            InterfaceC23243n interfaceC23243nA19 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i48 = parcel.readInt();
                            String string2 = parcel.readString();
                            A1 a120 = (A1) this;
                            if (interfaceC23243nA19 != null) {
                                if (TextUtils.isEmpty(string2)) {
                                    androidx.media3.common.util.s.g();
                                } else {
                                    a120.f4(interfaceC23243nA19, i48, null, 50004, new C23268v1(new C23228i(string2, 14), 0));
                                }
                            }
                            return true;
                        case 4003:
                            InterfaceC23243n interfaceC23243nA20 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i49 = parcel.readInt();
                            String string3 = parcel.readString();
                            int i52 = parcel.readInt();
                            int i53 = parcel.readInt();
                            Bundle bundle7 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                            A1 a121 = (A1) this;
                            if (interfaceC23243nA20 != null) {
                                if (!TextUtils.isEmpty(string3) && i52 >= 0 && i53 >= 1) {
                                    a121.f4(interfaceC23243nA20, i49, null, 50003, new C23268v1(new C23214d0(string3, i52, i53, bundle7 != null ? (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle7) : null), 0));
                                } else {
                                    androidx.media3.common.util.s.g();
                                }
                            }
                            return true;
                        case 4004:
                            InterfaceC23243n interfaceC23243nA21 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i54 = parcel.readInt();
                            String string4 = parcel.readString();
                            Bundle bundle8 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                            A1 a122 = (A1) this;
                            if (interfaceC23243nA21 != null) {
                                if (TextUtils.isEmpty(string4)) {
                                    androidx.media3.common.util.s.g();
                                } else {
                                    a122.f4(interfaceC23243nA21, i54, null, 50005, new C23268v1(new C23228i(string4, bundle8 != null ? (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle8) : null, 26), 0));
                                }
                            }
                            return true;
                        case 4005:
                            InterfaceC23243n interfaceC23243nA22 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i55 = parcel.readInt();
                            String string5 = parcel.readString();
                            int i56 = parcel.readInt();
                            int i57 = parcel.readInt();
                            Bundle bundle9 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                            A1 a123 = (A1) this;
                            if (interfaceC23243nA22 != null) {
                                if (!TextUtils.isEmpty(string5) && i56 >= 0 && i57 >= 1) {
                                    a123.f4(interfaceC23243nA22, i55, null, 50006, new C23268v1(new C23261t0(string5, i56, i57, bundle9 != null ? (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle9) : null), 0));
                                } else {
                                    androidx.media3.common.util.s.g();
                                }
                            }
                            return true;
                        case 4006:
                            InterfaceC23243n interfaceC23243nA23 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i58 = parcel.readInt();
                            String string6 = parcel.readString();
                            Bundle bundle10 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                            A1 a124 = (A1) this;
                            if (interfaceC23243nA23 != null) {
                                if (TextUtils.isEmpty(string6)) {
                                    androidx.media3.common.util.s.g();
                                } else {
                                    a124.f4(interfaceC23243nA23, i58, null, 50001, new C23268v1(new C23259s1(string6, bundle10 != null ? (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle10) : null), 0));
                                }
                            }
                            return true;
                        case 4007:
                            InterfaceC23243n interfaceC23243nA24 = M1.a("androidx.media3.session.IMediaSession", parcel);
                            int i59 = parcel.readInt();
                            String string7 = parcel.readString();
                            A1 a125 = (A1) this;
                            if (interfaceC23243nA24 != null) {
                                if (TextUtils.isEmpty(string7)) {
                                    androidx.media3.common.util.s.g();
                                } else {
                                    a125.f4(interfaceC23243nA24, i59, null, 50002, new C23268v1(new C23259s1(string7), 0));
                                }
                            }
                            return true;
                        default:
                            return super.onTransact(i12, parcel, parcel2, i13);
                    }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: IMediaSession.java */
    /* renamed from: androidx.media3.session.o$a */
    public static class a implements InterfaceC23246o {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void D2(InterfaceC23243n interfaceC23243n) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void D0(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void K2(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void K3(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void T1(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void Z0(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void b4(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void k1(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void r(InterfaceC23243n interfaceC23243n, int i12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void C3(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void E0(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void H1(InterfaceC23243n interfaceC23243n, int i12, int i13) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void J3(InterfaceC23243n interfaceC23243n, int i12, Surface surface) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void Q1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void W0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void a0(InterfaceC23243n interfaceC23243n, int i12, long j12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void a1(InterfaceC23243n interfaceC23243n, int i12, int i13) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void a3(InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void h0(InterfaceC23243n interfaceC23243n, int i12, int i13) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void i2(InterfaceC23243n interfaceC23243n, int i12, int i13) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void j2(InterfaceC23243n interfaceC23243n, int i12, float f12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void k2(InterfaceC23243n interfaceC23243n, int i12, float f12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void m1(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void n3(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void q0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void q2(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void A0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void B3(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void E2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void L0(InterfaceC23243n interfaceC23243n, int i12, boolean z12, int i13) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void M0(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, Bundle bundle2) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void Z(InterfaceC23243n interfaceC23243n, int i12, Bundle bundle, long j12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void e3(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, boolean z12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void z1(InterfaceC23243n interfaceC23243n, int i12, int i13, IBinder iBinder) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void N0(InterfaceC23243n interfaceC23243n, int i12, IBinder iBinder, int i13, long j12) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void O2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, IBinder iBinder) {
        }

        @Override // androidx.media3.session.InterfaceC23246o
        public final void n0(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, int i15) {
        }
    }
}
