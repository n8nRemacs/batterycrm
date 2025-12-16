package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import j.P;
import java.text.SimpleDateFormat;

/* compiled from: RangeDateSelector.java */
/* loaded from: classes6.dex */
class y extends AbstractC37057e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f356569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f356570i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f356571j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f356572k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, x xVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f356572k = rangeDateSelector;
        this.f356569h = textInputLayout2;
        this.f356570i = textInputLayout3;
        this.f356571j = xVar;
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void a() {
        RangeDateSelector rangeDateSelector = this.f356572k;
        rangeDateSelector.f356503f = null;
        RangeDateSelector.a(rangeDateSelector, this.f356569h, this.f356570i, this.f356571j);
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void b(@P Long l12) {
        RangeDateSelector rangeDateSelector = this.f356572k;
        rangeDateSelector.f356503f = l12;
        RangeDateSelector.a(rangeDateSelector, this.f356569h, this.f356570i, this.f356571j);
    }
}
