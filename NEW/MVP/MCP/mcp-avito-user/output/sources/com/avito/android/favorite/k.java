package com.avito.android.favorite;

import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: FavoriteAdvertsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isFavorite", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f155204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f155205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC30567a f155206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f155208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f155209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdvertisementVerticalAlias f155210h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Double f155211i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Boolean f155212j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f155213k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f155214l;

    public k(AbstractC30567a abstractC30567a, l lVar, AdvertisementVerticalAlias advertisementVerticalAlias, Boolean bool, Double d12, String str, String str2, String str3, String str4, String str5, boolean z12) {
        this.f155204b = lVar;
        this.f155205c = str;
        this.f155206d = abstractC30567a;
        this.f155207e = str2;
        this.f155208f = str3;
        this.f155209g = z12;
        this.f155210h = advertisementVerticalAlias;
        this.f155211i = d12;
        this.f155212j = bool;
        this.f155213k = str4;
        this.f155214l = str5;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C41811b c41811bG;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final AbstractC30567a abstractC30567a = this.f155206d;
        final l lVar = this.f155204b;
        if (zBooleanValue) {
            lVar.getClass();
            final String str = this.f155207e;
            final String str2 = this.f155205c;
            final String str3 = this.f155208f;
            final boolean z12 = this.f155209g;
            c41811bG = new C41826q(new InterfaceC43543a() { // from class: com.avito.android.favorite.i
                @Override // l41.InterfaceC43543a
                public final void run() {
                    l lVar2 = lVar;
                    x xVar = lVar2.f155215a;
                    AbstractC30567a abstractC30567a2 = abstractC30567a;
                    String strB = C35800g5.b(new C35792f5(abstractC30567a2.f155166b));
                    String str4 = str2;
                    String str5 = str;
                    xVar.e(str4, strB, str5);
                    lVar2.f155217c.a(new AbstractC30569c.b(str4, abstractC30567a2, str5, str3, (Map) null, 16, (C42822w) null));
                    lVar2.f155216b.a(z12);
                }
            }).x(lVar.f155220f.a()).g(lVar.f155218d.a(str2));
        } else {
            lVar.getClass();
            final String str4 = this.f155213k;
            final String str5 = this.f155214l;
            final String str6 = this.f155205c;
            final String str7 = this.f155207e;
            final AdvertisementVerticalAlias advertisementVerticalAlias = this.f155210h;
            final Double d12 = this.f155211i;
            final Boolean bool = this.f155212j;
            final String str8 = this.f155208f;
            final boolean z13 = this.f155209g;
            c41811bG = new C41826q(new InterfaceC43543a() { // from class: com.avito.android.favorite.j
                @Override // l41.InterfaceC43543a
                public final void run() {
                    l lVar2 = lVar;
                    x xVar = lVar2.f155215a;
                    AbstractC30567a abstractC30567a2 = abstractC30567a;
                    String strB = C35800g5.b(new C35792f5(abstractC30567a2.f155166b));
                    String str9 = str6;
                    String str10 = str7;
                    xVar.g(str9, strB, str10);
                    lVar2.f155217c.a(new AbstractC30569c.a(str9, abstractC30567a2, advertisementVerticalAlias, d12, str10, bool, str4, str5, str8, null, 512, null));
                    lVar2.f155219e.a(abstractC30567a2.f155165a);
                    lVar2.f155216b.a(z13);
                }
            }).x(lVar.f155220f.a()).g(lVar.f155218d.b(str6, C35800g5.b(new C35792f5(abstractC30567a.f155166b)), abstractC30567a.f155165a));
        }
        return c41811bG.B(G0.f406611a);
    }
}
