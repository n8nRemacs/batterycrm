package com.avito.android.advertising.kebab;

import com.avito.android.advertising.kebab.q;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.util.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdActionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/kebab/q;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advertising/kebab/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<q, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f87822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f87823m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f87824n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, g gVar, BannerInfo bannerInfo) {
        super(1);
        this.f87822l = dVar;
        this.f87823m = gVar;
        this.f87824n = bannerInfo;
    }

    @Override // Y41.l
    public final G0 invoke(q qVar) {
        q qVar2 = qVar;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f87822l.f87827d;
        if (dVar != null) {
            N0.a(dVar);
        }
        g gVar = this.f87823m;
        boolean z12 = qVar2 instanceof q.a;
        BannerInfo bannerInfo = this.f87824n;
        if (z12) {
            gVar.f87828a.c(((q.a) qVar2).f87855a, bannerInfo, gVar.f87830c);
        } else if (qVar2 instanceof q.b) {
            q.b bVar = (q.b) qVar2;
            com.avito.android.advertising.i iVar = bVar.f87856a;
            gVar.f87828a.a(iVar, bVar.f87857b, bVar.f87858c, bannerInfo, gVar.f87830c);
        }
        return G0.f406611a;
    }
}
