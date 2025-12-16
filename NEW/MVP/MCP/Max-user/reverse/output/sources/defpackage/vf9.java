package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class vf9 implements Menu {
    public static final int[] I0 = {1, 4, 5, 3, 2, 0};
    public zf9 F0;
    public boolean H0;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public tf9 o;
    public final ArrayList s0;
    public final ArrayList t0;
    public boolean u0;
    public CharSequence w0;
    public Drawable x0;
    public View y0;
    public int v0 = 0;
    public boolean z0 = false;
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public final ArrayList D0 = new ArrayList();
    public final CopyOnWriteArrayList E0 = new CopyOnWriteArrayList();
    public boolean G0 = false;

    public vf9(Context context) {
        boolean zB;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = true;
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.u0 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zB = jfh.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z = true;
            }
        }
        this.d = z;
    }

    public final zf9 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (I0[i5] << 16) | (65535 & i3);
        zf9 zf9Var = new zf9(this, i, i2, i3, i6, charSequence, this.v0);
        ArrayList arrayList = this.X;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((zf9) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, zf9Var);
        p(true);
        return zf9Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            zf9 zf9VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            zf9VarA.setIcon(resolveInfo.loadIcon(packageManager));
            zf9VarA.Y = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = zf9VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(mg9 mg9Var, Context context) {
        this.E0.add(new WeakReference(mg9Var));
        mg9Var.k(context, this);
        this.u0 = true;
    }

    public final void c(boolean z) {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            mg9 mg9Var = (mg9) weakReference.get();
            if (mg9Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                mg9Var.f(this, z);
            }
        }
        this.C0 = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        zf9 zf9Var = this.F0;
        if (zf9Var != null) {
            d(zf9Var);
        }
        this.X.clear();
        p(true);
    }

    public final void clearHeader() {
        this.x0 = null;
        this.w0 = null;
        this.y0 = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(zf9 zf9Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.F0 == zf9Var) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                mg9 mg9Var = (mg9) weakReference.get();
                if (mg9Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD = mg9Var.d(zf9Var);
                    if (zD) {
                        break;
                    }
                }
            }
            v();
            if (zD) {
                this.F0 = null;
            }
        }
        return zD;
    }

    public boolean e(vf9 vf9Var, MenuItem menuItem) {
        tf9 tf9Var = this.o;
        return tf9Var != null && tf9Var.b(vf9Var, menuItem);
    }

    public boolean f(zf9 zf9Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            mg9 mg9Var = (mg9) weakReference.get();
            if (mg9Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zH = mg9Var.h(zf9Var);
                if (zH) {
                    break;
                }
            }
        }
        v();
        if (zH) {
            this.F0 = zf9Var;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zf9 zf9Var = (zf9) arrayList.get(i2);
            if (zf9Var.a == i) {
                return zf9Var;
            }
            if (zf9Var.hasSubMenu() && (menuItemFindItem = zf9Var.y0.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final zf9 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.D0;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (zf9) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            zf9 zf9Var = (zf9) arrayList.get(i2);
            char c = zN ? zf9Var.t0 : zf9Var.Z;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return zf9Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.X.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zf9 zf9Var = (zf9) arrayList.get(i2);
                if (zf9Var.hasSubMenu()) {
                    zf9Var.y0.h(list, i, keyEvent);
                }
                char c = zN ? zf9Var.t0 : zf9Var.Z;
                if ((modifiers & 69647) == ((zN ? zf9Var.u0 : zf9Var.s0) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && zf9Var.isEnabled()) {
                        list.add(zf9Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.H0) {
            return true;
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zf9) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.u0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                mg9 mg9Var = (mg9) weakReference.get();
                if (mg9Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= mg9Var.c();
                }
            }
            ArrayList arrayList = this.s0;
            ArrayList arrayList2 = this.t0;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    zf9 zf9Var = (zf9) arrayListL.get(i);
                    if ((zf9Var.H0 & 32) == 32) {
                        arrayList.add(zf9Var);
                    } else {
                        arrayList2.add(zf9Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.u0 = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public vf9 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.Z;
        ArrayList arrayList = this.Y;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.X;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            zf9 zf9Var = (zf9) arrayList2.get(i);
            if (zf9Var.isVisible()) {
                arrayList.add(zf9Var);
            }
        }
        this.Z = false;
        this.u0 = true;
        return arrayList;
    }

    public boolean m() {
        return this.G0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.z0) {
            this.A0 = true;
            if (z) {
                this.B0 = true;
                return;
            }
            return;
        }
        if (z) {
            this.Z = true;
            this.u0 = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            mg9 mg9Var = (mg9) weakReference.get();
            if (mg9Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                mg9Var.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        zf9 zf9VarG = g(i, keyEvent);
        boolean zQ = zf9VarG != null ? q(zf9VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, defpackage.mg9 r8, int r9) {
        /*
            r6 = this;
            zf9 r7 = (defpackage.zf9) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            vf9 r1 = r7.x0
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.z0
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L41
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.Y
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            m7 r1 = r7.K0
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
            goto L1a
        L40:
            r1 = r0
        L41:
            m7 r2 = r7.K0
            if (r2 == 0) goto L4d
            boolean r4 = r2.a()
            if (r4 == 0) goto L4d
            r4 = r3
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.d()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.c(r3)
            goto Lcb
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L69
            goto L71
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.c(r3)
            goto Lcb
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.c(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            qnf r9 = new qnf
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.y0 = r9
            java.lang.CharSequence r5 = r7.o
            r9.setHeaderTitle(r5)
        L8c:
            qnf r7 = r7.y0
            if (r4 == 0) goto L93
            r2.f(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.E0
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.b(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            mg9 r4 = (defpackage.mg9) r4
            if (r4 != 0) goto Lbe
            r9.remove(r2)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.b(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.c(r3)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf9.q(android.view.MenuItem, mg9, int):boolean");
    }

    public final void r(mg9 mg9Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.E0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            mg9 mg9Var2 = (mg9) weakReference.get();
            if (mg9Var2 == null || mg9Var2 == mg9Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((zf9) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((zf9) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.X;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((zf9) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.X;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((qnf) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zf9 zf9Var = (zf9) arrayList.get(i2);
            if (zf9Var.b == i) {
                zf9Var.H0 = (zf9Var.H0 & (-5)) | (z2 ? 4 : 0);
                zf9Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.G0 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zf9 zf9Var = (zf9) arrayList.get(i2);
            if (zf9Var.b == i) {
                zf9Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            zf9 zf9Var = (zf9) arrayList.get(i2);
            if (zf9Var.b == i) {
                int i3 = zf9Var.H0;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                zf9Var.H0 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.X.size();
    }

    public final void t(Bundle bundle) {
        int size = this.X.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((qnf) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.y0 = view;
            this.w0 = null;
            this.x0 = null;
        } else {
            if (i > 0) {
                this.w0 = this.b.getText(i);
            } else if (charSequence != null) {
                this.w0 = charSequence;
            }
            if (i2 > 0) {
                this.x0 = r34.b(this.a, i2);
            } else if (drawable != null) {
                this.x0 = drawable;
            }
            this.y0 = null;
        }
        p(false);
    }

    public final void v() {
        this.z0 = false;
        if (this.A0) {
            this.A0 = false;
            p(this.B0);
        }
    }

    public final void w() {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        this.A0 = false;
        this.B0 = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        zf9 zf9VarA = a(i, i2, i3, charSequence);
        qnf qnfVar = new qnf(this.a, this, zf9VarA);
        zf9VarA.y0 = qnfVar;
        qnfVar.setHeaderTitle(zf9VarA.o);
        return qnfVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
