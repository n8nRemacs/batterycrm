package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.contentLevelStub.ContentLevelViewerWidget;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class pm2 extends yb4 {
    public final ChatMediaViewerScreen v0;
    public final String w0;
    public final iv x0;

    public pm2(ChatMediaViewerScreen chatMediaViewerScreen, ExecutorService executorService) {
        super((c54) chatMediaViewerScreen);
        this.v0 = chatMediaViewerScreen;
        this.w0 = "chatMediaViewer";
        this.x0 = new iv(new iv6(2, this), new xt4(executorService, 4, new yf4(4)));
    }

    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        Widget videoViewerWidget;
        Widget contentLevelViewerWidget;
        if (ytdVar.n()) {
            String name = pm2.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                c54 c54VarB = k8j.b(ytdVar);
                l6bVar.c(lg8Var, name, "Media viewer. Configure router | root exist | target exist:" + (c54VarB != null ? c54VarB.getTargetController() : null), null);
                return;
            }
            return;
        }
        j09 j09Var = (j09) ue3.J(i, this.x0.f);
        if (j09Var == null) {
            String name2 = pm2.class.getName();
            String strG = ho7.g("could not find media item by position ", i, j(), ", itemCount=");
            c54 c54VarB2 = k8j.b(ytdVar);
            String name3 = c54VarB2 != null ? c54VarB2.getClass().getName() : null;
            int iJ = j();
            StringBuilder sbM = utb.m(i, "controller=", name3, ", position=", ", itemCount=");
            sbM.append(iJ);
            wqi.e(name2, strG, new te2("ONEME-25409", sbM.toString(), null));
            return;
        }
        long j = j09Var.j();
        String strW = j09Var.w();
        if (j09Var instanceof tz8) {
            contentLevelViewerWidget = new ContentLevelViewerWidget();
        } else {
            if (j09Var instanceof b09) {
                videoViewerWidget = ((b09) j09Var).o ? new GifViewerWidget(j, strW, this.w0, null) : new PhotoViewerWidget(j, strW, this.w0, null);
            } else {
                if (!(j09Var instanceof h09)) {
                    throw new NoWhenBranchMatchedException();
                }
                videoViewerWidget = new VideoViewerWidget(j, strW, this.w0, null);
            }
            contentLevelViewerWidget = videoViewerWidget;
        }
        contentLevelViewerWidget.setTargetWidget(this.v0);
        contentLevelViewerWidget.setRetainViewMode(b54.b);
        ytdVar.S(new bud(contentLevelViewerWidget, null, null, null, false, -1));
    }

    @Override // defpackage.phd
    public final int j() {
        return this.x0.f.size();
    }

    @Override // defpackage.yb4, defpackage.phd
    public final long k(int i) {
        j09 j09Var = (j09) ue3.J(i, this.x0.f);
        if (j09Var != null) {
            return j09Var.getItemId();
        }
        return 0L;
    }
}
