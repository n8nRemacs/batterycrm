package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.RknBottomSheet;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class kga extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kga(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                kga kgaVar = new kga(3, (Continuation) obj3, 0);
                kgaVar.X = (vbe) obj;
                kgaVar.Y = (wbe) obj2;
                return kgaVar.n(qqg.a);
            case 1:
                kga kgaVar2 = new kga(3, (Continuation) obj3, 1);
                kgaVar2.X = (xbe) obj;
                kgaVar2.Y = (i2c) obj2;
                return kgaVar2.n(qqg.a);
            case 2:
                kga kgaVar3 = new kga((Context) this.Y, (Continuation) obj3, 2);
                kgaVar3.X = (x3b) obj;
                qqg qqgVar = qqg.a;
                kgaVar3.n(qqgVar);
                return qqgVar;
            case 3:
                kga kgaVar4 = new kga(3, (Continuation) obj3, 3);
                kgaVar4.X = (vbb) obj;
                kgaVar4.Y = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                kgaVar4.n(qqgVar2);
                return qqgVar2;
            case 4:
                kga kgaVar5 = new kga((phb) this.Y, (Continuation) obj3, 4);
                kgaVar5.X = (Throwable) obj2;
                qqg qqgVar3 = qqg.a;
                kgaVar5.n(qqgVar3);
                return qqgVar3;
            case 5:
                kga kgaVar6 = new kga(3, (Continuation) obj3, 5);
                kgaVar6.X = (RLottieImageView) obj;
                kgaVar6.Y = (yeb) obj2;
                qqg qqgVar4 = qqg.a;
                kgaVar6.n(qqgVar4);
                return qqgVar4;
            case 6:
                kga kgaVar7 = new kga(3, (Continuation) obj3, 6);
                kgaVar7.X = (grg) obj;
                kgaVar7.Y = (yeb) obj2;
                qqg qqgVar5 = qqg.a;
                kgaVar7.n(qqgVar5);
                return qqgVar5;
            case 7:
                kga kgaVar8 = new kga((ShapeDrawable) this.Y, (Continuation) obj3, 7);
                kgaVar8.X = (yeb) obj2;
                qqg qqgVar6 = qqg.a;
                kgaVar8.n(qqgVar6);
                return qqgVar6;
            case 8:
                kga kgaVar9 = new kga(3, (Continuation) obj3, 8);
                kgaVar9.X = (zi1) obj;
                kgaVar9.Y = (onb) obj2;
                return kgaVar9.n(qqg.a);
            case 9:
                kga kgaVar10 = new kga((p6c) this.Y, (Continuation) obj3, 9);
                kgaVar10.X = (ImageView) obj;
                qqg qqgVar7 = qqg.a;
                kgaVar10.n(qqgVar7);
                return qqgVar7;
            case 10:
                kga kgaVar11 = new kga((p6c) this.Y, (Continuation) obj3, 10);
                kgaVar11.X = (AppCompatTextView) obj;
                qqg qqgVar8 = qqg.a;
                kgaVar11.n(qqgVar8);
                return qqgVar8;
            case 11:
                kga kgaVar12 = new kga((Context) this.Y, (Continuation) obj3, 11);
                kgaVar12.X = (q6c) obj;
                qqg qqgVar9 = qqg.a;
                kgaVar12.n(qqgVar9);
                return qqgVar9;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                kga kgaVar13 = new kga((ProfileDeletionInfoScreen) this.Y, (Continuation) obj3, 12);
                kgaVar13.X = (yeb) obj2;
                qqg qqgVar10 = qqg.a;
                kgaVar13.n(qqgVar10);
                return qqgVar10;
            case 13:
                kga kgaVar14 = new kga((x9d) this.Y, (Continuation) obj3, 13);
                kgaVar14.X = (RecyclerView) obj;
                qqg qqgVar11 = qqg.a;
                kgaVar14.n(qqgVar11);
                return qqgVar11;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                kga kgaVar15 = new kga(3, (Continuation) obj3, 14);
                kgaVar15.X = (lcd) obj;
                kgaVar15.Y = (yeb) obj2;
                qqg qqgVar12 = qqg.a;
                kgaVar15.n(qqgVar12);
                return qqgVar12;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                kga kgaVar16 = new kga((RecordControlsWidget) this.Y, (Continuation) obj3, 15);
                kgaVar16.X = (ImageView) obj;
                qqg qqgVar13 = qqg.a;
                kgaVar16.n(qqgVar13);
                return qqgVar13;
            case 16:
                kga kgaVar17 = new kga((RecordControlsWidget) this.Y, (Continuation) obj3, 16);
                kgaVar17.X = (TextView) obj;
                qqg qqgVar14 = qqg.a;
                kgaVar17.n(qqgVar14);
                return qqgVar14;
            case LangUtils.HASH_SEED /* 17 */:
                kga kgaVar18 = new kga((RecordControlsWidget) this.Y, (Continuation) obj3, 17);
                kgaVar18.X = (yeb) obj2;
                qqg qqgVar15 = qqg.a;
                kgaVar18.n(qqgVar15);
                return qqgVar15;
            case 18:
                kga kgaVar19 = new kga((RknBottomSheet) this.Y, (Continuation) obj3, 18);
                kgaVar19.X = (LinearLayout) obj;
                qqg qqgVar16 = qqg.a;
                kgaVar19.n(qqgVar16);
                return qqgVar16;
            case 19:
                kga kgaVar20 = new kga((View) this.Y, (Continuation) obj3, 19);
                kgaVar20.X = (View) obj;
                qqg qqgVar17 = qqg.a;
                kgaVar20.n(qqgVar17);
                return qqgVar17;
            case 20:
                kga kgaVar21 = new kga((SearchMessageBottomWidget) this.Y, (Continuation) obj3, 20);
                kgaVar21.X = (ConstraintLayout) obj;
                qqg qqgVar18 = qqg.a;
                kgaVar21.n(qqgVar18);
                return qqgVar18;
            case 21:
                kga kgaVar22 = new kga(3, (Continuation) obj3, 21);
                kgaVar22.X = (List) obj;
                kgaVar22.Y = (vo6) obj2;
                return kgaVar22.n(qqg.a);
            case 22:
                kga kgaVar23 = new kga(3, (Continuation) obj3, 22);
                kgaVar23.X = (ube) obj;
                kgaVar23.Y = (yeb) obj2;
                qqg qqgVar19 = qqg.a;
                kgaVar23.n(qqgVar19);
                return qqgVar19;
            case 23:
                kga kgaVar24 = new kga((rbe) this.Y, (Continuation) obj3, 23);
                kgaVar24.X = (ConstraintLayout) obj;
                qqg qqgVar20 = qqg.a;
                kgaVar24.n(qqgVar20);
                return qqgVar20;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                kga kgaVar25 = new kga((xwe) this.Y, (Continuation) obj3, 24);
                kgaVar25.X = (yeb) obj2;
                qqg qqgVar21 = qqg.a;
                kgaVar25.n(qqgVar21);
                return qqgVar21;
            case 25:
                kga kgaVar26 = new kga((ogf) this.X, (Context) this.Y, (Continuation) obj3);
                qqg qqgVar22 = qqg.a;
                kgaVar26.n(qqgVar22);
                return qqgVar22;
            case 26:
                kga kgaVar27 = new kga((SuggestionsWidget) this.Y, (Continuation) obj3, 26);
                kgaVar27.X = (yeb) obj2;
                qqg qqgVar23 = qqg.a;
                kgaVar27.n(qqgVar23);
                return qqgVar23;
            case 27:
                kga kgaVar28 = new kga((xqf) this.Y, (Continuation) obj3, 27);
                kgaVar28.X = (Throwable) obj2;
                qqg qqgVar24 = qqg.a;
                kgaVar28.n(qqgVar24);
                return qqgVar24;
            case 28:
                kga kgaVar29 = new kga((View) this.Y, (Continuation) obj3, 28);
                kgaVar29.X = (ImageView) obj;
                qqg qqgVar25 = qqg.a;
                kgaVar29.n(qqgVar25);
                return qqgVar25;
            default:
                kga kgaVar30 = new kga((TwoFACheckPassScreen) this.Y, (Continuation) obj3, 29);
                kgaVar30.X = (yeb) obj2;
                qqg qqgVar26 = qqg.a;
                kgaVar30.n(qqgVar26);
                return qqgVar26;
        }
    }

    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cnb cnbVar;
        Integer numB;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                vbe vbeVar = (vbe) this.X;
                wbe wbeVar = (wbe) this.Y;
                if (vbeVar == null) {
                    break;
                }
                break;
            case 1:
                g8j.b(obj);
                break;
            case 2:
                g8j.b(obj);
                x3b x3bVar = (x3b) this.X;
                a93 a93VarX = a93.s0.x((Context) this.Y);
                yeb currentTheme = x3bVar.getCurrentTheme();
                a93VarX.getClass();
                a93.g(x3bVar, currentTheme);
                break;
            case 3:
                g8j.b(obj);
                vbb vbbVar = (vbb) this.X;
                ((yeb) this.Y).f();
                vbbVar.s0 = 687865856;
                break;
            case 4:
                g8j.b(obj);
                Throwable th = (Throwable) this.X;
                String str = ((phb) this.Y).d;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "Releasing connectionFactory after using " + th, null);
                    }
                }
                break;
            case 5:
                g8j.b(obj);
                ((RLottieImageView) this.X).setColorFilter(((yeb) this.Y).b().a.n);
                break;
            case 6:
                g8j.b(obj);
                ((grg) this.X).setBackground(new RippleDrawable(ColorStateList.valueOf(((yeb) this.Y).c().a.a.e), null, new ColorDrawable(-65536)));
                break;
            case 7:
                g8j.b(obj);
                ((ShapeDrawable) this.Y).getPaint().setColor(((yeb) this.X).i().b.b);
                break;
            case 8:
                g8j.b(obj);
                zi1 zi1Var = (zi1) this.X;
                onb onbVar = (onb) this.Y;
                Map map = onbVar.c;
                cnb cnbVar2 = onbVar.a;
                if (map.size() > 1) {
                    if (zi1Var == null && (zi1Var = onbVar.d) == null) {
                        zi1Var = onbVar.e;
                    }
                    cnbVar = (cnb) map.get(zi1Var);
                    if (cnbVar == null) {
                    }
                } else {
                    cnbVar = (cnb) ue3.H(map.values());
                    if (cnbVar != null) {
                        if (!cnbVar.a.l() && cnbVar2.a.a()) {
                        }
                    }
                }
                break;
            case 9:
                g8j.b(obj);
                ImageView imageView = (ImageView) this.X;
                p6c p6cVar = (p6c) this.Y;
                Integer num = p6cVar.b;
                imageView.setImageTintList(ColorStateList.valueOf(num != null ? p6cVar.getCurrentTheme().g(num.intValue()) : p6cVar.getCurrentTheme().getIcon().f));
                break;
            case 10:
                g8j.b(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.X;
                p6c p6cVar2 = (p6c) this.Y;
                Integer num2 = p6cVar2.b;
                appCompatTextView.setTextColor(num2 != null ? p6cVar2.getCurrentTheme().g(num2.intValue()) : p6cVar2.getCurrentTheme().getText().e);
                break;
            case 11:
                g8j.b(obj);
                q6c q6cVar = (q6c) this.X;
                q6cVar.setBackground(new ColorDrawable(q6cVar.getCurrentTheme().b().h));
                a93.h(a93.s0.x((Context) this.Y), q6cVar);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                g8j.b(obj);
                yeb yebVar = (yeb) this.X;
                ProfileDeletionInfoScreen profileDeletionInfoScreen = (ProfileDeletionInfoScreen) this.Y;
                yy7[] yy7VarArr = ProfileDeletionInfoScreen.X;
                View view = profileDeletionInfoScreen.getView();
                if (view != null) {
                    view.setBackgroundColor(yebVar.b().l);
                }
                TextView textView = (TextView) profileDeletionInfoScreen.findViewById(e0d.oneme_settings_twofa_onboarding_title);
                if (textView != null) {
                    textView.setTextColor(yebVar.getText().e);
                }
                TextView textView2 = (TextView) profileDeletionInfoScreen.findViewById(e0d.oneme_settings_twofa_onboarding_subtitle);
                if (textView2 != null) {
                    textView2.setTextColor(yebVar.getText().g);
                }
                ImageView imageView2 = (ImageView) profileDeletionInfoScreen.findViewById(e0d.oneme_settings_twofa_onboarding_picture);
                if (imageView2 != null) {
                    yebVar.getIcon();
                    imageView2.setImageTintList(ColorStateList.valueOf(-1));
                }
                break;
            case 13:
                g8j.b(obj);
                ((RecyclerView) this.X).setBackground(uga.f(Integer.valueOf(a93.s0.x(((x9d) this.Y).a).k().b().d), null, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                g8j.b(obj);
                ((lcd) this.X).V1.setColor(((yeb) this.Y).i().b.c);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                g8j.b(obj);
                ImageView imageView3 = (ImageView) this.X;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.Y;
                Drawable drawable = (Drawable) recordControlsWidget.G0.getValue();
                v1a v1aVar = a93.s0;
                v1aVar.y(imageView3).getIcon();
                cei.k(drawable, -1);
                cei.k(recordControlsWidget.L0(), v1aVar.y(imageView3).a().G().a.b.b);
                break;
            case 16:
                g8j.b(obj);
                TextView textView3 = (TextView) this.X;
                v1a v1aVar2 = a93.s0;
                textView3.setTextColor(v1aVar2.y(textView3).getText().g);
                RecordControlsWidget recordControlsWidget2 = (RecordControlsWidget) this.Y;
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                cei.k((InsetDrawable) recordControlsWidget2.H0.getValue(), v1aVar2.y(textView3).getIcon().j);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                g8j.b(obj);
                yeb yebVar2 = (yeb) this.X;
                RecordControlsWidget recordControlsWidget3 = (RecordControlsWidget) this.Y;
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                ((GradientDrawable) recordControlsWidget3.K0.getValue()).setColor(yebVar2.getText().b);
                break;
            case 18:
                g8j.b(obj);
                LinearLayout linearLayout = (LinearLayout) this.X;
                RknBottomSheet rknBottomSheet = (RknBottomSheet) this.Y;
                bbd bbdVar = rknBottomSheet.C0;
                yy7[] yy7VarArr4 = RknBottomSheet.G0;
                TextView textView4 = (TextView) bbdVar.D(rknBottomSheet, yy7VarArr4[0]);
                v1a v1aVar3 = a93.s0;
                textView4.setTextColor(v1aVar3.y(linearLayout).getText().e);
                ((TextView) rknBottomSheet.D0.D(rknBottomSheet, yy7VarArr4[1])).setTextColor(v1aVar3.y(linearLayout).getText().g);
                ((Drawable) rknBottomSheet.E0.getValue()).setTint(v1aVar3.y(linearLayout).getIcon().a.b.a);
                GradientDrawable gradientDrawable = (GradientDrawable) rknBottomSheet.F0.getValue();
                int[] iArr = v1aVar3.y(linearLayout).d().f.a;
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(new Integer(zob.b(iArr[i], 0.16f)));
                }
                gradientDrawable.setColors(ue3.c0(arrayList));
                break;
            case 19:
                g8j.b(obj);
                View view2 = (View) this.X;
                View view3 = (View) this.Y;
                v1a v1aVar4 = a93.s0;
                view3.setBackgroundColor(v1aVar4.y(view2).b().l);
                ((TextView) view2.findViewById(a0d.oneme_settings_privacy_onboarding_content_title)).setTextColor(v1aVar4.y(view2).getText().e);
                ((TextView) view2.findViewById(a0d.oneme_settings_privacy_onboarding_content_subtitle)).setTextColor(v1aVar4.y(view2).getText().g);
                break;
            case 20:
                g8j.b(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.X;
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.Y;
                yy7[] yy7VarArr5 = SearchMessageBottomWidget.Z;
                constraintLayout.setBackgroundColor(searchMessageBottomWidget.E0().a.d);
                searchMessageBottomWidget.z0().setTextColor(searchMessageBottomWidget.E0().d.g);
                searchMessageBottomWidget.A0().setBackgroundColor(searchMessageBottomWidget.E0().b.c);
                searchMessageBottomWidget.D0(searchMessageBottomWidget.B0(), searchMessageBottomWidget.X);
                searchMessageBottomWidget.D0(searchMessageBottomWidget.y0(), searchMessageBottomWidget.Y);
                break;
            case 21:
                g8j.b(obj);
                break;
            case 22:
                g8j.b(obj);
                ((ube) this.X).setBackgroundColor(((yeb) this.Y).b().n);
                break;
            case 23:
                g8j.b(obj);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.X;
                rbe rbeVar = (rbe) this.Y;
                ImageView imageView4 = rbeVar.E0;
                v1a v1aVar5 = a93.s0;
                imageView4.setColorFilter(v1aVar5.y(constraintLayout2).getIcon().k);
                rbeVar.F0.setTextColor(v1aVar5.y(constraintLayout2).getText().e);
                rbeVar.G0.setTextColor(v1aVar5.y(constraintLayout2).getText().g);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                g8j.b(obj);
                yeb yebVar3 = (yeb) this.X;
                xwe xweVar = (xwe) this.Y;
                xweVar.L0.setBackgroundColor(yebVar3.b().k);
                xweVar.F0.setTextColor(yebVar3.getText().e);
                AppCompatEditText appCompatEditText = xweVar.G0;
                appCompatEditText.setTextColor(yebVar3.getText().e);
                appCompatEditText.setHintTextColor(yebVar3.getText().i);
                xweVar.H0.setTextColor(yebVar3.getText().j);
                xweVar.N0.setTextColor(yebVar3.getText().g);
                laj lajVar = xweVar.E0;
                if (lajVar != null && (numB = lajVar.b()) != null) {
                    xweVar.M0.setTextColor(yebVar3.g(numB.intValue()));
                }
                Drawable drawable2 = xweVar.K0.getDrawable();
                if (drawable2 != null) {
                    cei.k(drawable2, yebVar3.getIcon().f);
                }
                break;
            case 25:
                g8j.b(obj);
                ogf ogfVar = (ogf) this.X;
                cei.k(ogfVar.E0, a93.s0.x((Context) this.Y).k().b().a.h);
                f62 f62Var = ogfVar.K0;
                if (f62Var != null) {
                    dgf dgfVar = f62Var.b;
                    if (ogfVar.F0 != null) {
                        ogfVar.F0 = ogfVar.H();
                    }
                    ogfVar.F(dgfVar.X);
                    ogfVar.G(dgfVar.Y);
                }
                break;
            case 26:
                g8j.b(obj);
                yeb yebVar4 = (yeb) this.X;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.Y;
                yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                suggestionsWidget.N0().setTextColor(yebVar4.getText().h);
                suggestionsWidget.M0().setBackgroundColor(yebVar4.getIcon().h);
                sn0 sn0Var = suggestionsWidget.B0;
                yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                yy7 yy7Var = yy7VarArr7[4];
                ((AppCompatImageView) sn0Var.getValue()).setImageTintList(ColorStateList.valueOf(yebVar4.getIcon().f));
                sn0 sn0Var2 = suggestionsWidget.C0;
                yy7 yy7Var2 = yy7VarArr7[5];
                ((AppCompatTextView) sn0Var2.getValue()).setTextColor(yebVar4.getText().e);
                break;
            case 27:
                g8j.b(obj);
                Throwable th2 = (Throwable) this.X;
                if (!(th2 instanceof CancellationException)) {
                    wqi.e(((xqf) this.Y).n, "fail in chat observing", th2);
                }
                break;
            case 28:
                g8j.b(obj);
                ImageView imageView5 = (ImageView) this.X;
                v1a v1aVar6 = a93.s0;
                View view4 = (View) this.Y;
                v1aVar6.y(view4).getIcon();
                imageView5.setColorFilter(-1);
                imageView5.setBackgroundColor(v1aVar6.y(view4).b().a.l);
                break;
            default:
                g8j.b(obj);
                yeb yebVar5 = (yeb) this.X;
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.Y;
                yy7[] yy7VarArr8 = TwoFACheckPassScreen.t0;
                View view5 = twoFACheckPassScreen.getView();
                if (view5 != null) {
                    view5.setBackgroundColor(yebVar5.b().l);
                }
                pog pogVar = (pog) twoFACheckPassScreen.findViewById(e0d.oneme_settings_twofa_onboarding_content);
                if (pogVar != null) {
                    pogVar.onThemeChanged(yebVar5);
                }
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kga(ogf ogfVar, Context context, Continuation continuation) {
        super(3, continuation);
        this.o = 25;
        this.X = ogfVar;
        this.Y = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kga(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
    }
}
