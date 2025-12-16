package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements r.a, C36604u.a, m90.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f48663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48664d;

    public /* synthetic */ i(float f12, int i12, Object obj) {
        this.f48662b = i12;
        this.f48664d = obj;
        this.f48663c = f12;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        switch (this.f48662b) {
            case 0:
                ((b) obj).y((b.C1823b) this.f48664d, this.f48663c);
                break;
            case 1:
                ((com.google.android.exoplayer2.analytics.b) obj).UC((b.C10568b) this.f48664d, this.f48663c);
                break;
            default:
                float f12 = this.f48663c;
                ((k9) obj).getClass();
                break;
        }
    }
}
