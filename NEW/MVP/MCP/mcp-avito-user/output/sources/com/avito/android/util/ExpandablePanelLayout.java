package com.avito.android.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.search.filter.RunnableC34589p;
import hw.InterfaceC41177b;
import j.InterfaceC42156l;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExpandablePanelLayout.kt */
@InterfaceC41177b
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0015\u0016\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/avito/android/util/ExpandablePanelLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "layoutListener", "Lkotlin/G0;", "setOnExpandListener", "(Lcom/avito/android/util/ExpandablePanelLayout$a;)V", "", "color", "setTextColor", "(I)V", "count", "setCollapsedLineCount", "(Ljava/lang/Integer;)V", "a", "SavedState", "b", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExpandablePanelLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f318584n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f318585b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f318586c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f318587d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f318588e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextView f318589f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f318590g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318591h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public CharSequence f318592i;

    /* renamed from: j, reason: collision with root package name */
    public int f318593j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public a f318594k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f318595l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318596m;

    /* compiled from: ExpandablePanelLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/ExpandablePanelLayout$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "b", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState implements Parcelable {

        @X41.f
        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public boolean f318597b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f318598c;

        /* compiled from: ExpandablePanelLayout.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/util/ExpandablePanelLayout$SavedState$a", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/util/ExpandablePanelLayout$SavedState;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        /* compiled from: ExpandablePanelLayout.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/util/ExpandablePanelLayout$SavedState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/util/ExpandablePanelLayout$SavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
            CREATOR = new a();
        }

        public SavedState(Parcel parcel, C42822w c42822w) {
            super(parcel);
            this.f318597b = J3.c(parcel);
            this.f318598c = J3.c(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            boolean z12 = this.f318597b;
            androidx.collection.o1<ClassLoader, androidx.collection.o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
            parcel.writeInt(z12 ? 1 : 0);
            parcel.writeInt(this.f318598c ? 1 : 0);
        }
    }

    /* compiled from: ExpandablePanelLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/ExpandablePanelLayout$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();

        void b(@Y61.l View view);

        void c();

        void d(@Y61.l View view);
    }

    public ExpandablePanelLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f318592i = "";
        this.f318593j = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406216f, 0, 0);
        Integer numA = C35804h1.a(typedArrayObtainStyledAttributes, 1);
        if (numA == null) {
            throw new IllegalArgumentException("handleId must be set");
        }
        this.f318585b = numA;
        Integer numA2 = C35804h1.a(typedArrayObtainStyledAttributes, 0);
        if (numA2 == null) {
            throw new IllegalArgumentException("contentId must be set");
        }
        this.f318586c = numA2;
        this.f318587d = C35804h1.a(typedArrayObtainStyledAttributes, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void b(ExpandablePanelLayout expandablePanelLayout, CharSequence charSequence) {
        TextView textView = expandablePanelLayout.f318590g;
        if (textView == null || kotlin.jvm.internal.L.f(charSequence, expandablePanelLayout.f318592i)) {
            return;
        }
        textView.setText(charSequence);
        if (charSequence == null) {
            charSequence = "";
        }
        expandablePanelLayout.f318592i = charSequence;
        textView.post(new RunnableC34589p(19, textView, expandablePanelLayout));
    }

    public final void a(boolean z12) {
        a aVar;
        TextView textView = this.f318590g;
        if (textView == null) {
            return;
        }
        this.f318591h = true;
        textView.setMaxLines(Integer.MAX_VALUE);
        if (this.f318596m) {
            textView.setText(this.f318592i);
        }
        if (!z12 || (aVar = this.f318594k) == null) {
            return;
        }
        aVar.d(this.f318589f);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        Integer num = this.f318585b;
        if (num != null && id2 == num.intValue()) {
            this.f318589f = (TextView) view;
            return;
        }
        Integer num2 = this.f318586c;
        if (num2 != null && id2 == num2.intValue()) {
            this.f318590g = (TextView) view;
            return;
        }
        Integer num3 = this.f318587d;
        if (num3 != null && id2 == num3.intValue()) {
            this.f318588e = view;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.k View view) {
        Integer num;
        TextView textView;
        int id2 = view.getId();
        Integer num2 = this.f318585b;
        if ((num2 != null && id2 == num2.intValue()) || ((num = this.f318586c) != null && id2 == num.intValue())) {
            if (!this.f318591h) {
                a(true);
                return;
            }
            if (!this.f318595l || (textView = this.f318590g) == null) {
                return;
            }
            this.f318591h = false;
            textView.setMaxLines(this.f318593j);
            a aVar = this.f318594k;
            if (aVar != null) {
                aVar.b(this.f318589f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() {
        /*
            r2 = this;
            super.onFinishInflate()
            android.widget.TextView r0 = r2.f318589f
            if (r0 == 0) goto La
            r0.setOnClickListener(r2)
        La:
            android.widget.TextView r0 = r2.f318590g
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            com.avito.android.util.ExpandablePanelLayout$c r1 = new com.avito.android.util.ExpandablePanelLayout$c
            r1.<init>()
            r0.setCustomSelectionActionModeCallback(r1)
        L17:
            android.widget.TextView r0 = r2.f318590g
            if (r0 == 0) goto L36
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L36
            int r0 = r0.width
            r1 = -2
            if (r0 != r1) goto L36
            android.widget.TextView r0 = r2.f318590g
            if (r0 == 0) goto L2f
            android.text.TextUtils$TruncateAt r0 = r0.getEllipsize()
            goto L30
        L2f:
            r0 = 0
        L30:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            if (r0 != r1) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            r2.f318596m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.ExpandablePanelLayout.onFinishInflate():void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.k Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z12 = savedState.f318597b;
        this.f318591h = z12;
        this.f318595l = savedState.f318598c;
        if (z12) {
            a(false);
        }
    }

    @Override // android.view.View
    @Y61.l
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f318597b = this.f318591h;
        savedState.f318598c = this.f318595l;
        return savedState;
    }

    public final void setCollapsedLineCount(@Y61.l Integer count) {
        if (count != null) {
            this.f318593j = count.intValue();
        }
    }

    public final void setOnExpandListener(@Y61.k a layoutListener) {
        this.f318594k = layoutListener;
    }

    public final void setTextColor(@InterfaceC42156l int color) {
        TextView textView = this.f318590g;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    /* compiled from: ExpandablePanelLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/ExpandablePanelLayout$b;", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class b implements a {
        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void a() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public void c() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void b(@Y61.l View view) {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public void d(@Y61.l View view) {
        }
    }

    /* compiled from: ExpandablePanelLayout.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/ExpandablePanelLayout$c", "Landroid/view/ActionMode$Callback;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ActionMode.Callback {
        public c() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(@Y61.l ActionMode actionMode, @Y61.l MenuItem menuItem) {
            a aVar;
            if (menuItem == null || menuItem.getItemId() != 16908321 || (aVar = ExpandablePanelLayout.this.f318594k) == null) {
                return false;
            }
            aVar.a();
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(@Y61.l ActionMode actionMode, @Y61.l Menu menu) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(@Y61.l ActionMode actionMode, @Y61.l Menu menu) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(@Y61.l ActionMode actionMode) {
        }
    }
}
