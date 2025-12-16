package com.avito.beduin.v2.avito.component.stepper.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidthStrategy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/stepper/state/WidthStrategy;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WidthStrategy {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f335155b;

    /* renamed from: c, reason: collision with root package name */
    public static final WidthStrategy f335156c;

    /* renamed from: d, reason: collision with root package name */
    public static final WidthStrategy f335157d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ WidthStrategy[] f335158e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335159f;

    /* compiled from: WidthStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/stepper/state/WidthStrategy$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        WidthStrategy widthStrategy = new WidthStrategy("FILL_MAX", 0);
        f335156c = widthStrategy;
        WidthStrategy widthStrategy2 = new WidthStrategy("WRAP_CONTENT", 1);
        f335157d = widthStrategy2;
        WidthStrategy[] widthStrategyArr = {widthStrategy, widthStrategy2};
        f335158e = widthStrategyArr;
        f335159f = kotlin.enums.c.a(widthStrategyArr);
        f335155b = new a(null);
    }

    public static WidthStrategy valueOf(String str) {
        return (WidthStrategy) Enum.valueOf(WidthStrategy.class, str);
    }

    public static WidthStrategy[] values() {
        return (WidthStrategy[]) f335158e.clone();
    }
}
