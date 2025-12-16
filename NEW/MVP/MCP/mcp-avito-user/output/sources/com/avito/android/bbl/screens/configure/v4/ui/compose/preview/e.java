package com.avito.android.bbl.screens.configure.v4.ui.compose.preview;

import Bh.C13148c;
import Bh.InterfaceC13147b;
import Y41.q;
import Y61.k;
import android.os.Bundle;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wZ.l;

/* compiled from: BblConfigureV4ScreenPreviews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final l f99591a = new l(new Image(P0.c()), new Image(P0.c()));

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final InterfaceC43160i<InterfaceC13147b> f99592b = C43175k.w();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Y41.l<DeepLink, G0> f99593c = a.f99595l;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final q<DeepLink, String, Bundle, G0> f99594d = b.f99596l;

    /* compiled from: BblConfigureV4ScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f99595l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureV4ScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Landroid/os/Bundle;", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements q<DeepLink, String, Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f99596l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink, String str, Bundle bundle) {
            return G0.f406611a;
        }
    }

    public static C13148c a(wZ.j jVar, AttributedText attributedText, List list, wZ.g gVar, int i12) {
        String str = (i12 & 1) != 0 ? null : "Попробуйте обновить страницу или загляните позже — мы обязательно всё починим.";
        return new C13148c(false, (i12 & 2) == 0, str, (i12 & 8) != 0 ? null : jVar, (i12 & 64) != 0 ? null : gVar, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : list, null);
    }

    public static final List<C13148c.a> b() {
        wZ.k kVar = new wZ.k("green", null, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        C13148c.C0068c c0068c = new C13148c.C0068c(10L, null, 0.1d, kVar, new AttributedText("Обгоните 10% конкурентов", c42784z0, 0, 4, null));
        l lVar = f99591a;
        return C42745f0.U(new C13148c.a(c0068c, "7 дней", "-30%", 1L, false, "Нет лимита контактов", "1 490 ₽", new C13148c.b(lVar, "Продвижение"), lVar, "5 600 ₽"), new C13148c.a(new C13148c.C0068c(50L, null, 0.5d, new wZ.k("gray", null, null), new AttributedText("Обгоните 50% конкурентов", c42784z0, 0, 4, null)), "30 дней", "-30%", 2L, true, "Лимит контактов: 34", "1 490 ₽", null, lVar, "5 600 ₽"), new C13148c.a(new C13148c.C0068c(90L, null, 0.9d, new wZ.k(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null), new AttributedText("Обгоните 90% конкурентов", c42784z0, 0, 4, null)), "60 дней", "-30%", 3L, false, "Лимит контактов: 56", "1 890 ₽", null, lVar, "5 600 ₽"));
    }
}
