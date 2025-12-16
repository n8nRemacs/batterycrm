package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: CacheByClass.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42840b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f407077a = 0;

    static {
        Object bVar;
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = Class.forName("java.lang.ClassValue");
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (!(bVar instanceof Z.b)) {
            bVar = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof Z.b) {
            bVar = obj;
        }
    }
}
