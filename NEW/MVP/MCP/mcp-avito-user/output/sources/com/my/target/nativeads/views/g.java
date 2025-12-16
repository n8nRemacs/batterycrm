package com.my.target.nativeads.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39924z;
import i11.C41211a;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class g extends ViewGroup {
    @N
    public TextView getAdvertisingTextView() {
        return null;
    }

    @N
    public TextView getAgeRestrictionTextView() {
        return null;
    }

    @N
    public Button getCtaButtonView() {
        return null;
    }

    @N
    public TextView getDisclaimerTextView() {
        return null;
    }

    @N
    public TextView getDomainTextView() {
        return null;
    }

    @N
    public IconAdView getIconImageView() {
        return null;
    }

    @N
    public C41211a getStarsRatingView() {
        return null;
    }

    @N
    public TextView getTitleTextView() {
        return null;
    }

    @N
    public TextView getVotesTextView() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        getPaddingLeft();
        getPaddingTop();
        int i16 = C39924z.f394913b;
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        View.MeasureSpec.getSize(i12);
        View.MeasureSpec.getSize(i13);
        getPaddingLeft();
        getPaddingRight();
        getPaddingTop();
        getPaddingBottom();
        int i14 = C39924z.f394913b;
        View.MeasureSpec.makeMeasureSpec(0, BeduinInputModel.MIN_TEXT_VERSION);
        View.MeasureSpec.makeMeasureSpec(0, BeduinInputModel.MIN_TEXT_VERSION);
        throw null;
    }

    public void setupView(@P k11.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.f406014k.getClass();
        throw null;
    }
}
