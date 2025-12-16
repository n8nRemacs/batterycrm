package com.avito.android.lib.util.groupable_item;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EdgeMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/EdgeMode;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EdgeMode {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f181350b;

    /* renamed from: c, reason: collision with root package name */
    public static final EdgeMode f181351c;

    /* renamed from: d, reason: collision with root package name */
    public static final EdgeMode f181352d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EdgeMode[] f181353e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181354f;

    /* compiled from: EdgeMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/EdgeMode$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        EdgeMode edgeMode = new EdgeMode("ROUNDED", 0);
        f181351c = edgeMode;
        EdgeMode edgeMode2 = new EdgeMode("FLAT", 1);
        f181352d = edgeMode2;
        EdgeMode[] edgeModeArr = {edgeMode, edgeMode2};
        f181353e = edgeModeArr;
        f181354f = kotlin.enums.c.a(edgeModeArr);
        f181350b = new a(null);
    }

    public EdgeMode() {
        throw null;
    }

    public static EdgeMode valueOf(String str) {
        return (EdgeMode) Enum.valueOf(EdgeMode.class, str);
    }

    public static EdgeMode[] values() {
        return (EdgeMode[]) f181353e.clone();
    }
}
