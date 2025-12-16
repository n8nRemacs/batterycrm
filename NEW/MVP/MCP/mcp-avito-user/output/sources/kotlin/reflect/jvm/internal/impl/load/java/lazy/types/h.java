package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y41.l;
import kotlin.jvm.internal.N;

/* compiled from: RawType.kt */
/* loaded from: classes8.dex */
final class h extends N implements l<String, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f408292l = new h();

    public h() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(String str) {
        return "(raw) ".concat(str);
    }
}
