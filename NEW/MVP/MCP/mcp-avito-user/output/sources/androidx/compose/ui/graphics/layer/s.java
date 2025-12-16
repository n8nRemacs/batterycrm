package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.C22247d;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LayerSnapshot.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/s;", "Landroidx/compose/ui/graphics/layer/n;", "<init>", "()V", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class s implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f39693a = new s();

    /* compiled from: LayerSnapshot.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/s$a;", "Landroid/graphics/Picture;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Picture {
        @Override // android.graphics.Picture
        @Y61.k
        public final Canvas beginRecording(int i12, int i13) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public final void draw(@Y61.k Canvas canvas) {
            C22247d.a(canvas);
            throw null;
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public final void endRecording() {
        }
    }
}
