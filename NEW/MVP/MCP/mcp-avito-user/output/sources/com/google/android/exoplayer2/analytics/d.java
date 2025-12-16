package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C10568b f343759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f343760d;

    public /* synthetic */ d(b.C10568b c10568b, I i12, com.google.android.exoplayer2.decoder.h hVar, int i13) {
        this.f343758b = i13;
        this.f343759c = c10568b;
        this.f343760d = i12;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343758b) {
            case 0:
                b.C10568b c10568b = this.f343759c;
                bVar.getClass();
                bVar.Dh(c10568b, this.f343760d);
                break;
            default:
                b.C10568b c10568b2 = this.f343759c;
                bVar.getClass();
                bVar.o40(c10568b2, this.f343760d);
                break;
        }
    }
}
