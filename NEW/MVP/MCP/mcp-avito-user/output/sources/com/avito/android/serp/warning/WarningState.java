package com.avito.android.serp.warning;

import Y61.k;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WarningState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/warning/WarningState;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WarningState {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f273965c;

    /* renamed from: d, reason: collision with root package name */
    public static final WarningState f273966d;

    /* renamed from: e, reason: collision with root package name */
    public static final WarningState f273967e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ WarningState[] f273968f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f273969g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273970b;

    /* compiled from: WarningState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/warning/WarningState$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        WarningState warningState = new WarningState("SHOW", 0, "show");
        f273966d = warningState;
        WarningState warningState2 = new WarningState("HIDE", 1, ConstraintKt.CONDITION_FLOW_HIDE);
        f273967e = warningState2;
        WarningState[] warningStateArr = {warningState, warningState2};
        f273968f = warningStateArr;
        f273969g = kotlin.enums.c.a(warningStateArr);
        f273965c = new a(null);
    }

    public WarningState(String str, int i12, String str2) {
        this.f273970b = str2;
    }

    public static WarningState valueOf(String str) {
        return (WarningState) Enum.valueOf(WarningState.class, str);
    }

    public static WarningState[] values() {
        return (WarningState[]) f273968f.clone();
    }
}
