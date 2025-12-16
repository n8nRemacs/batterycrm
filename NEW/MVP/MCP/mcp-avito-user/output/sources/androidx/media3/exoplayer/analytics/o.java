package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements r.a, C36604u.a, m90.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48685e;

    public /* synthetic */ o(Object obj, int i12, int i13, int i14) {
        this.f48682b = i14;
        this.f48685e = obj;
        this.f48683c = i12;
        this.f48684d = i13;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        switch (this.f48682b) {
            case 0:
                ((b) obj).C((b.C1823b) this.f48685e, this.f48683c, this.f48684d);
                break;
            case 1:
                ((com.google.android.exoplayer2.analytics.b) obj).OX((b.C10568b) this.f48685e, this.f48683c, this.f48684d);
                break;
            default:
                int i12 = this.f48683c;
                int i13 = this.f48684d;
                ((k9) obj).getClass();
                break;
        }
    }
}
