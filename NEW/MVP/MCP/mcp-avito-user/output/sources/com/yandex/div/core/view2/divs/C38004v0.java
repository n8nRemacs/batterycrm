package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.widgets.InterfaceC38013e;
import com.yandex.div2.DivAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivFocusBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/v0;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.v0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38004v0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C37955g f368835a;

    /* compiled from: DivFocusBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/v0$a;", "Landroid/view/View$OnFocusChangeListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.v0$a */
    public final class a implements View.OnFocusChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C38029k f368836b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.json.expressions.e f368837c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public com.yandex.div2.K f368838d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public com.yandex.div2.K f368839e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public List<? extends DivAction> f368840f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public List<? extends DivAction> f368841g;

        public a(@Y61.k C38029k c38029k, @Y61.k com.yandex.div.json.expressions.e eVar) {
            this.f368836b = c38029k;
            this.f368837c = eVar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(@Y61.k View view, boolean z12) throws Resources.NotFoundException {
            com.yandex.div2.K k12;
            com.yandex.div.json.expressions.e eVar = this.f368837c;
            C38004v0 c38004v0 = C38004v0.this;
            if (z12) {
                com.yandex.div2.K k13 = this.f368838d;
                if (k13 != null) {
                    c38004v0.getClass();
                    C38004v0.a(view, k13, eVar);
                }
                List<? extends DivAction> list = this.f368840f;
                if (list == null) {
                    return;
                }
                C37955g c37955g = c38004v0.f368835a;
                c37955g.getClass();
                C38029k c38029k = this.f368836b;
                c38029k.m(new C37977m(list, "focus", c37955g, c38029k, view));
                return;
            }
            if (this.f368838d != null && (k12 = this.f368839e) != null) {
                c38004v0.getClass();
                C38004v0.a(view, k12, eVar);
            }
            List<? extends DivAction> list2 = this.f368841g;
            if (list2 == null) {
                return;
            }
            C37955g c37955g2 = c38004v0.f368835a;
            c37955g2.getClass();
            C38029k c38029k2 = this.f368836b;
            c38029k2.m(new C37977m(list2, "blur", c37955g2, c38029k2, view));
        }
    }

    @Inject
    public C38004v0(@Y61.k C37955g c37955g) {
        this.f368835a = c37955g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, com.yandex.div2.K k12, com.yandex.div.json.expressions.e eVar) throws Resources.NotFoundException {
        if (view instanceof InterfaceC38013e) {
            ((InterfaceC38013e) view).c(eVar, k12);
            return;
        }
        float dimension = 0.0f;
        if (!C37931a.y(k12) && k12.f372641c.a(eVar).booleanValue() && k12.f372642d == null) {
            dimension = view.getResources().getDimension(R.dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
    }
}
