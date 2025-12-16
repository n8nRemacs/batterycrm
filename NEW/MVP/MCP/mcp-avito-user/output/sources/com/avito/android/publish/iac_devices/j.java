package com.avito.android.publish.iac_devices;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import lV.C43685a;
import lV.C43687c;
import lV.InterfaceC43686b;

/* compiled from: IacDevicesSelectRe23Dialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_devices/j;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f236048K = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final N f236049E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final ArrayList f236050F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f236051G;

    /* renamed from: H, reason: collision with root package name */
    public Button f236052H;

    /* renamed from: I, reason: collision with root package name */
    public View f236053I;

    /* renamed from: J, reason: collision with root package name */
    public LinearLayout f236054J;

    /* compiled from: IacDevicesSelectRe23Dialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            C43685a c43685a;
            View view2 = view;
            j jVar = (j) this.receiver;
            int i12 = j.f236048K;
            jVar.getClass();
            jVar.f236052H = (Button) view2.findViewById(R.id.devices_btn);
            jVar.f236053I = view2.findViewById(R.id.devices_error_container);
            jVar.f236054J = (LinearLayout) view2.findViewById(R.id.devices_linear);
            Button button = jVar.f236052H;
            if (button == null) {
                button = null;
            }
            button.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(jVar, 13));
            ArrayList arrayList = jVar.f236050F;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IacDevice iacDevice = (IacDevice) it.next();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(jVar.getContext());
                LinearLayout linearLayout = jVar.f236054J;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                ListItemCheckbox listItemCheckbox = (ListItemCheckbox) layoutInflaterFrom.inflate(R.layout.iac_devices_select_dialog_item_re23, (ViewGroup) linearLayout, false);
                listItemCheckbox.setTitle(iacDevice.f236029b);
                listItemCheckbox.setSubtitle(iacDevice.f236031d ? jVar.getContext().getString(R.string.iac_devices_current_device) : null);
                boolean z12 = iacDevice.f236032e;
                C43687c.a aVar = C43687c.f413775i;
                Context context = jVar.getContext();
                int iJ2 = C35835l0.j(R.attr.listItemCheckboxDefaultMedium, jVar.getContext());
                aVar.getClass();
                C43687c c43687cB = C43687c.a.b(iJ2, context);
                C43685a c43685a2 = c43687cB.f413776a;
                if (c43685a2 != null) {
                    c43685a = new C43685a(c43685a2.f413757a, c43685a2.f413758b, c43685a2.f413759c, c43685a2.f413760d, c43685a2.f413761e, c43685a2.f413762f, c43685a2.f413763g, c43685a2.f413764h, c43685a2.f413765i, c43685a2.f413766j, c43685a2.f413767k, c43685a2.f413768l, c43685a2.f413769m, c43685a2.f413770n, c43685a2.f413771o, z12 ? 0 : c43685a2.f413772p);
                } else {
                    c43685a = null;
                }
                listItemCheckbox.setStyle((InterfaceC43686b) C43687c.a(c43687cB, c43685a));
                listItemCheckbox.setChecked(iacDevice.f236032e);
                listItemCheckbox.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(6, jVar, iacDevice));
                LinearLayout linearLayout2 = jVar.f236054J;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                linearLayout2.addView(listItemCheckbox);
            }
            jVar.Y(j.W(arrayList));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k Context context, boolean z12, @Y61.k List<IacDevice> list, @Y61.k Y41.l<? super List<IacDevice>, G0> lVar) {
        super(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23), 0, 2, null);
        this.f236049E = (N) lVar;
        List<IacDevice> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(IacDevice.a((IacDevice) it.next()));
        }
        this.f236050F = arrayList;
        this.f236051G = z12 || V(list);
        NavBar navBar = new NavBar(getContext(), null, 0, 6, null);
        navBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        NavBar.e(navBar, getContext().getString(R.string.iac_devices_choose_title_re23), R.attr.textH50, 4);
        navBar.setBackground(null);
        navBar.c(R.attr.ic_close24, new k(0, this, j.class, "dismiss", "dismiss()V", 0));
        H(navBar);
        E(R.layout.iac_devices_select_dialog_re23, true, new a(1, this, j.class, "createView", "createView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        t();
    }

    public static boolean V(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((IacDevice) it.next()).f236032e) {
                return true;
            }
        }
        return false;
    }

    public static int W(ArrayList arrayList) {
        int i12 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((IacDevice) it.next()).f236032e && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return i12;
    }

    public final void X(int[] iArr) {
        LinearLayout linearLayout = this.f236054J;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C43025h.a aVar = new C43025h.a(C43033p.i(new C22829k0(linearLayout), l.f236055l));
        while (aVar.hasNext()) {
            ((ListItemCheckbox) aVar.next()).setCheckboxState(iArr);
        }
    }

    public final void Y(int i12) {
        Button button = this.f236052H;
        if (button == null) {
            button = null;
        }
        boolean z12 = true;
        button.setText(i12 > 1 ? getContext().getResources().getQuantityString(R.plurals.select_devices_plural, i12, Integer.valueOf(i12)) : getContext().getString(R.string.iac_devices_dialog_apply_btn));
        Button button2 = this.f236052H;
        Button button3 = button2 != null ? button2 : null;
        boolean z13 = i12 > 0;
        if (this.f236051G && !z13) {
            z12 = false;
        }
        button3.setEnabled(z12);
    }
}
