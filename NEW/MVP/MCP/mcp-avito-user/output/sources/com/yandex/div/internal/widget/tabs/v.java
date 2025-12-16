package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div.internal.widget.tabs.y;
import com.yandex.div2.DivTabs;
import j.N;
import j.P;
import java.util.List;

/* compiled from: TabTitlesLayoutView.java */
/* loaded from: classes7.dex */
public class v<ACTION> extends BaseIndicatorTabLayout implements d.b<ACTION> {

    /* renamed from: H, reason: collision with root package name */
    @P
    public d.b.a<ACTION> f370513H;

    /* renamed from: I, reason: collision with root package name */
    @P
    public List<? extends d.g.b<ACTION>> f370514I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public com.yandex.div.internal.viewpool.h f370515J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public String f370516K;

    /* renamed from: L, reason: collision with root package name */
    @P
    public DivTabs.TabTitleStyle f370517L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public a f370518M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f370519N;

    /* compiled from: TabTitlesLayoutView.java */
    public interface a {
        void b();
    }

    /* compiled from: TabTitlesLayoutView.java */
    public static class b implements com.yandex.div.internal.viewpool.g<y> {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final Context f370520a;

        public b(@N Context context) {
            this.f370520a = context;
        }

        @Override // com.yandex.div.internal.viewpool.g
        @N
        public final View a() {
            return new y(this.f370520a);
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public final void a(int i12) {
        BaseIndicatorTabLayout.f fVar;
        if (getSelectedTabPosition() == i12 || (fVar = this.f370390b.get(i12)) == null) {
            return;
        }
        BaseIndicatorTabLayout baseIndicatorTabLayout = fVar.f370445c;
        if (baseIndicatorTabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        baseIndicatorTabLayout.p(fVar, true);
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public final void b(@N List<? extends d.g.b<ACTION>> list, int i12, @N com.yandex.div.json.expressions.e eVar, @N F21.b bVar) {
        this.f370514I = list;
        o();
        int size = list.size();
        if (i12 < 0 || i12 >= size) {
            i12 = 0;
        }
        int i13 = 0;
        while (i13 < size) {
            BaseIndicatorTabLayout.f fVarM = m();
            fVarM.f370443a = list.get(i13).getTitle();
            y yVar = fVarM.f370446d;
            if (yVar != null) {
                BaseIndicatorTabLayout.f fVar = yVar.f370528h;
                yVar.setText(fVar == null ? null : fVar.f370443a);
                y.b bVar2 = yVar.f370527g;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
            y yVar2 = fVarM.f370446d;
            DivTabs.TabTitleStyle tabTitleStyle = this.f370517L;
            if (tabTitleStyle != null) {
                com.yandex.div.core.view2.divs.tabs.j.b(yVar2, tabTitleStyle, eVar, bVar);
            }
            f(fVarM, i13 == i12);
            i13++;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public final void c(int i12) {
        BaseIndicatorTabLayout.f fVar;
        if (getSelectedTabPosition() == i12 || (fVar = this.f370390b.get(i12)) == null) {
            return;
        }
        BaseIndicatorTabLayout baseIndicatorTabLayout = fVar.f370445c;
        if (baseIndicatorTabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        baseIndicatorTabLayout.p(fVar, true);
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public final void d(@N com.yandex.div.internal.viewpool.h hVar) {
        this.f370515J = hVar;
        this.f370516K = "DIV2.TAB_HEADER_VIEW";
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f370519N = true;
        }
        return zDispatchTouchEvent;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    @P
    public ViewPager.i getCustomPageChangeListener() {
        BaseIndicatorTabLayout.g pageChangeListener = getPageChangeListener();
        pageChangeListener.f370449d = 0;
        pageChangeListener.f370448c = 0;
        return pageChangeListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    public final y l(@N Context context) {
        return (y) this.f370515J.b(this.f370516K);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    public final void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        a aVar = this.f370518M;
        if (aVar == null || !this.f370519N) {
            return;
        }
        aVar.b();
        this.f370519N = false;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public void setHost(@N d.b.a<ACTION> aVar) {
        this.f370513H = aVar;
    }

    public void setOnScrollChangedListener(@P a aVar) {
        this.f370518M = aVar;
    }

    public void setTabTitleStyle(@P DivTabs.TabTitleStyle tabTitleStyle) {
        this.f370517L = tabTitleStyle;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.b
    public void setTypefaceProvider(@N com.yandex.div.core.font.a aVar) {
        this.f370399k = aVar;
    }
}
