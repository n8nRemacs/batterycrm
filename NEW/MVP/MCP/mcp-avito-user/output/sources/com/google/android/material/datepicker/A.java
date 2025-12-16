package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import j.P;
import java.text.SimpleDateFormat;

/* compiled from: SingleDateSelector.java */
/* loaded from: classes6.dex */
class A extends AbstractC37057e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f356404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f356405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f356406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, x xVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f356406j = singleDateSelector;
        this.f356404h = xVar;
        this.f356405i = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void a() {
        this.f356406j.f356505b = this.f356405i.getError();
        this.f356404h.a();
    }

    @Override // com.google.android.material.datepicker.AbstractC37057e
    public final void b(@P Long l12) {
        SingleDateSelector singleDateSelector = this.f356406j;
        if (l12 == null) {
            singleDateSelector.f356506c = null;
        } else {
            singleDateSelector.f356506c = l12;
        }
        singleDateSelector.f356505b = null;
        this.f356404h.b(singleDateSelector.f356506c);
    }
}
