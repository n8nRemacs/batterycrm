package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.material.ComGoogleAndroidMaterialR$style;
import defpackage.dz7;
import defpackage.kyd;
import defpackage.m44;
import defpackage.mvd;
import defpackage.ol6;
import defpackage.qc;
import defpackage.xp8;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* loaded from: classes2.dex */
public class FrgDlgPermissions extends FrgDlgBase {
    public static final int C1 = mvd.e2;
    public static final int D1 = mvd.H;
    public boolean B1;

    public static FrgDlgPermissions y0(String[] strArr, int i, int i2, int i3, boolean z) {
        FrgDlgPermissions frgDlgPermissions = new FrgDlgPermissions();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ru.ok.tamtam.extra.PERMISSIONS", strArr);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", i3);
        bundle.putInt("ru.ok.tamtam.extra.TITLE", i);
        bundle.putInt("ru.ok.tamtam.extra.CONTENT", i2);
        bundle.putBoolean("ru.ok.tamtam.extra.MODE_SETTINGS", z);
        frgDlgPermissions.n0(bundle);
        return frgDlgPermissions;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dz7 dz7VarT = t();
        if (dz7VarT instanceof ol6) {
            ((ol6) dz7VarT).b();
        }
        kyd kydVar = this.G0;
        if (kydVar instanceof ol6) {
            ((ol6) kydVar).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [nl6] */
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        Bundle bundleJ0 = j0();
        this.B1 = bundleJ0.getBoolean("ru.ok.tamtam.extra.MODE_SETTINGS");
        int i = bundleJ0.getInt("ru.ok.tamtam.extra.CONTENT");
        int i2 = bundleJ0.getInt("ru.ok.tamtam.extra.TITLE", C1);
        int i3 = bundleJ0.getInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", D1);
        xp8 xp8Var = new xp8(new m44(k0(), ComGoogleAndroidMaterialR$style.Theme_MaterialComponents), 0);
        qc qcVar = xp8Var.a;
        qcVar.d = qcVar.a.getText(i2);
        qcVar.f = qcVar.a.getText(i);
        final int i4 = 0;
        xp8 xp8VarA = xp8Var.a(i3, new DialogInterface.OnClickListener(this) { // from class: nl6
            public final /* synthetic */ FrgDlgPermissions b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                int i6 = i4;
                FrgDlgPermissions frgDlgPermissions = this.b;
                switch (i6) {
                    case 0:
                        if (!frgDlgPermissions.B1) {
                            if (!frgDlgPermissions.j0().getBoolean("use.result.api", false)) {
                                String[] stringArray = frgDlgPermissions.j0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                                a aVarZ = frgDlgPermissions.z(true);
                                if (aVarZ == null) {
                                    b bVarT = frgDlgPermissions.t();
                                    if (bVarT != null) {
                                        z7.i(bVarT, stringArray, frgDlgPermissions.A());
                                        if (lfi.e == null) {
                                            lfi.e = bVarT.getSharedPreferences("permissions_prefs", 0);
                                        }
                                        lfi.d(lfi.e, stringArray);
                                        break;
                                    }
                                } else {
                                    try {
                                        aVarZ.h0(stringArray, frgDlgPermissions.A());
                                        Context contextV = aVarZ.v();
                                        if (lfi.e == null) {
                                            lfi.e = contextV.getSharedPreferences("permissions_prefs", 0);
                                        }
                                        lfi.d(lfi.e, stringArray);
                                        break;
                                    } catch (Exception e) {
                                        eza ezaVar = uvi.a;
                                        (ezaVar != null ? ezaVar : null).getClass();
                                        wqi.e("lfi", "Can't request permission", e);
                                        return;
                                    }
                                }
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("dialog:permissions:result", true);
                                frgDlgPermissions.x().b0(frgDlgPermissions.J0, bundle);
                                break;
                            }
                        } else {
                            dz7 dz7VarT = frgDlgPermissions.t();
                            if (dz7VarT instanceof ol6) {
                                ((ol6) dz7VarT).i();
                            }
                            kyd kydVar = frgDlgPermissions.G0;
                            if (kydVar instanceof ol6) {
                                ((ol6) kydVar).i();
                                break;
                            }
                        }
                        break;
                    default:
                        int i7 = FrgDlgPermissions.C1;
                        b bVarT2 = frgDlgPermissions.t();
                        if (bVarT2 != null) {
                            bVarT2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", bVarT2.getPackageName(), null)));
                        }
                        dz7 dz7VarT2 = frgDlgPermissions.t();
                        if (dz7VarT2 instanceof ol6) {
                            ((ol6) dz7VarT2).g();
                        }
                        kyd kydVar2 = frgDlgPermissions.G0;
                        if (kydVar2 instanceof ol6) {
                            ((ol6) kydVar2).g();
                            break;
                        }
                        break;
                }
            }
        });
        qc qcVar2 = xp8VarA.a;
        qcVar2.m = false;
        if (this.B1) {
            int i5 = mvd.d1;
            final int i6 = 1;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: nl6
                public final /* synthetic */ FrgDlgPermissions b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i52) {
                    int i62 = i6;
                    FrgDlgPermissions frgDlgPermissions = this.b;
                    switch (i62) {
                        case 0:
                            if (!frgDlgPermissions.B1) {
                                if (!frgDlgPermissions.j0().getBoolean("use.result.api", false)) {
                                    String[] stringArray = frgDlgPermissions.j0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                                    a aVarZ = frgDlgPermissions.z(true);
                                    if (aVarZ == null) {
                                        b bVarT = frgDlgPermissions.t();
                                        if (bVarT != null) {
                                            z7.i(bVarT, stringArray, frgDlgPermissions.A());
                                            if (lfi.e == null) {
                                                lfi.e = bVarT.getSharedPreferences("permissions_prefs", 0);
                                            }
                                            lfi.d(lfi.e, stringArray);
                                            break;
                                        }
                                    } else {
                                        try {
                                            aVarZ.h0(stringArray, frgDlgPermissions.A());
                                            Context contextV = aVarZ.v();
                                            if (lfi.e == null) {
                                                lfi.e = contextV.getSharedPreferences("permissions_prefs", 0);
                                            }
                                            lfi.d(lfi.e, stringArray);
                                            break;
                                        } catch (Exception e) {
                                            eza ezaVar = uvi.a;
                                            (ezaVar != null ? ezaVar : null).getClass();
                                            wqi.e("lfi", "Can't request permission", e);
                                            return;
                                        }
                                    }
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("dialog:permissions:result", true);
                                    frgDlgPermissions.x().b0(frgDlgPermissions.J0, bundle);
                                    break;
                                }
                            } else {
                                dz7 dz7VarT = frgDlgPermissions.t();
                                if (dz7VarT instanceof ol6) {
                                    ((ol6) dz7VarT).i();
                                }
                                kyd kydVar = frgDlgPermissions.G0;
                                if (kydVar instanceof ol6) {
                                    ((ol6) kydVar).i();
                                    break;
                                }
                            }
                            break;
                        default:
                            int i7 = FrgDlgPermissions.C1;
                            b bVarT2 = frgDlgPermissions.t();
                            if (bVarT2 != null) {
                                bVarT2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", bVarT2.getPackageName(), null)));
                            }
                            dz7 dz7VarT2 = frgDlgPermissions.t();
                            if (dz7VarT2 instanceof ol6) {
                                ((ol6) dz7VarT2).g();
                            }
                            kyd kydVar2 = frgDlgPermissions.G0;
                            if (kydVar2 instanceof ol6) {
                                ((ol6) kydVar2).g();
                                break;
                            }
                            break;
                    }
                }
            };
            qcVar2.k = qcVar2.a.getText(i5);
            qcVar2.l = onClickListener;
        }
        return xp8VarA.create();
    }
}
