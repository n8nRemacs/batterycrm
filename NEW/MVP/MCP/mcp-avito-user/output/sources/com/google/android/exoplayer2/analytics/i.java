package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C10568b f343771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f343772d;

    public /* synthetic */ i(b.C10568b c10568b, boolean z12, int i12) {
        this.f343770b = i12;
        this.f343771c = c10568b;
        this.f343772d = z12;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343770b) {
            case 0:
                b.C10568b c10568b = this.f343771c;
                bVar.getClass();
                bVar.TF(c10568b, this.f343772d);
                break;
            case 1:
                bVar.kR(this.f343771c, this.f343772d);
                break;
            case 2:
                bVar.QK(this.f343771c, this.f343772d);
                break;
            default:
                bVar.qi(this.f343771c, this.f343772d);
                break;
        }
    }
}
