package com.avito.android.imv_goods_advert;

import com.avito.android.J0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.imv_goods_advert.di.f;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.ExpandItemsButton;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35945t1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImvGoodsAdvertConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/a;", "", "a", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f170313i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f170314a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final hJ.i f170315b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final hJ.h f170316c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q f170317d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f170318e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f170319f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f170320g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f170321h;

    /* compiled from: ImvGoodsAdvertConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/imv_goods_advert/a$a;", "", "<init>", "()V", "", "INITIAL_POSITION", "I", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.imv_goods_advert.a$a, reason: collision with other inner class name */
    public static final class C5043a {
        public /* synthetic */ C5043a(C42822w c42822w) {
            this();
        }

        public C5043a() {
        }
    }

    static {
        new C5043a(null);
    }

    @Inject
    public a(@Y61.k J0 j02, @Y61.k hJ.i iVar, @Y61.k hJ.h hVar, @Y61.k q qVar, @f.a @Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @Y61.k @f.c InterfaceC35945t1<AdvertPrice> interfaceC35945t12, @f.d @Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t13, @Y61.k InterfaceC28280j interfaceC28280j) {
        this.f170314a = j02;
        this.f170315b = iVar;
        this.f170316c = hVar;
        this.f170317d = qVar;
        this.f170318e = interfaceC35945t1;
        this.f170319f = interfaceC35945t12;
        this.f170320g = interfaceC35945t13;
        this.f170321h = interfaceC28280j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03db  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6, types: [com.avito.android.html_formatter.HtmlCharSequence] */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.avito.android.html_formatter.HtmlCharSequence] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.avito.android.html_formatter.HtmlCharSequence] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k com.avito.android.remote.model.AdvertDetails r43, boolean r44, int r45) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.imv_goods_advert.a.a(com.avito.android.remote.model.AdvertDetails, boolean, int):java.util.ArrayList");
    }

    public final AdvertDetailsFlatsItem b(List<AdvertParameters.Parameter> list, boolean z12, AttributedText attributedText, ExpandItemsButton expandItemsButton, AttributedText attributedText2) {
        if (list == null) {
            return null;
        }
        AdvertDetailsFlatsItem advertDetailsFlatsItem = new AdvertDetailsFlatsItem(this.f170314a.a(), null, list, z12, attributedText, attributedText2, null, null, false, false, this.f170317d.a(), null, null, false, null, 31682, null);
        if (expandItemsButton == null || list.size() <= expandItemsButton.getLimit()) {
            return advertDetailsFlatsItem;
        }
        return AdvertDetailsFlatsItem.b(advertDetailsFlatsItem, advertDetailsFlatsItem.f84656d.subList(0, expandItemsButton.getLimit()), 0, 32699);
    }

    public final AdvertDetailsGapItem c(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f170317d.a(), null, null, 50, null);
    }
}
