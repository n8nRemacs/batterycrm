package com.avito.android.advertising.adapter.items.mytarget;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MyTargetGridBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/mytarget/f;", "LTV0/b;", "LGb/d;", "Lcom/avito/android/advertising/adapter/items/mytarget/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.b<Gb.d, com.avito.android.advertising.adapter.items.mytarget.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f87619a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<Gb.e> f87621c = new g.a<>(R.layout.my_target_ad, new a());

    /* compiled from: MyTargetGridBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LGb/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LGb/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, Gb.e> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Gb.e invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            f fVar = f.this;
            Gb.e eVar = new Gb.e(view2, fVar.f87620b.a() ? AdStyle.f88540e : AdStyle.f88539d);
            boolean zA2 = fVar.f87620b.a();
            Gb.b bVar = eVar.f6604b;
            if (zA2) {
                bVar.getClass();
                e.a.d(bVar);
            } else {
                bVar.getClass();
                e.a.i(bVar);
            }
            eVar.B80(1.0f, false);
            return eVar;
        }
    }

    @Inject
    public f(@Y61.k j jVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87619a = jVar;
        this.f87620b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87619a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<Gb.e> b() {
        return this.f87621c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof com.avito.android.advertising.adapter.items.mytarget.a) {
            com.avito.android.advertising.adapter.items.mytarget.a aVar2 = (com.avito.android.advertising.adapter.items.mytarget.a) aVar;
            if (!aVar2.getDisplayType().isInformative() && aVar2.getAdViewType() == AdViewType.f86909c) {
                return true;
            }
        }
        return false;
    }
}
