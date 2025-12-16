package com.avito.android.advert.item.safedeal;

import Hr.InterfaceC14024a;
import an.InterfaceC19913b;
import cn.C27223b;
import com.avito.android.Z0;
import com.avito.android.advert.item.safedeal.X;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NavigatorAfterCartItemAdded.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/Y;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f78779a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19913b f78780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z0 f78781c;

    @Inject
    public Y(@Y61.k InterfaceC14024a interfaceC14024a, @Y61.k InterfaceC19913b interfaceC19913b, @Y61.k Z0 z02) {
        this.f78779a = interfaceC14024a;
        this.f78780b = interfaceC19913b;
        this.f78781c = z02;
    }

    @Y61.l
    public final X a(@Y61.k com.avito.android.remote.safedeal.a aVar, @Y61.l String str, @Y61.l String str2) {
        C27223b nativeBottomSheetContent = aVar.getNativeBottomSheetContent();
        BeduinUniversalPageContent bottomSheetContent = aVar.getBottomSheetContent();
        DeepLink toastDeeplink = aVar.getToastDeeplink();
        Z0 z02 = this.f78781c;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[14];
        if (((Boolean) z02.f67614q.a().invoke()).booleanValue() && nativeBottomSheetContent != null) {
            return new X.b(this.f78780b.a(str2, str, nativeBottomSheetContent));
        }
        if (bottomSheetContent != null) {
            return new X.a(new BeduinUniversalPageLink(null, ScreenStyle.BOTTOM_SHEET.f133649b, bottomSheetContent.getScreenName(), Long.valueOf(this.f78779a.a(bottomSheetContent)), null, null, null, 112, null));
        }
        if (toastDeeplink != null) {
            return new X.a(toastDeeplink);
        }
        return null;
    }
}
