package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.mz0;

/* loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int j1;
    public mz0 k1;

    @Override // androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.X;
        }
        this.j1 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.k1 = (mz0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(v(), this.j1));
        throw null;
    }

    @Override // androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.j1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k1);
    }
}
