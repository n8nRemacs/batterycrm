package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class hce extends mid {
    public static final /* synthetic */ int K0 = 0;
    public final mu8 E0;
    public final OneMeDraweeView F0;
    public final AppCompatImageView G0;
    public ece H0;
    public Uri I0;
    public Uri J0;

    public hce(mu8 mu8Var, OneMeDraweeView oneMeDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.E0 = mu8Var;
        this.F0 = oneMeDraweeView;
        this.G0 = appCompatImageView2;
        final int i = 0;
        f8j.d(oneMeDraweeView, 300L, new View.OnClickListener(this) { // from class: gce
            public final /* synthetic */ hce b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        hce hceVar = this.b;
                        ece eceVar = hceVar.H0;
                        if (eceVar != null) {
                            mu8 mu8Var2 = hceVar.E0;
                            mu8Var2.u0.g(new ft8(eceVar, ((List) mu8Var2.y0.getValue()).indexOf(eceVar)));
                            break;
                        }
                        break;
                    default:
                        hce hceVar2 = this.b;
                        ece eceVar2 = hceVar2.H0;
                        if (eceVar2 != null) {
                            hceVar2.E0.u0.g(new bt8(eceVar2));
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        f8j.d(appCompatImageView, 300L, new View.OnClickListener(this) { // from class: gce
            public final /* synthetic */ hce b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        hce hceVar = this.b;
                        ece eceVar = hceVar.H0;
                        if (eceVar != null) {
                            mu8 mu8Var2 = hceVar.E0;
                            mu8Var2.u0.g(new ft8(eceVar, ((List) mu8Var2.y0.getValue()).indexOf(eceVar)));
                            break;
                        }
                        break;
                    default:
                        hce hceVar2 = this.b;
                        ece eceVar2 = hceVar2.H0;
                        if (eceVar2 != null) {
                            hceVar2.E0.u0.g(new bt8(eceVar2));
                            break;
                        }
                        break;
                }
            }
        });
    }
}
