package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.X;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes8.dex */
final class q extends N implements Y41.l<J0, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f408391l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(J0 j02) {
        return Boolean.valueOf(j02 instanceof X);
    }
}
