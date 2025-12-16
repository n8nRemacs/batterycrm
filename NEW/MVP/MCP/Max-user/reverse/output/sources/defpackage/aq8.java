package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class aq8 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public te0 f;

    public aq8(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = exi.d(context, dvc.motionEasingStandardDecelerateInterpolator, wob.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = exi.c(dvc.motionDurationMedium2, HttpStatus.SC_MULTIPLE_CHOICES, context);
        this.d = exi.c(dvc.motionDurationShort3, 150, context);
        this.e = exi.c(dvc.motionDurationShort2, 100, context);
    }
}
