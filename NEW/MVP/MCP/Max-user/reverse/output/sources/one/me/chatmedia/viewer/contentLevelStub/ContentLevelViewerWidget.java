package one.me.chatmedia.viewer.contentLevelStub;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a93;
import defpackage.d1b;
import defpackage.e1b;
import defpackage.n5g;
import defpackage.v1a;
import defpackage.x3b;
import defpackage.yud;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatmedia/viewer/contentLevelStub/ContentLevelViewerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ContentLevelViewerWidget extends Widget {
    public ContentLevelViewerWidget() {
        super(null, 0, 3, null);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        x3b x3bVar = new x3b(frameLayout.getContext());
        x3bVar.setId(d1b.b);
        x3bVar.setTitle(new n5g(e1b.e));
        x3bVar.setSubtitle(new n5g(e1b.d));
        x3bVar.setIcon(yud.W);
        v1a v1aVar = a93.s0;
        x3bVar.setBackgroundColor(v1aVar.y(x3bVar).b().a.h);
        x3bVar.setCustomTheme(v1aVar.B(x3bVar).c);
        frameLayout.addView(x3bVar);
        return frameLayout;
    }
}
