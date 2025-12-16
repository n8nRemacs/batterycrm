package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransformedTextFieldState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WedgeAffinity {

    /* renamed from: b, reason: collision with root package name */
    public static final WedgeAffinity f31012b;

    /* renamed from: c, reason: collision with root package name */
    public static final WedgeAffinity f31013c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ WedgeAffinity[] f31014d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f31015e;

    static {
        WedgeAffinity wedgeAffinity = new WedgeAffinity("Start", 0);
        f31012b = wedgeAffinity;
        WedgeAffinity wedgeAffinity2 = new WedgeAffinity("End", 1);
        f31013c = wedgeAffinity2;
        WedgeAffinity[] wedgeAffinityArr = {wedgeAffinity, wedgeAffinity2};
        f31014d = wedgeAffinityArr;
        f31015e = kotlin.enums.c.a(wedgeAffinityArr);
    }

    public WedgeAffinity() {
        throw null;
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f31014d.clone();
    }
}
