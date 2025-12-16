package androidx.compose.material3;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.C22286u;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Checkbox.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/G2;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class G2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Path f34769a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.O0 f34770b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Path f34771c;

    public G2() {
        this(null, null, null, 7, null);
    }

    public G2(Path path, androidx.compose.ui.graphics.O0 o02, Path path2, int i12, C42822w c42822w) {
        path = (i12 & 1) != 0 ? C22315w.a() : path;
        o02 = (i12 & 2) != 0 ? new C22286u(new PathMeasure()) : o02;
        path2 = (i12 & 4) != 0 ? C22315w.a() : path2;
        this.f34769a = path;
        this.f34770b = o02;
        this.f34771c = path2;
    }
}
