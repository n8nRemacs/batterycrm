package com.avito.android.bxcontent;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;

/* compiled from: BxContentFiltersTooltipController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/u;", "Lcom/avito/android/bxcontent/r;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29255u implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final View f113012a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final View f113013b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f113014c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f113015d = true;

    /* compiled from: BxContentFiltersTooltipController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.u$a */
    final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f113016l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f113017m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f113018n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f113019o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C29255u f113020p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f113021q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, com.avito.android.lib.design.tooltip.k kVar, C29255u c29255u, Y41.a<kotlin.G0> aVar) {
            super(1);
            this.f113016l = str;
            this.f113017m = str2;
            this.f113018n = str3;
            this.f113019o = kVar;
            this.f113020p = c29255u;
            this.f113021q = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            com.avito.android.lib.design.tooltip.o oVar2 = oVar;
            oVar2.i(this.f113016l);
            oVar2.b(this.f113017m);
            oVar2.d(this.f113018n);
            oVar2.f(true);
            com.avito.android.lib.design.tooltip.k kVar = this.f113019o;
            oVar2.e(new ViewOnClickListenerC29249s(kVar, 0));
            final C29255u c29255u = this.f113020p;
            kVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.avito.android.bxcontent.t
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    c29255u.f113014c = null;
                }
            });
            oVar2.c(new com.avito.android.body_condition.h(3, kVar, this.f113021q));
            return kotlin.G0.f406611a;
        }
    }

    public C29255u(@Y61.l Y0 y02, @Y61.l View view) {
        this.f113012a = y02.Aq();
        this.f113013b = view;
    }
}
