package one.me.sdk.gallery.selectalbum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.aw0;
import defpackage.awa;
import defpackage.b1e;
import defpackage.cm6;
import defpackage.dbe;
import defpackage.g56;
import defpackage.gbe;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6c;
import defpackage.imb;
import defpackage.k18;
import defpackage.l38;
import defpackage.m6c;
import defpackage.o6c;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ube;
import defpackage.vid;
import defpackage.yy7;
import defpackage.zy8;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "parentScope", "(Ljava/lang/String;Ltk4;)V", "v9", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(SelectAlbumWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), ho7.d(vid.a, SelectAlbumWidget.class, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), new toc(SelectAlbumWidget.class, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0), new toc(SelectAlbumWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0)};
    public final k18 a;
    public final k18 b;
    public final sn0 c;
    public final sn0 d;
    public final sn0 o;

    public SelectAlbumWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    public final dbe A0() {
        return (dbe) this.a.getValue();
    }

    public final void B0() {
        View viewF;
        if (z0().getScrollState() != m6c.a) {
            z0().j(true);
            return;
        }
        i6c callback = z0().getCallback();
        if (callback == null || (viewF = callback.f()) == null || viewF.getHeight() != 0) {
            z0().k();
        } else {
            z0().post(new awa(28, this));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return z0();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(A0().o, getViewLifecycleOwner().p(), l38.d), new gbe(null, this), 1), getViewLifecycleScope());
    }

    public final ube y0() {
        yy7 yy7Var = X[2];
        return (ube) this.d.getValue();
    }

    public final o6c z0() {
        yy7 yy7Var = X[3];
        return (o6c) this.o.getValue();
    }

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        yy7 yy7Var = X[0];
        this.a = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, dbe.class, null);
        this.b = zy8.a.getAccessor().d(56);
        final int i = 0;
        this.c = binding(new cm6(this) { // from class: ebe
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                int i3 = 3;
                Continuation continuation = null;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = SelectAlbumWidget.X;
                        tbe tbeVar = new tbe(new u4e(2, selectAlbumWidget), ((g4b) selectAlbumWidget.b.getValue()).a());
                        gw0.w(new g56(aw0.a(selectAlbumWidget.A0().Z, selectAlbumWidget.getViewLifecycleOwner().p(), l38.d), new fbe(null, tbeVar), 1), selectAlbumWidget.getViewLifecycleScope());
                        return tbeVar;
                    case 1:
                        yy7[] yy7VarArr2 = SelectAlbumWidget.X;
                        ube ubeVar = new ube(selectAlbumWidget.getContext(), null);
                        ubeVar.setId(gab.d);
                        ubeVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        ubeVar.getContext();
                        ubeVar.setLayoutManager(new LinearLayoutManager());
                        sn0 sn0Var = selectAlbumWidget.c;
                        yy7 yy7Var2 = SelectAlbumWidget.X[1];
                        ubeVar.setAdapter((tbe) sn0Var.getValue());
                        ubeVar.setOutlineProvider(new ls0(0, vw4.d().getDisplayMetrics().density * 20.0f));
                        tqi.c(new kga(i3, continuation, 22), ubeVar);
                        return ubeVar;
                    default:
                        yy7[] yy7VarArr3 = SelectAlbumWidget.X;
                        o6c o6cVar = new o6c(selectAlbumWidget.getContext());
                        o6cVar.setStackFromBottom(false);
                        o6cVar.setCallback(new v9(selectAlbumWidget, 5));
                        o6cVar.addView(selectAlbumWidget.y0());
                        tqi.c(new er(i3, continuation, 12), o6cVar);
                        return o6cVar;
                }
            }
        });
        final int i2 = 1;
        this.d = binding(new cm6(this) { // from class: ebe
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                int i3 = 3;
                Continuation continuation = null;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SelectAlbumWidget.X;
                        tbe tbeVar = new tbe(new u4e(2, selectAlbumWidget), ((g4b) selectAlbumWidget.b.getValue()).a());
                        gw0.w(new g56(aw0.a(selectAlbumWidget.A0().Z, selectAlbumWidget.getViewLifecycleOwner().p(), l38.d), new fbe(null, tbeVar), 1), selectAlbumWidget.getViewLifecycleScope());
                        return tbeVar;
                    case 1:
                        yy7[] yy7VarArr2 = SelectAlbumWidget.X;
                        ube ubeVar = new ube(selectAlbumWidget.getContext(), null);
                        ubeVar.setId(gab.d);
                        ubeVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        ubeVar.getContext();
                        ubeVar.setLayoutManager(new LinearLayoutManager());
                        sn0 sn0Var = selectAlbumWidget.c;
                        yy7 yy7Var2 = SelectAlbumWidget.X[1];
                        ubeVar.setAdapter((tbe) sn0Var.getValue());
                        ubeVar.setOutlineProvider(new ls0(0, vw4.d().getDisplayMetrics().density * 20.0f));
                        tqi.c(new kga(i3, continuation, 22), ubeVar);
                        return ubeVar;
                    default:
                        yy7[] yy7VarArr3 = SelectAlbumWidget.X;
                        o6c o6cVar = new o6c(selectAlbumWidget.getContext());
                        o6cVar.setStackFromBottom(false);
                        o6cVar.setCallback(new v9(selectAlbumWidget, 5));
                        o6cVar.addView(selectAlbumWidget.y0());
                        tqi.c(new er(i3, continuation, 12), o6cVar);
                        return o6cVar;
                }
            }
        });
        final int i3 = 2;
        this.o = binding(new cm6(this) { // from class: ebe
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                int i32 = 3;
                Continuation continuation = null;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SelectAlbumWidget.X;
                        tbe tbeVar = new tbe(new u4e(2, selectAlbumWidget), ((g4b) selectAlbumWidget.b.getValue()).a());
                        gw0.w(new g56(aw0.a(selectAlbumWidget.A0().Z, selectAlbumWidget.getViewLifecycleOwner().p(), l38.d), new fbe(null, tbeVar), 1), selectAlbumWidget.getViewLifecycleScope());
                        return tbeVar;
                    case 1:
                        yy7[] yy7VarArr2 = SelectAlbumWidget.X;
                        ube ubeVar = new ube(selectAlbumWidget.getContext(), null);
                        ubeVar.setId(gab.d);
                        ubeVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        ubeVar.getContext();
                        ubeVar.setLayoutManager(new LinearLayoutManager());
                        sn0 sn0Var = selectAlbumWidget.c;
                        yy7 yy7Var2 = SelectAlbumWidget.X[1];
                        ubeVar.setAdapter((tbe) sn0Var.getValue());
                        ubeVar.setOutlineProvider(new ls0(0, vw4.d().getDisplayMetrics().density * 20.0f));
                        tqi.c(new kga(i32, continuation, 22), ubeVar);
                        return ubeVar;
                    default:
                        yy7[] yy7VarArr3 = SelectAlbumWidget.X;
                        o6c o6cVar = new o6c(selectAlbumWidget.getContext());
                        o6cVar.setStackFromBottom(false);
                        o6cVar.setCallback(new v9(selectAlbumWidget, 5));
                        o6cVar.addView(selectAlbumWidget.y0());
                        tqi.c(new er(i32, continuation, 12), o6cVar);
                        return o6cVar;
                }
            }
        });
    }
}
