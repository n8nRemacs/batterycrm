package defpackage;

import android.hardware.camera2.CameraManager;
import android.widget.ImageView;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class jah implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ jah(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        VideoMessageWidget videoMessageWidget = this.b;
        switch (i) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setId(m1b.z);
                imageView.setImageResource(yud.h);
                yy7[] yy7VarArr = VideoMessageWidget.H0;
                imageView.setEnabled(((CameraManager) videoMessageWidget.getContext().getSystemService("camera")).getCameraIdList().length > 1);
                f8j.d(imageView, 300L, new iah(videoMessageWidget, 0));
                imageView.setVisibility(8);
                break;
            default:
                ImageView imageView2 = (ImageView) obj;
                imageView2.setId(m1b.B);
                imageView2.setAlpha(0.0f);
                f8j.d(imageView2, 300L, new iah(videoMessageWidget, 1));
                imageView2.setVisibility(8);
                break;
        }
        return qqgVar;
    }
}
