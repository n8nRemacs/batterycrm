package com.avito.android.cyclic_gallery_widget.image_carousel.seller_info;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SellerInfoParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/SellerInfoParams;", "", "SellerInfoBlockPosition", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerInfoParams {

    /* renamed from: a, reason: collision with root package name */
    public final int f132105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f132106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f132107c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SellerInfoBlockPosition f132108d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SellerInfoParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/SellerInfoParams$SellerInfoBlockPosition;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SellerInfoBlockPosition {

        /* renamed from: b, reason: collision with root package name */
        public static final SellerInfoBlockPosition f132109b;

        /* renamed from: c, reason: collision with root package name */
        public static final SellerInfoBlockPosition f132110c;

        /* renamed from: d, reason: collision with root package name */
        public static final SellerInfoBlockPosition f132111d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SellerInfoBlockPosition[] f132112e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f132113f;

        static {
            SellerInfoBlockPosition sellerInfoBlockPosition = new SellerInfoBlockPosition("BEFORE_ACTIONS", 0);
            f132109b = sellerInfoBlockPosition;
            SellerInfoBlockPosition sellerInfoBlockPosition2 = new SellerInfoBlockPosition("AFTER_ACTIONS", 1);
            f132110c = sellerInfoBlockPosition2;
            SellerInfoBlockPosition sellerInfoBlockPosition3 = new SellerInfoBlockPosition("NONE", 2);
            f132111d = sellerInfoBlockPosition3;
            SellerInfoBlockPosition[] sellerInfoBlockPositionArr = {sellerInfoBlockPosition, sellerInfoBlockPosition2, sellerInfoBlockPosition3};
            f132112e = sellerInfoBlockPositionArr;
            f132113f = kotlin.enums.c.a(sellerInfoBlockPositionArr);
        }

        public SellerInfoBlockPosition() {
            throw null;
        }

        public static SellerInfoBlockPosition valueOf(String str) {
            return (SellerInfoBlockPosition) Enum.valueOf(SellerInfoBlockPosition.class, str);
        }

        public static SellerInfoBlockPosition[] values() {
            return (SellerInfoBlockPosition[]) f132112e.clone();
        }
    }

    public SellerInfoParams(int i12, boolean z12, int i13, @k SellerInfoBlockPosition sellerInfoBlockPosition) {
        this.f132105a = i12;
        this.f132106b = z12;
        this.f132107c = i13;
        this.f132108d = sellerInfoBlockPosition;
    }

    public /* synthetic */ SellerInfoParams(int i12, boolean z12, int i13, SellerInfoBlockPosition sellerInfoBlockPosition, int i14, C42822w c42822w) {
        this(i12, z12, i13, (i14 & 8) != 0 ? SellerInfoBlockPosition.f132109b : sellerInfoBlockPosition);
    }
}
