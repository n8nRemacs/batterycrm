package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.source.C36548k;
import com.google.android.exoplayer2.trackselection.a;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.upstream.s;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C36535p implements com.google.common.base.e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f345850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f345851c;

    public /* synthetic */ C36535p(Context context, int i12) {
        this.f345850b = i12;
        this.f345851c = context;
    }

    @Override // com.google.common.base.e0
    public final Object get() {
        com.google.android.exoplayer2.upstream.s sVar;
        switch (this.f345850b) {
            case 0:
                return new C36532m(this.f345851c);
            case 1:
                return new C36548k(this.f345851c, new com.google.android.exoplayer2.extractor.g());
            case 2:
                return new C36548k(this.f345851c, new com.google.android.exoplayer2.extractor.g());
            case 3:
                a.b bVar = new a.b();
                g.d dVar = g.d.f347200R;
                Context context = this.f345851c;
                return new com.google.android.exoplayer2.trackselection.g(new g.d.a(context).a(), bVar, context);
            default:
                Context context2 = this.f345851c;
                AbstractC37401r1<Long> abstractC37401r1 = com.google.android.exoplayer2.upstream.s.f347957n;
                synchronized (com.google.android.exoplayer2.upstream.s.class) {
                    try {
                        if (com.google.android.exoplayer2.upstream.s.f347963t == null) {
                            s.b bVar2 = new s.b(context2);
                            com.google.android.exoplayer2.upstream.s.f347963t = new com.google.android.exoplayer2.upstream.s(bVar2.f347977a, bVar2.f347978b, bVar2.f347979c, bVar2.f347980d, bVar2.f347981e);
                        }
                        sVar = com.google.android.exoplayer2.upstream.s.f347963t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return sVar;
        }
    }
}
