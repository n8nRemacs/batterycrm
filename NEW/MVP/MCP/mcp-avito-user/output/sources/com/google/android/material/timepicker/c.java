package com.google.android.material.timepicker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f357660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f357661c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f357660b = i12;
        this.f357661c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f357660b) {
            case 0:
                Object obj = ((MaterialTimePicker) this.f357661c).f357623n0;
                if (obj instanceof l) {
                    ((l) obj).b();
                    break;
                }
                break;
            default:
                ((e) this.f357661c).g();
                break;
        }
    }
}
