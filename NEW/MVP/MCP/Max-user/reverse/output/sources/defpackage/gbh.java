package defpackage;

import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* loaded from: classes2.dex */
public final class gbh extends fqi {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerSeekBarPreview b;

    public /* synthetic */ gbh(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i) {
        this.a = i;
        this.b = videoPlayerSeekBarPreview;
    }

    @Override // defpackage.fqi
    public final void f() {
        switch (this.a) {
            case 0:
                this.b.v0 = null;
                break;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                videoPlayerSeekBarPreview.c.setVisibility(4);
                videoPlayerSeekBarPreview.c.setAlpha(1.0f);
                videoPlayerSeekBarPreview.w0 = null;
                break;
        }
    }

    @Override // defpackage.fqi
    public void g() {
        switch (this.a) {
            case 0:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                videoPlayerSeekBarPreview.c.setVisibility(0);
                videoPlayerSeekBarPreview.c.setAlpha(0.0f);
                break;
        }
    }
}
