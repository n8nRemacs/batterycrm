package com.avito.android.beduin.common.component.text_with_icon;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.utils.E;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTextWithIconComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/text_with_icon/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/text_with_icon/BeduinTextWithIconModel;", "Lcom/avito/android/beduin/common/component/text_with_icon/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinTextWithIconModel, e> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102784e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinTextWithIconModel f102785f;

    /* compiled from: BeduinTextWithIconComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/text_with_icon/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.text_with_icon.a$a, reason: collision with other inner class name */
    public static final class C3082a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102786a = C42745f0.U("textWithIcon", "attributedTextWithIcon");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102787b = BeduinTextWithIconModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102787b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102786a;
        }
    }

    /* compiled from: BeduinTextWithIconComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102788a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f102789b;

        static {
            int[] iArr = new int[IconAlignment.values().length];
            try {
                iArr[IconAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102788a = iArr;
            int[] iArr2 = new int[IconPosition.values().length];
            try {
                iArr2[IconPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f102789b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinTextWithIconModel beduinTextWithIconModel) {
        this.f102784e = interfaceC15523b;
        this.f102785f = beduinTextWithIconModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102785f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f102785f.getTheme();
        Context context = viewGroup.getContext();
        e eVar = new e(theme != null ? new ContextThemeWrapper(context, theme.f100608b) : context, null, 0, 0, 14, null);
        eVar.setLayoutParams(layoutParams);
        return eVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        e eVar = (e) view;
        BeduinTextWithIconModel beduinTextWithIconModel = this.f102785f;
        eVar.setTag(beduinTextWithIconModel.getF100853b());
        ImageView iconImageView = eVar.getIconImageView();
        TextView textView = eVar.getTextView();
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f102784e;
        E.a(textView, interfaceC15523b, beduinTextWithIconModel);
        j.a(eVar, beduinTextWithIconModel.getActions(), interfaceC15523b);
        IconPosition iconPosition = beduinTextWithIconModel.getIconPosition();
        if (iconPosition == null) {
            iconPosition = IconPosition.RIGHT;
        }
        Drawable drawableC = v.c(iconImageView.getContext(), beduinTextWithIconModel.getLocalIcon(), beduinTextWithIconModel.getBase64Icon());
        iconImageView.setImageDrawable(drawableC);
        Integer iconHeight = beduinTextWithIconModel.getIconHeight();
        Integer iconSpacing = beduinTextWithIconModel.getIconSpacing();
        int iIntValue = iconSpacing != null ? iconSpacing.intValue() : 0;
        if (iconHeight == null || drawableC == null) {
            iconImageView.getLayoutParams().width = -2;
            iconImageView.getLayoutParams().height = -2;
        } else {
            int intrinsicHeight = drawableC.getIntrinsicHeight() / drawableC.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = iconImageView.getLayoutParams();
            layoutParams.height = D6.i(iconHeight.intValue(), iconImageView.getContext());
            layoutParams.width = D6.i(iIntValue, iconImageView.getContext()) + (D6.i(iconHeight.intValue(), iconImageView.getContext()) / intrinsicHeight);
            iconImageView.setLayoutParams(layoutParams);
        }
        int[] iArr = b.f102789b;
        int i12 = iArr[iconPosition.ordinal()];
        if (i12 == 1) {
            View childAt = eVar.getChildAt(0);
            if ((childAt instanceof ImageView ? (ImageView) childAt : null) == null) {
                View childAt2 = eVar.getChildAt(0);
                eVar.removeViewAt(0);
                eVar.addView(childAt2);
            }
        } else if (i12 == 2) {
            View childAt3 = eVar.getChildAt(0);
            if ((childAt3 instanceof ImageView ? (ImageView) childAt3 : null) != null) {
                View childAt4 = eVar.getChildAt(0);
                eVar.removeViewAt(0);
                eVar.addView(childAt4);
            }
        }
        Integer iconSpacing2 = beduinTextWithIconModel.getIconSpacing();
        if (iconSpacing2 != null) {
            int i13 = iArr[iconPosition.ordinal()];
            if (i13 == 1) {
                iconImageView.setPadding(0, 0, D6.i(iconSpacing2.intValue(), iconImageView.getContext()), 0);
            } else if (i13 == 2) {
                iconImageView.setPadding(D6.i(iconSpacing2.intValue(), iconImageView.getContext()), 0, 0, 0);
            }
        } else {
            Paint paint = new Paint();
            paint.setTextSize(textView.getTextSize());
            int iMeasureText = (int) paint.measureText(" ");
            int i14 = iArr[iconPosition.ordinal()];
            if (i14 == 1) {
                iconImageView.setPadding(0, 0, iMeasureText, 0);
            } else if (i14 == 2) {
                iconImageView.setPadding(iMeasureText, 0, 0, 0);
            }
        }
        IconAlignment iconAlignment = beduinTextWithIconModel.getIconAlignment();
        ViewGroup.LayoutParams layoutParams2 = iconImageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
        if (iconAlignment != null) {
            int i15 = b.f102788a[iconAlignment.ordinal()];
            if (i15 == 1) {
                if (layoutParams3 != null) {
                    layoutParams3.topMargin = D6.i(2, iconImageView.getContext());
                }
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 48;
                }
                if (layoutParams5 != null) {
                    layoutParams5.gravity = 48;
                }
            } else if (i15 == 2) {
                if (layoutParams3 != null) {
                    layoutParams3.topMargin = 0;
                }
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 16;
                }
                if (layoutParams5 != null) {
                    layoutParams5.gravity = 16;
                }
            } else if (i15 == 3) {
                if (layoutParams3 != null) {
                    layoutParams3.topMargin = 0;
                }
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 80;
                }
                if (layoutParams5 != null) {
                    layoutParams5.gravity = 80;
                }
            }
        } else {
            if (layoutParams3 != null) {
                layoutParams3.gravity = 80;
            }
            if (layoutParams5 != null) {
                layoutParams5.gravity = 80;
            }
        }
        if (layoutParams3 != null) {
            iconImageView.setLayoutParams(layoutParams3);
        }
        if (layoutParams5 != null) {
            textView.setLayoutParams(layoutParams5);
        }
    }
}
