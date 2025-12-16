package com.avito.android.advert.item.equipmentsTile;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f75352c;

    public /* synthetic */ n(GestureDetector gestureDetector, int i12) {
        this.f75351b = i12;
        this.f75352c = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f75352c;
        switch (this.f75351b) {
            case 0:
                int i12 = o.f75353h;
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 1:
                return CBRApplicantDataSelectionCountryFieldView.m307_init_$lambda5(gestureDetector, view, motionEvent);
            default:
                return CBRApplicantDataSelectionFieldView.m310_init_$lambda0(gestureDetector, view, motionEvent);
        }
    }
}
