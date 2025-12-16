package com.avito.android.delivery_combined_buttons_public;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CombinedButtons.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/WidthStrategy;", "", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WidthStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final WidthStrategy f134963b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ WidthStrategy[] f134964c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f134965d;

    static {
        WidthStrategy widthStrategy = new WidthStrategy("EQUAL", 0);
        f134963b = widthStrategy;
        WidthStrategy[] widthStrategyArr = {widthStrategy};
        f134964c = widthStrategyArr;
        f134965d = c.a(widthStrategyArr);
    }

    public WidthStrategy() {
        throw null;
    }

    public static WidthStrategy valueOf(String str) {
        return (WidthStrategy) Enum.valueOf(WidthStrategy.class, str);
    }

    public static WidthStrategy[] values() {
        return (WidthStrategy[]) f134964c.clone();
    }
}
