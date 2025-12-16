package com.avito.android.messenger.conversation.chat_header;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f189398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f189399c;

    public /* synthetic */ b(GestureDetector gestureDetector, int i12) {
        this.f189398b = i12;
        this.f189399c = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f189399c;
        switch (this.f189398b) {
            case 0:
                int i12 = c.f189400K;
                break;
        }
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
