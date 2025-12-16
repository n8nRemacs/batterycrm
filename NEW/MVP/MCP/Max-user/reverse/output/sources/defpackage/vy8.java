package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vy8 extends Binder implements ya7 {
    public final WeakReference c;

    public vy8(ly8 ly8Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(ly8Var);
    }

    public static ya7 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ya7)) {
            return (ya7) iInterfaceQueryLocalInterface;
        }
        xa7 xa7Var = new xa7();
        xa7Var.c = iBinder;
        return xa7Var;
    }

    public final void A(uy8 uy8Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ly8 ly8Var = (ly8) this.c.get();
            if (ly8Var == null) {
                return;
            }
            zxg.a0(ly8Var.a.o, new qz5(ly8Var, 24, uy8Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ya7
    public final void P(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(o4c.d, z);
        bundle2.putBoolean(o4c.e, true);
        w(i, bundle, bundle2);
    }

    @Override // defpackage.ya7
    public final void R(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            T(i, yie.a(bundle));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final int S() {
        tje tjeVar;
        ly8 ly8Var = (ly8) this.c.get();
        if (ly8Var == null || (tjeVar = ly8Var.l) == null) {
            return -1;
        }
        return tjeVar.a.e();
    }

    public final void T(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ly8 ly8Var = (ly8) this.c.get();
            if (ly8Var == null) {
                return;
            }
            ly8Var.b.A(i, obj);
            ly8Var.a.z(new l30(ly8Var, i, 12));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ya7
    public final void b(int i) {
        A(new zb8(24));
    }

    @Override // defpackage.ya7
    public final void c(int i, PendingIntent pendingIntent) {
        A(new ty8(i, pendingIntent));
    }

    @Override // defpackage.ya7
    public final void n(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            A(new sl6(21, js3.a(bundle)));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected();
        }
    }

    @Override // defpackage.ya7
    public final void onDisconnected() {
        A(new zb8(25));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle = (Bundle) yei.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                a8i.l("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            } else if (i3 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                wy1.p(i3, str, "MediaControllerStub");
            } else if (bundle == null) {
                A(new zb8(26));
            } else {
                try {
                    f19.a(bundle);
                    A(new zb8(26));
                } catch (RuntimeException e) {
                    a8i.m("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                }
            }
        } else if (i != 4002) {
            switch (i) {
                case 3001:
                    n(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    R(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    z(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    int i4 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            int iS = S();
                            if (iS == -1) {
                                break;
                            } else {
                                tg7 tg7VarI = wg7.i();
                                for (int i5 = 0; i5 < arrayListCreateTypedArrayList.size(); i5++) {
                                    Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(i5);
                                    bundle2.getClass();
                                    tg7VarI.a(bg3.d(iS, bundle2));
                                }
                                A(new ad0(i4, tg7VarI.i(), 9));
                                break;
                            }
                        } catch (RuntimeException e2) {
                            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e2);
                            break;
                        }
                    }
                    break;
                case 3005:
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    v(i6, (Bundle) yei.a(parcel, creator), (Bundle) yei.a(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    onDisconnected();
                    return true;
                case 3007:
                    P(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    u(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    t(parcel.readInt(), (Bundle) yei.a(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) yei.a(parcel, creator2);
                    Bundle bundle4 = (Bundle) yei.a(parcel, creator2);
                    if (bundle3 != null && bundle4 != null) {
                        try {
                            try {
                                A(new dq4(bie.a(bundle3), 17, o3c.b(bundle4)));
                                break;
                            } catch (RuntimeException e3) {
                                a8i.m("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
                                break;
                            }
                        } catch (RuntimeException e4) {
                            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e4);
                            break;
                        }
                    }
                    break;
                case 3011:
                    b(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundle5 = (Bundle) yei.a(parcel, Bundle.CREATOR);
                    if (bundle5 == null) {
                        a8i.l("MediaControllerStub", "Ignoring null Bundle for extras");
                        return true;
                    }
                    A(new sl6(20, bundle5));
                    return true;
                case 3013:
                    int i7 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    w(i7, (Bundle) yei.a(parcel, creator3), (Bundle) yei.a(parcel, creator3));
                    return true;
                case 3014:
                    c(parcel.readInt(), (PendingIntent) yei.a(parcel, PendingIntent.CREATOR));
                    return true;
                case 3015:
                    try {
                        A(new sl6(parcel.readInt(), mie.a((Bundle) yei.a(parcel, Bundle.CREATOR))));
                        break;
                    } catch (RuntimeException e5) {
                        a8i.m("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e5);
                        break;
                    }
                case 3016:
                    int i8 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList2 != null) {
                        try {
                            int iS2 = S();
                            if (iS2 == -1) {
                                break;
                            } else {
                                tg7 tg7VarI2 = wg7.i();
                                for (int i9 = 0; i9 < arrayListCreateTypedArrayList2.size(); i9++) {
                                    Bundle bundle6 = (Bundle) arrayListCreateTypedArrayList2.get(i9);
                                    bundle6.getClass();
                                    tg7VarI2.a(bg3.d(iS2, bundle6));
                                }
                                A(new ad0(i8, tg7VarI2.i(), 8));
                                break;
                            }
                        } catch (RuntimeException e6) {
                            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e6);
                            break;
                        }
                    }
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle7 = (Bundle) yei.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                a8i.l("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (i3 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                wy1.p(i3, str, "MediaControllerStub");
            } else if (bundle7 == null) {
                A(new zb8(26));
            } else {
                try {
                    f19.a(bundle7);
                    A(new zb8(26));
                } catch (RuntimeException e7) {
                    a8i.m("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e7);
                }
            }
        }
        return true;
    }

    @Override // defpackage.ya7
    public final void t(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            A(new sy8(o3c.b(bundle)));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.ya7
    public final void u(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            A(new sl6(18, wie.b(bundle)));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.ya7
    public final void v(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            a8i.l("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            A(new ad0(i, aie.a(bundle), bundle2));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.ya7
    public final void w(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iS = S();
            if (iS == -1) {
                return;
            }
            try {
                A(new dq4(q4c.m(iS, bundle), 16, new o4c(bundle2.getBoolean(o4c.d, false), bundle2.getBoolean(o4c.e, false))));
            } catch (RuntimeException e) {
                a8i.m("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.ya7
    public final void z(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            T(i, b38.a(bundle));
        } catch (RuntimeException e) {
            a8i.m("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }
}
