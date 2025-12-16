package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.az1;
import defpackage.bn0;
import defpackage.bwf;
import defpackage.dce;
import defpackage.e91;
import defpackage.es2;
import defpackage.f8j;
import defpackage.g6g;
import defpackage.ivd;
import defpackage.kt3;
import defpackage.lni;
import defpackage.m7g;
import defpackage.n1d;
import defpackage.nca;
import defpackage.p3;
import defpackage.pt8;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.qm3;
import defpackage.qt8;
import defpackage.r34;
import defpackage.rt8;
import defpackage.rw4;
import defpackage.sd8;
import defpackage.t1b;
import defpackage.tvc;
import defpackage.ui;
import defpackage.un4;
import defpackage.vw4;
import defpackage.yd8;
import defpackage.yni;
import defpackage.z10;
import defpackage.z7c;
import defpackage.zg;
import defpackage.zm;
import java.lang.reflect.Field;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class MediaBarPreviewLayout extends ConstraintLayout implements rt8, m7g {
    public static final /* synthetic */ int a1 = 0;
    public final rw4 F0;
    public final View G0;
    public final View H0;
    public final View I0;
    public final RecyclerView J0;
    public final View K0;
    public final ImageButton L0;
    public final ImageButton M0;
    public final ImageButton N0;
    public final ImageButton O0;
    public final MessageComposeEditText P0;
    public final sd8 Q0;
    public final qt8 R0;
    public pt8 S0;
    public Toast T0;
    public final zg U0;
    public final z7c V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public int Z0;

    public MediaBarPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.W0 = false;
        this.X0 = true;
        this.Y0 = false;
        this.Z0 = -1;
        qm3 qm3VarA = zm.a();
        getContext();
        rw4 rw4VarA = rw4.a();
        this.F0 = rw4VarA;
        t1b t1bVar = (t1b) qm3VarA;
        zg zgVarB = t1bVar.b();
        this.U0 = zgVarB;
        sd8 sd8VarH = t1bVar.h();
        this.Q0 = sd8VarH;
        z10 z10Var = (z10) t1bVar.getAccessor().c(610);
        this.V0 = t1bVar.j();
        yd8 yd8Var = (yd8) t1bVar.getAccessor().c(627);
        View.inflate(getContext(), n1d.cl_media_bar_preview_layout, this);
        this.H0 = findViewById(q0d.cl_media_bar_preview_layout__top_panel);
        this.G0 = findViewById(q0d.cl_media_bar_preview_layout__bottom_panel);
        this.I0 = findViewById(q0d.media_bar_view__bottom_shadow);
        this.K0 = findViewById(q0d.cl_media_bar_preview_layout__separator_middle);
        RecyclerView recyclerView = (RecyclerView) findViewById(q0d.cl_media_bar_preview_layout__rv_selected);
        this.J0 = recyclerView;
        ImageButton imageButton = (ImageButton) findViewById(q0d.cl_media_bar_preview_layout__ib_send);
        this.L0 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(q0d.cl_media_bar_preview_layout__ib_file);
        this.M0 = imageButton2;
        ImageButton imageButton3 = (ImageButton) findViewById(q0d.cl_media_bar_preview_layout__ib_collage);
        this.N0 = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(q0d.cl_media_bar_preview_layout__ib_cancel);
        this.O0 = imageButton4;
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) findViewById(q0d.cl_media_bar_preview_layout__edit_message);
        this.P0 = messageComposeEditText;
        b();
        v();
        recyclerView.setHasFixedSize(true);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new un4());
        recyclerView.j(new e91(rw4VarA.b, 4));
        qt8 qt8Var = new qt8(getContext(), this, zgVarB, z10Var, sd8VarH, yd8Var);
        this.R0 = qt8Var;
        qt8Var.A(true);
        recyclerView.setAdapter(this.R0);
        messageComposeEditText.addTextChangedListener(new p3(2, this));
        messageComposeEditText.setInputType(933968);
        new g6g(messageComposeEditText, lni.a(messageComposeEditText.getContext())).a();
        final int i = 0;
        f8j.d(imageButton, 300L, new View.OnClickListener(this) { // from class: ot8
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i2 = i;
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i2) {
                    case 0:
                        if (mediaBarPreviewLayout.S0 != null) {
                            if (mediaBarPreviewLayout.W0) {
                                l5c l5cVar = mediaBarPreviewLayout.V0.b;
                                l5cVar.getClass();
                                int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
                                if (mediaBarPreviewLayout.Q0.f.b() > iM) {
                                    efi.r(mediaBarPreviewLayout.getContext(), l6g.p(kvd.a, iM, mediaBarPreviewLayout.getContext()), 0);
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.S0).S();
                            break;
                        }
                        break;
                    case 1:
                        int i3 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var = mediaBarPreviewLayout.Q0;
                        dce dceVar = sd8Var.f;
                        dceVar.p(dceVar.k == 2 ? 1 : 2);
                        mediaBarPreviewLayout.v();
                        dce dceVar2 = sd8Var.f;
                        if (dceVar2.k != 2) {
                            mediaBarPreviewLayout.x(mvd.M1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(dceVar2.b() > 1 ? mvd.L1 : mvd.K1);
                            break;
                        }
                    case 2:
                        int i4 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var2 = mediaBarPreviewLayout.Q0;
                        dce dceVar3 = sd8Var2.f;
                        dceVar3.p(dceVar3.k != 3 ? 3 : 1);
                        mediaBarPreviewLayout.v();
                        if (sd8Var2.f.k != 3) {
                            mediaBarPreviewLayout.x(mvd.O1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(mvd.J1);
                            break;
                        }
                    default:
                        dce dceVar4 = mediaBarPreviewLayout.Q0.f;
                        dceVar4.a.clear();
                        dceVar4.n();
                        pt8 pt8Var = mediaBarPreviewLayout.S0;
                        if (pt8Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) pt8Var;
                            if (fni.a(actLocalMedias.U0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.F();
                            } else {
                                actLocalMedias.a0();
                            }
                        }
                        mediaBarPreviewLayout.R0.m();
                        break;
                }
            }
        });
        imageButton.setLongClickable(true);
        imageButton.setOnLongClickListener(new bn0(3, this));
        final int i2 = 1;
        f8j.d(imageButton2, 300L, new View.OnClickListener(this) { // from class: ot8
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i22 = i2;
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i22) {
                    case 0:
                        if (mediaBarPreviewLayout.S0 != null) {
                            if (mediaBarPreviewLayout.W0) {
                                l5c l5cVar = mediaBarPreviewLayout.V0.b;
                                l5cVar.getClass();
                                int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
                                if (mediaBarPreviewLayout.Q0.f.b() > iM) {
                                    efi.r(mediaBarPreviewLayout.getContext(), l6g.p(kvd.a, iM, mediaBarPreviewLayout.getContext()), 0);
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.S0).S();
                            break;
                        }
                        break;
                    case 1:
                        int i3 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var = mediaBarPreviewLayout.Q0;
                        dce dceVar = sd8Var.f;
                        dceVar.p(dceVar.k == 2 ? 1 : 2);
                        mediaBarPreviewLayout.v();
                        dce dceVar2 = sd8Var.f;
                        if (dceVar2.k != 2) {
                            mediaBarPreviewLayout.x(mvd.M1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(dceVar2.b() > 1 ? mvd.L1 : mvd.K1);
                            break;
                        }
                    case 2:
                        int i4 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var2 = mediaBarPreviewLayout.Q0;
                        dce dceVar3 = sd8Var2.f;
                        dceVar3.p(dceVar3.k != 3 ? 3 : 1);
                        mediaBarPreviewLayout.v();
                        if (sd8Var2.f.k != 3) {
                            mediaBarPreviewLayout.x(mvd.O1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(mvd.J1);
                            break;
                        }
                    default:
                        dce dceVar4 = mediaBarPreviewLayout.Q0.f;
                        dceVar4.a.clear();
                        dceVar4.n();
                        pt8 pt8Var = mediaBarPreviewLayout.S0;
                        if (pt8Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) pt8Var;
                            if (fni.a(actLocalMedias.U0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.F();
                            } else {
                                actLocalMedias.a0();
                            }
                        }
                        mediaBarPreviewLayout.R0.m();
                        break;
                }
            }
        });
        final int i3 = 2;
        f8j.d(imageButton3, 300L, new View.OnClickListener(this) { // from class: ot8
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i22 = i3;
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i22) {
                    case 0:
                        if (mediaBarPreviewLayout.S0 != null) {
                            if (mediaBarPreviewLayout.W0) {
                                l5c l5cVar = mediaBarPreviewLayout.V0.b;
                                l5cVar.getClass();
                                int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
                                if (mediaBarPreviewLayout.Q0.f.b() > iM) {
                                    efi.r(mediaBarPreviewLayout.getContext(), l6g.p(kvd.a, iM, mediaBarPreviewLayout.getContext()), 0);
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.S0).S();
                            break;
                        }
                        break;
                    case 1:
                        int i32 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var = mediaBarPreviewLayout.Q0;
                        dce dceVar = sd8Var.f;
                        dceVar.p(dceVar.k == 2 ? 1 : 2);
                        mediaBarPreviewLayout.v();
                        dce dceVar2 = sd8Var.f;
                        if (dceVar2.k != 2) {
                            mediaBarPreviewLayout.x(mvd.M1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(dceVar2.b() > 1 ? mvd.L1 : mvd.K1);
                            break;
                        }
                    case 2:
                        int i4 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var2 = mediaBarPreviewLayout.Q0;
                        dce dceVar3 = sd8Var2.f;
                        dceVar3.p(dceVar3.k != 3 ? 3 : 1);
                        mediaBarPreviewLayout.v();
                        if (sd8Var2.f.k != 3) {
                            mediaBarPreviewLayout.x(mvd.O1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(mvd.J1);
                            break;
                        }
                    default:
                        dce dceVar4 = mediaBarPreviewLayout.Q0.f;
                        dceVar4.a.clear();
                        dceVar4.n();
                        pt8 pt8Var = mediaBarPreviewLayout.S0;
                        if (pt8Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) pt8Var;
                            if (fni.a(actLocalMedias.U0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.F();
                            } else {
                                actLocalMedias.a0();
                            }
                        }
                        mediaBarPreviewLayout.R0.m();
                        break;
                }
            }
        });
        final int i4 = 3;
        f8j.d(imageButton4, 300L, new View.OnClickListener(this) { // from class: ot8
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i22 = i4;
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i22) {
                    case 0:
                        if (mediaBarPreviewLayout.S0 != null) {
                            if (mediaBarPreviewLayout.W0) {
                                l5c l5cVar = mediaBarPreviewLayout.V0.b;
                                l5cVar.getClass();
                                int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
                                if (mediaBarPreviewLayout.Q0.f.b() > iM) {
                                    efi.r(mediaBarPreviewLayout.getContext(), l6g.p(kvd.a, iM, mediaBarPreviewLayout.getContext()), 0);
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.S0).S();
                            break;
                        }
                        break;
                    case 1:
                        int i32 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var = mediaBarPreviewLayout.Q0;
                        dce dceVar = sd8Var.f;
                        dceVar.p(dceVar.k == 2 ? 1 : 2);
                        mediaBarPreviewLayout.v();
                        dce dceVar2 = sd8Var.f;
                        if (dceVar2.k != 2) {
                            mediaBarPreviewLayout.x(mvd.M1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(dceVar2.b() > 1 ? mvd.L1 : mvd.K1);
                            break;
                        }
                    case 2:
                        int i42 = MediaBarPreviewLayout.a1;
                        sd8 sd8Var2 = mediaBarPreviewLayout.Q0;
                        dce dceVar3 = sd8Var2.f;
                        dceVar3.p(dceVar3.k != 3 ? 3 : 1);
                        mediaBarPreviewLayout.v();
                        if (sd8Var2.f.k != 3) {
                            mediaBarPreviewLayout.x(mvd.O1);
                            break;
                        } else {
                            mediaBarPreviewLayout.x(mvd.J1);
                            break;
                        }
                    default:
                        dce dceVar4 = mediaBarPreviewLayout.Q0.f;
                        dceVar4.a.clear();
                        dceVar4.n();
                        pt8 pt8Var = mediaBarPreviewLayout.S0;
                        if (pt8Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) pt8Var;
                            if (fni.a(actLocalMedias.U0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.F();
                            } else {
                                actLocalMedias.a0();
                            }
                        }
                        mediaBarPreviewLayout.R0.m();
                        break;
                }
            }
        });
    }

    public final void A(boolean z) {
        Editable text = this.P0.getText();
        this.L0.setVisibility((z || !TextUtils.isEmpty(text != null ? text.toString().trim() : null)) ? 0 : 8);
    }

    @Override // defpackage.m7g
    public final void b() {
        Context context = getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        setBackgroundColor(0);
        this.J0.setBackgroundColor(q1gVarD.m);
        int i = q1gVarD.m;
        this.H0.setBackgroundColor(i);
        this.G0.setBackgroundColor(i);
        this.K0.setBackgroundColor(q1gVarD.K);
        int i2 = q1gVarD.k;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageButton imageButton = this.L0;
        imageButton.setColorFilter(i2, mode);
        imageButton.setBackground(q1gVarD.a());
        kt3 kt3Var = (kt3) imageButton.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) kt3Var).width = -2;
        imageButton.setLayoutParams(kt3Var);
        yni.f(imageButton, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageButton.getLayoutParams();
        if (marginLayoutParams.bottomMargin != 0) {
            marginLayoutParams.bottomMargin = 0;
            imageButton.setLayoutParams(marginLayoutParams);
        }
        RippleDrawable rippleDrawableA = q1gVarD.a();
        ImageButton imageButton2 = this.M0;
        imageButton2.setBackground(rippleDrawableA);
        RippleDrawable rippleDrawableA2 = q1gVarD.a();
        ImageButton imageButton3 = this.N0;
        imageButton3.setBackground(rippleDrawableA2);
        int i3 = q1gVarD.w;
        imageButton2.setColorFilter(i3, mode);
        imageButton3.setColorFilter(i3, mode);
        ImageButton imageButton4 = this.O0;
        imageButton4.setColorFilter(i3, mode);
        imageButton4.setBackground(q1gVarD.a());
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(q1gVarD.i), i != 0 ? new ColorDrawable(i) : null, null);
        rippleDrawable.setRadius(this.F0.l);
        imageButton4.setBackground(rippleDrawable);
        int i4 = q1gVarD.F;
        MessageComposeEditText messageComposeEditText = this.P0;
        messageComposeEditText.setTextColor(i4);
        messageComposeEditText.setHintTextColor(q1gVarD.M);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i5 = declaredField.getInt(messageComposeEditText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(messageComposeEditText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawableB = r34.b(messageComposeEditText.getContext(), i5);
            drawableB.setColorFilter(new PorterDuffColorFilter(i2, mode));
            Drawable drawableB2 = r34.b(messageComposeEditText.getContext(), i5);
            drawableB2.setColorFilter(new PorterDuffColorFilter(i2, mode));
            declaredField3.set(obj, new Drawable[]{drawableB, drawableB2});
        } catch (Throwable unused) {
        }
    }

    public int getBottomShadowHeight() {
        return this.I0.getHeight();
    }

    public int getContentHeight() {
        MessageComposeEditText messageComposeEditText = this.P0;
        int measuredHeight = messageComposeEditText.getVisibility() == 0 ? messageComposeEditText.getMeasuredHeight() : 0;
        View view = this.H0;
        if (view.getVisibility() == 0) {
            measuredHeight += view.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom();
        this.F0.getClass();
        if (paddingBottom < vw4.b((int) 200.0f)) {
            measuredHeight += getPaddingBottom();
        }
        return getPaddingTop() + measuredHeight;
    }

    public int getHeightWithoutShadow() {
        return getHeight() - this.I0.getHeight();
    }

    public Pair<Integer, Integer> getScrollPosition() {
        LinearLayoutManager linearLayoutManager;
        int iX0;
        View viewS;
        RecyclerView recyclerView = this.J0;
        return (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager) || recyclerView.getWidth() == 0 || (viewS = linearLayoutManager.s((iX0 = (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()).X0()))) == null) ? new Pair<>(0, 0) : new Pair<>(Integer.valueOf(iX0), Integer.valueOf(viewS.getLeft() - (this.F0.i / 2)));
    }

    public void setAnimojisEnabled(boolean z) {
        MessageComposeEditText messageComposeEditText = this.P0;
        if (messageComposeEditText != null) {
            messageComposeEditText.setAnimojiEnabled(z);
        }
    }

    public void setChatMode(es2 es2Var) {
        int i = ((Boolean) es2Var.a.getValue()).booleanValue() ? ivd.I0 : ivd.x0;
        ImageButton imageButton = this.L0;
        imageButton.setImageResource(i);
        imageButton.setLongClickable(((Boolean) es2Var.a.getValue()).booleanValue());
    }

    public void setFullScreen(boolean z) {
        this.Y0 = z;
        z();
        b();
    }

    public void setListener(pt8 pt8Var) {
        this.S0 = pt8Var;
    }

    public void setMessageEdit(boolean z) {
        this.W0 = z;
        z();
        b();
    }

    public void setShouldApplyHighlight(boolean z) {
        this.R0.t0 = z;
    }

    public final void v() {
        int iV = az1.v(this.Q0.f.k);
        ImageButton imageButton = this.M0;
        ImageButton imageButton2 = this.N0;
        if (iV == 1) {
            imageButton2.setImageResource(ivd.M);
            imageButton.setImageResource(ivd.W);
        } else if (iV != 2) {
            imageButton2.setImageResource(ivd.M);
            imageButton.setImageResource(ivd.V);
        } else {
            imageButton2.setImageResource(ivd.N);
            imageButton.setImageResource(ivd.V);
        }
    }

    public final void w(int i) {
        RecyclerView recyclerView = this.J0;
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager) || recyclerView.getWidth() == 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        View childAt = recyclerView.getChildAt(i);
        linearLayoutManager.o1(i, Math.max(0, (recyclerView.getWidth() / 2) - ((childAt != null ? childAt.getWidth() : getContext().getResources().getDimensionPixelOffset(tvc.compose_view_item_height) - this.F0.i) / 2)));
    }

    public final void x(int i) throws Resources.NotFoundException {
        Toast toast = this.T0;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), i, 0);
        this.T0 = toastMakeText;
        toastMakeText.show();
    }

    public final void z() {
        boolean z = false;
        boolean z2 = this.V0.c.g.getBoolean("app.messages.enable.animations", true) && !this.X0;
        this.X0 = false;
        sd8 sd8Var = this.Q0;
        dce dceVar = sd8Var.f;
        dce dceVar2 = sd8Var.f;
        int iB = dceVar.b();
        if (iB == 0) {
            post(new ui(9, this, z));
        } else {
            post(new ui(9, this, z));
            int i = this.Z0;
            if (i != -1 && i < iB) {
                this.J0.B0(iB - 1);
            }
        }
        this.Z0 = iB;
        boolean z3 = this.W0;
        ImageButton imageButton = this.M0;
        ImageButton imageButton2 = this.N0;
        if (z3) {
            imageButton2.setVisibility(8);
            imageButton.setVisibility(8);
            A(dceVar2.b() > 0);
        } else {
            this.L0.setVisibility(0);
            int iB2 = dceVar2.b();
            boolean z4 = iB2 > 1;
            zg zgVar = this.U0;
            if (z2) {
                if (z4) {
                    zgVar.c(imageButton2);
                } else {
                    zgVar.d(imageButton2);
                }
            } else if (z4) {
                imageButton2.setVisibility(0);
            } else {
                imageButton2.setVisibility(8);
            }
            if (!this.Y0 && iB2 <= 0) {
                z = false;
            }
            if (z2) {
                if (z) {
                    zgVar.c(imageButton);
                } else {
                    zgVar.d(imageButton);
                }
            } else if (z) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
        CharSequence charSequence = dceVar2.j;
        if (charSequence != null) {
            this.P0.setText(charSequence);
        }
        v();
        this.R0.m();
    }
}
