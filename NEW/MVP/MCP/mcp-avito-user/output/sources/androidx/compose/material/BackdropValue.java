package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropValue {

    /* renamed from: b, reason: collision with root package name */
    public static final BackdropValue f32405b;

    /* renamed from: c, reason: collision with root package name */
    public static final BackdropValue f32406c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BackdropValue[] f32407d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32408e;

    static {
        BackdropValue backdropValue = new BackdropValue("Concealed", 0);
        f32405b = backdropValue;
        BackdropValue backdropValue2 = new BackdropValue("Revealed", 1);
        f32406c = backdropValue2;
        BackdropValue[] backdropValueArr = {backdropValue, backdropValue2};
        f32407d = backdropValueArr;
        f32408e = kotlin.enums.c.a(backdropValueArr);
    }

    public BackdropValue() {
        throw null;
    }

    public static BackdropValue valueOf(String str) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, str);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) f32407d.clone();
    }
}
