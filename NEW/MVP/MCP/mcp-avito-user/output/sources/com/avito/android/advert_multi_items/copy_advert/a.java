package com.avito.android.advert_multi_items.copy_advert;

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

/* compiled from: MultiItemCopyBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_multi_items/copy_advert/a;", "LTV0/b;", "Lcom/avito/android/advert_multi_items/copy_advert/e;", "LTa/b;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<e, Ta.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85880a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InterfaceC14875c f85881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f85882c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f85883d;

    /* compiled from: MultiItemCopyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_multi_items/copy_advert/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_multi_items/copy_advert/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_multi_items.copy_advert.a$a, reason: collision with other inner class name */
    public static final class C2559a extends N implements p<ViewGroup, View, g> {
        public C2559a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new g(aVar.f85880a, aVar.f85881b, view);
        }
    }

    public a(@k InterfaceC14873a interfaceC14873a, @l InterfaceC14875c interfaceC14875c) {
        this.f85880a = interfaceC14873a;
        this.f85881b = interfaceC14875c;
        this.f85882c = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);
        this.f85883d = new g.a<>(R.layout.advert_details_multi_item_copy, new C2559a());
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, Ta.b> a() {
        return this.f85882c;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f85883d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof Ta.b;
    }

    public /* synthetic */ a(InterfaceC14873a interfaceC14873a, InterfaceC14875c interfaceC14875c, int i12, C42822w c42822w) {
        this(interfaceC14873a, (i12 & 2) != 0 ? null : interfaceC14875c);
    }
}
