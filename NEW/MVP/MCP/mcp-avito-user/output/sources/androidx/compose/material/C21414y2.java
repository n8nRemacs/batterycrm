package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22132o;
import j.InterfaceC42167x;
import kotlin.Metadata;

/* compiled from: ContentAlpha.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/y2;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21414y2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21414y2 f34415a = new C21414y2();

    @InterfaceC22132o
    public static float a(@InterfaceC42167x float f12, @InterfaceC42167x float f13, androidx.compose.runtime.A a12) {
        long j12 = ((androidx.compose.ui.graphics.T) a12.o(A2.f32335a)).f39331a;
        C21365u5.f34242a.getClass();
        if (C21365u5.a(a12).g()) {
            if (androidx.compose.ui.graphics.V.i(j12) > 0.5d) {
                return f12;
            }
        } else if (androidx.compose.ui.graphics.V.i(j12) < 0.5d) {
            return f12;
        }
        return f13;
    }

    @InterfaceC22132o
    @X41.i
    public static float b(@Y61.l androidx.compose.runtime.A a12) {
        return a(1.0f, 0.87f, a12);
    }

    @InterfaceC22132o
    @X41.i
    public static float c(@Y61.l androidx.compose.runtime.A a12) {
        return a(0.74f, 0.6f, a12);
    }
}
