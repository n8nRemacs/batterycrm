package com.avito.android.select.collapsable_chips;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.google.android.flexbox.FlexboxLayout;
import j.InterfaceC42156l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsableChips.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\f\u0010\rR#\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/avito/android/select/collapsable_chips/CollapsableChips;", "Lcom/google/android/flexbox/FlexboxLayout;", "", "value", "v", "I", "getMaxLines", "()I", "setMaxLines", "(I)V", "maxLines", "w", "getState$annotations", "()V", VoiceInfo.STATE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "y", "Lkotlin/C;", "getCollapseButton", "()Landroid/view/View;", "collapseButton", "a", "b", "c", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollapsableChips extends FlexboxLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f265349z = 0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public b<?> f265350s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final String f265351t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final String f265352u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int maxLines;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final Drawable f265355x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C collapseButton;

    /* compiled from: CollapsableChips.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/collapsable_chips/CollapsableChips$a;", "T", "Lcom/avito/android/lib/design/chips/h;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f265357b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelableEntity f265358c;

        public a(ParcelableEntity parcelableEntity, @Y61.k String str) {
            this.f265357b = str;
            this.f265358c = parcelableEntity;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
                return false;
            }
            String str = this.f265357b;
            if (str.length() > 0) {
                com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
                if (hVar.getF114848c().length() > 0) {
                    return L.f(str, hVar.getF114848c());
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF114848c() {
            return this.f265357b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF262143e() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF287110c() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    /* compiled from: CollapsableChips.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/collapsable_chips/CollapsableChips$b;", "T", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f265359a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.l<T, G0> f265360b;

        public b(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
            this.f265359a = arrayList;
            this.f265360b = lVar;
        }
    }

    /* compiled from: CollapsableChips.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/collapsable_chips/CollapsableChips$c;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface c {
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CollapsableChips f265362c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f265363d;

        public d(CollapsableChips collapsableChips, b bVar) {
            this.f265362c = collapsableChips;
            this.f265363d = bVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = CollapsableChips.f265349z;
            this.f265362c.t(this.f265363d);
            CollapsableChips.this.removeOnLayoutChangeListener(this);
        }
    }

    @X41.j
    public CollapsableChips(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getCollapseButton() {
        return (View) this.collapseButton.getValue();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final View r(int i12) {
        Drawable drawableH = C35835l0.h(this.state == 1 ? R.attr.ic_arrowExpandMore20 : R.attr.ic_arrowExpandLess20, getContext());
        if (drawableH != null) {
            V0.d(drawableH, C35835l0.d(R.attr.blue, getContext()));
        } else {
            drawableH = null;
        }
        String str = this.state == 1 ? this.f265351t : String.format(this.f265352u, Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
        View viewFindViewById = getCollapseButton().findViewById(R.id.category_action_button_link);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(str);
        View viewFindViewById2 = getCollapseButton().findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById2).setImageDrawable(drawableH);
        return getCollapseButton();
    }

    public final void setMaxLines(int i12) {
        if (i12 <= 0) {
            i12 = Integer.MAX_VALUE;
        }
        this.maxLines = i12;
        b<?> bVar = this.f265350s;
        if (bVar != null) {
            t(bVar);
        }
    }

    public final <T> void t(b<T> bVar) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int iS2 = viewGroup != null ? D6.s(viewGroup) : D6.s(this);
        boolean z12 = bVar.f265359a.size() > this.maxLines;
        if (iS2 <= 0 && z12) {
            addOnLayoutChangeListener(new d(this, bVar));
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iS2, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        removeAllViews();
        ArrayList arrayList = bVar.f265359a;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i13 = i12 + 1;
            a aVar = (a) it.next();
            Button button = (Button) LayoutInflater.from(getRootView().getContext()).inflate(R.layout.multiselect_chips_item, (ViewGroup) this, false);
            button.setText(aVar.f265357b);
            Button.g(button, null, this.f265355x, true, new com.avito.android.select.collapsable_chips.a(bVar.f265360b, aVar), 1);
            addView(button);
            if (this.state != 1) {
                measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                if (getFlexLines().size() > this.maxLines) {
                    removeViewAt(getChildCount() - 1);
                    addView(r(((arrayList.size() - 1) - i12) + 1));
                    break;
                }
            }
            i12 = i13;
        }
        measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        if (this.state != 1 || getFlexLines().size() <= this.maxLines) {
            this.state = 2;
        } else {
            addView(r(0));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsableChips(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.maxLines = Integer.MAX_VALUE;
        this.f265355x = C35835l0.h(R.attr.ic_close16, context);
        this.collapseButton = C42727D.c(new com.avito.android.select.collapsable_chips.c(context, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f265383a);
        setMaxLines(typedArrayObtainStyledAttributes.getInteger(2, Integer.MAX_VALUE));
        String string = typedArrayObtainStyledAttributes.getString(0);
        this.f265351t = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(1);
        this.f265352u = string2 != null ? string2 : "";
        typedArrayObtainStyledAttributes.recycle();
    }

    private static /* synthetic */ void getState$annotations() {
    }
}
