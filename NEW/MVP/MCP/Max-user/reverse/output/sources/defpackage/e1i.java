package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class e1i extends FrameLayout {
    public final h08 a;
    public final d1i b;
    public boolean c;
    public boolean d;
    public mgf o;

    public e1i(Context context) {
        super(context, null);
        h08 h08Var = new h08(context);
        this.a = h08Var;
        d1i d1iVar = new d1i(context);
        d1iVar.setId(uab.g);
        d1iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = d1iVar;
        addView((OneMeDraweeView) h08Var.b);
        addView(d1iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.fff r8, int r9) {
        /*
            r7 = this;
            mgf r0 = r7.o
            if (r0 == 0) goto L7
            r0.b(r8)
        L7:
            java.lang.String r0 = r8.X
            r1 = 0
            h08 r2 = r7.a
            r3 = 1
            d1i r4 = r7.b
            if (r0 == 0) goto L87
            int r5 = r0.length()
            if (r5 != 0) goto L19
            goto L87
        L19:
            ehg r5 = new ehg
            r6 = 19
            r5.<init>(r6, r7)
            r4.setOnFirstFrameListener(r5)
            r4.setVisibility(r1)
            r7.c = r3
            int r5 = r0.length()
            if (r5 != 0) goto L33
            r4.f()
        L31:
            r9 = r3
            goto L7a
        L33:
            java.lang.String r5 = r4.a
            if (r5 == 0) goto L3f
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3f
            r9 = r1
            goto L7a
        L3f:
            r4.b = r3
            r4.a = r0
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = new one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder
            r5.<init>()
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = r5.setAutoStart(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = r5.setAutoRepeat(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r6 = new one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder
            r6.<init>()
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r0 = r6.setUrl(r0)
            java.lang.Object r9 = r0.setSize(r9, r9)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r9 = (one.me.sdk.media.ffmpeg.WebmFactory.Way.Url.Builder) r9
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r9 = r9.setNetworkFetchEnabled(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url r9 = r9.build()
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r9 = r5.setWay(r9)
            one.me.sdk.media.ffmpeg.WebmFactory$Config r9 = r9.build()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r9 = one.me.sdk.media.ffmpeg.WebmFactory.create(r9)
            r9.addOnNextFrameRenderedListener(r4)
            r4.setImageDrawable(r9)
            goto L31
        L7a:
            r7.c = r1
            if (r9 == 0) goto L83
            boolean r9 = r7.d
            if (r9 != 0) goto L83
            goto L84
        L83:
            r3 = r1
        L84:
            r7.d = r1
            goto L96
        L87:
            r4.f()
            r9 = 8
            r4.setVisibility(r9)
            java.lang.Object r9 = r2.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r9 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r9
            r9.setVisibility(r1)
        L96:
            if (r3 == 0) goto Lab
            java.lang.String r8 = r8.d
            java.lang.Object r9 = r2.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r9 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r9
            rf7 r8 = defpackage.rf7.b(r8)
            int r0 = one.me.sdk.uikit.common.views.OneMeDraweeView.B0
            r0 = 0
            r9.i(r8, r0)
            r9.setVisibility(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1i.a(fff, int):void");
    }

    public final void b(qk8 qk8Var) {
        if (qk8Var.a == null) {
            qk8Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = qk8Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final mgf getSizeConfigurator() {
        return this.o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        mgf mgfVar = this.o;
        kt ktVarA = mgfVar != null ? mgfVar.a(i, i2) : null;
        if (ktVarA != null) {
            i = ktVarA.b;
        }
        if (ktVarA != null) {
            i2 = ktVarA.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(mgf mgfVar) {
        this.o = mgfVar;
    }
}
