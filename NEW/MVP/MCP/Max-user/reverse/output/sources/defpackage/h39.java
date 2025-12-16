package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class h39 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ h39(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        View viewFindViewById;
        int i = this.a;
        int i2 = 1;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MediaPickerScreen.B0;
                return mediaPickerScreen.z0().Z ? f1e.MINIAPP_PICKER_GALLERY : f1e.AVATAR_PICKER_GALLERY;
            case 1:
                bbd bbdVar = mediaPickerScreen.t0;
                yy7[] yy7VarArr2 = MediaPickerScreen.B0;
                if (!(mediaPickerScreen.B0().x0.a.getValue() instanceof n34)) {
                    sn0 sn0Var = mediaPickerScreen.u0;
                    yy7[] yy7VarArr3 = MediaPickerScreen.B0;
                    yy7 yy7Var = yy7VarArr3[4];
                    ((f82) sn0Var.getValue()).setVisibility(0);
                    sn0 sn0Var2 = mediaPickerScreen.y0;
                    yy7 yy7Var2 = yy7VarArr3[8];
                    ((View) sn0Var2.getValue()).setVisibility(0);
                    c83 c83Var = (c83) bbdVar.D(mediaPickerScreen, yy7VarArr3[3]);
                    ytd ytdVar = c83Var.a;
                    if (!fni.a(c83Var.b(), "SELECT_ALBUM_WIDGET_TAG")) {
                        ytdVar.R(false);
                        bud budVarA = l8j.a(new SelectAlbumWidget(mediaPickerScreen.c, null), null, null);
                        budVarA.d("SELECT_ALBUM_WIDGET_TAG");
                        ytdVar.S(budVarA);
                    }
                    c54 c54VarB = k8j.b(((c83) bbdVar.D(mediaPickerScreen, yy7VarArr3[3])).a);
                    SelectAlbumWidget selectAlbumWidget = c54VarB instanceof SelectAlbumWidget ? (SelectAlbumWidget) c54VarB : null;
                    if (selectAlbumWidget != null) {
                        View view = selectAlbumWidget.getView();
                        if (view != null && (viewFindViewById = view.findViewById(gab.d)) != null) {
                            int height = viewFindViewById.getHeight();
                            hs hsVar = mediaPickerScreen.v0;
                            yy7 yy7Var3 = yy7VarArr3[5];
                            hsVar.b(mediaPickerScreen, Integer.valueOf(height));
                            tqi.c(new q3(3, null, 3), viewFindViewById);
                        }
                        selectAlbumWidget.B0();
                    }
                }
                return qqg.a;
            case 2:
                hs hsVar2 = mediaPickerScreen.o;
                yy7[] yy7VarArr4 = MediaPickerScreen.B0;
                if (mediaPickerScreen.z0().Z) {
                    yy7[] yy7VarArr5 = MediaPickerScreen.B0;
                    yy7 yy7Var4 = yy7VarArr5[2];
                    if (((Long) hsVar2.a(mediaPickerScreen)) != null) {
                        yy7 yy7Var5 = yy7VarArr5[2];
                        return new qmb(null, 0, e7f.X, (Long) hsVar2.a(mediaPickerScreen), null, null, 51);
                    }
                }
                return qmb.g;
            case 3:
                yy7[] yy7VarArr6 = MediaPickerScreen.B0;
                return new dbe((de8) x29.a.getAccessor().c(492), new sae(mediaPickerScreen.z0().s0, false));
            case 4:
                yy7[] yy7VarArr7 = MediaPickerScreen.B0;
                return new r39(mediaPickerScreen.z0(), (dbe) mediaPickerScreen.Z.getValue(), (mp6) mediaPickerScreen.Y.getValue());
            case 5:
                yy7[] yy7VarArr8 = MediaPickerScreen.B0;
                f82 f82Var = new f82(mediaPickerScreen.getContext());
                f82Var.setId(x6b.i);
                f82Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                f82Var.setVisibility(8);
                return f82Var;
            case 6:
                yy7[] yy7VarArr9 = MediaPickerScreen.B0;
                f82 f82Var2 = new f82(mediaPickerScreen.getContext());
                f82Var2.setId(x6b.j);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                f82Var2.setLayoutParams(layoutParams);
                return f82Var2;
            case 7:
                yy7[] yy7VarArr10 = MediaPickerScreen.B0;
                yfb yfbVar = new yfb(mediaPickerScreen.getContext(), 6);
                yfbVar.setId(x6b.m);
                yfbVar.setTitle(y6b.a);
                yfbVar.setLeftActions(new gfb(new wu7(13, mediaPickerScreen)));
                yfbVar.setTitleClickListener(new h39(mediaPickerScreen, i2));
                yfbVar.setShowDropdown(true);
                return yfbVar;
            case 8:
                yy7[] yy7VarArr11 = MediaPickerScreen.B0;
                View view2 = new View(mediaPickerScreen.getContext());
                view2.setId(x6b.l);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kti.d(1 * vw4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view2.setLayoutParams(layoutParams2);
                tqi.c(new q3(3, null, 2), view2);
                view2.setVisibility(8);
                return view2;
            default:
                yy7[] yy7VarArr12 = MediaPickerScreen.B0;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(y6b.c);
                dpg.o.b(textView, t75.b);
                textView.setGravity(17);
                tqi.c(new x9(3, null, 23), textView);
                ((FrameLayout) mediaPickerScreen.z0.D(mediaPickerScreen, MediaPickerScreen.B0[9])).addView(textView);
                return textView;
        }
    }
}
