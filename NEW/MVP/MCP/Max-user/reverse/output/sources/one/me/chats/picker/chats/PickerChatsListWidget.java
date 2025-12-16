package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import defpackage.an3;
import defpackage.aw0;
import defpackage.ayb;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.byb;
import defpackage.cyb;
import defpackage.dxb;
import defpackage.dyb;
import defpackage.e03;
import defpackage.em6;
import defpackage.fni;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i1b;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iv8;
import defpackage.jxb;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ma1;
import defpackage.ocg;
import defpackage.phd;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.uhd;
import defpackage.un4;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w73;
import defpackage.wxb;
import defpackage.x7j;
import defpackage.xxb;
import defpackage.yg2;
import defpackage.yh4;
import defpackage.ym3;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z71;
import defpackage.z8a;
import defpackage.zm3;
import defpackage.zr0;
import defpackage.zxb;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BO\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0005\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lb1e;", "scopeId", "Lyg2;", "filter", "", "isFakeChatsEnabled", "isInMultiSelect", "Lkotlin/Function1;", "Lqqg;", "onMultiSelectToggled", "(Ljava/lang/String;Ljava/lang/String;Lyg2;ZZLem6;Ltk4;)V", "Lx3b;", "emptyView", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickerChatsListWidget extends Widget {
    public static final /* synthetic */ yy7[] A0 = {new toc(PickerChatsListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), ho7.d(vid.a, PickerChatsListWidget.class, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), new z8a(PickerChatsListWidget.class, "isInMultiSelect", "isInMultiSelect()Z"), new toc(PickerChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final em6 X;
    public final k18 Y;
    public ocg Z;
    public final k18 a;
    public final String b;
    public final hs c;
    public final hs d;
    public final hs o;
    public final ExecutorService s0;
    public b t0;
    public final z71 u0;
    public final zm3 v0;
    public final dxb w0;
    public final dxb x0;
    public final bbd y0;
    public final Object z0;

    public PickerChatsListWidget(String str, String str2, yg2 yg2Var, boolean z, boolean z2, em6 em6Var, tk4 tk4Var) {
        this(gwi.b(new imb("folder.id.key", str), new imb("scope.id", new b1e(str2)), new imb("picker.filter", yg2Var), new imb("folder.fake.enabled", Boolean.valueOf(z)), new imb("is_in_multiselect", Boolean.valueOf(z2))));
        this.X = em6Var;
    }

    public static final boolean y0(PickerChatsListWidget pickerChatsListWidget, int i) {
        zm3 zm3Var = pickerChatsListWidget.v0;
        return i < 0 || i >= zm3Var.j() || !fni.a(zm3Var.D(i).first, pickerChatsListWidget.u0);
    }

    public static final boolean z0(PickerChatsListWidget pickerChatsListWidget) {
        List listC = pickerChatsListWidget.v0.C();
        if (!listC.isEmpty()) {
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                if (((phd) it.next()) == pickerChatsListWidget.x0) {
                    return false;
                }
            }
        }
        return ((Boolean) pickerChatsListWidget.D0().y0.a.getValue()).booleanValue();
    }

    public final yg2 A0() {
        yy7 yy7Var = A0[0];
        return (yg2) this.c.a(this);
    }

    public final jxb B0() {
        return (jxb) this.a.getValue();
    }

    public final EndlessRecyclerView2 C0() {
        return (EndlessRecyclerView2) this.y0.D(this, A0[3]);
    }

    public final wxb D0() {
        return (wxb) this.Y.getValue();
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        tcf tcfVar = D0().B0;
        tcfVar.m(null, Long.valueOf(((Number) tcfVar.getValue()).longValue() + 1));
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        if (fni.a(this.b, "all.chat.folder")) {
            gw0.w(new g56(B0().t0, new zr0(2, D0(), wxb.class, "search", "search$chats_list_release(Ljava/lang/String;)V", 4, 28), 1), getLifecycleScope());
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), null, 6);
        endlessRecyclerView2.setId(i1b.k);
        endlessRecyclerView2.setClipChildren(false);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipToOutline(false);
        if (!fni.a(this.b, "all.chat.folder")) {
            return endlessRecyclerView2;
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        EndlessRecyclerView2 endlessRecyclerView2C0 = C0();
        ocg ocgVar = this.Z;
        if (ocgVar != null) {
            ocgVar.b(endlessRecyclerView2C0);
        }
        endlessRecyclerView2C0.setDelegate(null);
        endlessRecyclerView2C0.setPager(null);
        endlessRecyclerView2C0.setAdapter(null);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zm3 zm3Var = this.v0;
        an3 an3Var = zm3Var.d;
        dxb dxbVar = this.w0;
        an3Var.a(0, dxbVar);
        EndlessRecyclerView2 endlessRecyclerView2C0 = C0();
        endlessRecyclerView2C0.getContext();
        endlessRecyclerView2C0.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2C0.setAdapter(zm3Var);
        this.Z = x7j.c(endlessRecyclerView2C0);
        endlessRecyclerView2C0.setPager(new ma1(this, 6));
        endlessRecyclerView2C0.setDelegate(this.u0);
        endlessRecyclerView2C0.setClipToPadding(false);
        float f = 6;
        endlessRecyclerView2C0.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        endlessRecyclerView2C0.setThreshold(10);
        endlessRecyclerView2C0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.t0;
        if (bVar != null) {
            endlessRecyclerView2C0.setRecycledViewPool(bVar);
        }
        endlessRecyclerView2C0.setItemAnimator(null);
        uhd itemAnimator = endlessRecyclerView2C0.getItemAnimator();
        un4 un4Var = itemAnimator instanceof un4 ? (un4) itemAnimator : null;
        if (un4Var != null) {
            un4Var.g = false;
        }
        yy7 yy7Var = A0[2];
        boolean zBooleanValue = ((Boolean) this.o.a(this)).booleanValue();
        ?? r4 = this.z0;
        if (zBooleanValue) {
            endlessRecyclerView2C0.j((w73) r4.getValue());
        } else {
            endlessRecyclerView2C0.p0((w73) r4.getValue());
        }
        endlessRecyclerView2C0.l(new yh4(endlessRecyclerView2C0));
        if (dxbVar.j() > 0) {
            endlessRecyclerView2C0.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2C0.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2C0.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            uhd itemAnimator2 = endlessRecyclerView2C0.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.e();
            }
        }
        C0().setRefreshingNext(((Boolean) D0().y0.a.getValue()).booleanValue());
        hbd hbdVar = D0().w0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ayb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().A0, getViewLifecycleOwner().p(), l38Var), new byb(null, this, view, ipi.b(3, new xxb(this, 2))), 1), getViewLifecycleScope());
        gw0.w(new g56(B0().Y, new cyb(null, this), 1), getViewLifecycleScope());
        if (fni.a(this.b, "all.chat.folder")) {
            gw0.w(new g56(B0().t0, new dyb(null, this), 1), getViewLifecycleScope());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerChatsListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 0;
        Object objA = yvi.a(bundle, "scope.id", b1e.class);
        if (objA != null) {
            this.a = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, jxb.class, null);
            String string = bundle.getString("folder.id.key");
            if (string != null) {
                this.b = string;
                this.c = new hs(yg2.class, "picker.filter");
                this.d = new hs(Boolean.class, "folder.fake.enabled");
                this.o = new hs(Boolean.class, Boolean.TRUE, "is_in_multiselect");
                this.Y = createViewModelLazy(wxb.class, new iv8(21, new xxb(this, i)));
                ExecutorService executorServiceA = e03.a.a().a();
                this.s0 = executorServiceA;
                int i2 = 1;
                z71 z71Var = new z71(executorServiceA, i2);
                this.u0 = z71Var;
                this.v0 = new zm3(new ym3(false, 1), z71Var);
                zxb zxbVar = new zxb(this);
                this.w0 = new dxb(zxbVar, executorServiceA, 0);
                this.x0 = new dxb(zxbVar, executorServiceA, 0);
                this.y0 = viewBinding(i1b.k);
                this.z0 = ipi.b(3, new xxb(this, i2));
                D0().c.e();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key scope.id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ PickerChatsListWidget(String str, String str2, yg2 yg2Var, boolean z, boolean z2, em6 em6Var, int i, tk4 tk4Var) {
        this(str, str2, (i & 4) != 0 ? yg2.a : yg2Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : em6Var, null);
    }
}
