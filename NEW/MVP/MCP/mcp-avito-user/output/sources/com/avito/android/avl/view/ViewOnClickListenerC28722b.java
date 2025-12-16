package com.avito.android.avl.view;

import android.view.View;
import com.avito.android.analytics.event.native_video.VideoStopReason;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.avl.view.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC28722b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98379c;

    public /* synthetic */ ViewOnClickListenerC28722b(Object obj, int i12) {
        this.f98378b = i12;
        this.f98379c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f98379c;
        switch (this.f98378b) {
            case 0:
                int i12 = AvlPlayerActivity.f98291Q;
                ((AvlPlayerActivity) obj).finish();
                break;
            default:
                int i13 = B.f98333M;
                B b12 = (B) obj;
                b12.I80(VideoStopReason.f90112c);
                b12.f98346b.invoke();
                break;
        }
    }
}
