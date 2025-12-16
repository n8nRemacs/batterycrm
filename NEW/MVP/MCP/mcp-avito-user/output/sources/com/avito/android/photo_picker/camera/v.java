package com.avito.android.photo_picker.camera;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_picker.camera.t;
import kotlin.Metadata;

/* compiled from: CameraViewport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/v;", "Lcom/avito/android/photo_picker/camera/t;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<t.a> f219036a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CameraAnimationCanvas f219037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextureView f219038c;

    /* renamed from: d, reason: collision with root package name */
    public final float f219039d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f219040e;

    public v(@Y61.k View view) {
        com.jakewharton.rxrelay3.c<t.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f219036a = cVar;
        CameraAnimationCanvas cameraAnimationCanvas = (CameraAnimationCanvas) view.findViewById(R.id.cameraAnimationCanvas);
        this.f219037b = cameraAnimationCanvas;
        this.f219038c = (TextureView) view.findViewById(R.id.texture);
        this.f219039d = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.photo_picker_focus_area_size);
        this.f219040e = cVar;
        cameraAnimationCanvas.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.photo_picker.camera.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                v vVar = this.f219035b;
                vVar.f219036a.accept(new t.a(vVar.a(motionEvent, 1.0f), vVar.a(motionEvent, 1.5f)));
                return false;
            }
        });
    }

    public final RectF a(MotionEvent motionEvent, float f12) {
        float f13 = (this.f219039d / 2.0f) * f12;
        float fMax = Math.max(0.0f, motionEvent.getX() - f13);
        float fMax2 = Math.max(0.0f, motionEvent.getY() - f13);
        TextureView textureView = this.f219038c;
        return new RectF(fMax, fMax2, Math.min(textureView.getWidth(), motionEvent.getX() + f13), Math.min(textureView.getHeight(), motionEvent.getY() + f13));
    }
}
