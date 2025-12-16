package com.avito.android.lib.design.radio;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.a;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.D;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.U;
import j.f0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroup.kt */
@s0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0007ABCDEFGB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010(\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\u001aJ\u0017\u0010)\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020\u0011¢\u0006\u0004\b)\u0010\u001aR\u001a\u0010/\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.R*\u00108\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010.\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006H"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "listener", "setOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "", "getCheckedRadioButtonId", "()I", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "resId", "setTitleStyle", "(I)V", "bottom", "setTitleBottomMargin", "", "getTitle", "()Ljava/lang/String;", "subtitle", "setSubtitle", "getSubtitle", "hint", "setHint", "(Ljava/lang/String;)V", "getHint", "color", "setHintColorRes", "setHintColor", "Lcom/avito/android/lib/design/radio/a$a;", "i", "Lcom/avito/android/lib/design/radio/a$a;", "getDeprecatedChildOnCheckedChangeListener$annotations", "()V", "deprecatedChildOnCheckedChangeListener", "Lcom/avito/android/lib/design/radio/RadioGroup$d;", "m", "Lcom/avito/android/lib/design/radio/RadioGroup$d;", "getDeprecatedOnCheckedChangeListener", "()Lcom/avito/android/lib/design/radio/RadioGroup$d;", "setDeprecatedOnCheckedChangeListener", "(Lcom/avito/android/lib/design/radio/RadioGroup$d;)V", "getDeprecatedOnCheckedChangeListener$annotations", "deprecatedOnCheckedChangeListener", "Lcom/avito/android/lib/design/radio/RadioGroup$e;", "n", "Lcom/avito/android/lib/design/radio/RadioGroup$e;", "getOnCheckedChangeListener", "()Lcom/avito/android/lib/design/radio/RadioGroup$e;", "setOnCheckedChangeListener", "(Lcom/avito/android/lib/design/radio/RadioGroup$e;)V", "onCheckedChangeListener", "a", "b", "c", "d", "e", "f", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RadioGroup extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f180130b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f180131c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f180132d;

    /* renamed from: e, reason: collision with root package name */
    @D
    public int f180133e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180134f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final HashMap<Integer, View> f180135g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final f f180136h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public final a.InterfaceC5292a deprecatedChildOnCheckedChangeListener;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ListItemCompoundButton.a f180138j;

    /* renamed from: k, reason: collision with root package name */
    @U
    public final int f180139k;

    /* renamed from: l, reason: collision with root package name */
    @U
    public final int f180140l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    public d deprecatedOnCheckedChangeListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    public e onCheckedChangeListener;

    /* compiled from: RadioGroup.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f180143b;

        /* renamed from: c, reason: collision with root package name */
        public int f180144c;

        /* compiled from: RadioGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i12, int i13, C42822w c42822w) {
            this(parcelable, (i13 & 2) != 0 ? -1 : i12);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f180143b, i12);
            parcel.writeInt(this.f180144c);
        }

        public SavedState(@k Parcelable parcelable, int i12) {
            super(parcelable);
            this.f180143b = parcelable;
            this.f180144c = i12;
        }
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$a;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements ListItemCompoundButton.a {
        public a() {
        }

        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            RadioGroup radioGroup = RadioGroup.this;
            if (radioGroup.f180134f) {
                return;
            }
            radioGroup.f180134f = true;
            int i12 = radioGroup.f180133e;
            if (i12 != -1) {
                radioGroup.d(i12, false);
            }
            radioGroup.f180134f = false;
            radioGroup.c(listItemCompoundButton.getId());
        }
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$b;", "", "<init>", "()V", "", "DEPRECATION_MESSAGE", "Ljava/lang/String;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$c;", "Lcom/avito/android/lib/design/radio/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public final class c implements a.InterfaceC5292a {
        public c() {
        }

        @Override // com.avito.android.lib.design.radio.a.InterfaceC5292a
        public final void b(@k RadioButton radioButton) {
            RadioGroup radioGroup = RadioGroup.this;
            if (radioGroup.f180134f) {
                return;
            }
            radioGroup.f180134f = true;
            int i12 = radioGroup.f180133e;
            if (i12 != -1) {
                radioGroup.d(i12, false);
            }
            radioGroup.f180134f = false;
            radioGroup.c(radioButton.getId());
        }
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public interface d {
        void b(@k RadioButton radioButton);
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        void a(@k ListItemRadio listItemRadio);
    }

    /* compiled from: RadioGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup$f;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @l
        public ViewGroup.OnHierarchyChangeListener f180147b;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(@k View view, @k View view2) {
            RadioGroup radioGroup = RadioGroup.this;
            if (view.equals(radioGroup) && (view2 instanceof Checkable)) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    id2 = View.generateViewId();
                    view2.setId(id2);
                }
                if (view2 instanceof com.avito.android.lib.design.radio.a) {
                    ((com.avito.android.lib.design.radio.a) view2).f(radioGroup.deprecatedChildOnCheckedChangeListener);
                } else if (view2 instanceof ListItemCompoundButton) {
                    ((ListItemCompoundButton) view2).e(radioGroup.f180138j);
                }
                radioGroup.f180135g.put(Integer.valueOf(id2), view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f180147b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(@k View view, @k View view2) {
            RadioGroup radioGroup = RadioGroup.this;
            if (view == radioGroup && (view2 instanceof Checkable)) {
                if (view2 instanceof com.avito.android.lib.design.radio.a) {
                    ((com.avito.android.lib.design.radio.a) view2).h(radioGroup.deprecatedChildOnCheckedChangeListener);
                } else if (view2 instanceof ListItemCompoundButton) {
                    ((ListItemCompoundButton) view2).j(radioGroup.f180138j);
                }
            }
            radioGroup.f180135g.remove(Integer.valueOf(view2.getId()));
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f180147b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ RadioGroup(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public final void a(@D int i12) {
        if (i12 == -1 || i12 != this.f180133e) {
            int i13 = this.f180133e;
            if (i13 != -1) {
                d(i13, false);
            }
            if (i12 != -1) {
                d(i12, true);
            }
            c(i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        if (view == 0) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }
        if (view instanceof Checkable) {
            if (((Checkable) view).isChecked()) {
                this.f180134f = true;
                int i13 = this.f180133e;
                if (i13 != -1) {
                    d(i13, false);
                }
                this.f180134f = false;
                c(view.getId());
            }
            view.setPaddingRelative(this.f180139k, view.getPaddingTop(), this.f180140l, view.getPaddingBottom());
        }
        super.addView(view, i12, layoutParams);
    }

    public final void b() {
        Iterator it = C42745f0.M0(this.f180135g.values()).iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
    }

    public final void c(@D int i12) {
        e eVar;
        this.f180133e = i12;
        View view = this.f180135g.get(Integer.valueOf(i12));
        if (view != null) {
            if (view instanceof RadioButton) {
                d dVar = this.deprecatedOnCheckedChangeListener;
                if (dVar != null) {
                    dVar.b((RadioButton) view);
                    return;
                }
                return;
            }
            if (!(view instanceof ListItemRadio) || (eVar = this.onCheckedChangeListener) == null) {
                return;
            }
            eVar.a((ListItemRadio) view);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i12, boolean z12) {
        HashMap<Integer, View> map = this.f180135g;
        KeyEvent.Callback callbackFindViewById = (View) map.get(Integer.valueOf(i12));
        if (callbackFindViewById == null && (callbackFindViewById = findViewById(i12)) != null) {
            map.put(Integer.valueOf(i12), callbackFindViewById);
        }
        if (callbackFindViewById == null || !(callbackFindViewById instanceof Checkable)) {
            return;
        }
        ((Checkable) callbackFindViewById).setChecked(z12);
    }

    @D
    /* renamed from: getCheckedRadioButtonId, reason: from getter */
    public final int getF180133e() {
        return this.f180133e;
    }

    @l
    public final d getDeprecatedOnCheckedChangeListener() {
        return this.deprecatedOnCheckedChangeListener;
    }

    @k
    public final String getHint() {
        return this.f180132d.getText().toString();
    }

    @l
    public final e getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @k
    public final String getSubtitle() {
        return this.f180131c.getText().toString();
    }

    @k
    public final String getTitle() {
        return this.f180130b.getText().toString();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i12 = this.f180133e;
        if (i12 != -1) {
            this.f180134f = true;
            d(i12, true);
            this.f180134f = false;
            c(this.f180133e);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@l MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f180133e = savedState.f180144c;
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState(), 0, 2, null);
        savedState.f180144c = this.f180133e;
        return savedState;
    }

    public final void setDeprecatedOnCheckedChangeListener(@l d dVar) {
        this.deprecatedOnCheckedChangeListener = dVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<Map.Entry<Integer, View>> it = this.f180135g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setEnabled(enabled);
        }
    }

    public final void setHint(@l String hint) {
        I5.a(this.f180132d, hint, false);
    }

    public final void setHintColor(@InterfaceC42156l int color) {
        this.f180132d.setTextColor(color);
    }

    public final void setHintColorRes(@InterfaceC42158n int color) {
        setHintColor(androidx.core.content.d.getColor(getContext(), color));
    }

    public final void setOnCheckedChangeListener(@l e eVar) {
        this.onCheckedChangeListener = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(@k ViewGroup.OnHierarchyChangeListener listener) {
        this.f180136h.f180147b = listener;
    }

    @Override // android.view.View
    public final void setPadding(int i12, int i13, int i14, int i15) {
        super.setPadding(0, i13, 0, i15);
        TextView textView = this.f180130b;
        if (textView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i14;
        }
        TextView textView2 = this.f180131c;
        if (textView2 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = i12;
            layoutParams2.rightMargin = i14;
        }
        TextView textView3 = this.f180132d;
        if (textView3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
            layoutParams3.leftMargin = i12;
            layoutParams3.rightMargin = i14;
        }
    }

    public final void setSubtitle(@l CharSequence subtitle) {
        I5.a(this.f180131c, subtitle, false);
    }

    public final void setTitle(@l CharSequence title) {
        I5.a(this.f180130b, title, false);
    }

    public final void setTitleBottomMargin(@InterfaceC42161q int bottom) {
        D6.c(this.f180130b, null, null, null, Integer.valueOf(getResources().getDimensionPixelSize(bottom)), 7);
    }

    public final void setTitleStyle(@f0 int resId) {
        this.f180130b.setTextAppearance(resId);
    }

    @j
    public RadioGroup(@k Context context, @l AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f180133e = -1;
        this.f180135g = new HashMap<>();
        f fVar = new f();
        this.f180136h = fVar;
        this.deprecatedChildOnCheckedChangeListener = new c();
        this.f180138j = new a();
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.design_radio_group_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f180130b = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.f180131c = textView2;
        TextView textView3 = (TextView) findViewById(R.id.hint);
        this.f180132d = textView3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178919F);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.design_radio_group_default_child_horizontal_padding);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(1, -1);
        if (layoutDimension > 0) {
            this.f180139k = layoutDimension;
            this.f180140l = layoutDimension;
            setPadding(0, layoutDimension, 0, layoutDimension);
        } else {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f180139k = dimensionPixelSize == 0 ? typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelOffset) : dimensionPixelSize;
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f180140l = dimensionPixelSize2 == 0 ? typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelOffset) : dimensionPixelSize2;
            setPadding(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0), 0, typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0));
        }
        CharSequence text = typedArrayObtainStyledAttributes.getText(11);
        String string = text != null ? text.toString() : null;
        int i12 = this.f180139k;
        int i13 = this.f180140l;
        I5.a(textView, string, false);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(10);
        String string2 = text2 != null ? text2.toString() : null;
        int i14 = this.f180139k;
        int i15 = this.f180140l;
        I5.a(textView2, string2, false);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
        layoutParams2.leftMargin = i14;
        layoutParams2.rightMargin = i15;
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(9);
        String string3 = text3 != null ? text3.toString() : null;
        int i16 = this.f180139k;
        int i17 = this.f180140l;
        I5.a(textView3, string3, false);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
        layoutParams3.leftMargin = i16;
        layoutParams3.rightMargin = i17;
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        super.setOnHierarchyChangeListener(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @k
    public final LinearLayout.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @InterfaceC42830m
    private static /* synthetic */ void getDeprecatedChildOnCheckedChangeListener$annotations() {
    }

    @InterfaceC42830m
    public static /* synthetic */ void getDeprecatedOnCheckedChangeListener$annotations() {
    }
}
