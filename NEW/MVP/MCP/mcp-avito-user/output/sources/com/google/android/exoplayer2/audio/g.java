package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f343991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f343992d;

    public /* synthetic */ g(i.a aVar, Exception exc, int i12) {
        this.f343990b = i12;
        this.f343991c = aVar;
        this.f343992d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.f343992d;
        i.a aVar = this.f343991c;
        int i12 = this.f343990b;
        aVar.getClass();
        switch (i12) {
            case 0:
                int i13 = U.f348106a;
                aVar.f343997b.l2(exc);
                break;
            default:
                int i14 = U.f348106a;
                aVar.f343997b.b1(exc);
                break;
        }
    }
}
