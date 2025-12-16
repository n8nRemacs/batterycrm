package com.avito.android.publish;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/FlowType;", "", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FlowType {

    /* renamed from: b, reason: collision with root package name */
    public static final FlowType f231902b;

    /* renamed from: c, reason: collision with root package name */
    public static final FlowType f231903c;

    /* renamed from: d, reason: collision with root package name */
    public static final FlowType f231904d;

    /* renamed from: e, reason: collision with root package name */
    public static final FlowType f231905e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FlowType[] f231906f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231907g;

    static {
        FlowType flowType = new FlowType("Other", 0);
        f231902b = flowType;
        FlowType flowType2 = new FlowType("Publish", 1);
        f231903c = flowType2;
        FlowType flowType3 = new FlowType("Filters", 2);
        f231904d = flowType3;
        FlowType flowType4 = new FlowType("InlineFilters", 3);
        FlowType flowType5 = new FlowType("Profile", 4);
        f231905e = flowType5;
        FlowType[] flowTypeArr = {flowType, flowType2, flowType3, flowType4, flowType5};
        f231906f = flowTypeArr;
        f231907g = kotlin.enums.c.a(flowTypeArr);
    }

    public FlowType() {
        throw null;
    }

    public static FlowType valueOf(String str) {
        return (FlowType) Enum.valueOf(FlowType.class, str);
    }

    public static FlowType[] values() {
        return (FlowType[]) f231906f.clone();
    }
}
