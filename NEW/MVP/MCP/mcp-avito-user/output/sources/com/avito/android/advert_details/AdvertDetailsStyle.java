package com.avito.android.advert_details;

import Y61.k;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsStyle.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details/AdvertDetailsStyle;", "", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsStyle {

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertDetailsStyle f84409c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdvertDetailsStyle f84410d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdvertDetailsStyle f84411e;

    /* renamed from: f, reason: collision with root package name */
    public static final AdvertDetailsStyle f84412f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AdvertDetailsStyle[] f84413g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84414h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f84415b;

    /* compiled from: AdvertDetailsStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details/AdvertDetailsStyle$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f84416a;

        public a(boolean z12) {
            this.f84416a = z12;
        }
    }

    static {
        AdvertDetailsStyle advertDetailsStyle = new AdvertDetailsStyle("Default", 0, new a(false));
        f84409c = advertDetailsStyle;
        AdvertDetailsStyle advertDetailsStyle2 = new AdvertDetailsStyle("AvitoBlack", 1, new a(true));
        f84410d = advertDetailsStyle2;
        AdvertDetailsStyle advertDetailsStyle3 = new AdvertDetailsStyle("AvitoMall", 2, new a(false));
        f84411e = advertDetailsStyle3;
        AdvertDetailsStyle advertDetailsStyle4 = new AdvertDetailsStyle("AvitoBusiness", 3, new a(false));
        f84412f = advertDetailsStyle4;
        AdvertDetailsStyle[] advertDetailsStyleArr = {advertDetailsStyle, advertDetailsStyle2, advertDetailsStyle3, advertDetailsStyle4};
        f84413g = advertDetailsStyleArr;
        f84414h = c.a(advertDetailsStyleArr);
    }

    public AdvertDetailsStyle(String str, int i12, a aVar) {
        this.f84415b = aVar;
    }

    public static AdvertDetailsStyle valueOf(String str) {
        return (AdvertDetailsStyle) Enum.valueOf(AdvertDetailsStyle.class, str);
    }

    public static AdvertDetailsStyle[] values() {
        return (AdvertDetailsStyle[]) f84413g.clone();
    }
}
