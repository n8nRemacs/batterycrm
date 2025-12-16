package coil.view;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scale.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/Scale;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Scale {

    /* renamed from: b, reason: collision with root package name */
    public static final Scale f58755b;

    /* renamed from: c, reason: collision with root package name */
    public static final Scale f58756c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Scale[] f58757d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f58758e;

    static {
        Scale scale = new Scale("FILL", 0);
        f58755b = scale;
        Scale scale2 = new Scale("FIT", 1);
        f58756c = scale2;
        Scale[] scaleArr = {scale, scale2};
        f58757d = scaleArr;
        f58758e = c.a(scaleArr);
    }

    public Scale() {
        throw null;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f58757d.clone();
    }
}
