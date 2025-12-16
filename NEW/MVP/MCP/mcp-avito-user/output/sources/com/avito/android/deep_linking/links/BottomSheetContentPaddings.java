package com.avito.android.deep_linking.links;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinUniversalPageLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "TOP", "NONE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomSheetContentPaddings {

    @com.google.gson.annotations.c("none")
    public static final BottomSheetContentPaddings NONE;

    @com.google.gson.annotations.c("top")
    public static final BottomSheetContentPaddings TOP;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f133056c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BottomSheetContentPaddings[] f133057d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133058e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133059b;

    /* compiled from: BeduinUniversalPageLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BottomSheetContentPaddings bottomSheetContentPaddings = new BottomSheetContentPaddings("TOP", 0, "top");
        TOP = bottomSheetContentPaddings;
        BottomSheetContentPaddings bottomSheetContentPaddings2 = new BottomSheetContentPaddings("NONE", 1, "none");
        NONE = bottomSheetContentPaddings2;
        BottomSheetContentPaddings[] bottomSheetContentPaddingsArr = {bottomSheetContentPaddings, bottomSheetContentPaddings2};
        f133057d = bottomSheetContentPaddingsArr;
        f133058e = kotlin.enums.c.a(bottomSheetContentPaddingsArr);
        f133056c = new a(null);
    }

    private BottomSheetContentPaddings(String str, int i12, String str2) {
        this.f133059b = str2;
    }

    public static BottomSheetContentPaddings valueOf(String str) {
        return (BottomSheetContentPaddings) Enum.valueOf(BottomSheetContentPaddings.class, str);
    }

    public static BottomSheetContentPaddings[] values() {
        return (BottomSheetContentPaddings[]) f133057d.clone();
    }
}
