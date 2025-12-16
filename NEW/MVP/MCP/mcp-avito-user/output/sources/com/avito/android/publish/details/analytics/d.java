package com.avito.android.publish.details.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.Metadata;

/* compiled from: PublishDetailsFlowTracker.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: PublishDetailsFlowTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233465a;

        static {
            int[] iArr = new int[SlotType.values().length];
            try {
                iArr[SlotType.ANONYMOUS_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotType.CONTACT_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SlotType.INFORMATION_WITH_USER_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SlotType.MARKET_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SlotType.AUTO_PUBLISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SlotType.SALARY_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SlotType.AGE_RANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SlotType.JOB_PREMODERATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SlotType.IAC_DEVICES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SlotType.STOCK_MANAGEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SlotType.CARD_SELECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SlotType.CONTACT_METHOD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SlotType.SLEEPING_PLACES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SlotType.GROUP_BODY_CONDITION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SlotType.GROUP_ADDITIONAL_OPTIONS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SlotType.ITEM_INFO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SlotType.IMAGES_GROUPS_RECOMMENDATIONS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SlotType.GROUP_INLINED_BLOCK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SlotType.GROUP_CONTACT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SlotType.DELIVERY_ADDRESSES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SlotType.GENERATE_TEXT_BUTTONS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SlotType.ADDRESSES_FROM_PROFILE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f233465a = iArr;
        }
    }

    @l
    public static final PublishDetailsFlowTracker.FlowContext a(@k SlotType slotType) {
        switch (a.f233465a[slotType.ordinal()]) {
            case 1:
                return PublishDetailsFlowTracker.FlowContext.f233439e;
            case 2:
                return PublishDetailsFlowTracker.FlowContext.f233440f;
            case 3:
                return PublishDetailsFlowTracker.FlowContext.f233441g;
            case 4:
                return PublishDetailsFlowTracker.FlowContext.f233442h;
            case 5:
                return PublishDetailsFlowTracker.FlowContext.f233443i;
            case 6:
                return PublishDetailsFlowTracker.FlowContext.f233444j;
            case 7:
                return PublishDetailsFlowTracker.FlowContext.f233445k;
            case 8:
                return PublishDetailsFlowTracker.FlowContext.f233446l;
            case 9:
                return PublishDetailsFlowTracker.FlowContext.f233450p;
            case 10:
                return PublishDetailsFlowTracker.FlowContext.f233451q;
            case 11:
                return PublishDetailsFlowTracker.FlowContext.f233452r;
            case 12:
                return PublishDetailsFlowTracker.FlowContext.f233453s;
            case 13:
                return PublishDetailsFlowTracker.FlowContext.f233454t;
            case 14:
                return PublishDetailsFlowTracker.FlowContext.f233456v;
            case 15:
                return PublishDetailsFlowTracker.FlowContext.f233459y;
            case 16:
                return PublishDetailsFlowTracker.FlowContext.f233457w;
            case 17:
                return PublishDetailsFlowTracker.FlowContext.f233458x;
            case 18:
                return PublishDetailsFlowTracker.FlowContext.f233455u;
            case 19:
                return PublishDetailsFlowTracker.FlowContext.f233460z;
            case 20:
                return PublishDetailsFlowTracker.FlowContext.f233431A;
            case 21:
                return PublishDetailsFlowTracker.FlowContext.f233432B;
            case 22:
                return PublishDetailsFlowTracker.FlowContext.f233433C;
            default:
                return null;
        }
    }
}
