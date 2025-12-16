package com.avito.android.deep_linking.links;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinUniversalPageLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deep_linking/links/ScreenStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "PUSH", "BOTTOM_SHEET", "MODAL", "PUSH_BOTTOM_SHEET", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScreenStyle {

    @com.google.gson.annotations.c("bottomSheet")
    public static final ScreenStyle BOTTOM_SHEET;

    @com.google.gson.annotations.c("modal")
    public static final ScreenStyle MODAL;

    @com.google.gson.annotations.c("push")
    public static final ScreenStyle PUSH;

    @com.google.gson.annotations.c("pushBottomSheet")
    public static final ScreenStyle PUSH_BOTTOM_SHEET;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f133646c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ScreenStyle[] f133647d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133648e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133649b;

    /* compiled from: BeduinUniversalPageLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ScreenStyle$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ScreenStyle a(@Y61.l String str) {
            ScreenStyle screenStyle = ScreenStyle.BOTTOM_SHEET;
            if (kotlin.jvm.internal.L.f(str, screenStyle.f133649b)) {
                return screenStyle;
            }
            ScreenStyle screenStyle2 = ScreenStyle.PUSH;
            if (kotlin.jvm.internal.L.f(str, screenStyle2.f133649b)) {
                return screenStyle2;
            }
            ScreenStyle screenStyle3 = ScreenStyle.PUSH_BOTTOM_SHEET;
            return kotlin.jvm.internal.L.f(str, screenStyle3.f133649b) ? screenStyle3 : ScreenStyle.MODAL;
        }

        public a() {
        }
    }

    static {
        ScreenStyle screenStyle = new ScreenStyle("PUSH", 0, "push");
        PUSH = screenStyle;
        ScreenStyle screenStyle2 = new ScreenStyle("BOTTOM_SHEET", 1, "bottomSheet");
        BOTTOM_SHEET = screenStyle2;
        ScreenStyle screenStyle3 = new ScreenStyle("MODAL", 2, "modal");
        MODAL = screenStyle3;
        ScreenStyle screenStyle4 = new ScreenStyle("PUSH_BOTTOM_SHEET", 3, "pushBottomSheet");
        PUSH_BOTTOM_SHEET = screenStyle4;
        ScreenStyle[] screenStyleArr = {screenStyle, screenStyle2, screenStyle3, screenStyle4};
        f133647d = screenStyleArr;
        f133648e = kotlin.enums.c.a(screenStyleArr);
        f133646c = new a(null);
    }

    private ScreenStyle(String str, int i12, String str2) {
        this.f133649b = str2;
    }

    public static ScreenStyle valueOf(String str) {
        return (ScreenStyle) Enum.valueOf(ScreenStyle.class, str);
    }

    public static ScreenStyle[] values() {
        return (ScreenStyle[]) f133647d.clone();
    }
}
