package com.avito.beduin.v2.component.common;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/common/AxisAlignment;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AxisAlignment {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f335651c;

    /* renamed from: d, reason: collision with root package name */
    public static final AxisAlignment f335652d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AxisAlignment[] f335653e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335654f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f335655b;

    /* compiled from: Alignment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/AxisAlignment$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        AxisAlignment axisAlignment = new AxisAlignment("Start", 0, "Start");
        f335652d = axisAlignment;
        AxisAlignment[] axisAlignmentArr = {axisAlignment, new AxisAlignment("Center", 1, "Center"), new AxisAlignment("End", 2, "End")};
        f335653e = axisAlignmentArr;
        f335654f = c.a(axisAlignmentArr);
        f335651c = new a(null);
    }

    public AxisAlignment(String str, int i12, String str2) {
        this.f335655b = str2;
    }

    public static AxisAlignment valueOf(String str) {
        return (AxisAlignment) Enum.valueOf(AxisAlignment.class, str);
    }

    public static AxisAlignment[] values() {
        return (AxisAlignment[]) f335653e.clone();
    }
}
