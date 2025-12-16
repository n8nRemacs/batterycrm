package androidx.compose.ui.platform;

import android.graphics.Outline;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.Path;
import j.InterfaceC42164u;
import kotlin.Metadata;

/* compiled from: OutlineResolver.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/M1;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Path;", "path", "Lkotlin/G0;", "a", "(Landroid/graphics/Outline;Landroidx/compose/ui/graphics/Path;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final M1 f41171a = new M1();

    @InterfaceC42164u
    public final void a(@Y61.k Outline outline, @Y61.k Path path) {
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C22277p) path).f39716a);
    }
}
