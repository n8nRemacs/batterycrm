package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a93;
import defpackage.ai8;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.dpg;
import defpackage.efa;
import defpackage.ega;
import defpackage.em6;
import defpackage.eo7;
import defpackage.es0;
import defpackage.f8j;
import defpackage.fve;
import defpackage.g39;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hh8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iqb;
import defpackage.ivd;
import defpackage.j48;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.kxa;
import defpackage.l38;
import defpackage.l48;
import defpackage.llc;
import defpackage.lwf;
import defpackage.lzf;
import defpackage.n5g;
import defpackage.njd;
import defpackage.o8c;
import defpackage.oga;
import defpackage.pg1;
import defpackage.pjd;
import defpackage.q2b;
import defpackage.qf;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.r34;
import defpackage.rea;
import defpackage.rjd;
import defpackage.s3;
import defpackage.sea;
import defpackage.sf;
import defpackage.sjd;
import defpackage.sv2;
import defpackage.svi;
import defpackage.t3d;
import defpackage.t5g;
import defpackage.t75;
import defpackage.tjd;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ua6;
import defpackage.uha;
import defpackage.ujd;
import defpackage.uxa;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.vea;
import defpackage.vid;
import defpackage.vjd;
import defpackage.vw4;
import defpackage.xyc;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.zfi;
import defpackage.zpi;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.android.root.RootController;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/login/neuroavatars/RegistrationNeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqq3;", "Lg39;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "Lnjd;", "registrationData", "Lo8c;", "presetAvatars", "(Lnjd;Lo8c;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class RegistrationNeuroAvatarsScreen extends Widget implements qq3, g39 {
    public static final /* synthetic */ yy7[] D0 = {new toc(RegistrationNeuroAvatarsScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), ho7.d(vid.a, RegistrationNeuroAvatarsScreen.class, "selectAvatarBtn", "getSelectAvatarBtn()Landroid/view/View;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "selectAvatarIcon", "getSelectAvatarIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "continueBtn", "getContinueBtn()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "continueEnabledBtn", "getContinueEnabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "continueDisabledBtn", "getContinueDisabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "pickPhotoTextView", "getPickPhotoTextView()Landroid/widget/TextView;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "contactId", "getContactId()Ljava/lang/Long;", 0), new toc(RegistrationNeuroAvatarsScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0)};
    public final hs A0;
    public final k18 B0;
    public final bwf C0;
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final /* synthetic */ lwf a;
    public final eo7 b;
    public final ka5 c;
    public final String d;
    public final k18 o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final k18 w0;
    public final k18 x0;
    public final hs y0;
    public final hs z0;

    public RegistrationNeuroAvatarsScreen(njd njdVar, o8c o8cVar) {
        this(gwi.b(new imb("registration_data_args", njdVar), new imb("avatars_args", o8cVar)));
    }

    public static void C0(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, LinearLayout linearLayout, int i) {
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
        layoutParams.weight = 0.0f;
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
    }

    public static void D0(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, LinearLayout linearLayout, n5g n5gVar, t5g t5gVar, em6 em6Var, int i, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i = -1;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView.setId(i);
        appCompatTextView.setText(n5gVar.b(appCompatTextView.getContext()));
        t5g t5gVar2 = dpg.a;
        t5gVar.b(appCompatTextView, t75.b);
        tqi.c(new s3(em6Var, null, 29), appCompatTextView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, i2, 0, i3);
        appCompatTextView.setLayoutParams(layoutParams);
        linearLayout.addView(appCompatTextView);
    }

    public static final void y0(View view, yeb yebVar) {
        float fMin = Math.min(view.getWidth(), view.getHeight());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = fMin;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(yebVar.c().a.a.e), shapeDrawable, shapeDrawable);
        shapeDrawable.getPaint().setColor(yebVar.a().G().b.m);
        view.setBackground(rippleDrawable);
    }

    public final oga A0() {
        return (oga) this.B0.getValue();
    }

    public final void B0(boolean z) {
        yy7[] yy7VarArr = D0;
        yy7 yy7Var = yy7VarArr[4];
        bbd bbdVar = this.t0;
        boolean z2 = !z;
        ((OneMeButton) bbdVar.D(this, yy7Var)).setClickable(z2);
        ((OneMeButton) bbdVar.D(this, yy7VarArr[4])).setProgressEnabled(z);
        yy7 yy7Var2 = yy7VarArr[5];
        bbd bbdVar2 = this.u0;
        ((OneMeButton) bbdVar2.D(this, yy7Var2)).setClickable(z2);
        ((OneMeButton) bbdVar2.D(this, yy7VarArr[5])).setProgressEnabled(z);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == xyc.oneme_login_neuro_avatars_load_from_gallery_action) {
            ai8.c.p0().b(":media-picker/select/photo", null);
        } else if (i == xyc.oneme_login_neuro_avatars_take_photo_action) {
            A0().A();
        } else if (i == xyc.oneme_login_neuro_avatars_remove_photo_action) {
            A0().t();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getA() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            oga ogaVarA0 = A0();
            Uri data = intent != null ? intent.getData() : null;
            ContextScope contextScope = ogaVarA0.a;
            vea veaVar = ogaVarA0.b;
            svi.e(contextScope, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new rea(veaVar, data, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v1a v1aVar = a93.s0;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(xyc.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i = 3;
        Continuation continuation = null;
        tqi.c(new sv2(i, continuation, 6), frameLayout);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        uha.E(linearLayout, A0().t0, new iqb(18, this));
        float f = 24;
        C0(this, linearLayout, kti.d(vw4.d().getDisplayMetrics().density * f));
        uha.D(linearLayout, A0().t0);
        C0(this, linearLayout, kti.d(80 * vw4.d().getDisplayMetrics().density));
        bwf bwfVar = this.C0;
        float f2 = 120;
        uxa uxaVarB = uha.B(linearLayout, (efa) bwfVar.getValue(), new pjd(this, 6), new pjd(this, 1), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density), null, null);
        sf sfVar = new sf(6, new WeakReference(uxaVarB));
        uxaVarB.setTag(sfVar);
        ((efa) bwfVar.getValue()).setCallback(sfVar);
        D0(this, linearLayout, new n5g(t3d.oneme_registration_neuro_avatars_choose_photo), dpg.g, new llc(4), xyc.oneme_login_neuro_avatars_pick_image_text, kti.d(16 * vw4.d().getDisplayMetrics().density), 0, 32);
        n5g n5gVar = new n5g(t3d.oneme_registration_neuro_avatars_or);
        t5g t5gVar = dpg.I;
        D0(this, linearLayout, n5gVar, t5gVar, new llc(5), 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), 8);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(xyc.oneme_login_neuro_avatars_pick_neuroavatar_button);
        float f3 = 6;
        float f4 = 12;
        linearLayout2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(layoutParams);
        if (!linearLayout2.isLaidOut() || linearLayout2.isLayoutRequested()) {
            linearLayout2.addOnLayoutChangeListener(new es0(14, linearLayout2));
        } else {
            y0(linearLayout2, v1aVar.y(linearLayout2));
        }
        tqi.c(new pg1(i, continuation, 6), linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(linearLayout2.getContext());
        frameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        frameLayout2.setPadding(iD, iD, iD, iD);
        frameLayout2.setBackground(new ShapeDrawable(new OvalShape()));
        tqi.c(new sv2(i, continuation, 7), frameLayout2);
        uxa uxaVar = new uxa(frameLayout2.getContext());
        float f5 = 32;
        uxaVar.setLayoutParams(new ViewGroup.MarginLayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density)));
        uxaVar.setId(xyc.oneme_login_neuro_avatars_pick_neuroavatar_icon);
        uxaVar.setAvatarShape(kxa.a);
        frameLayout2.addView(uxaVar);
        linearLayout2.addView(frameLayout2);
        TextView textView = new TextView(linearLayout2.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        float f6 = 8;
        marginLayoutParams.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f6);
        textView.setLayoutParams(marginLayoutParams);
        t5gVar.b(textView, t75.b);
        textView.setText(t3d.oneme_registration_neuro_avatars_choose_avatar);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r34.b(getContext(), ivd.i), (Drawable) null);
        textView.setCompoundDrawablePadding(kti.d(f6 * vw4.d().getDisplayMetrics().density));
        tqi.c(new ua6(3, null, 1), textView);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(xyc.oneme_login_neuro_avatars_button_background);
        frameLayout3.setLayoutParams(layoutParams2);
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, v1aVar.y(frameLayout3).d().c.a));
        frameLayout3.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f4), 0, kti.d(f4 * vw4.d().getDisplayMetrics().density), 0);
        zfi.a(frameLayout3);
        qf qfVar = new qf(frameLayout3.getContext());
        qfVar.setId(xyc.oneme_login_neuro_avatars_continue_btn);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 48;
        qfVar.setLayoutParams(layoutParams3);
        qfVar.setupDisabledButton(new llc(6));
        qfVar.setupActiveButton(new llc(7));
        frameLayout3.addView(qfVar);
        tqi.c(new sv2(i, continuation, 4), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qsb) this.w0.getValue()).c(strArr)) {
            A0().A();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yy7[] yy7VarArr = D0;
        yy7 yy7Var = yy7VarArr[0];
        bbd bbdVar = this.X;
        uxa uxaVar = (uxa) bbdVar.D(this, yy7Var);
        j48 viewLifecycleOwner = getViewLifecycleOwner();
        hbd hbdVar = A0().u0;
        efa efaVar = (efa) this.C0.getValue();
        l48 l48VarP = viewLifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ega(uxaVar, efaVar, null, null, null), 1), zpi.a(viewLifecycleOwner.p()));
        fve fveVar = A0().s0;
        if (fveVar != null) {
            gw0.w(new g56(aw0.a(fveVar, getViewLifecycleOwner().p(), l38Var), new ujd(null, this), 1), getViewLifecycleScope());
        }
        gw0.w(new g56(aw0.a(A0().Z, getViewLifecycleOwner().p(), l38Var), new vjd(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().b.i, getViewLifecycleOwner().p(), l38Var), new tjd(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().x0, getViewLifecycleOwner().p(), l38Var), new rjd(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().u0, getViewLifecycleOwner().p(), l38Var), new sjd(null, this), 1), getViewLifecycleScope());
        final int i = 0;
        f8j.d((OneMeButton) this.t0.D(this, yy7VarArr[4]), 300L, new View.OnClickListener(this) { // from class: qjd
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v13 */
            /* JADX WARN: Type inference failed for: r15v14, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v25 */
            /* JADX WARN: Type inference failed for: r15v26, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v32 */
            /* JADX WARN: Type inference failed for: r15v33 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ytd ytdVarE0;
                int i2 = i;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 1:
                        yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 2:
                        yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                        if (registrationNeuroAvatarsScreen.z0() != null) {
                            List listU = registrationNeuroAvatarsScreen.A0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr5 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(registrationNeuroAvatarsScreen);
                                    ?? parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(registrationNeuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                    default:
                        yy7[] yy7VarArr6 = RegistrationNeuroAvatarsScreen.D0;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.v0.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[6])).getGlobalVisibleRect(rect);
                            yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.d, u45.q(16, vw4.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom), null);
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            ?? parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                            ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                            neuroAvatarPickerBottomSheet.N0(registrationNeuroAvatarsScreen);
                            if (ytdVarE0 != null) {
                                bud budVar2 = new bud(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                az1.u(false, budVar2, true, "BottomSheetWidget");
                                ytdVarE0.H(budVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        f8j.d((OneMeButton) this.u0.D(this, yy7VarArr[5]), 300L, new View.OnClickListener(this) { // from class: qjd
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v13 */
            /* JADX WARN: Type inference failed for: r15v14, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v25 */
            /* JADX WARN: Type inference failed for: r15v26, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v32 */
            /* JADX WARN: Type inference failed for: r15v33 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ytd ytdVarE0;
                int i22 = i2;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 1:
                        yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 2:
                        yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                        if (registrationNeuroAvatarsScreen.z0() != null) {
                            List listU = registrationNeuroAvatarsScreen.A0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr5 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(registrationNeuroAvatarsScreen);
                                    ?? parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(registrationNeuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                    default:
                        yy7[] yy7VarArr6 = RegistrationNeuroAvatarsScreen.D0;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.v0.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[6])).getGlobalVisibleRect(rect);
                            yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.d, u45.q(16, vw4.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom), null);
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            ?? parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                            ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                            neuroAvatarPickerBottomSheet.N0(registrationNeuroAvatarsScreen);
                            if (ytdVarE0 != null) {
                                bud budVar2 = new bud(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                az1.u(false, budVar2, true, "BottomSheetWidget");
                                ytdVarE0.H(budVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        uxa uxaVar2 = (uxa) bbdVar.D(this, yy7VarArr[0]);
        final int i3 = 2;
        f8j.d(uxaVar2, 300L, new View.OnClickListener(this) { // from class: qjd
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v13 */
            /* JADX WARN: Type inference failed for: r15v14, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v25 */
            /* JADX WARN: Type inference failed for: r15v26, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v32 */
            /* JADX WARN: Type inference failed for: r15v33 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ytd ytdVarE0;
                int i22 = i3;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 1:
                        yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 2:
                        yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                        if (registrationNeuroAvatarsScreen.z0() != null) {
                            List listU = registrationNeuroAvatarsScreen.A0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr5 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(registrationNeuroAvatarsScreen);
                                    ?? parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(registrationNeuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                    default:
                        yy7[] yy7VarArr6 = RegistrationNeuroAvatarsScreen.D0;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.v0.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[6])).getGlobalVisibleRect(rect);
                            yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.d, u45.q(16, vw4.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom), null);
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            ?? parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                            ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                            neuroAvatarPickerBottomSheet.N0(registrationNeuroAvatarsScreen);
                            if (ytdVarE0 != null) {
                                bud budVar2 = new bud(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                az1.u(false, budVar2, true, "BottomSheetWidget");
                                ytdVarE0.H(budVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        ((View) this.Y.D(this, yy7VarArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: qjd
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v13 */
            /* JADX WARN: Type inference failed for: r15v14, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v25 */
            /* JADX WARN: Type inference failed for: r15v26, types: [c54] */
            /* JADX WARN: Type inference failed for: r15v32 */
            /* JADX WARN: Type inference failed for: r15v33 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ytd ytdVarE0;
                int i22 = i4;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 1:
                        yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                        registrationNeuroAvatarsScreen.B0(true);
                        registrationNeuroAvatarsScreen.A0().w();
                        break;
                    case 2:
                        yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                        if (registrationNeuroAvatarsScreen.z0() != null) {
                            List listU = registrationNeuroAvatarsScreen.A0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr5 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(registrationNeuroAvatarsScreen);
                                    ?? parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(registrationNeuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                    default:
                        yy7[] yy7VarArr6 = RegistrationNeuroAvatarsScreen.D0;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.v0.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[6])).getGlobalVisibleRect(rect);
                            yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.d, u45.q(16, vw4.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom), null);
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            ?? parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                            ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                            neuroAvatarPickerBottomSheet.N0(registrationNeuroAvatarsScreen);
                            if (ytdVarE0 != null) {
                                bud budVar2 = new bud(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                az1.u(false, budVar2, true, "BottomSheetWidget");
                                ytdVarE0.H(budVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        oga ogaVarA0 = A0();
        ContextScope contextScope = ogaVarA0.a;
        vea veaVar = ogaVarA0.b;
        svi.e(contextScope, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new sea(str, veaVar, rectF, 2, rect, null), 2);
    }

    public final njd z0() {
        yy7 yy7Var = D0[7];
        return (njd) this.y0.a(this);
    }

    public RegistrationNeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new lwf();
        this.b = new eo7(3, null, 5);
        this.c = new ka5(new pjd(this, 0), new pjd(this, 3), 4);
        this.d = "RegistrationNeuroAvatarsScreen";
        hh8 hh8Var = hh8.a;
        this.o = hh8Var.a();
        this.X = viewBinding(xyc.oneme_login_neuro_avatars_avatar);
        this.Y = viewBinding(xyc.oneme_login_neuro_avatars_pick_neuroavatar_button);
        this.Z = viewBinding(xyc.oneme_login_neuro_avatars_pick_neuroavatar_icon);
        this.s0 = viewBinding(xyc.oneme_login_neuro_avatars_continue_btn);
        this.t0 = viewBinding(xyc.oneme_login_neuro_avatars_continue_enabled_btn);
        this.u0 = viewBinding(xyc.oneme_login_neuro_avatars_continue_disabled_btn);
        this.v0 = viewBinding(xyc.oneme_login_neuro_avatars_pick_image_text);
        this.w0 = hh8Var.getAccessor().d(10);
        this.x0 = hh8Var.getAccessor().d(151);
        this.y0 = new hs(njd.class, "registration_data_args");
        this.z0 = new hs(Long.class, "contact_id_args");
        this.A0 = new hs(o8c.class, "avatars_args");
        this.B0 = createViewModelLazy(oga.class, new vdc(10, new pjd(this, 4)));
        this.C0 = new bwf(new pjd(this, 5));
    }

    public RegistrationNeuroAvatarsScreen(long j) {
        this(gwi.b(new imb("contact_id_args", Long.valueOf(j))));
    }
}
