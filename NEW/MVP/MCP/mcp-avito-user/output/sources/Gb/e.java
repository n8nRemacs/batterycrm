package Gb;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.internal.observers.m;
import j.InterfaceC42161q;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdMyTargetViewHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LGb/e;", "LGb/d;", "Lcom/avito/android/serp/c;", "LGb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends com.avito.android.serp.c implements d, InterfaceC13862a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f6604b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f6605c;

    public e(@k View view, @k AdStyle adStyle) {
        super(view);
        this.f6604b = new b(view, adStyle);
    }

    @Override // Gb.InterfaceC13862a
    public final void Ah(@l String str) {
        this.f6604b.Ah(str);
    }

    public final void B80(float f12, boolean z12) {
        b bVar = this.f6604b;
        if (f12 < 0.0f) {
            bVar.getClass();
            return;
        }
        ViewGroup viewGroup = bVar.f6592f;
        if (z12) {
            ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(8);
            }
            ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.removeRule(10);
            }
            ViewGroup.LayoutParams layoutParams5 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.addRule(15);
            }
        }
        ViewGroup.LayoutParams layoutParams7 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams7 != null) {
            layoutParams7.height = -2;
        }
        RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroup instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroup : null;
        if (ratioForegroundFrameLayout != null) {
            ratioForegroundFrameLayout.setRatio(f12);
        }
    }

    @Override // Gb.InterfaceC13862a
    public final void CP() {
        this.f6604b.CP();
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        b bVar = this.f6604b;
        bVar.getClass();
        return c.a.b(bVar);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        b bVar = this.f6604b;
        bVar.getClass();
        e.a.j(bVar, z12, z13);
    }

    @Override // Gb.InterfaceC13862a
    public final void J30() {
        this.f6604b.J30();
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        b bVar = this.f6604b;
        bVar.getClass();
        e.a.a(bVar, R.dimen.ad_image_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        this.f6604b.getClass();
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Oc(@l String str) {
        b bVar = this.f6604b;
        bVar.getClass();
        TextView f6601o = bVar.getF6601o();
        if (f6601o != null) {
            I5.a(f6601o, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: Qw */
    public final TextView getF6597k() {
        return this.f6604b.f6597k;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: T1 */
    public final ViewGroup getF6591e() {
        return this.f6604b.f6591e;
    }

    @Override // Gb.InterfaceC13862a
    public final void UL(@l m mVar) {
        this.f6604b.f6590d = mVar;
    }

    @Override // Gb.InterfaceC13862a
    /* renamed from: cu */
    public final int getF6602p() {
        return this.f6604b.f6602p;
    }

    @Override // Gb.d
    public final void d(@l Y41.a<G0> aVar) {
        this.f6605c = aVar;
    }

    @Override // Gb.InterfaceC13862a
    public final void d30(int i12) {
        this.f6604b.d30(i12);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        b bVar = this.f6604b;
        bVar.getClass();
        ViewGroup f6592f = bVar.getF6592f();
        if (f6592f != null) {
            v.b(f6592f, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@l TextView textView, @l String str) {
        this.f6604b.getClass();
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        b bVar = this.f6604b;
        bVar.getClass();
        e.a.m(bVar, z12);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: getCallToActionView */
    public final TextView getF6596j() {
        return this.f6604b.f6596j;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle */
    public final AdStyle getF6589c() {
        return this.f6604b.f6589c;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: getView */
    public final View getF6588b() {
        return this.f6604b.f6588b;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f6605c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f6605c = null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: j70 */
    public final ViewGroup getF7319x() {
        this.f6604b.getClass();
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: od */
    public final ViewGroup getF6592f() {
        return this.f6604b.f6592f;
    }

    @Override // Gb.InterfaceC13862a
    @l
    public final WeakReference<View> oe(@k com.my.target.nativeads.d dVar) {
        return this.f6604b.oe(dVar);
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: qs */
    public final TextView getF6595i() {
        return this.f6604b.f6595i;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    public final View uC() {
        return this.f6604b.f6594h;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: wV */
    public final TextView getF6601o() {
        return this.f6604b.f6601o;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        b bVar = this.f6604b;
        bVar.getClass();
        return c.a.a(bVar);
    }
}
