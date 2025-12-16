package com.avito.android.blueprint.input;

import android.view.MotionEvent;
import android.view.View;
import com.avito.android.blueprint.suggest.C;
import com.avito.android.blueprints.input.B;
import com.avito.android.publish.items.tagged_input.D;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f105562c;

    public /* synthetic */ u(int i12, Y41.a aVar) {
        this.f105561b = i12;
        this.f105562c = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Y41.a aVar = this.f105562c;
        switch (this.f105561b) {
            case 0:
                int i12 = v.f105563w;
                if (motionEvent.getAction() == 1) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                int i13 = C.f105675y;
                if (motionEvent.getAction() == 1) {
                    aVar.invoke();
                    break;
                }
                break;
            case 2:
                int i14 = B.f105909p;
                if (motionEvent.getAction() == 1) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                int i15 = D.f237110o;
                if (motionEvent.getAction() == 1) {
                    aVar.invoke();
                    break;
                }
                break;
        }
        return false;
    }
}
