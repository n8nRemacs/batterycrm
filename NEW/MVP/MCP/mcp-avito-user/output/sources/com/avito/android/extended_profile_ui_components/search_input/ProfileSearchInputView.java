package com.avito.android.extended_profile_ui_components.search_input;

import Gp0.C13906a;
import L91.q;
import X41.j;
import Y61.k;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C22767g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.widget.C37750f0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: ProfileSearchInputView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002'(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u000eR6\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/ProfileSearchInputView;", "Landroid/widget/FrameLayout;", "", "text", "Lkotlin/G0;", "setQuery", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "hint", "setHint", "", "isEnabled", "setInputEnabled", "(Z)V", "", "drawableRes", "setNavigationIcon", "(I)V", "setSuggestsEnabled", "enabled", "setShareEnabled", "setFilterEnabled", "isVisible", "setInputVisible", "getInputViewId", "()I", "getSelectionPosition", "getLastCharPosition", "visible", "setSuggestionsVisible", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "C", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "a", "SavedState", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileSearchInputView extends FrameLayout {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f153380D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f153381A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Boolean> f153382B;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @l
    public RecyclerView.Adapter<?> adapter;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f153384b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f153385c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f153386d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f153387e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f153388f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153389g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Input f153390h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final View f153391i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final View f153392j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f153393k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ViewGroup f153394l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final View f153395m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ViewGroup f153396n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ImageView f153397o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final View f153398p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final View f153399q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Integer> f153400r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f153401s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f153402t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f153403u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f153404v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public Integer f153405w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f153406x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public Integer f153407y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f153408z;

    /* compiled from: ProfileSearchInputView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/ProfileSearchInputView$SavedState;", "Landroid/view/View$BaseSavedState;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153409b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f153410c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f153411d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Parcelable f153412e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f153413f;

        /* compiled from: ProfileSearchInputView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, @l Integer num, boolean z13, @k Parcelable parcelable, boolean z14) {
            super(parcelable);
            this.f153409b = z12;
            this.f153410c = num;
            this.f153411d = z13;
            this.f153412e = parcelable;
            this.f153413f = z14;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f153409b ? 1 : 0);
            Integer num = this.f153410c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.f153411d ? 1 : 0);
            parcel.writeParcelable(this.f153412e, i12);
            parcel.writeInt(this.f153413f ? 1 : 0);
        }
    }

    /* compiled from: ProfileSearchInputView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/ProfileSearchInputView$a;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f153414a;

        /* renamed from: b, reason: collision with root package name */
        public final int f153415b;

        public a(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
            this.f153414a = i12;
            this.f153415b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f153414a == aVar.f153414a && this.f153415b == aVar.f153415b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f153415b) + (Integer.hashCode(this.f153414a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MutableSearchViewConfig(searchIconTintEmpty=");
            sb2.append(this.f153414a);
            sb2.append(", searchIconTintFilled=");
            return r.t(sb2, this.f153415b, ')');
        }
    }

    @j
    public ProfileSearchInputView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    private final int getInputViewId() {
        return R.id.input_view;
    }

    private final int getLastCharPosition() {
        String string;
        Editable editableM53getText = this.f153390h.m53getText();
        if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
            return 0;
        }
        return string.length();
    }

    private final int getSelectionPosition() {
        Integer num = this.f153407y;
        int iIntValue = num != null ? num.intValue() : getLastCharPosition();
        return iIntValue <= String.valueOf(this.f153390h.m53getText()).length() ? iIntValue : getLastCharPosition();
    }

    private final void setSuggestionsVisible(boolean visible) {
        D6.G(this.f153387e, visible);
        D6.G(this.f153386d, !visible);
    }

    public final void b() {
        if (this.f153406x) {
            this.f153382B.accept(Boolean.FALSE);
            this.f153406x = false;
            D6.w(this.f153393k);
            if (this.f153405w != null) {
                D6.G(this.f153397o, true);
            }
            i();
            d();
            D6.w(this.f153388f);
            setSuggestionsVisible(false);
            K2.d(this, true);
            e();
        }
    }

    public final void c() {
        this.f153382B.accept(Boolean.TRUE);
        this.f153406x = true;
        Input input = this.f153390h;
        D6.H(input);
        View view = this.f153395m;
        D6.w(view);
        ViewGroup viewGroup = this.f153394l;
        D6.w(viewGroup);
        D6.G(this.f153393k, true);
        ImageView imageView = this.f153397o;
        D6.w(imageView);
        input.setSelection(getSelectionPosition());
        imageView.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 0));
        if (!D6.y(this.f153387e)) {
            setSuggestionsVisible(this.f153389g);
        }
        D6.G(this.f153388f, this.f153389g);
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179289f);
        Editable editableM53getText = input.m53getText();
        if (editableM53getText == null || editableM53getText.length() == 0) {
            D6.w(view);
            D6.w(viewGroup);
            f();
        }
        input.v();
        f();
    }

    public final void d() {
        Integer num = this.f153405w;
        ImageView imageView = this.f153397o;
        if (num == null) {
            D6.w(imageView);
            imageView.setOnClickListener(new q(5));
        } else {
            D6.G(imageView, true);
            imageView.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 2));
        }
    }

    public final void e() {
        View view = this.f153395m;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44217u = -1;
        bVar.f44216t = -1;
        view.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f44218v = -1;
        bVar2.f44219w = -1;
        view.setLayoutParams(bVar2);
        boolean z12 = this.f153381A;
        if (this.f153406x) {
            return;
        }
        D6.H(view);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        ViewGroup viewGroup = this.f153396n;
        if (z12) {
            bVar3.f44216t = viewGroup.getId();
        } else {
            bVar3.f44219w = viewGroup.getId();
        }
        view.setLayoutParams(bVar3);
    }

    public final void f() {
        if (D6.y(this.f153394l)) {
            D6.c(this.f153390h, null, null, Integer.valueOf(y6.b(6)), null, 11);
            D6.f(this.f153394l, 0, 0, y6.b(10), 0, 11);
            return;
        }
        D6.c(this.f153390h, null, null, Integer.valueOf(y6.b(12)), null, 11);
        D6.f(this.f153394l, 0, 0, y6.b(0), 0, 11);
    }

    @k
    public final B0 g() {
        return C37750f0.b(this.f153390h.f179340l).d0(new c(this));
    }

    @l
    public final RecyclerView.Adapter<?> getAdapter() {
        return this.adapter;
    }

    @k
    public final String getQuery() {
        return String.valueOf(this.f153390h.m53getText());
    }

    @k
    public final B0 h() {
        return n.e(this.f153390h).K(new d(this)).d0(e.f153421b);
    }

    public final void i() {
        this.f153394l.setVisibility(this.f153408z ? 0 : 8);
        f();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        boolean z12 = savedState.f153409b;
        this.f153406x = z12;
        this.f153407y = savedState.f153410c;
        this.f153408z = savedState.f153411d;
        if (z12) {
            post(new com.avito.android.app.coldstart.d(this, 22));
        }
        this.f153381A = savedState.f153413f;
        e();
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.f153406x, this.f153407y, this.f153408z, super.onSaveInstanceState(), this.f153381A);
    }

    public final void setAdapter(@l RecyclerView.Adapter<?> adapter) {
        this.adapter = adapter;
        RecyclerView recyclerView = this.f153387e;
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(null);
    }

    public final void setFilterEnabled(boolean enabled) {
        this.f153381A = !enabled;
        if (this.f153406x) {
            return;
        }
        e();
        f();
    }

    public final void setHint(@k String hint) {
        this.f153390h.setHint(hint);
    }

    public final void setInputEnabled(boolean isEnabled) {
        Input input = this.f153390h;
        if (isEnabled) {
            input.setComponentType(ComponentType.f179283d);
        } else {
            input.setComponentType(ComponentType.f179284e);
        }
    }

    public final void setInputVisible(boolean isVisible) {
        D6.G(this.f153396n, isVisible);
        D6.G(this.f153390h, isVisible);
    }

    public final void setNavigationIcon(@InterfaceC42165v int drawableRes) {
        this.f153405w = Integer.valueOf(drawableRes);
        this.f153397o.setImageResource(drawableRes);
    }

    public final void setQuery(@k String text) {
        Input.t(this.f153390h, text, false, 6);
    }

    public final void setShareEnabled(boolean enabled) {
        this.f153408z = enabled;
        if (this.f153406x) {
            return;
        }
        i();
    }

    public final void setSuggestsEnabled(boolean isEnabled) {
        this.f153389g = isEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileSearchInputView(Context context, AttributeSet attributeSet, int i12, a aVar, int i13, C42822w c42822w) {
        AttributeSet attributeSet2 = (i13 & 2) != 0 ? null : attributeSet;
        int i14 = (i13 & 4) != 0 ? 0 : i12;
        a aVar2 = (i13 & 8) != 0 ? new a(C35835l0.d(R.attr.gray36, context), C35835l0.d(R.attr.black, context)) : aVar;
        super(context, attributeSet2, i14);
        this.f153384b = aVar2;
        this.f153400r = new com.jakewharton.rxrelay3.c<>();
        this.f153401s = new com.jakewharton.rxrelay3.c<>();
        this.f153402t = new com.jakewharton.rxrelay3.c<>();
        this.f153403u = new com.jakewharton.rxrelay3.c<>();
        this.f153404v = new com.jakewharton.rxrelay3.c<>();
        this.f153381A = true;
        this.f153382B = new com.jakewharton.rxrelay3.c<>();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C13906a.g.f6746a, i14, 0);
        layoutInflaterFrom.inflate(R.layout.profile_search_input, this);
        View viewFindViewById = findViewById(R.id.toolbar_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153385c = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.toolbar_bottom_offset);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153386d = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.suggests_recycler_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f153387e = recyclerView;
        View viewFindViewById4 = findViewById(R.id.input_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        input.setId(getInputViewId());
        this.f153390h = input;
        View viewFindViewById5 = findViewById(R.id.shadow);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153388f = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.clear_button);
        this.f153391i = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.dismiss_text_view);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        this.f153393k = textView;
        View viewFindViewById8 = findViewById(R.id.share_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById8).setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 3));
        View viewFindViewById9 = findViewById(R.id.share_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById9;
        viewGroup.setClipToPadding(false);
        this.f153394l = viewGroup;
        View viewFindViewById10 = findViewById(R.id.filter_button_view);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153395m = viewFindViewById10;
        View viewFindViewById11 = viewFindViewById10.findViewById(R.id.clarify_placeholder_view);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        View viewFindViewById12 = findViewById(R.id.design_input_left_container);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153398p = viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.right_barrier);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153399q = viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.icons_container_view);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById14;
        this.f153396n = viewGroup2;
        viewGroup2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 10));
        View viewFindViewById15 = findViewById(R.id.container);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        Drawable drawableH = C35835l0.h(R.attr.ic_search20, viewFindViewById12.getContext());
        int intrinsicWidth = drawableH != null ? drawableH.getIntrinsicWidth() : y6.b(24);
        input.m(input.f179336h, y6.b(52));
        View viewFindViewById16 = findViewById(R.id.design_input_right_container);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.f(viewFindViewById16, 0, y6.b(5), y6.b(6) + viewFindViewById16.getPaddingRight(), y6.b(5), 1);
        input.k(y6.b(22) + intrinsicWidth, input.f179335g);
        D6.f(viewFindViewById12, y6.b(16), 0, y6.b(6), 0, 10);
        viewFindViewById10.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 4));
        textView.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 5));
        input.setLeftIcon(C35835l0.h(R.attr.ic_search20, input.getContext()));
        D6.f(input.findViewById(R.id.design_input_left_icon), 0, y6.b(8), 0, 0, 13);
        input.setLeftIconColor(aVar2.f153414a);
        Input.j(input, y6.a(14.5f), 0, 14);
        Input.e(input, y6.a(14.5f), 0, 0, 0, 0, 30);
        this.f153392j = findViewById(R.id.filters_badge_counter_view);
        View viewFindViewById17 = findViewById(R.id.toolbar_up_button_view);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f153397o = (ImageView) viewFindViewById17;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 6));
        }
        setSuggestionsVisible(false);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.o(new b(this));
        viewFindViewById5.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 7));
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 8));
        input.setOnClickListener(new com.avito.android.extended_profile_ui_components.search_input.a(this, 1));
        input.f();
        textView.setBackground(new RippleDrawable(ColorStateList.valueOf(C22767g.i(C35835l0.d(R.attr.warmGray100, textView.getContext()), 21)), null, C43852a.a(getRootView().getContext(), R.drawable.rect_mask_radius_3)));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C35835l0.d(R.attr.warmGray12, textView.getContext()));
        float[] fArr = new float[8];
        for (int i15 = 0; i15 < 8; i15++) {
            fArr[i15] = y6.b(18);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.black, getRootView().getContext()));
        viewFindViewById10.setBackground(new RippleDrawable(colorStateListValueOf, null, shapeDrawable));
        String string = typedArrayObtainStyledAttributes.getString(2);
        setHint(string == null ? "" : string);
        typedArrayObtainStyledAttributes.recycle();
        i();
        this.f153387e.l(new f(context), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClientProvidedNavigation$lambda$17(View view) {
    }
}
