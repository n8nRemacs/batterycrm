package com.avito.android.publish.iac_devices;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
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

/* compiled from: IacDevicesSelectDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_devices/h;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f236039L = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final N f236040E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final ArrayList f236041F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f236042G;

    /* renamed from: H, reason: collision with root package name */
    public Button f236043H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f236044I;

    /* renamed from: J, reason: collision with root package name */
    public LinearLayout f236045J;

    /* renamed from: K, reason: collision with root package name */
    public NestedScrollView f236046K;

    /* compiled from: IacDevicesSelectDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            final int i12 = 1;
            final int i13 = 0;
            View view2 = view;
            final h hVar = (h) this.receiver;
            int i14 = h.f236039L;
            hVar.getClass();
            hVar.f236043H = (Button) view2.findViewById(R.id.devices_btn);
            hVar.f236044I = (TextView) view2.findViewById(R.id.devices_error_text);
            hVar.f236045J = (LinearLayout) view2.findViewById(R.id.devices_linear);
            hVar.f236046K = (NestedScrollView) view2.findViewById(R.id.devices_scroll);
            ImageView imageView = (ImageView) view2.findViewById(R.id.devices_close);
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.iac_devices.g
                    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        h hVar2 = hVar;
                        switch (i13) {
                            case 0:
                                int i15 = h.f236039L;
                                hVar2.r();
                                break;
                            default:
                                hVar2.f236040E.invoke(hVar2.f236041F);
                                hVar2.dismiss();
                                break;
                        }
                    }
                });
            }
            Button button = hVar.f236043H;
            if (button == null) {
                button = null;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.iac_devices.g
                /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    h hVar2 = hVar;
                    switch (i12) {
                        case 0:
                            int i15 = h.f236039L;
                            hVar2.r();
                            break;
                        default:
                            hVar2.f236040E.invoke(hVar2.f236041F);
                            hVar2.dismiss();
                            break;
                    }
                }
            });
            ArrayList arrayList = hVar.f236041F;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IacDevice iacDevice = (IacDevice) it.next();
                ListItemCheckbox listItemCheckbox = new ListItemCheckbox(hVar.getContext(), null);
                listItemCheckbox.setId(R.id.devices_checkbox_list_item);
                listItemCheckbox.setCheckboxStyle(R.style.Re23_Toggle_CheckboxDefaultMedium);
                listItemCheckbox.setTitle(iacDevice.f236029b);
                if (iacDevice.f236031d) {
                    listItemCheckbox.setSubtitle(R.string.iac_devices_current_device);
                    listItemCheckbox.setSubtitleColor(R.color.gray54);
                }
                D6.f(listItemCheckbox, y6.b(16), 0, y6.b(16), 0, 10);
                listItemCheckbox.setClickable(true);
                listItemCheckbox.setChecked(iacDevice.f236032e);
                listItemCheckbox.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(5, hVar, iacDevice));
                LinearLayout linearLayout = hVar.f236045J;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                linearLayout.addView(listItemCheckbox);
            }
            View view3 = new View(hVar.getContext());
            view3.setLayoutParams(new ViewGroup.LayoutParams(-1, 16));
            LinearLayout linearLayout2 = hVar.f236045J;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.addView(view3);
            NestedScrollView nestedScrollView = hVar.f236046K;
            (nestedScrollView != null ? nestedScrollView : null).setPadding(0, 0, 0, y6.b(75));
            hVar.Y(h.W(arrayList));
            return G0.f406611a;
        }
    }

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f236047l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ListItemCheckbox);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k Context context, boolean z12, @Y61.k List<IacDevice> list, @Y61.k Y41.l<? super List<IacDevice>, G0> lVar) {
        super(context, 0, 2, null);
        this.f236040E = (N) lVar;
        List<IacDevice> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(IacDevice.a((IacDevice) it.next()));
        }
        this.f236041F = arrayList;
        this.f236042G = z12 || V(list);
        C(R.layout.iac_devices_select_dialog, new a(1, this, h.class, "createView", "createView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
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
        LinearLayout linearLayout = this.f236045J;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C43025h.a aVar = new C43025h.a(C43033p.i(new C22829k0(linearLayout), b.f236047l));
        while (aVar.hasNext()) {
            ((ListItemCheckbox) aVar.next()).setCheckboxState(iArr);
        }
    }

    public final void Y(int i12) {
        Button button = this.f236043H;
        if (button == null) {
            button = null;
        }
        boolean z12 = true;
        button.setText(i12 > 1 ? getContext().getResources().getQuantityString(R.plurals.select_devices_plural, i12, Integer.valueOf(i12)) : getContext().getString(R.string.iac_devices_dialog_apply_btn));
        Button button2 = this.f236043H;
        Button button3 = button2 != null ? button2 : null;
        boolean z13 = i12 > 0;
        if (this.f236042G && !z13) {
            z12 = false;
        }
        button3.setEnabled(z12);
    }

    public final void Z(boolean z12) {
        if (z12) {
            TextView textView = this.f236044I;
            if (textView == null) {
                textView = null;
            }
            D6.H(textView);
            NestedScrollView nestedScrollView = this.f236046K;
            (nestedScrollView != null ? nestedScrollView : null).setPadding(0, 0, 0, y6.b(97));
            return;
        }
        TextView textView2 = this.f236044I;
        if (textView2 == null) {
            textView2 = null;
        }
        D6.w(textView2);
        NestedScrollView nestedScrollView2 = this.f236046K;
        (nestedScrollView2 != null ? nestedScrollView2 : null).setPadding(0, 0, 0, y6.b(75));
    }
}
