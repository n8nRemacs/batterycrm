package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class xz3 extends l0g {
    public final /* synthetic */ int c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz3(tm9 tm9Var, int i) {
        super(tm9Var);
        this.c = i;
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        ArrayList arrayList;
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("contactIds")) {
                    this.d = new ArrayList();
                    int iF = efi.f(tm9Var);
                    for (int i = 0; i < iF; i++) {
                        ((List) this.d).add(Long.valueOf(tm9Var.t0()));
                    }
                    break;
                } else {
                    tm9Var.v();
                    break;
                }
            case 1:
                str.getClass();
                if (str.equals("mentions")) {
                    this.d = sz.e(tm9Var);
                    break;
                } else {
                    tm9Var.v();
                    break;
                }
            default:
                str.getClass();
                if (str.equals("locations")) {
                    LinkedHashMap linkedHashMap = null;
                    if (tm9Var.w().a() == 8) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int iU0 = tm9Var.u0();
                        for (int i2 = 0; i2 < iU0; i2++) {
                            Long lValueOf = Long.valueOf(efi.l(tm9Var, 0L));
                            if (tm9Var.w().a() == 7) {
                                arrayList = new ArrayList();
                                int iN0 = tm9Var.n0();
                                for (int i3 = 0; i3 < iN0; i3++) {
                                    arrayList.add(df8.a(tm9Var));
                                }
                            } else {
                                tm9Var.v();
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                linkedHashMap2.put(lValueOf, arrayList);
                            }
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        tm9Var.v();
                    }
                    this.d = linkedHashMap;
                    break;
                } else {
                    tm9Var.v();
                    break;
                }
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        switch (this.c) {
            case 0:
                return wy1.e(zdi.a((List) this.d), "{contactIds=", "}");
            case 1:
                return wy1.e(zdi.a((sz) this.d), "Response{mentions=", "}");
            default:
                return "Response{locations=" + ((LinkedHashMap) this.d) + "}";
        }
    }
}
