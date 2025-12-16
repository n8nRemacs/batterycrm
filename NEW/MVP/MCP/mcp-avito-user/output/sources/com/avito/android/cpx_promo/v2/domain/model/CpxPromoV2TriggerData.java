package com.avito.android.cpx_promo.v2.domain.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: CpxPromoV2TriggerData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/domain/model/CpxPromoV2TriggerData;", "", "Color", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoV2TriggerData {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f127534a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127535b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Color f127536c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxPromoV2TriggerData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/domain/model/CpxPromoV2TriggerData$Color;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        /* renamed from: d, reason: collision with root package name */
        public static final Color f127537d;

        /* renamed from: e, reason: collision with root package name */
        public static final Color f127538e;

        /* renamed from: f, reason: collision with root package name */
        public static final Color f127539f;

        /* renamed from: g, reason: collision with root package name */
        public static final Color f127540g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Color[] f127541h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ a f127542i;

        /* renamed from: b, reason: collision with root package name */
        public final int f127543b;

        /* renamed from: c, reason: collision with root package name */
        public final int f127544c;

        static {
            Color color = new Color("GREEN", 0, R.attr.green700, R.attr.green50);
            f127537d = color;
            Color color2 = new Color("YELLOW", 1, R.attr.yellow600, R.attr.orange50);
            f127538e = color2;
            Color color3 = new Color("RED", 2, R.attr.red600, R.attr.red50);
            f127539f = color3;
            Color color4 = new Color("GREY", 3, R.attr.gray54, R.attr.warmGray4);
            f127540g = color4;
            Color[] colorArr = {color, color2, color3, color4};
            f127541h = colorArr;
            f127542i = c.a(colorArr);
        }

        public Color(@InterfaceC42150f String str, @InterfaceC42150f int i12, int i13, int i14) {
            this.f127543b = i13;
            this.f127544c = i14;
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f127541h.clone();
        }
    }

    public CpxPromoV2TriggerData(@l String str, @k String str2, @k Color color) {
        this.f127534a = str;
        this.f127535b = str2;
        this.f127536c = color;
    }
}
