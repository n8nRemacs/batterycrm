package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class ow5 extends DrawableWrapper {
    public final Object a;
    public final Object b;
    public final Object c;

    public ow5(Context context) {
        super(new EnhancedVectorDrawable(context, cxc.ic_file_extension));
        final int i = 0;
        this.a = ipi.b(3, new cm6(this) { // from class: nw5
            public final /* synthetic */ ow5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
        final int i2 = 1;
        this.b = ipi.b(3, new cm6(this) { // from class: nw5
            public final /* synthetic */ ow5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
        final int i3 = 2;
        this.c = ipi.b(3, new cm6(this) { // from class: nw5
            public final /* synthetic */ ow5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
    }
}
