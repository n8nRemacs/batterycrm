package com.avito.android.travel_guest_profile.domain;

import PE0.c;
import PE0.d;
import PE0.e;
import PE0.f;
import PE0.g;
import PE0.h;
import PE0.i;
import PE0.j;
import Y61.k;
import android.annotation.SuppressLint;
import android.net.Uri;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileMocks.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/a;", "", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f301931a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final List<OE0.a> f301932b;

    static {
        String str = "m20";
        h hVar = new h(a("Алиса", "h20", null), a("4,9 ∙ 44 отзыва", "m20", null), a("Москва", "m20", new UniversalColor("gray54", new Color(8882055), new Color(7697781))), a("На Авито с мая 2019", "m20", new UniversalColor("gray54", new Color(8882055), new Color(7697781))), new Image(P0.g(new Q(new Size(256, 256), Uri.parse("https://static.avito.ru/stub_avatars/S/13_256x256.png")), new Q(new Size(96, 96), Uri.parse("https://static.avito.ru/stub_avatars/S/13_96x96.png")), new Q(new Size(128, 128), Uri.parse("https://static.avito.ru/stub_avatars/S/13_128x128.png")), new Q(new Size(192, 192), Uri.parse("https://static.avito.ru/stub_avatars/S/13_192x192.png")), new Q(new Size(36, 36), Uri.parse("https://static.avito.ru/stub_avatars/S/13_36x36.png")), new Q(new Size(64, 64), Uri.parse("https://static.avito.ru/stub_avatars/S/13_64x64.png")), new Q(new Size(24, 24), Uri.parse("https://static.avito.ru/stub_avatars/S/13_24x24.png")), new Q(new Size(48, 48), Uri.parse("https://static.avito.ru/stub_avatars/S/13_48x48.png")), new Q(new Size(72, 72), Uri.parse("https://static.avito.ru/stub_avatars/S/13_72x72.png")))), Collections.singletonList(new f("Документы проверены", null, null, new UniversalImage(new Image(Collections.singletonMap(new Size(1024, 1024), Uri.parse("https://70.img.avito.st/image/1/1.-L8atra2js6tF9ZELAWc6E_f3FWsFVJQqh1U.4Oq_eqHt6Hj_khok7mUXW5ivaIAZj9cwCE5yPhZFgzo"))), null), new NoMatchLink())), new g(a("Нет в черном списке", "h25", null), a("Проверили по прошлым бронированиям. Или иное объяснение в 1-2 строки", "m10", null)));
        UniversalColor universalColor = null;
        UniversalImage universalImage = new UniversalImage(new Image(Collections.singletonMap(new Size(1420, 928), Uri.parse("https://avito.st/static/ims/65cb0859-705a-4901-86f3-2d5d5e44b2fd_dosye_na_gostya_light_1420x928.png"))), null);
        AttributedText attributedTextA = a("Больше возможностей на расширенном тарифе", "h25", null);
        kotlin.collections.builders.b bVarT = C42745f0.t();
        int i12 = 0;
        while (i12 < 5) {
            String strG = AK.c.g(i12, "benefit #");
            f301931a.getClass();
            String str2 = str;
            bVarT.add(a(strG, str2, universalColor));
            i12++;
            str = str2;
            universalColor = null;
        }
        G0 g02 = G0.f406611a;
        d dVar = new d(universalImage, attributedTextA, C42745f0.p(bVarT), new e("Подключить тариф", "4000 ₽/мес", new NoMatchLink()));
        f301931a.getClass();
        f301932b = C42745f0.U(hVar, dVar, new i(a("20 бронирований", "h25", null), C42745f0.U(new j("Состоялись", "blue400", 12), new j("Гость отменил", "violet400", 6), new j("Арендодатель отменил", "red400", 2))), new PE0.a("empty_state_review_banner", a("Нет отзывов", "h20", null), a("Никто ничего не написал. Пожалуйста, расскажите потом, как всё прошло. Ваш отзыв очень поможет другим арендодателям.", "m10", null), new PE0.b("Давайте расскажу", new c.a(new NoMatchLink()))));
    }

    public static AttributedText a(String str, String str2, UniversalColor universalColor) {
        return new AttributedText("{{text}}", Collections.singletonList(new FontAttribute("text", str, C42756l.B(new FontParameter[]{new FontParameter.TextStyleParameter(null, str2), universalColor != null ? new FontParameter.ColorParameter(universalColor != null ? universalColor.getColor() : null, universalColor != null ? universalColor.getColorDark() : null, universalColor != null ? universalColor.getColorKey() : null) : null}))), 1);
    }
}
