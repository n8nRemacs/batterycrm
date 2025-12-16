package com.avito.android.publish.slots.promoblock;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlot;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlotConfig;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import i31.InterfaceC41220a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoblockSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/promoblock/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends k<PromoblockSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PromoblockSlot f244713b;

    /* compiled from: PromoblockSlotWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f244714a;

        static {
            int[] iArr = new int[PromoStyle.values().length];
            try {
                iArr[PromoStyle.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoStyle.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoStyle.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoStyle.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoStyle.ORANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoStyle.BEIGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoStyle.VIOLET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PromoStyle.WARMGRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f244714a = iArr;
        }
    }

    @i31.c
    public b(@InterfaceC41220a @Y61.k PromoblockSlot promoblockSlot) {
        this.f244713b = promoblockSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244713b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Integer numValueOf;
        int i12;
        PromoblockSlot promoblockSlot = this.f244713b;
        PromoblockSlotConfig promoblockSlotConfig = (PromoblockSlotConfig) promoblockSlot.getWidget().getConfig();
        String id2 = promoblockSlot.getId();
        String title = promoblockSlotConfig.getTitle();
        String text = promoblockSlotConfig.getText();
        PromoStyle style = promoblockSlotConfig.getStyle();
        if (style != null) {
            switch (a.f244714a[style.ordinal()]) {
                case 1:
                    i12 = R.attr.bannerWhite;
                    break;
                case 2:
                    i12 = R.attr.bannerBlue;
                    break;
                case 3:
                    i12 = R.attr.bannerGreen;
                    break;
                case 4:
                    i12 = R.attr.bannerRed;
                    break;
                case 5:
                    i12 = R.attr.bannerOrange;
                    break;
                case 6:
                default:
                    i12 = R.attr.bannerBeige;
                    break;
                case 7:
                    i12 = R.attr.bannerViolet;
                    break;
                case 8:
                    i12 = R.attr.bannerWarmgray;
                    break;
            }
            numValueOf = Integer.valueOf(i12);
        } else {
            numValueOf = null;
        }
        return Collections.singletonList(new com.avito.android.publish.slots.promoblock.item.a(id2, title, text, numValueOf, promoblockSlotConfig.getType(), promoblockSlotConfig.getMargins()));
    }
}
