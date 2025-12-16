package com.avito.android.photo_gallery.realty_ai_design;

import android.view.MotionEvent;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageComparisonSlider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class i extends N implements Y41.l<MotionEvent, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f217618l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewGroup viewGroup) {
        super(1);
        this.f217618l = viewGroup;
    }

    @Override // Y41.l
    public final Boolean invoke(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ViewGroup viewGroup = this.f217618l;
        if (action == 0) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        return Boolean.FALSE;
    }
}
