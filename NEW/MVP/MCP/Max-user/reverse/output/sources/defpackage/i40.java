package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class i40 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ i40(vhg vhgVar, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.h = vhgVar;
        this.c = viewGroup;
        this.d = obj;
        this.e = view;
        this.f = obj2;
        this.b = z;
        this.g = obj3;
    }

    public void a() {
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        TabLayout tabLayout = (TabLayout) this.c;
        if (this.b) {
            return;
        }
        this.b = true;
        my6 my6Var = new my6(tabLayout, 1);
        viewPager2.b(my6Var);
        this.g = my6Var;
        ac4 ac4Var = new ac4(viewPager2, 0);
        tabLayout.a(ac4Var);
        this.h = ac4Var;
        tabLayout.o(viewPager2.getCurrentItem(), 0.0f, true, true, true);
        ((md6) this.e).invoke();
    }

    public ak4 b() {
        hsi.g(!this.b);
        this.b = true;
        if (((sa9) this.e) == null) {
            this.e = new sa9(new l50[0]);
        }
        if (((xt4) this.h) == null) {
            this.h = new xt4((Context) this.c);
        }
        return new ak4(this);
    }

    public void c() {
        if (this.b) {
            ac4 ac4Var = (ac4) this.h;
            if (ac4Var != null) {
                ((TabLayout) this.c).k(ac4Var);
            }
            this.h = null;
            my6 my6Var = (my6) this.g;
            if (my6Var != null) {
                ((ViewPager2) this.d).g(my6Var);
            }
            this.g = null;
            this.b = false;
            ((md6) this.f).invoke();
        }
    }

    public void d(ecb ecbVar) {
        fvf callback;
        int iOrdinal = ecbVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            gvf gvfVar = (gvf) this.e;
            if (gvfVar != null && (callback = gvfVar.getCallback()) != null) {
                callback.onDismiss();
            }
            dcb dcbVar = (dcb) this.f;
            if (dcbVar != null) {
                dcbVar.l(ecbVar);
                return;
            }
            return;
        }
        gvf gvfVar2 = (gvf) this.e;
        if (gvfVar2 != null) {
            l3b l3bVar = new l3b(this, 2, ecbVar);
            fvf fvfVar = gvfVar2.d;
            if (fvfVar == null) {
                return;
            }
            if (fvfVar.m().getHeight() > 0) {
                gvfVar2.c(fvfVar.g(), fvfVar.o(), new sue(l3bVar, 4, fvfVar), new nte(26), new evf(gvfVar2, 1));
            }
            gvfVar2.invalidate();
        }
    }

    public void e() {
        ArrayList arrayList;
        us usVar;
        View view;
        boolean z;
        ArrayList arrayList2;
        Rect rect;
        char c;
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 5:
                eve eveVar = (eve) this.h;
                ViewGroup viewGroup = (ViewGroup) this.c;
                View view2 = (View) this.d;
                View view3 = (View) this.e;
                shg shgVar = (shg) this.f;
                boolean z2 = this.b;
                View view4 = new View(viewGroup.getContext());
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                us usVar2 = eveVar.Y;
                if (view3 != null && view2 != null) {
                    if (usVar2.isEmpty() || eveVar.v0 == null) {
                        usVar2.clear();
                        usVar = null;
                    } else {
                        usVar = new us(0);
                        vfi.e(usVar, view2);
                        usVar.l(new ArrayList(usVar2.keySet()));
                        usVar2.l(usVar.keySet());
                    }
                    if (usVar2.isEmpty()) {
                        eveVar.v0 = null;
                    } else if (usVar != null) {
                        arrayList3.addAll(usVar.values());
                    }
                    if (eveVar.u0 != null || eveVar.t0 != null || eveVar.v0 != null) {
                        if (eveVar.v0 != null) {
                            Rect rect2 = new Rect();
                            shg shgVar2 = eveVar.v0;
                            ArrayList arrayList5 = shgVar2.X;
                            arrayList5.clear();
                            int size = arrayList3.size();
                            view = view3;
                            int i4 = 0;
                            while (i4 < size) {
                                int i5 = i4;
                                View view5 = (View) arrayList3.get(i4);
                                boolean z3 = z2;
                                int size2 = arrayList5.size();
                                ArrayList arrayList6 = arrayList4;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < size2) {
                                        i = size;
                                        if (arrayList5.get(i6) == view5) {
                                            break;
                                        }
                                        i6++;
                                        size = i;
                                    } else {
                                        i = size;
                                        arrayList5.add(view5);
                                        int i7 = size2;
                                        while (i7 < arrayList5.size()) {
                                            View view6 = (View) arrayList5.get(i7);
                                            if (view6 instanceof ViewGroup) {
                                                ViewGroup viewGroup2 = (ViewGroup) view6;
                                                int childCount = viewGroup2.getChildCount();
                                                i2 = i7;
                                                int i8 = 0;
                                                while (i8 < childCount) {
                                                    int i9 = childCount;
                                                    View childAt = viewGroup2.getChildAt(i8);
                                                    int i10 = i8;
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 < size2) {
                                                            i3 = size2;
                                                            if (arrayList5.get(i11) == childAt) {
                                                                break;
                                                            }
                                                            i11++;
                                                            size2 = i3;
                                                        } else {
                                                            i3 = size2;
                                                            arrayList5.add(childAt);
                                                        }
                                                    }
                                                    i8 = i10 + 1;
                                                    childCount = i9;
                                                    size2 = i3;
                                                }
                                            } else {
                                                i2 = i7;
                                            }
                                            i7 = i2 + 1;
                                            size2 = size2;
                                        }
                                    }
                                }
                                i4 = i5 + 1;
                                z2 = z3;
                                arrayList4 = arrayList6;
                                size = i;
                            }
                            z = z2;
                            arrayList2 = arrayList4;
                            arrayList5.add(view4);
                            arrayList3.add(view4);
                            vfi.a(shgVar2, arrayList3);
                            if (usVar2.c > 0 && usVar != null) {
                                View view7 = (View) usVar.get(usVar2.f(0));
                                shg shgVar3 = eveVar.v0;
                                if (shgVar3 == null || view7 == null) {
                                    c = 1;
                                } else {
                                    Rect rect3 = new Rect();
                                    int[] iArr = new int[2];
                                    view7.getLocationOnScreen(iArr);
                                    int i12 = iArr[0];
                                    c = 1;
                                    rect3.set(i12, iArr[1], view7.getWidth() + i12, view7.getHeight() + iArr[1]);
                                    shgVar3.J(new ave(1, rect3));
                                }
                                shg shgVar4 = eveVar.t0;
                                if (shgVar4 != null && view7 != null) {
                                    Rect rect4 = new Rect();
                                    int[] iArr2 = new int[2];
                                    view7.getLocationOnScreen(iArr2);
                                    int i13 = iArr2[0];
                                    rect4.set(i13, iArr2[c], view7.getWidth() + i13, view7.getHeight() + iArr2[c]);
                                    shgVar4.J(new ave(1, rect4));
                                }
                            }
                            shg shgVar5 = eveVar.u0;
                            if (shgVar5 != null) {
                                shgVar5.J(new ave(0, rect2));
                            }
                            rect = rect2;
                        } else {
                            view = view3;
                            z = z2;
                            arrayList2 = arrayList4;
                            rect = null;
                        }
                        view3 = view;
                        arrayList4 = arrayList2;
                        cve.a(viewGroup, new zue(eveVar, view3, z, arrayList4, view4, arrayList3, rect));
                    }
                }
                shg shgVar6 = eveVar.t0;
                if (shgVar6 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    if (view2 != null) {
                        eve.n(arrayList7, view2);
                    }
                    arrayList7.removeAll(arrayList3);
                    if (!arrayList7.isEmpty()) {
                        arrayList7.add(view4);
                        vfi.a(shgVar6, arrayList7);
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    eveVar.t0 = null;
                }
                shg shgVar7 = eveVar.u0;
                if (shgVar7 != null) {
                    shgVar7.b(view4);
                }
                ArrayList arrayList8 = new ArrayList();
                shgVar.a(new bve(eveVar.u0, arrayList8, eveVar.t0, arrayList, eveVar.v0, arrayList4));
                cve.a(viewGroup, new zue(eveVar, view4, view3, arrayList4, arrayList8, arrayList));
                boolean z4 = false;
                cve.a(viewGroup, new zn6(eveVar, arrayList4, z4, 27));
                cve.a(viewGroup, new c5e(eveVar, arrayList4, z4, 2));
                ((i40) this.g).e();
                break;
            default:
                shg shgVar8 = (shg) this.d;
                ViewGroup viewGroup3 = (ViewGroup) this.c;
                vhg vhgVar = (vhg) this.h;
                if (!vhgVar.d) {
                    zhg.a(viewGroup3, shgVar8);
                    vhgVar.k((ViewGroup) this.c, (View) this.e, (View) this.f, shgVar8, this.b);
                    viewGroup3.post((thg) this.g);
                    break;
                }
                break;
        }
    }

    public void f() {
        if (((Long) this.g) == null || this.b) {
            return;
        }
        this.b = true;
        pe8 pe8Var = (pe8) ((pb3) ((k18) this.f).getValue());
        pe8Var.K0.O(pe8Var, pe8.U0[24], Boolean.TRUE);
    }

    public i40(hfd hfdVar, zid zidVar, y6d y6dVar, si1 si1Var) {
        this.a = 3;
        this.h = null;
        this.b = false;
        this.c = hfdVar;
        this.d = zidVar;
        this.e = y6dVar;
        this.g = new e01(1, this);
        this.f = si1Var;
    }

    public i40(l7a l7aVar, ContextScope contextScope, k18 k18Var) {
        this.a = 0;
        this.c = l7aVar;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.d = jveVarB;
        this.e = new gbd(jveVarB);
        this.f = k18Var;
        pe8 pe8Var = (pe8) ((pb3) k18Var.getValue());
        boolean zBooleanValue = ((Boolean) pe8Var.K0.D(pe8Var, pe8.U0[24])).booleanValue();
        this.b = zBooleanValue;
        a3b a3bVar = new a3b(3, this);
        this.h = a3bVar;
        if (zBooleanValue) {
            return;
        }
        ((b8a) l7aVar).b(a3bVar);
        eoi.e(contextScope.getCoroutineContext()).invokeOnCompletion(new k(10, this));
    }

    public i40(neb nebVar, ViewPager2 viewPager2, md6 md6Var, md6 md6Var2) {
        this.a = 1;
        this.c = nebVar;
        this.d = viewPager2;
        this.e = md6Var;
        this.f = md6Var2;
    }

    public i40(WeakReference weakReference) {
        this.a = 4;
        this.c = weakReference;
        this.d = cdb.Z;
        this.g = new rk(6, this);
        this.h = new fcb(this);
    }

    public i40(Context context) {
        this.a = 2;
        this.c = context;
        this.d = u20.c;
        this.f = lcj.u0;
        this.g = kc3.v0;
    }
}
