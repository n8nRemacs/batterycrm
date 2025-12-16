package com.avito.android.lib.design.picker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Picker f179995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f179996d;

    public /* synthetic */ c(Picker picker, k kVar, int i12) {
        this.f179994b = i12;
        this.f179995c = picker;
        this.f179996d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f179994b) {
            case 0:
                this.f179995c.i(0, this.f179996d);
                break;
            default:
                this.f179995c.i(0, this.f179996d);
                break;
        }
    }
}
