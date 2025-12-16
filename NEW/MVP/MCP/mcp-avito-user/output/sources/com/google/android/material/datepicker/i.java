package com.google.android.material.datepicker;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f356536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356537c;

    public i(MaterialCalendar materialCalendar, int i12) {
        this.f356537c = materialCalendar;
        this.f356536b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f356537c.f356440o0.F0(this.f356536b);
    }
}
