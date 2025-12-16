package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C10568b f343756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36557u f343757d;

    public /* synthetic */ c(b.C10568b c10568b, C36557u c36557u, int i12) {
        this.f343755b = i12;
        this.f343756c = c10568b;
        this.f343757d = c36557u;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343755b) {
            case 0:
                bVar.nR(this.f343756c, this.f343757d);
                break;
            default:
                bVar.hp(this.f343756c, this.f343757d);
                break;
        }
    }
}
