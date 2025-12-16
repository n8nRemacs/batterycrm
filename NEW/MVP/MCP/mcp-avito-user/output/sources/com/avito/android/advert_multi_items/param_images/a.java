package com.avito.android.advert_multi_items.param_images;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: MultiItemParamImagesBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/a;", "LTV0/b;", "Lcom/avito/android/advert_multi_items/param_images/f;", "Lcom/avito/android/advert_multi_items/param_images/MultiItemParamImagesItem;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, MultiItemParamImagesItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85937a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InterfaceC14875c f85938b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f85939c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f85940d;

    /* compiled from: MultiItemParamImagesBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_multi_items/param_images/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_multi_items/param_images/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_multi_items.param_images.a$a, reason: collision with other inner class name */
    public static final class C2562a extends N implements p<ViewGroup, View, g> {
        public C2562a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new g(aVar.f85937a, aVar.f85938b, view);
        }
    }

    public a(@k InterfaceC14873a interfaceC14873a, @l InterfaceC14875c interfaceC14875c) {
        this.f85937a = interfaceC14873a;
        this.f85938b = interfaceC14875c;
        this.f85939c = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);
        this.f85940d = new g.a<>(R.layout.advert_details_multi_item_param_images, new C2562a());
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, MultiItemParamImagesItem> a() {
        return this.f85939c;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f85940d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof MultiItemParamImagesItem;
    }

    public /* synthetic */ a(InterfaceC14873a interfaceC14873a, InterfaceC14875c interfaceC14875c, int i12, C42822w c42822w) {
        this(interfaceC14873a, (i12 & 2) != 0 ? null : interfaceC14875c);
    }
}
