package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import defpackage.c2c;
import defpackage.cf7;
import defpackage.df7;
import defpackage.hr6;
import defpackage.rf7;
import defpackage.rpd;
import defpackage.tfi;
import defpackage.tyd;
import defpackage.v10;
import defpackage.zk6;
import ru.ok.messages.media.mediabar.SimpleTransitionDraweeView;

/* loaded from: classes2.dex */
public class VideoThumbnailView extends SimpleTransitionDraweeView {
    public final rpd w0;

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context, attributeSet);
        this.w0 = new rpd();
    }

    private void setPlaceHolderDrawable(Drawable drawable) {
        hr6 hr6Var = new hr6(getResources());
        tyd tydVar = tyd.c;
        hr6Var.l = tydVar;
        hr6Var.d = drawable;
        hr6Var.e = tydVar;
        setHierarchy(hr6Var.a());
    }

    private void setPlaceHolderFromVideo(v10 v10Var) {
        Uri uriG = tfi.g(v10Var.d);
        if (uriG != null) {
            setPlaceHolderUri(uriG);
        }
    }

    private void setPlaceHolderUri(Uri uri) {
        hr6 hr6Var = new hr6(getResources());
        hr6Var.l = tyd.c;
        hr6Var.b = 0;
        setHierarchy(hr6Var.a());
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = this.w0;
        c2cVarA.i = getController();
        setController(c2cVarA.a());
        rf7 rf7VarA = rf7.a(uri);
        df7 df7VarE = zk6.e();
        df7VarE.getClass();
        this.w0.a(new cf7(df7VarE, rf7VarA, null));
    }
}
