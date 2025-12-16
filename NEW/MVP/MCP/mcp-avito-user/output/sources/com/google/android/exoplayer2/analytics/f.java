package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.util.C36604u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.C10568b f343764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f343765d;

    public /* synthetic */ f(b.C10568b c10568b, String str, int i12) {
        this.f343763b = i12;
        this.f343764c = c10568b;
        this.f343765d = str;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f343763b) {
            case 0:
                bVar.JW(this.f343764c, this.f343765d);
                break;
            case 1:
                bVar.TD(this.f343764c, this.f343765d);
                break;
            case 2:
                bVar.th(this.f343764c, this.f343765d);
                break;
            default:
                bVar.TU(this.f343764c, this.f343765d);
                break;
        }
    }

    public /* synthetic */ f(b.C10568b c10568b, String str, long j12, long j13, int i12) {
        this.f343763b = i12;
        this.f343764c = c10568b;
        this.f343765d = str;
    }
}
