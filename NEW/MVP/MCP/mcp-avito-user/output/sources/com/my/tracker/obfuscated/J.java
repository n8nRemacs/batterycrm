package com.my.tracker.obfuscated;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f365293c;

    public /* synthetic */ J(Object obj, int i12) {
        this.f365292b = i12;
        this.f365293c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365292b) {
            case 0:
                ((C37830d) this.f365293c).b();
                break;
            case 1:
                ((j0) this.f365293c).a();
                break;
            case 2:
                ((l0) this.f365293c).a();
                break;
            case 3:
                o0.d((Context) this.f365293c);
                break;
            case 4:
                ((q1) this.f365293c).a();
                break;
            default:
                ((C37848w) this.f365293c).d();
                break;
        }
    }
}
