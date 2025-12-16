package com.avito.android.lib.design.button;

import VU.b;
import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.style.Alignment;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;
import pK0.InterfaceC46971a;
import pK0.InterfaceC46972b;
import wK0.AbstractC49526a;

/* compiled from: Button.kt */
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0003-89J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0004¢\u0006\u0004\b+\u0010,R$\u0010#\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\rR\u001a\u00107\u001a\u0002028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/avito/android/lib/design/button/Button;", "Landroid/widget/FrameLayout;", "LpK0/a;", "LpK0/b;", "LLV/a;", "LUU/a;", "LVU/b;", "newState", "Lkotlin/G0;", "setState", "(LUU/a;)V", "newStyle", "setStyle", "(LVU/b;)V", "", "resId", "setText", "(I)V", "", "getText", "()Ljava/lang/CharSequence;", "text", "(Ljava/lang/CharSequence;)V", "color", "setTextColor", "setSubtitle", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "isLoading", "setLoading", "(Z)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "Landroid/content/res/ColorStateList;", "colorStateList", "setIconColor", "(Landroid/content/res/ColorStateList;)V", "Lcom/avito/android/lib/design/button/Button$Mode;", "mode", "setMode", "(Lcom/avito/android/lib/design/button/Button$Mode;)V", "b", "LVU/b;", "getStyle$_design_modules_components", "()LVU/b;", "setStyle$_design_modules_components", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "Mode", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class Button extends FrameLayout implements InterfaceC46971a, InterfaceC46972b, LV.a<UU.a, VU.b> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final b f178621m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f178622n;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public VU.b style;

    /* renamed from: c, reason: collision with root package name */
    @l
    public UU.a f178624c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f178625d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f178626e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView textView;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f178628g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f178629h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Spinner f178630i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f178631j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.button.c f178632k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f178633l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/button/Button$Mode;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f178634b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f178635c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f178636d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178637e;

        static {
            Mode mode = new Mode("TEXT", 0);
            f178634b = mode;
            Mode mode2 = new Mode("IMAGE", 1);
            f178635c = mode2;
            Mode[] modeArr = {mode, mode2};
            f178636d = modeArr;
            f178637e = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f178636d.clone();
        }
    }

    /* compiled from: Button.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/button/Button$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Parcelable f178638b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f178639c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f178640d;

        /* compiled from: Button.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@l Parcelable parcelable, boolean z12, boolean z13) {
            super(parcelable);
            this.f178638b = parcelable;
            this.f178639c = z12;
            this.f178640d = z13;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f178638b, i12);
            parcel.writeInt(this.f178639c ? 1 : 0);
            parcel.writeInt(this.f178640d ? 1 : 0);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<Context, AttributeSet, Button> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f178641b = new a();

        public a() {
            super(2, Button.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);
        }

        @Override // Y41.p
        public final Button invoke(Context context, AttributeSet attributeSet) {
            return new Button(context, attributeSet, 0, 0, 12, null);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/button/Button$b;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178642a;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                Alignment alignment = Alignment.f178655b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Alignment alignment2 = Alignment.f178655b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f178642a = iArr;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f178643l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f178643l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f178643l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: Button.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onClick", "(Landroid/view/View;)V", "com/avito/android/lib/design/button/a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f178644b;

        public e(Object obj) {
            this.f178644b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((Y41.a) this.f178644b).invoke();
        }
    }

    static {
        AvitoLayoutInflater.f181382a.getClass();
        f178622n = AvitoLayoutInflater.a(a.f178641b, AvitoLayoutInflater.f181383b);
    }

    @j
    public Button(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(Button button, Drawable drawable, Drawable drawable2, boolean z12, Y41.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            drawable = null;
        }
        if ((i12 & 2) != 0) {
            drawable2 = null;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        if ((i12 & 8) != 0) {
            aVar = null;
        }
        button.f(drawable, drawable2, z12, aVar);
    }

    public static void h(Button button, int i12, int i13, int i14) {
        Drawable drawableA;
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        button.getClass();
        Integer numValueOf = Integer.valueOf(i12);
        Drawable drawableA2 = null;
        if (i12 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawableA = C43852a.a(button.getContext(), numValueOf.intValue());
        } else {
            drawableA = null;
        }
        Integer numValueOf2 = Integer.valueOf(i13);
        if (i13 <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            drawableA2 = C43852a.a(button.getContext(), numValueOf2.intValue());
        }
        g(button, drawableA, drawableA2, false, null, 12);
    }

    public static void k(Button button, int i12, int i13) {
        button.f178626e.setPadding(i12, button.f178626e.getPaddingTop(), i13, button.f178626e.getPaddingBottom());
    }

    public final void a(TypedArray typedArray, Context context) {
        VU.b.f17147t.getClass();
        VU.b.f17148u = true;
        setStyle(b.a.d(typedArray, context));
        if (typedArray.hasValue(28)) {
            String string = typedArray.getString(28);
            if (string == null) {
                string = "";
            }
            setSubtitle(string);
        }
        TextView textView = this.textView;
        if (textView instanceof PK0.e) {
            return;
        }
        if (typedArray.hasValue(1)) {
            textView.setTextAppearance(typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(2)) {
            textView.setTextColor(x.a(typedArray, context, 2));
        }
        boolean zHasValue = typedArray.hasValue(29);
        TextView textView2 = this.f178628g;
        if (zHasValue) {
            this.f178633l = true;
            textView2.setTextAppearance(typedArray.getResourceId(29, 0));
        }
        if (typedArray.hasValue(30)) {
            textView2.setTextColor(x.a(typedArray, context, 30));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r4 = this;
            VU.b r0 = r4.style
            r1 = 0
            if (r0 == 0) goto L13
            r2 = 1
            boolean r3 = r0.f17157i
            if (r3 != r2) goto L13
            PK0.n r0 = r0.f17150b
            if (r0 == 0) goto L11
            com.avito.android.util.c0 r0 = r0.f12988b
            goto L17
        L11:
            r0 = r1
            goto L17
        L13:
            if (r0 == 0) goto L11
            com.avito.android.util.c0 r0 = r0.f17153e
        L17:
            if (r0 == 0) goto L1d
            android.content.res.ColorStateList r1 = r0.b()
        L1d:
            android.widget.ImageView r0 = r4.f178629h
            r0.setImageTintList(r1)
            android.widget.TextView r0 = r4.textView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            java.util.ArrayList r0 = kotlin.collections.C42756l.B(r0)
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r2.setTintList(r1)
            goto L30
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.button.Button.b():void");
    }

    @SuppressLint({"RtlHardcoded"})
    public final void c() {
        VU.b bVar = this.style;
        Alignment alignment = bVar != null ? bVar.f17166r : null;
        int i12 = alignment == null ? -1 : c.f178642a[alignment.ordinal()];
        int i13 = 17;
        ViewGroup viewGroup = this.f178625d;
        TextView textView = this.textView;
        if (i12 == 1) {
            viewGroup.getLayoutParams().width = -1;
            textView.getLayoutParams().width = -1;
            if (textView.getCompoundDrawables()[0] != null && textView.getCompoundDrawables()[2] == null) {
                i13 = 5;
            } else if (textView.getCompoundDrawables()[2] != null && textView.getCompoundDrawables()[0] == null) {
                i13 = 3;
            }
            textView.setGravity(i13 | 16);
        } else {
            if (i12 != 2) {
                return;
            }
            viewGroup.getLayoutParams().width = -2;
            textView.getLayoutParams().width = -2;
            textView.setGravity(17);
        }
        textView.requestLayout();
        viewGroup.requestLayout();
    }

    public final boolean d() {
        int lineCount;
        TextView textView = this.textView;
        return textView.getLayout() != null && (lineCount = textView.getLayout().getLineCount()) > 0 && textView.getLayout().getEllipsisCount(lineCount - 1) > 0;
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        this.f178632k.a(canvas, this);
        super.draw(canvas);
    }

    public final void e(int i12, @k ColorStateList colorStateList, @l ColorStateList colorStateList2) {
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, colorStateList, colorStateList2, i12, null, 0, 120));
    }

    public final void f(@l Drawable drawable, @l Drawable drawable2, boolean z12, @l Y41.a<G0> aVar) {
        TextView textView = this.textView;
        I5.d(textView, drawable, drawable2, 10);
        if (aVar != null) {
            I5.b(textView, new d(aVar));
        }
        setMode(Mode.f178634b);
        j();
        if (z12) {
            b();
        }
        c();
    }

    @l
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final VU.b getStyle() {
        return this.style;
    }

    @l
    public final CharSequence getText() {
        return this.textView.getText();
    }

    @k
    public final TextView getTextView() {
        return this.textView;
    }

    public final void i() {
        CharSequence text;
        boolean z12 = this.f178633l;
        TextView textView = this.f178628g;
        textView.setVisibility(z12 && this.textView.getVisibility() == 0 && (text = textView.getText()) != null && text.length() != 0 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.textView
            java.lang.CharSequence r1 = r0.getText()
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L14
            r0.setCompoundDrawablePadding(r2)
            k(r5, r2, r2)
            return
        L14:
            VU.b r1 = r5.style
            if (r1 == 0) goto L1b
            int r1 = r1.f17164p
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r0.setCompoundDrawablePadding(r1)
            boolean r1 = com.avito.android.util.D6.y(r0)
            r3 = 0
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable[] r1 = r0.getCompoundDrawables()
            if (r1 == 0) goto L33
            r1 = r1[r2]
            goto L34
        L33:
            r1 = r3
        L34:
            if (r0 == 0) goto L40
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            if (r0 == 0) goto L40
            r4 = 2
            r0 = r0[r4]
            goto L41
        L40:
            r0 = r3
        L41:
            if (r1 == 0) goto L56
            VU.b r1 = r5.style
            if (r1 == 0) goto L4e
            int r1 = r1.f17162n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L4f
        L4e:
            r1 = r3
        L4f:
            if (r1 == 0) goto L56
            int r1 = r1.intValue()
            goto L5e
        L56:
            VU.b r1 = r5.style
            if (r1 == 0) goto L5d
            int r1 = r1.f17160l
            goto L5e
        L5d:
            r1 = r2
        L5e:
            if (r0 == 0) goto L71
            VU.b r0 = r5.style
            if (r0 == 0) goto L6a
            int r0 = r0.f17163o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L6a:
            if (r3 == 0) goto L71
            int r2 = r3.intValue()
            goto L77
        L71:
            VU.b r0 = r5.style
            if (r0 == 0) goto L77
            int r2 = r0.f17161m
        L77:
            k(r5, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.button.Button.j():void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f178632k.d(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setEnabled(savedState.f178639c);
        setLoading(savedState.f178640d);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), isEnabled(), this.f178631j);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179002x);
        a(typedArrayObtainStyledAttributes, getContext());
        typedArrayObtainStyledAttributes.recycle();
        j();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setIconColor(@l ColorStateList colorStateList) {
        VU.b bVar = this.style;
        if (bVar != null) {
            setStyle(VU.b.a(bVar, null, null, null, null, colorStateList != null ? new C35763c0(colorStateList, true) : null, 0, 0, 0, 0, null, 262127));
        }
    }

    public final void setImageDrawable(@l Drawable drawable) {
        this.f178629h.setImageDrawable(drawable);
        setMode(Mode.f178635c);
        b();
    }

    public final void setImageResource(@InterfaceC42165v int resId) {
        Integer numValueOf = Integer.valueOf(resId);
        Drawable drawableA = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawableA = C43852a.a(getContext(), numValueOf.intValue());
        }
        setImageDrawable(drawableA);
    }

    public final void setLoading(boolean isLoading) {
        this.f178631j = isLoading;
        int i12 = isLoading ? 0 : 8;
        Spinner spinner = this.f178630i;
        spinner.setVisibility(i12);
        if (!isLoading) {
            spinner.onVisibilityAggregated(false);
        }
        this.f178625d.setVisibility(isLoading ? 4 : 0);
    }

    public final void setMode(@k Mode mode) {
        this.textView.setVisibility(mode == Mode.f178634b ? 0 : 8);
        i();
        this.f178629h.setVisibility(mode == Mode.f178635c ? 0 : 8);
    }

    public final void setStyle$_design_modules_components(@l VU.b bVar) {
        this.style = bVar;
    }

    public final void setSubtitle(@e0 int resId) {
        setSubtitle(getContext().getString(resId));
    }

    public void setText(@e0 int resId) {
        setText(getContext().getString(resId));
    }

    public void setTextColor(int color) {
        this.textView.setTextColor(color);
    }

    public /* synthetic */ Button(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.button : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k UU.a r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.button.Button.setState(UU.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0160  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k VU.b r11) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.button.Button.setStyle(VU.b):void");
    }

    public final void setSubtitle(@k CharSequence text) {
        this.f178628g.setText(text);
        setMode(Mode.f178634b);
    }

    public void setText(@k CharSequence text) {
        this.textView.setText(text);
        setMode(Mode.f178634b);
        j();
    }

    @j
    public Button(@k Context context, @l AttributeSet attributeSet, @InterfaceC42150f int i12, @f0 int i13) {
        super(context, attributeSet, i12, i13);
        this.f178632k = new com.avito.android.lib.design.button.c();
        LayoutInflater.from(context).inflate(R.layout.design_button_layout, (ViewGroup) this, true);
        this.f178625d = (ViewGroup) findViewById(R.id.container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.button_texts_container);
        this.f178626e = viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(R.id.text_view);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.textView = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.subtitle_text_view);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        this.f178628g = textView2;
        this.f178629h = (ImageView) findViewById(R.id.image_view);
        this.f178630i = (Spinner) findViewById(R.id.spinner);
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f179002x, i12, i13);
        CharSequence text = typedArrayObtainStyledAttributes.getText(8);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(9);
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(10);
        a(typedArrayObtainStyledAttributes, getContext());
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(z12);
        I5.a(textView, text, false);
        j();
        if (drawable2 != null || drawable3 != null) {
            g(this, drawable2, drawable3, false, null, 12);
        }
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }
}
