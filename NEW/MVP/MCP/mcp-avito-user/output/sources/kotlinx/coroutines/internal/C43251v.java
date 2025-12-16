package kotlinx.coroutines.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: FastServiceLoader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43251v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f411932a = 0;

    static {
        Serializable bVar;
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = Class.forName("android.os.Build");
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        boolean z12 = bVar instanceof Z.b;
    }
}
