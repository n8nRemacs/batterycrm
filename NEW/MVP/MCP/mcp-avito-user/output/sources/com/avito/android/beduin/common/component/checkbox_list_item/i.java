package com.avito.android.beduin.common.component.checkbox_list_item;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CheckboxListItemLayout.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/i;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "(Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;)V", "LJV/b;", "listener", "setCheckboxStateChangedListener", "(LJV/b;)V", "Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "verticalPosition", "setCheckboxPosition", "(Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;)V", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "getCheckboxContainer", "()Landroid/widget/FrameLayout;", "checkboxContainer", "d", "Landroid/widget/LinearLayout;", "getChildrenContainer", "()Landroid/widget/LinearLayout;", "childrenContainer", "Landroid/graphics/drawable/Drawable;", "e", "Lkotlin/C;", "getSelectableBackground", "()Landroid/graphics/drawable/Drawable;", "selectableBackground", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Checkbox f100991b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FrameLayout checkboxContainer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final LinearLayout childrenContainer;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f100994e;

    /* renamed from: f, reason: collision with root package name */
    public final int f100995f;

    /* renamed from: g, reason: collision with root package name */
    public final int f100996g;

    /* compiled from: CheckboxListItemLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100997a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100998b;

        static {
            int[] iArr = new int[CheckboxTapArea.values().length];
            try {
                iArr[CheckboxTapArea.COMPONENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckboxTapArea.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100997a = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f100998b = iArr2;
        }
    }

    public i(@Y61.k androidx.appcompat.view.d dVar) {
        super(dVar);
        this.f100994e = C42727D.b(LazyThreadSafetyMode.f406616d, new j(this));
        View viewInflate = LayoutInflater.from(dVar).inflate(R.layout.beduin_component_checkbox_list_item, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.checkbox_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.checkboxContainer = frameLayout;
        View viewFindViewById2 = frameLayout.findViewById(R.id.checkbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        Checkbox checkbox = (Checkbox) viewFindViewById2;
        this.f100991b = checkbox;
        View viewFindViewById3 = viewInflate.findViewById(R.id.children_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.childrenContainer = (LinearLayout) viewFindViewById3;
        ViewGroup.LayoutParams layoutParams = checkbox.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        this.f100995f = layoutParams2 != null ? layoutParams2.topMargin : y6.b(4);
        this.f100996g = layoutParams2 != null ? layoutParams2.gravity : -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final Drawable getSelectableBackground() {
        return (Drawable) this.f100994e.getValue();
    }

    public final void a(@Y61.k CheckboxTapArea checkboxTapArea, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.media_x2.d dVar, @Y61.l UniversalColor universalColor) {
        Drawable selectableBackground;
        com.avito.android.autoteka.presentation.reportGeneration.a aVar = dVar != null ? new com.avito.android.autoteka.presentation.reportGeneration.a(this, 6) : null;
        this.f100991b.setOnClickListener(dVar);
        int i12 = a.f100997a[checkboxTapArea.ordinal()];
        FrameLayout frameLayout = this.checkboxContainer;
        if (i12 == 1) {
            if (universalColor != null) {
                C48063a c48063a = C48063a.f437606a;
                Context context = getContext();
                c48063a.getClass();
                ColorStateList colorStateListE = C48063a.e(context, universalColor);
                Context context2 = getContext();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(y6.b(3));
                gradientDrawable.setColor(C35835l0.d(R.attr.white, context2));
                selectableBackground = new RippleDrawable(colorStateListE, null, gradientDrawable);
            } else {
                selectableBackground = getSelectableBackground();
            }
            setBackground(selectableBackground);
            frameLayout.setOnClickListener(null);
            setOnClickListener(aVar);
        } else if (i12 == 2) {
            setBackground(null);
            setOnClickListener(null);
            frameLayout.setOnClickListener(aVar);
        }
        frameLayout.setClickable(checkboxTapArea == CheckboxTapArea.CHECKBOX);
    }

    @Y61.k
    public final FrameLayout getCheckboxContainer() {
        return this.checkboxContainer;
    }

    @Y61.k
    public final LinearLayout getChildrenContainer() {
        return this.childrenContainer;
    }

    public final void setCheckboxPosition(@Y61.l CheckboxVerticalPosition verticalPosition) {
        int i12;
        Integer offset;
        int iIntValue = (verticalPosition == null || (offset = verticalPosition.getOffset()) == null) ? this.f100995f : offset.intValue();
        VerticalAlignment alignment = verticalPosition != null ? verticalPosition.getAlignment() : null;
        int i13 = alignment == null ? -1 : a.f100998b[alignment.ordinal()];
        if (i13 == -1) {
            i12 = this.f100996g;
        } else if (i13 == 1) {
            i12 = 48;
        } else if (i13 == 2) {
            i12 = 16;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 80;
        }
        Checkbox checkbox = this.f100991b;
        ViewGroup.LayoutParams layoutParams = checkbox.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && layoutParams2.gravity == i12 && layoutParams2.topMargin == iIntValue) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = checkbox.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = iIntValue;
        layoutParams4.gravity = i12;
        checkbox.setLayoutParams(layoutParams4);
    }

    public final void setCheckboxStateChangedListener(@Y61.l JV.b listener) {
        this.f100991b.setOnStateChangedListener(listener);
    }

    public final void setState(@Y61.k CheckboxState state) {
        com.avito.android.beduin.common.component.checkbox.i.a(this.f100991b, state);
    }
}
