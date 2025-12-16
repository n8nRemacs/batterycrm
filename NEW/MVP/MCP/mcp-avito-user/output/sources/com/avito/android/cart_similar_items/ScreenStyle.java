package com.avito.android.cart_similar_items;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/ScreenStyle;", "", "a", "_avito_cart-similar-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScreenStyle {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f115707b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScreenStyle f115708c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScreenStyle f115709d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ScreenStyle[] f115710e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f115711f;

    /* compiled from: ScreenStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/ScreenStyle$a;", "", "<init>", "()V", "_avito_cart-similar-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ScreenStyle screenStyle = new ScreenStyle("MODAL", 0);
        f115708c = screenStyle;
        ScreenStyle screenStyle2 = new ScreenStyle("PUSH", 1);
        f115709d = screenStyle2;
        ScreenStyle[] screenStyleArr = {screenStyle, screenStyle2};
        f115710e = screenStyleArr;
        f115711f = kotlin.enums.c.a(screenStyleArr);
        f115707b = new a(null);
    }

    public static ScreenStyle valueOf(String str) {
        return (ScreenStyle) Enum.valueOf(ScreenStyle.class, str);
    }

    public static ScreenStyle[] values() {
        return (ScreenStyle[]) f115710e.clone();
    }
}
