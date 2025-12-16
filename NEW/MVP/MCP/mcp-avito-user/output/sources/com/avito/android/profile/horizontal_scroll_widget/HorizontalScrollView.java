package com.avito.android.profile.horizontal_scroll_widget;

import Va0.C15660a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HorizontalScrollView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/avito/android/profile/horizontal_scroll_widget/HorizontalScrollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "Lcom/avito/android/profile/horizontal_scroll_widget/HorizontalScrollView$State;", VoiceInfo.STATE, "setState", "(Lcom/avito/android/profile/horizontal_scroll_widget/HorizontalScrollView$State;)V", "text", "setTextStub", "Lkotlin/Function0;", "listener", "setOnTitleClickListener", "(LY41/a;)V", "setBadgeText", "setActionButtonText", "setOnActionButtonClickListener", "State", "_avito_profile_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HorizontalScrollView extends ConstraintLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f222306l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f222307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f222308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222309d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f222310e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Badge f222311f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f222312g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f222313h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f222314i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f222315j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final View f222316k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HorizontalScrollView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/horizontal_scroll_widget/HorizontalScrollView$State;", "", "a", "_avito_profile_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f222317c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f222318d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f222319e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f222320f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f222321g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222322h;

        /* renamed from: b, reason: collision with root package name */
        public final int f222323b;

        /* compiled from: HorizontalScrollView.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/horizontal_scroll_widget/HorizontalScrollView$State$a;", "", "<init>", "()V", "_avito_profile_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            State state = new State("SCROLL", 0, 0);
            f222318d = state;
            State state2 = new State("LOAD", 1, 1);
            f222319e = state2;
            State state3 = new State("TEXT_STUB", 2, 1);
            f222320f = state3;
            State[] stateArr = {state, state2, state3};
            f222321g = stateArr;
            f222322h = c.a(stateArr);
            f222317c = new a(null);
        }

        public State(String str, int i12, int i13) {
            this.f222323b = i13;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f222321g.clone();
        }
    }

    /* compiled from: HorizontalScrollView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State.a aVar = State.f222317c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State.a aVar2 = State.f222317c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @j
    public HorizontalScrollView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void g() {
        D6.H(this.f222311f);
    }

    public final void setActionButtonText(@l String text) {
        this.f222314i.setText(text);
    }

    public final void setBadgeText(@l String text) {
        if (text == null) {
            text = "";
        }
        this.f222311f.setTitleText(text);
    }

    public final void setOnActionButtonClickListener(@l Y41.a<G0> listener) {
        LinearLayout linearLayout = this.f222313h;
        if (listener == null) {
            linearLayout.setOnClickListener(null);
        } else {
            linearLayout.setOnClickListener(new com.avito.android.profile.edit.adapter.c(2, listener));
        }
    }

    public final void setOnTitleClickListener(@l Y41.a<G0> listener) {
        TextView textView = this.f222310e;
        if (listener == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new com.avito.android.profile.edit.adapter.c(1, listener));
        }
    }

    public final void setState(@k State state) {
        int iOrdinal = state.ordinal();
        RecyclerView recyclerView = this.f222312g;
        TextView textView = this.f222315j;
        if (iOrdinal == 0) {
            D6.w(this.f222316k);
            D6.w(textView);
            D6.H(recyclerView);
        } else if (iOrdinal == 1) {
            D6.H(this.f222316k);
            D6.w(textView);
            D6.w(recyclerView);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            D6.w(this.f222316k);
            D6.H(textView);
            D6.w(recyclerView);
        }
    }

    public final void setTextStub(@l String text) {
        this.f222315j.setText(text);
    }

    public final void setTitle(@l String title) {
        this.f222310e.setText(title);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HorizontalScrollView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        Object next;
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i15 = (i14 & 4) != 0 ? R.attr.horizontalScrollView : i12;
        int i16 = (i14 & 8) != 0 ? R.style.HorizontalScroll : i13;
        super(context, attributeSet2, i15, i16);
        View.inflate(context, R.layout.view_horizontal_scroll, this);
        this.f222307b = new LinearLayoutManager(0, false);
        View viewFindViewById = findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f222310e = textView;
        View viewFindViewById2 = findViewById(R.id.badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        Badge badge = (Badge) viewFindViewById2;
        this.f222311f = badge;
        View viewFindViewById3 = findViewById(R.id.items_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f222312g = recyclerView;
        View viewFindViewById4 = findViewById(R.id.action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f222313h = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.flat_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f222314i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.loader_anchor);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById7;
        this.f222315j = textView2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C15660a.f.f17203a, i15, i16);
        D6.c(badge, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0)), null, null, null, 14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(9, 0);
        if (resourceId != 0) {
            badge.setAppearance(resourceId);
        }
        D6.c(recyclerView, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0)), null, null, 13);
        textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(24, 0));
        D6.c(textView, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(25, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, 0)), null, 8);
        CharSequence text = typedArrayObtainStyledAttributes.getText(15);
        setTextStub(text != null ? text.toString() : null);
        textView2.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(19, 0));
        textView2.setTextColor(typedArrayObtainStyledAttributes.getColor(20, 0));
        textView2.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(21, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0));
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, 0);
        if (resourceId2 != 0) {
            View viewInflate = LayoutInflater.from(context).inflate(resourceId2, viewGroup, false);
            this.f222316k = viewInflate;
            viewGroup.addView(viewInflate);
        }
        State.a aVar = State.f222317c;
        int i17 = typedArrayObtainStyledAttributes.getInt(14, 0);
        State.f222317c.getClass();
        Iterator it = ((AbstractC42738c) State.f222322h).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((State) next).f222323b == i17) {
                    break;
                }
            }
        }
        State state = (State) next;
        setState(state == null ? State.f222318d : state);
        int i18 = typedArrayObtainStyledAttributes.getBoolean(7, true) ? 0 : 8;
        TextView textView3 = this.f222314i;
        textView3.setVisibility(i18);
        textView3.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(3, 0));
        textView3.setTextColor(typedArrayObtainStyledAttributes.getColor(2, 0));
        D6.D(textView3, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        D6.f(this.f222314i, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        D6.f(this.f222314i, 0, dimensionPixelSize2, 0, dimensionPixelSize2, 5);
        D6.c(this.f222313h, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0)), null, null, 13);
        D6.c(this.f222314i, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0)), null, null, 13);
        this.f222308c = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.f222309d = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f222312g.setLayoutManager(this.f222307b);
        int i19 = this.f222308c;
        this.f222312g.l(new com.avito.android.profile.horizontal_scroll_widget.a(i19, i19, this.f222309d), -1);
        this.f222312g.setItemAnimator(null);
        this.f222312g.setOverScrollMode(2);
    }
}
