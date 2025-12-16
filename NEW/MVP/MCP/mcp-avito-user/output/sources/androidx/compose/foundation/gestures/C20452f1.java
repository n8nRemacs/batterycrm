package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: MouseWheelScrollable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20452f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f27701a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f27702b;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f27701a = 6;
        f27702b = 1;
    }

    public static final boolean a(float f12) {
        return Float.isNaN(f12) || Math.abs(f12) < 0.5f;
    }
}
