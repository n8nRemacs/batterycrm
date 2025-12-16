package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.az1;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.eri;
import defpackage.f83;
import defpackage.f8j;
import defpackage.fya;
import defpackage.gza;
import defpackage.iwa;
import defpackage.iza;
import defpackage.j6;
import defpackage.jwa;
import defpackage.jza;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l5j;
import defpackage.ms0;
import defpackage.mvi;
import defpackage.oe6;
import defpackage.oq;
import defpackage.r1d;
import defpackage.t75;
import defpackage.tq;
import defpackage.tqi;
import defpackage.u45;
import defpackage.u74;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vw4;
import defpackage.yud;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForceUpdateScreen extends Widget {
    public static final /* synthetic */ int d = 0;
    public final eo7 a;
    public final tq b;
    public final fya c;

    /* JADX WARN: Multi-variable type inference failed */
    public ForceUpdateScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new eo7(0, new ms0(3, 1, false), 7);
        oq oqVar = oq.a;
        this.b = (tq) oqVar.getAccessor().c(HttpStatus.SC_PROCESSING);
        this.c = (fya) oqVar.getAccessor().c(452);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(iwa.a);
        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(eri.a((Context) this.c.a.c(12), r1d.ic_launcher_background));
        u45.n(17, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(yud.e);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(iwa.e);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new f83(imageView2, 3));
        imageView2.setBackground(mvi.a(imageView2.getContext(), 1301046487, 78.0f, true));
        float f = 12;
        u45.n(f, vw4.d().getDisplayMetrics().density, imageView2);
        imageView2.setImageResource(yud.h);
        TextView textView = new TextView(getContext());
        textView.setId(iwa.c);
        textView.setGravity(1);
        dpg.C.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        textView.setText(jwa.b);
        TextView textView2 = new TextView(getContext());
        textView2.setId(iwa.b);
        textView2.setGravity(1);
        textView2.setTextColor(az1.f(dpg.I, textView2, v1aVar, textView2).e);
        textView2.setText(jwa.a);
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(iwa.d);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(jwa.c);
        f8j.d(oneMeButton, 300L, new j6(29, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tqi.c(new oe6(textView, textView2, null, 0), constraintLayout);
        float f2 = 120;
        constraintLayout.addView(imageView, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        float f3 = 60;
        kt3 kt3Var = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        float f4 = 84;
        kt3Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
        ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = kti.d(f4 * vw4.d().getDisplayMetrics().density);
        constraintLayout.addView(imageView2, kt3Var);
        kt3 kt3Var2 = new kt3(-1, -2);
        kt3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var2.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = kti.d(20 * vw4.d().getDisplayMetrics().density);
        ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = kti.d(50 * vw4.d().getDisplayMetrics().density);
        constraintLayout.addView(textView, kt3Var2);
        kt3 kt3Var3 = new kt3(-1, -2);
        kt3Var3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var3.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        constraintLayout.addView(textView2, kt3Var3);
        kt3 kt3Var4 = new kt3(-1, -2);
        kt3Var4.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var4.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
        ((ViewGroup.MarginLayoutParams) kt3Var4).bottomMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        constraintLayout.addView(oneMeButton, kt3Var4);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = imageView.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 4, textView.getId(), 3);
        ut3VarG.g(id).d.W = 2;
        int id2 = imageView2.getId();
        ut3VarG.d(id2, 3, imageView.getId(), 3);
        ut3VarG.d(id2, 4, imageView.getId(), 4);
        ut3VarG.d(id2, 6, imageView.getId(), 6);
        ut3VarG.d(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        ut3VarG.d(id3, 3, imageView.getId(), 4);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        ut3VarG.d(id4, 3, textView.getId(), 4);
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 4, oneMeButton.getId(), 3);
        int id5 = oneMeButton.getId();
        ut3VarG.d(id5, 4, 0, 4);
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }
}
