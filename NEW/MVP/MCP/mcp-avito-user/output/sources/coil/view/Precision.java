package coil.view;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Precision.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/Precision;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Precision {

    /* renamed from: b, reason: collision with root package name */
    public static final Precision f58750b;

    /* renamed from: c, reason: collision with root package name */
    public static final Precision f58751c;

    /* renamed from: d, reason: collision with root package name */
    public static final Precision f58752d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Precision[] f58753e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f58754f;

    static {
        Precision precision = new Precision("EXACT", 0);
        f58750b = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        f58751c = precision2;
        Precision precision3 = new Precision("AUTOMATIC", 2);
        f58752d = precision3;
        Precision[] precisionArr = {precision, precision2, precision3};
        f58753e = precisionArr;
        f58754f = c.a(precisionArr);
    }

    public Precision() {
        throw null;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f58753e.clone();
    }
}
