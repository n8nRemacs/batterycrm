package com.avito.android.cart_snippet_actions;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CartActionsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_snippet_actions/Style;", "", "a", "_avito_cart-snippet-actions_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Style {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f116150b;

    /* renamed from: c, reason: collision with root package name */
    public static final Style f116151c;

    /* renamed from: d, reason: collision with root package name */
    public static final Style f116152d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Style[] f116153e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116154f;

    /* compiled from: CartActionsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_snippet_actions/Style$a;", "", "<init>", "()V", "_avito_cart-snippet-actions_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Style style = new Style("Button", 0);
        f116151c = style;
        Style style2 = new Style("Text", 1);
        f116152d = style2;
        Style[] styleArr = {style, style2};
        f116153e = styleArr;
        f116154f = kotlin.enums.c.a(styleArr);
        f116150b = new a(null);
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) f116153e.clone();
    }
}
