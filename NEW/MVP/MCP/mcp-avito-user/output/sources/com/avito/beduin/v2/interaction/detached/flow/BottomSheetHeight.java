package com.avito.beduin.v2.interaction.detached.flow;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetachComponentClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetHeight;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetHeight {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f337302b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomSheetHeight f337303c;

    /* renamed from: d, reason: collision with root package name */
    public static final BottomSheetHeight f337304d;

    /* renamed from: e, reason: collision with root package name */
    public static final BottomSheetHeight f337305e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ BottomSheetHeight[] f337306f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337307g;

    /* compiled from: DetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetHeight$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BottomSheetHeight bottomSheetHeight = new BottomSheetHeight("Fit", 0);
        f337303c = bottomSheetHeight;
        BottomSheetHeight bottomSheetHeight2 = new BottomSheetHeight("Max", 1);
        f337304d = bottomSheetHeight2;
        BottomSheetHeight bottomSheetHeight3 = new BottomSheetHeight("Half", 2);
        f337305e = bottomSheetHeight3;
        BottomSheetHeight[] bottomSheetHeightArr = {bottomSheetHeight, bottomSheetHeight2, bottomSheetHeight3};
        f337306f = bottomSheetHeightArr;
        f337307g = kotlin.enums.c.a(bottomSheetHeightArr);
        f337302b = new a(null);
    }

    public BottomSheetHeight() {
        throw null;
    }

    public static BottomSheetHeight valueOf(String str) {
        return (BottomSheetHeight) Enum.valueOf(BottomSheetHeight.class, str);
    }

    public static BottomSheetHeight[] values() {
        return (BottomSheetHeight[]) f337306f.clone();
    }
}
