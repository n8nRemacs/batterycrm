package com.avito.android.beduin.common.component.attributed_text_pair;

import Au.ViewOnClickListenerC13080b;
import Jh.d;
import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: BeduinAttributedTextPairComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "LJh/d;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinAttributedTextPairModel, d> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100665e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f100666f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinAttributedTextPairModel f100667g;

    /* compiled from: BeduinAttributedTextPairComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.attributed_text_pair.a$a, reason: collision with other inner class name */
    public static final class C3021a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3021a f100668a = new C3021a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f100669b = Collections.singletonList("attributedTextPair");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinAttributedTextPairModel> f100670c = BeduinAttributedTextPairModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinAttributedTextPairModel> S() {
            return f100670c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f100669b;
        }
    }

    /* compiled from: BeduinAttributedTextPairComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100671a;

        static {
            int[] iArr = new int[BeduinAttributedTextPairModel.LineStyle.values().length];
            try {
                iArr[BeduinAttributedTextPairModel.LineStyle.DOTTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinAttributedTextPairModel.LineStyle.SOLID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100671a = iArr;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k com.avito.android.util.text.a aVar, @k BeduinAttributedTextPairModel beduinAttributedTextPairModel) {
        this.f100665e = interfaceC15523b;
        this.f100666f = aVar;
        this.f100667g = beduinAttributedTextPairModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100667g;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(viewGroup.getContext(), null, 0, 6, null);
        dVar.setId(R.id.beduin_attributed_text_pair);
        dVar.setLayoutParams(layoutParams);
        return dVar;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        d dVar = (d) interfaceC40116e;
        View root = dVar.getF101723b();
        BeduinAttributedTextPairModel beduinAttributedTextPairModel = this.f100667g;
        root.setTag(beduinAttributedTextPairModel.getId());
        D6.f(dVar.getF101723b(), y6.b(com.avito.android.beduin.common.component.model.a.b(beduinAttributedTextPairModel.getPadding())), 0, y6.b(com.avito.android.beduin.common.component.model.a.c(beduinAttributedTextPairModel.getPadding())), 0, 10);
        BeduinComponentTheme theme = beduinAttributedTextPairModel.getTheme();
        Context dVar2 = theme != null ? new androidx.appcompat.view.d(dVar.getContext(), theme.f100608b) : dVar.getContext();
        Context context = dVar2;
        q(context, beduinAttributedTextPairModel.getLeftPart(), dVar.getLeftText(), dVar.getLeftPartLeftIcon(), dVar.getLeftPartRightIcon());
        q(context, beduinAttributedTextPairModel.getRightPart(), dVar.getRightText(), dVar.getRightPartLeftIcon(), dVar.getRightPartRightIcon());
        dVar.getGuideline().setGuidelinePercent(beduinAttributedTextPairModel.getLeftTextWidthProportion());
        BeduinAttributedTextPairModel.ConnectingLine connectingLine = beduinAttributedTextPairModel.getConnectingLine();
        int iD2 = C48065c.d(dVar2, connectingLine != null ? connectingLine.getColor() : null, R.attr.gray48);
        BeduinAttributedTextPairModel.ConnectingLine connectingLine2 = beduinAttributedTextPairModel.getConnectingLine();
        BeduinAttributedTextPairModel.LineStyle style = connectingLine2 != null ? connectingLine2.getStyle() : null;
        int i12 = style == null ? -1 : b.f100671a[style.ordinal()];
        if (i12 == 1) {
            Drawable drawable = dVar.getContext().getDrawable(R.drawable.dotted_line);
            if (drawable != null) {
                drawable.setTint(iD2);
                dVar.getLine().setImageDrawable(drawable);
                D6.H(dVar.getLine());
                return;
            }
            return;
        }
        if (i12 != 2) {
            D6.w(dVar.getLine());
            return;
        }
        Drawable drawable2 = dVar.getContext().getDrawable(R.drawable.solid_line);
        if (drawable2 != null) {
            drawable2.setTint(iD2);
            dVar.getLine().setImageDrawable(drawable2);
            D6.H(dVar.getLine());
        }
    }

    public final void p(Context context, ImageView imageView, BeduinAttributedTextPairModel.AttributedTextPairIcon attributedTextPairIcon, boolean z12) {
        D6.G(imageView, attributedTextPairIcon != null);
        imageView.setImageDrawable(v.c(context, attributedTextPairIcon != null ? attributedTextPairIcon.getLocalIcon() : null, attributedTextPairIcon != null ? attributedTextPairIcon.getBase64Icon() : null));
        boolean zA2 = O2.a(attributedTextPairIcon != null ? attributedTextPairIcon.getActions() : null);
        boolean z13 = z12 || zA2;
        if (zA2) {
            imageView.setOnClickListener(new ViewOnClickListenerC13080b(6, this, attributedTextPairIcon));
        }
        imageView.setClickable(z13);
        imageView.setFocusable(z13);
    }

    public final void q(Context context, BeduinAttributedTextPairModel.AttributedTextPairPart attributedTextPairPart, TextView textView, ImageView imageView, ImageView imageView2) {
        Iterator it = C42745f0.U(textView, imageView, imageView2).iterator();
        while (it.hasNext()) {
            j.a((View) it.next(), attributedTextPairPart.getActions(), this.f100665e);
        }
        Integer numberOfLines = attributedTextPairPart.getNumberOfLines();
        if (numberOfLines != null) {
            textView.setMaxLines(numberOfLines.intValue());
        }
        I5.a(textView, this.f100666f.c(context, attributedTextPairPart.getText()), false);
        boolean zA2 = O2.a(attributedTextPairPart.getActions());
        p(context, imageView, attributedTextPairPart.getLeftIcon(), zA2);
        p(context, imageView2, attributedTextPairPart.getRightIcon(), zA2);
    }
}
