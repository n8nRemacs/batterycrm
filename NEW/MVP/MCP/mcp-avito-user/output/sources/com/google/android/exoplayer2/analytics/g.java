package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C10568b f343767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f343768d;

    public /* synthetic */ g(int i12, long j12, b.C10568b c10568b) {
        this.f343766b = 0;
        this.f343767c = c10568b;
        this.f343768d = i12;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343766b) {
            case 0:
                bVar.ZT(this.f343767c, this.f343768d);
                break;
            case 1:
                b.C10568b c10568b = this.f343767c;
                bVar.getClass();
                bVar.Gs(c10568b, this.f343768d);
                break;
            case 2:
                bVar.ch(this.f343767c, this.f343768d);
                break;
            case 3:
                bVar.WB(this.f343767c, this.f343768d);
                break;
            default:
                bVar.fI(this.f343767c, this.f343768d);
                break;
        }
    }

    public /* synthetic */ g(b.C10568b c10568b, int i12, int i13) {
        this.f343766b = i13;
        this.f343767c = c10568b;
        this.f343768d = i12;
    }
}
