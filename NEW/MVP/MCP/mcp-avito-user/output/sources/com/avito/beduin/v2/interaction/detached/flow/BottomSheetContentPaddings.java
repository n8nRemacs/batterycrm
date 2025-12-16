package com.avito.beduin.v2.interaction.detached.flow;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetachComponentClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetContentPaddings;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetContentPaddings {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f337295b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomSheetContentPaddings f337296c;

    /* renamed from: d, reason: collision with root package name */
    public static final BottomSheetContentPaddings f337297d;

    /* renamed from: e, reason: collision with root package name */
    public static final BottomSheetContentPaddings f337298e;

    /* renamed from: f, reason: collision with root package name */
    public static final BottomSheetContentPaddings f337299f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ BottomSheetContentPaddings[] f337300g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337301h;

    /* compiled from: DetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetContentPaddings$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BottomSheetContentPaddings bottomSheetContentPaddings = new BottomSheetContentPaddings("Vertical", 0);
        f337296c = bottomSheetContentPaddings;
        BottomSheetContentPaddings bottomSheetContentPaddings2 = new BottomSheetContentPaddings("All", 1);
        f337297d = bottomSheetContentPaddings2;
        BottomSheetContentPaddings bottomSheetContentPaddings3 = new BottomSheetContentPaddings("None", 2);
        f337298e = bottomSheetContentPaddings3;
        BottomSheetContentPaddings bottomSheetContentPaddings4 = new BottomSheetContentPaddings("Default", 3);
        f337299f = bottomSheetContentPaddings4;
        BottomSheetContentPaddings[] bottomSheetContentPaddingsArr = {bottomSheetContentPaddings, bottomSheetContentPaddings2, bottomSheetContentPaddings3, bottomSheetContentPaddings4};
        f337300g = bottomSheetContentPaddingsArr;
        f337301h = kotlin.enums.c.a(bottomSheetContentPaddingsArr);
        f337295b = new a(null);
    }

    public BottomSheetContentPaddings() {
        throw null;
    }

    public static BottomSheetContentPaddings valueOf(String str) {
        return (BottomSheetContentPaddings) Enum.valueOf(BottomSheetContentPaddings.class, str);
    }

    public static BottomSheetContentPaddings[] values() {
        return (BottomSheetContentPaddings[]) f337300g.clone();
    }
}
