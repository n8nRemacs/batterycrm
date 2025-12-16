package com.google.android.material.bottomsheet;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes6.dex */
class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f356042b;

    public e(h hVar) {
        this.f356042b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f356042b;
        if (hVar.f356048k && hVar.isShowing()) {
            if (!hVar.f356050m) {
                TypedArray typedArrayObtainStyledAttributes = hVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                hVar.f356049l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                hVar.f356050m = true;
            }
            if (hVar.f356049l) {
                hVar.cancel();
            }
        }
    }
}
