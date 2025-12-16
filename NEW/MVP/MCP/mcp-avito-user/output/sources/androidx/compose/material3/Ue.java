package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Ue;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Ue {

    /* renamed from: b, reason: collision with root package name */
    public static final Ue f35558b;

    /* renamed from: c, reason: collision with root package name */
    public static final Ue f35559c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Ue[] f35560d;

    static {
        Ue ue2 = new Ue("THUMB", 0);
        f35558b = ue2;
        Ue ue3 = new Ue("TRACK", 1);
        f35559c = ue3;
        f35560d = new Ue[]{ue2, ue3};
    }

    public Ue() {
        throw null;
    }

    public static Ue valueOf(String str) {
        return (Ue) Enum.valueOf(Ue.class, str);
    }

    public static Ue[] values() {
        return (Ue[]) f35560d.clone();
    }
}
