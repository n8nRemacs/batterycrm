package com.avito.android.publish.details.analytics;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* compiled from: PublishDetailsFlowTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/analytics/PublishDetailsFlowTracker;", "", "FlowContext", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PublishDetailsFlowTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PublishDetailsFlowTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/analytics/PublishDetailsFlowTracker$FlowContext;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlowContext {

        /* renamed from: A, reason: collision with root package name */
        public static final FlowContext f233431A;

        /* renamed from: B, reason: collision with root package name */
        public static final FlowContext f233432B;

        /* renamed from: C, reason: collision with root package name */
        public static final FlowContext f233433C;

        /* renamed from: D, reason: collision with root package name */
        public static final /* synthetic */ FlowContext[] f233434D;

        /* renamed from: E, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f233435E;

        /* renamed from: b, reason: collision with root package name */
        public static final FlowContext f233436b;

        /* renamed from: c, reason: collision with root package name */
        public static final FlowContext f233437c;

        /* renamed from: d, reason: collision with root package name */
        public static final FlowContext f233438d;

        /* renamed from: e, reason: collision with root package name */
        public static final FlowContext f233439e;

        /* renamed from: f, reason: collision with root package name */
        public static final FlowContext f233440f;

        /* renamed from: g, reason: collision with root package name */
        public static final FlowContext f233441g;

        /* renamed from: h, reason: collision with root package name */
        public static final FlowContext f233442h;

        /* renamed from: i, reason: collision with root package name */
        public static final FlowContext f233443i;

        /* renamed from: j, reason: collision with root package name */
        public static final FlowContext f233444j;

        /* renamed from: k, reason: collision with root package name */
        public static final FlowContext f233445k;

        /* renamed from: l, reason: collision with root package name */
        public static final FlowContext f233446l;

        /* renamed from: m, reason: collision with root package name */
        public static final FlowContext f233447m;

        /* renamed from: n, reason: collision with root package name */
        public static final FlowContext f233448n;

        /* renamed from: o, reason: collision with root package name */
        public static final FlowContext f233449o;

        /* renamed from: p, reason: collision with root package name */
        public static final FlowContext f233450p;

        /* renamed from: q, reason: collision with root package name */
        public static final FlowContext f233451q;

        /* renamed from: r, reason: collision with root package name */
        public static final FlowContext f233452r;

        /* renamed from: s, reason: collision with root package name */
        public static final FlowContext f233453s;

        /* renamed from: t, reason: collision with root package name */
        public static final FlowContext f233454t;

        /* renamed from: u, reason: collision with root package name */
        public static final FlowContext f233455u;

        /* renamed from: v, reason: collision with root package name */
        public static final FlowContext f233456v;

        /* renamed from: w, reason: collision with root package name */
        public static final FlowContext f233457w;

        /* renamed from: x, reason: collision with root package name */
        public static final FlowContext f233458x;

        /* renamed from: y, reason: collision with root package name */
        public static final FlowContext f233459y;

        /* renamed from: z, reason: collision with root package name */
        public static final FlowContext f233460z;

        static {
            FlowContext flowContext = new FlowContext(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            f233436b = flowContext;
            FlowContext flowContext2 = new FlowContext("INIT", 1);
            f233437c = flowContext2;
            FlowContext flowContext3 = new FlowContext("PARAMETER_VALUE_UPDATE", 2);
            f233438d = flowContext3;
            FlowContext flowContext4 = new FlowContext("ANONYMOUS_NUMBER_SLOT_UPDATE", 3);
            f233439e = flowContext4;
            FlowContext flowContext5 = new FlowContext("CONTACT_INFO_SLOT_UPDATE", 4);
            f233440f = flowContext5;
            FlowContext flowContext6 = new FlowContext("INFORMATION_WITH_USER_ID_SLOT_UPDATE", 5);
            f233441g = flowContext6;
            FlowContext flowContext7 = new FlowContext("MARKET_PRICE_SLOT_UPDATE", 6);
            f233442h = flowContext7;
            FlowContext flowContext8 = new FlowContext("AUTO_PUBLISH_SLOT_UPDATE", 7);
            f233443i = flowContext8;
            FlowContext flowContext9 = new FlowContext("SALARY_RANGE_SLOT_UPDATE", 8);
            f233444j = flowContext9;
            FlowContext flowContext10 = new FlowContext("AGE_RANGE_SLOT_UPDATE", 9);
            f233445k = flowContext10;
            FlowContext flowContext11 = new FlowContext("JOB_PREMODERATION_UPDATE", 10);
            f233446l = flowContext11;
            FlowContext flowContext12 = new FlowContext("POST_PROCESSING", 11);
            f233447m = flowContext12;
            FlowContext flowContext13 = new FlowContext("SUBMIT", 12);
            f233448n = flowContext13;
            FlowContext flowContext14 = new FlowContext("FORM_UPDATE", 13);
            f233449o = flowContext14;
            FlowContext flowContext15 = new FlowContext("IAC_SLOT_UPDATE", 14);
            FlowContext flowContext16 = new FlowContext("IAC_DEVICES_SLOT_UPDATE", 15);
            f233450p = flowContext16;
            FlowContext flowContext17 = new FlowContext("STOCK_MANAGEMENT_SLOT_UPDATE", 16);
            f233451q = flowContext17;
            FlowContext flowContext18 = new FlowContext("CARD_SELECT_UPDATE", 17);
            f233452r = flowContext18;
            FlowContext flowContext19 = new FlowContext("CONTACT_METHOD_UPDATE", 18);
            f233453s = flowContext19;
            FlowContext flowContext20 = new FlowContext("SLEEPING_PLACES_UPDATE", 19);
            f233454t = flowContext20;
            FlowContext flowContext21 = new FlowContext("GROUP_INLINED_BLOCK_UPDATE", 20);
            f233455u = flowContext21;
            FlowContext flowContext22 = new FlowContext("GROUP_BODY_CONDITION_UPDATE", 21);
            f233456v = flowContext22;
            FlowContext flowContext23 = new FlowContext("ITEM_INFO_SLOT_UPDATE", 22);
            f233457w = flowContext23;
            FlowContext flowContext24 = new FlowContext("IMAGES_GROUPS_RECOMMENDATIONS_UPDATE", 23);
            f233458x = flowContext24;
            FlowContext flowContext25 = new FlowContext("GROUP_ADDITIONAL_OPTIONS_UPDATE", 24);
            f233459y = flowContext25;
            FlowContext flowContext26 = new FlowContext("GROUP_CONTACT_UPDATE", 25);
            f233460z = flowContext26;
            FlowContext flowContext27 = new FlowContext("DELIVERY_ADDRESSES", 26);
            f233431A = flowContext27;
            FlowContext flowContext28 = new FlowContext("GENERATE_TEXT_BUTTONS_UPDATE", 27);
            f233432B = flowContext28;
            FlowContext flowContext29 = new FlowContext("SELECTED_ADDRESS_UPDATE", 28);
            f233433C = flowContext29;
            FlowContext[] flowContextArr = {flowContext, flowContext2, flowContext3, flowContext4, flowContext5, flowContext6, flowContext7, flowContext8, flowContext9, flowContext10, flowContext11, flowContext12, flowContext13, flowContext14, flowContext15, flowContext16, flowContext17, flowContext18, flowContext19, flowContext20, flowContext21, flowContext22, flowContext23, flowContext24, flowContext25, flowContext26, flowContext27, flowContext28, flowContext29};
            f233434D = flowContextArr;
            f233435E = kotlin.enums.c.a(flowContextArr);
        }

        public FlowContext() {
            throw null;
        }

        public static FlowContext valueOf(String str) {
            return (FlowContext) Enum.valueOf(FlowContext.class, str);
        }

        public static FlowContext[] values() {
            return (FlowContext[]) f233434D.clone();
        }
    }

    void a(@k FlowContext... flowContextArr);

    void b();
}
