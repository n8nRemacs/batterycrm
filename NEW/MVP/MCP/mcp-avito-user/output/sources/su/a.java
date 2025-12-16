package SU;

import Y61.k;
import Y61.l;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.remote.model.AnimationOverlayUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnimationOverlayState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AnimationOverlayUrl f14993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14994b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AnimationView.RepeatMode f14995c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final FrameLayout f14996d;

    public a(AnimationOverlayUrl animationOverlayUrl, int i12, AnimationView.RepeatMode repeatMode, FrameLayout frameLayout, int i13, C42822w c42822w) {
        i12 = (i13 & 2) != 0 ? 0 : i12;
        repeatMode = (i13 & 4) != 0 ? AnimationView.RepeatMode.f178282c : repeatMode;
        frameLayout = (i13 & 8) != 0 ? null : frameLayout;
        this.f14993a = animationOverlayUrl;
        this.f14994b = i12;
        this.f14995c = repeatMode;
        this.f14996d = frameLayout;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f14993a, aVar.f14993a) && this.f14994b == aVar.f14994b && this.f14995c == aVar.f14995c && L.f(this.f14996d, aVar.f14996d);
    }

    public final int hashCode() {
        int iHashCode = (this.f14995c.hashCode() + r.e(this.f14994b, this.f14993a.hashCode() * 31, 31)) * 31;
        FrameLayout frameLayout = this.f14996d;
        return iHashCode + (frameLayout == null ? 0 : frameLayout.hashCode());
    }

    @k
    public final String toString() {
        return "AnimationOverlayState(url=" + this.f14993a + ", repeatCount=" + this.f14994b + ", repeatMode=" + this.f14995c + ", parent=" + this.f14996d + ')';
    }
}
