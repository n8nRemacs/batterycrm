package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.f0;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: g0, reason: collision with root package name */
    @f0
    public int f356487g0;

    /* renamed from: h0, reason: collision with root package name */
    @P
    public DateSelector<S> f356488h0;

    /* renamed from: i0, reason: collision with root package name */
    @P
    public CalendarConstraints f356489i0;

    public class a extends x<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.x
        public final void a() {
            Iterator<x<S>> it = MaterialTextInputPicker.this.f356498f0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.x
        public final void b(S s5) {
            Iterator<x<S>> it = MaterialTextInputPicker.this.f356498f0.iterator();
            while (it.hasNext()) {
                it.next().b(s5);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f356487g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f356488h0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f356489i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        return this.f356488h0.q3(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f356487g0)), viewGroup, this.f356489i0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f356487g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f356488h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f356489i0);
    }
}
