package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.b00;
import com.yandex.mobile.ads.impl.g5;
import com.yandex.mobile.ads.impl.g7;
import com.yandex.mobile.ads.impl.he;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.ma0;
import com.yandex.mobile.ads.impl.oa0;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.sj1;
import com.yandex.mobile.ads.impl.v11;
import j.K;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

@K
/* loaded from: classes8.dex */
public abstract class h extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final ma0 f382527a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final oa0 f382528b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final f f382529c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final i f382530d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final ArrayList f382531e;

    /* renamed from: f, reason: collision with root package name */
    private int f382532f;

    /* renamed from: g, reason: collision with root package name */
    private int f382533g;

    public h(@N Context context) {
        this(context, null);
    }

    @N
    public abstract f a(@N Context context, @N e eVar, @N a4 a4Var);

    public void addVisibilityChangeListener(@N sj1 sj1Var) {
        this.f382531e.add(sj1Var);
    }

    public final void b(@N g5 g5Var) {
        this.f382528b.a();
        this.f382527a.a(new com.vk.id.captcha.web.h(4, this, g5Var));
    }

    public void destroy() {
        this.f382528b.a();
        this.f382527a.a();
        this.f382531e.clear();
        if (g7.a((b00) this.f382529c)) {
            return;
        }
        this.f382529c.w();
    }

    public BannerAdSize getAdSize() {
        this.f382528b.a();
        SizeInfo sizeInfoA = he.a(this.f382529c);
        if (sizeInfoA != null) {
            return new BannerAdSize(sizeInfoA.e(), sizeInfoA.c(), sizeInfoA.d());
        }
        return null;
    }

    public int getHeightMeasureSpec() {
        return this.f382533g;
    }

    public int getWidthMeasureSpec() {
        return this.f382532f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        i iVar = this.f382530d;
        getContext();
        iVar.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!g7.a((b00) this.f382529c)) {
            setVisibility(this.f382529c.v() ? 0 : 8);
        }
        configuration.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        i iVar = this.f382530d;
        getContext();
        iVar.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f382532f = i12;
        this.f382533g = i13;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        v11 v11VarA = q21.b().a(getContext());
        if (v11VarA == null || !v11VarA.P()) {
            if (g7.a((b00) this.f382529c)) {
                return;
            }
            Iterator it = this.f382531e.iterator();
            while (it.hasNext()) {
                ((sj1) it.next()).a(i12);
            }
            return;
        }
        if (this != view || g7.a((b00) this.f382529c)) {
            return;
        }
        Iterator it2 = this.f382531e.iterator();
        while (it2.hasNext()) {
            ((sj1) it2.next()).a(i12);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i12) {
        super.onWindowVisibilityChanged(i12);
        getVisibility();
        int i13 = (i12 == 0 && getVisibility() == 0) ? 0 : 8;
        if (g7.a((b00) this.f382529c)) {
            return;
        }
        Iterator it = this.f382531e.iterator();
        while (it.hasNext()) {
            ((sj1) it.next()).a(i13);
        }
    }

    public void removeVisibilityChangeListener(@N sj1 sj1Var) {
        this.f382531e.remove(sj1Var);
    }

    public void setAdSize(@N BannerAdSize bannerAdSize) {
        this.f382528b.a();
        this.f382529c.a(bannerAdSize.a());
    }

    public void setAdUnitId(@P String str) {
        this.f382528b.a();
        this.f382529c.a(str);
    }

    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        this.f382528b.a();
        this.f382529c.a(bannerAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z12) {
        this.f382528b.a();
        this.f382529c.a(z12);
    }

    public h(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g5 g5Var) {
        this.f382529c.b(g5Var);
    }

    public h(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f382527a = new ma0();
        oa0 oa0Var = new oa0(context);
        this.f382528b = oa0Var;
        oa0Var.a();
        this.f382531e = new ArrayList();
        a4 a4Var = new a4();
        e eVar = new e(context, a4Var);
        f fVarA = a(context, eVar, a4Var);
        this.f382529c = fVarA;
        eVar.a(fVarA.d());
        i iVarA = a();
        this.f382530d = iVarA;
        iVarA.a(context, this);
    }

    @N
    private i a() {
        return j.a(this, this.f382529c);
    }

    @N
    public final ih1 b() {
        this.f382528b.a();
        return this.f382529c.y();
    }
}
