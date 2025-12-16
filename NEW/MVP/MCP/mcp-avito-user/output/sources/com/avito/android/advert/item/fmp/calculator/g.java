package com.avito.android.advert.item.fmp.calculator;

import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FmpButtonClick;
import com.avito.android.remote.fmp.FmpCalculatorButton;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpCalculatorItem f75491l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f75492m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75493n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f75494o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75495p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, h hVar, k kVar, l0.h hVar2, l0.h hVar3) {
        super(0);
        this.f75491l = advertDetailsFmpCalculatorItem;
        this.f75492m = hVar;
        this.f75493n = hVar2;
        this.f75494o = kVar;
        this.f75495p = hVar3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    @Override // Y41.a
    public final G0 invoke() throws UnsupportedEncodingException {
        String strQ;
        int I12;
        FmpButtonClick onClick;
        FmpButtonClick onClick2;
        List<AnalyticsEvent> listC;
        AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem = this.f75491l;
        FmpCalculatorButton fmpCalculatorButton = advertDetailsFmpCalculatorItem.f75461j;
        h hVar = this.f75492m;
        if (fmpCalculatorButton != null && (onClick2 = fmpCalculatorButton.getOnClick()) != null && (listC = onClick2.c()) != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                hVar.f75498d.c(j.a((AnalyticsEvent) it.next()));
            }
        }
        l0.h<Integer> hVar2 = this.f75493n;
        int iO2 = h.O(hVar2.f406842b, advertDetailsFmpCalculatorItem);
        Integer num = hVar2.f406842b;
        k kVar = this.f75494o;
        if (num != null && iO2 == num.intValue()) {
            kVar.dH();
            FmpCalculatorButton fmpCalculatorButton2 = advertDetailsFmpCalculatorItem.f75461j;
            if (fmpCalculatorButton2 == null || (onClick = fmpCalculatorButton2.getOnClick()) == null || (strQ = onClick.getDeeplink()) == null) {
                strQ = "";
            }
            Integer num2 = hVar2.f406842b;
            Integer num3 = this.f75495p.f406842b;
            if (num2 != null && num3 != null && (I12 = C43066x.I(strQ, "url=", 0, false, 6)) != -1) {
                int i12 = I12 + 4;
                String strSubstring = strQ.substring(0, i12);
                String strDecode = URLDecoder.decode(strQ.substring(i12), Constants.ENCODING);
                strQ = r.q(strSubstring, URLEncoder.encode(strDecode + (C43066x.r(strDecode, '?') ? ContainerUtils.FIELD_DELIMITER : "?") + "amount=" + num2 + "&term=" + num3, Constants.ENCODING));
            }
            b.a.a(hVar.f75496b, hVar.f75497c.b(strQ), null, null, 6);
        } else {
            kVar.N50();
            kVar.sk(String.valueOf(iO2));
            hVar2.f406842b = Integer.valueOf(iO2);
        }
        return G0.f406611a;
    }
}
