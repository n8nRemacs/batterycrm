package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import j.P;
import java.text.SimpleDateFormat;

/* compiled from: RangeDateSelector.java */
/* loaded from: classes6.dex */
class z extends AbstractC37057e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f356573h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f356574i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f356575j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f356576k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, x xVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f356576k = rangeDateSelector;
        this.f356573h = textInputLayout2;
        this.f356574i = textInputLayout3;
        this.f356575j = xVar;
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void a() {
        RangeDateSelector rangeDateSelector = this.f356576k;
        rangeDateSelector.f356504g = null;
        RangeDateSelector.a(rangeDateSelector, this.f356573h, this.f356574i, this.f356575j);
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void b(@P Long l12) {
        RangeDateSelector rangeDateSelector = this.f356576k;
        rangeDateSelector.f356504g = l12;
        RangeDateSelector.a(rangeDateSelector, this.f356573h, this.f356574i, this.f356575j);
    }
}
