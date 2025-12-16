package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntrinsicSize {

    /* renamed from: b, reason: collision with root package name */
    public static final IntrinsicSize f28333b;

    /* renamed from: c, reason: collision with root package name */
    public static final IntrinsicSize f28334c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicSize[] f28335d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f28336e;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        f28333b = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        f28334c = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        f28335d = intrinsicSizeArr;
        f28336e = kotlin.enums.c.a(intrinsicSizeArr);
    }

    public IntrinsicSize() {
        throw null;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f28335d.clone();
    }
}
