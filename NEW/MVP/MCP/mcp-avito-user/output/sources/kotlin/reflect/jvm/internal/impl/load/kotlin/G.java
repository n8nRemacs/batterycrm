package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.ui.platform.C22491k0;
import kotlin.jvm.internal.N;

/* compiled from: SignatureBuildingComponents.kt */
/* loaded from: classes8.dex */
final class G extends N implements Y41.l<String, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final G f408433l = new G();

    public G() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(String str) {
        String str2 = str;
        H.f408434a.getClass();
        return str2.length() > 1 ? C22491k0.a(';', "L", str2) : str2;
    }
}
