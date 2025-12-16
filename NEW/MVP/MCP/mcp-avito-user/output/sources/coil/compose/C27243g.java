package coil.compose;

import android.graphics.drawable.Drawable;
import coil.compose.C27242f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageRequest.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"coil/request/o", "LK2/c;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.compose.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27243g implements K2.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27242f f58225b;

    public C27243g(C27242f c27242f) {
        this.f58225b = c27242f;
    }

    @Override // K2.c
    public final void c(@Y61.l Drawable drawable) {
        androidx.compose.ui.graphics.painter.e eVarJ;
        C27242f c27242f = this.f58225b;
        if (drawable != null) {
            C27242f.b bVar = C27242f.f58194v;
            eVarJ = c27242f.j(drawable);
        } else {
            eVarJ = null;
        }
        C27242f.c.C2065c c2065c = new C27242f.c.C2065c(eVarJ);
        C27242f.b bVar2 = C27242f.f58194v;
        c27242f.k(c2065c);
    }

    @Override // K2.c
    public final void b(@Y61.k Drawable drawable) {
    }

    @Override // K2.c
    public final void d(@Y61.l Drawable drawable) {
    }
}
