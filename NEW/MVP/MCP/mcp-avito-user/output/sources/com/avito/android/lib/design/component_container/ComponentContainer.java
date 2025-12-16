package com.avito.android.lib.design.component_container;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import j.e0;
import j.f0;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: ComponentContainer.kt */
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001:\u000b9:;<=>?@ABCB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010#\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010\fJ\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\n2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0004\b,\u0010\u0017J#\u0010.\u001a\u00020\n2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0004\b.\u0010\u0014J&\u00102\u001a\u00020\n2\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b0¢\u0006\u0004\b2\u0010\u0014J\u0017\u00103\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u001aJ\u0017\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b3\u0010\u001dJ\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0011¢\u0006\u0004\b6\u0010\u001aJ\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u001a¨\u0006D"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", "getState", "()Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", "Lkotlin/Function1;", "", "listener", "setComponentsResetListener", "(LY41/l;)V", "Lkotlin/Function0;", "setContainerResetListener", "(LY41/a;)V", "titleRes", "setTitle", "(I)V", "", "title", "(Ljava/lang/CharSequence;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setTitleStyle", "top", "setContentContainerTopPadding", "subtitleRes", "setSubtitle", "subtitle", "isBelowInput", "setMessagePosition", "Landroid/text/method/MovementMethod;", "movement", "setSubtitleMovementMethod", "(Landroid/text/method/MovementMethod;)V", "clickListener", "setTitleTipListener", "Landroid/view/View;", "setTitleTipViewListener", "Landroid/widget/TextView;", "Lkotlin/w;", "block", "setTitleTipText", "setMessage", "message", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "setTitlePaddingBottom", "orientation", "setOrientation", "a", "b", "c", "d", "Condition", "e", "f", "g", "h", "SavedState", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class ComponentContainer extends ConstraintLayout {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Class<Context>[] f178840r;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public TextView f178841b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TextView f178842c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ImageView f178843d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public TextView f178844e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextView f178845f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public LinearLayout f178846g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public Condition f178847h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public CharSequence f178848i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ThreadLocal<Map<String, Constructor<com.avito.android.lib.design.component_container.a<View>>>> f178849j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f178850k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f178851l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public State f178852m;

    /* renamed from: n, reason: collision with root package name */
    public int f178853n;

    /* renamed from: o, reason: collision with root package name */
    public int f178854o;

    /* renamed from: p, reason: collision with root package name */
    public int f178855p;

    /* renamed from: q, reason: collision with root package name */
    public int f178856q;

    /* compiled from: ComponentContainer.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final State f178861b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Condition f178862c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final CharSequence f178863d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final int[] f178864e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Parcelable f178865f;

        /* compiled from: ComponentContainer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(State.valueOf(parcel.readString()), Condition.valueOf(parcel.readString()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.createIntArray(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@Y61.k State state, @Y61.k Condition condition, @Y61.l CharSequence charSequence, @Y61.k int[] iArr, @Y61.l Parcelable parcelable) {
            super(parcelable);
            this.f178861b = state;
            this.f178862c = condition;
            this.f178863d = charSequence;
            this.f178864e = iArr;
            this.f178865f = parcelable;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f178861b.name());
            parcel.writeString(this.f178862c.name());
            TextUtils.writeToParcel(this.f178863d, parcel, i12);
            parcel.writeIntArray(this.f178864e);
            parcel.writeParcelable(this.f178865f, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComponentContainer.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        public static final State f178866c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f178867d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f178868e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f178869f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178870g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f178871b;

        static {
            State state = new State("NORMAL", 0, null);
            f178866c = state;
            State state2 = new State("WARNING", 1, Integer.valueOf(R.attr.state_warning));
            f178867d = state2;
            State state3 = new State("ERROR", 2, Integer.valueOf(R.attr.state_error));
            f178868e = state3;
            State[] stateArr = {state, state2, state3};
            f178869f = stateArr;
            f178870g = kotlin.enums.c.a(stateArr);
        }

        public State(String str, int i12, Integer num) {
            this.f178871b = num != null ? new int[]{num.intValue()} : new int[0];
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f178869f.clone();
        }
    }

    /* compiled from: ComponentContainer.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$a;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements h {
        public a() {
            throw null;
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$b;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements h {
        public b() {
            throw null;
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@Y61.l com.avito.android.lib.design.component_container.a<View> aVar);

        @Y61.l
        com.avito.android.lib.design.component_container.a<View> getBehavior();
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$d;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Landroid/content/Context;", "CONSTRUCTOR_PARAMS", "[Ljava/lang/Class;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$e;", "Landroid/widget/LinearLayout$LayoutParams;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends LinearLayout.LayoutParams implements c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public String f178872b;

        /* renamed from: c, reason: collision with root package name */
        public int f178873c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public com.avito.android.lib.design.component_container.a<View> f178874d;

        @Override // com.avito.android.lib.design.component_container.ComponentContainer.c
        public final void a(@Y61.l com.avito.android.lib.design.component_container.a<View> aVar) {
            this.f178874d = aVar;
        }

        @Override // com.avito.android.lib.design.component_container.ComponentContainer.c
        @Y61.l
        public final com.avito.android.lib.design.component_container.a<View> getBehavior() {
            return this.f178874d;
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$f;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends ConstraintLayout.b implements c {

        /* renamed from: s0, reason: collision with root package name */
        @Y61.l
        public String f178875s0;

        /* renamed from: t0, reason: collision with root package name */
        public int f178876t0;

        /* renamed from: u0, reason: collision with root package name */
        @Y61.l
        public com.avito.android.lib.design.component_container.a<View> f178877u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f178878v0;

        @Override // com.avito.android.lib.design.component_container.ComponentContainer.c
        public final void a(@Y61.l com.avito.android.lib.design.component_container.a<View> aVar) {
            this.f178877u0 = aVar;
        }

        @Override // com.avito.android.lib.design.component_container.ComponentContainer.c
        @Y61.l
        public final com.avito.android.lib.design.component_container.a<View> getBehavior() {
            return this.f178877u0;
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$g;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g implements h {
        public g() {
            throw null;
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$h;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h {
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.l<View, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int[] f178879l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int[] iArr) {
            super(1);
            this.f178879l = iArr;
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            return Boolean.valueOf(C42756l.g(view.getId(), this.f178879l));
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.l<View, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f178880l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() != -1);
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.l<View, Boolean> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a(view);
            return Boolean.valueOf((aVarA != null ? aVarA.getState() : null) == ComponentContainer.this.f178852m);
        }
    }

    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends N implements Y41.l<View, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f178882l = new l();

        public l() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(View view) {
            return Integer.valueOf(view.getId());
        }
    }

    static {
        new d(null);
        f178840r = new Class[]{Context.class};
    }

    public ComponentContainer(@Y61.k ContextWrapper contextWrapper) {
        super(contextWrapper);
        this.f178847h = Condition.f178857b;
        this.f178849j = new ThreadLocal<>();
        this.f178852m = State.f178866c;
        j(this, null);
    }

    public static void j(ComponentContainer componentContainer, AttributeSet attributeSet) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TypedArray typedArrayObtainStyledAttributes = componentContainer.getContext().obtainStyledAttributes(attributeSet, d.n.f178982n, R.attr.componentContainer, R.style.Design_Widget_ComponentContainer);
        LayoutInflater.from(componentContainer.getContext()).inflate(typedArrayObtainStyledAttributes.getResourceId(5, 0), (ViewGroup) componentContainer, true);
        if (typedArrayObtainStyledAttributes.hasValue(17) && (textView6 = componentContainer.f178841b) != null) {
            textView6.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(17, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(12) && (textView5 = componentContainer.f178842c) != null) {
            textView5.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(12, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(7) && (textView4 = componentContainer.f178845f) != null) {
            textView4.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18) && (textView3 = componentContainer.f178841b) != null) {
            textView3.setTextColor(x.a(typedArrayObtainStyledAttributes, componentContainer.getContext(), 18));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13) && (textView2 = componentContainer.f178842c) != null) {
            textView2.setTextColor(x.a(typedArrayObtainStyledAttributes, componentContainer.getContext(), 13));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && (textView = componentContainer.f178845f) != null) {
            textView.setTextColor(x.a(typedArrayObtainStyledAttributes, componentContainer.getContext(), 8));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            LinearLayout linearLayout = componentContainer.f178846g;
            if (linearLayout != null) {
                linearLayout.setShowDividers(2);
            }
            LinearLayout linearLayout2 = componentContainer.f178846g;
            if (linearLayout2 != null) {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                ShapeDrawable shapeDrawable = new ShapeDrawable();
                shapeDrawable.setIntrinsicHeight(dimensionPixelSize);
                shapeDrawable.setIntrinsicWidth(dimensionPixelSize);
                shapeDrawable.getPaint().setColor(0);
                linearLayout2.setDividerDrawable(shapeDrawable);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            componentContainer.f178853n = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            componentContainer.f178854o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
            componentContainer.f178856q = dimensionPixelSize2;
            TextView textView7 = componentContainer.f178845f;
            if (textView7 != null) {
                D6.f(textView7, 0, 0, 0, dimensionPixelSize2, 7);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            componentContainer.f178855p = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
            TextView textView8 = componentContainer.f178841b;
            if (textView8 != null) {
                D6.f(textView8, dimensionPixelSize3, 0, 0, 0, 14);
            }
            TextView textView9 = componentContainer.f178842c;
            if (textView9 != null) {
                D6.f(textView9, dimensionPixelSize3, 0, 0, 0, 14);
            }
            TextView textView10 = componentContainer.f178845f;
            if (textView10 != null) {
                D6.f(textView10, dimensionPixelSize3, 0, 0, 0, 14);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
            ImageView imageView3 = componentContainer.f178843d;
            if (imageView3 != null) {
                D6.c(imageView3, null, null, Integer.valueOf(dimensionPixelSize4), null, 11);
            } else {
                TextView textView11 = componentContainer.f178841b;
                if (textView11 != null) {
                    D6.f(textView11, 0, 0, dimensionPixelSize4, 0, 11);
                }
            }
            TextView textView12 = componentContainer.f178842c;
            if (textView12 != null) {
                D6.f(textView12, 0, 0, dimensionPixelSize4, 0, 11);
            }
            TextView textView13 = componentContainer.f178845f;
            if (textView13 != null) {
                D6.f(textView13, 0, 0, dimensionPixelSize4, 0, 11);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(20) && (imageView2 = componentContainer.f178843d) != null) {
            imageView2.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(20));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21) && (imageView = componentContainer.f178843d) != null) {
            imageView.setImageTintList(x.a(typedArrayObtainStyledAttributes, componentContainer.getContext(), 21));
        }
        componentContainer.setTitle(typedArrayObtainStyledAttributes.getString(16));
        componentContainer.setSubtitle(typedArrayObtainStyledAttributes.getString(11));
        componentContainer.setMessage(typedArrayObtainStyledAttributes.getString(6));
        LinearLayout linearLayout3 = componentContainer.f178846g;
        if (linearLayout3 != null) {
            linearLayout3.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 1));
        }
        Condition condition = (Condition) C42756l.F(typedArrayObtainStyledAttributes.getInt(10, 0), Condition.values());
        if (condition == null) {
            condition = Condition.f178857b;
        }
        componentContainer.f178847h = condition;
        typedArrayObtainStyledAttributes.recycle();
        componentContainer.setEnabled(componentContainer.isEnabled());
    }

    public static void l(ComponentContainer componentContainer, int[] iArr, CharSequence charSequence, int i12) {
        if ((i12 & 2) != 0) {
            charSequence = null;
        }
        componentContainer.getClass();
        componentContainer.g(State.f178868e, Arrays.copyOf(iArr, iArr.length), charSequence, null);
    }

    public static /* synthetic */ void n(ComponentContainer componentContainer, CharSequence charSequence, int i12) {
        if ((i12 & 1) != 0) {
            charSequence = null;
        }
        componentContainer.m(charSequence, null);
    }

    public static void s(ComponentContainer componentContainer, String str, int i12) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        componentContainer.getClass();
        componentContainer.h(State.f178867d, str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.avito.android.lib.design.component_container.a] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addView(@Y61.l android.view.View r8, int r9, @Y61.l android.view.ViewGroup.LayoutParams r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.component_container.ComponentContainer.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(@Y61.k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public final void g(State state, int[] iArr, CharSequence charSequence, Condition condition) {
        k();
        this.f178852m = state;
        refreshDrawableState();
        if (condition != null) {
            this.f178847h = condition;
        }
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            C43025h.a aVar = new C43025h.a(C43033p.i(C43033p.b(new p6(linearLayout)), new i(iArr)));
            while (aVar.hasNext()) {
                com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a((View) aVar.next());
                if (aVarA != null) {
                    aVarA.setState(state);
                }
            }
        }
        TextView textView = this.f178845f;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
        t();
        u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final State getF178852m() {
        return this.f178852m;
    }

    public final void h(State state, CharSequence charSequence, Condition condition) {
        this.f178852m = state;
        refreshDrawableState();
        if (condition != null) {
            this.f178847h = condition;
        }
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            p6 p6Var = new p6(linearLayout);
            while (p6Var.hasNext()) {
                com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a((View) p6Var.next());
                if (aVarA != null) {
                    aVarA.setState(state);
                }
            }
        }
        TextView textView = this.f178845f;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
        t();
        u();
    }

    public final void i(@Y61.k Y41.l<? super TextView, G0> lVar) {
        TextView textView = this.f178842c;
        if (textView != null) {
            lVar.invoke(textView);
        }
        t();
        u();
    }

    public final void k() {
        State state = State.f178866c;
        this.f178852m = state;
        refreshDrawableState();
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            p6 p6Var = new p6(linearLayout);
            while (p6Var.hasNext()) {
                com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a((View) p6Var.next());
                if (aVarA != null) {
                    aVarA.setState(state);
                }
            }
        }
        TextView textView = this.f178845f;
        if (textView != null) {
            I5.a(textView, this.f178848i, false);
        }
    }

    public final void m(@Y61.l CharSequence charSequence, @Y61.l Condition condition) {
        h(State.f178868e, charSequence, condition);
    }

    public final void o(@Y61.l CharSequence charSequence, @Y61.k int[] iArr) {
        g(State.f178866c, Arrays.copyOf(iArr, iArr.length), charSequence, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.f178852m.f178871b.length), this.f178852m.f178871b);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
        post(new RunnableC28882d(16, this, (SavedState) parcelable));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // android.view.View
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r8 = this;
            r0 = 0
            com.avito.android.lib.design.component_container.ComponentContainer$State r2 = r8.f178852m     // Catch: java.lang.IllegalArgumentException -> L5a
            com.avito.android.lib.design.component_container.ComponentContainer$Condition r3 = r8.f178847h     // Catch: java.lang.IllegalArgumentException -> L5a
            android.widget.TextView r1 = r8.f178845f     // Catch: java.lang.IllegalArgumentException -> L5a
            if (r1 == 0) goto L19
            boolean r4 = com.avito.android.util.D6.y(r1)     // Catch: java.lang.IllegalArgumentException -> L5a
            if (r4 == 0) goto L10
            goto L11
        L10:
            r1 = r0
        L11:
            if (r1 == 0) goto L19
            java.lang.CharSequence r1 = r1.getText()     // Catch: java.lang.IllegalArgumentException -> L5a
            r4 = r1
            goto L1a
        L19:
            r4 = r0
        L1a:
            android.widget.LinearLayout r1 = r8.f178846g     // Catch: java.lang.IllegalArgumentException -> L5a
            if (r1 == 0) goto L4b
            com.avito.android.util.p6 r5 = new com.avito.android.util.p6     // Catch: java.lang.IllegalArgumentException -> L5a
            r5.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5a
            kotlin.sequences.a r1 = kotlin.sequences.C43033p.b(r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            com.avito.android.lib.design.component_container.ComponentContainer$j r5 = com.avito.android.lib.design.component_container.ComponentContainer.j.f178880l     // Catch: java.lang.IllegalArgumentException -> L5a
            kotlin.sequences.h r1 = kotlin.sequences.C43033p.i(r1, r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            com.avito.android.lib.design.component_container.ComponentContainer$k r5 = new com.avito.android.lib.design.component_container.ComponentContainer$k     // Catch: java.lang.IllegalArgumentException -> L5a
            r5.<init>()     // Catch: java.lang.IllegalArgumentException -> L5a
            kotlin.sequences.h r1 = kotlin.sequences.C43033p.i(r1, r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            com.avito.android.lib.design.component_container.ComponentContainer$l r5 = com.avito.android.lib.design.component_container.ComponentContainer.l.f178882l     // Catch: java.lang.IllegalArgumentException -> L5a
            kotlin.sequences.o0 r6 = new kotlin.sequences.o0     // Catch: java.lang.IllegalArgumentException -> L5a
            r6.<init>(r1, r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            java.util.List r1 = kotlin.sequences.C43033p.D(r6)     // Catch: java.lang.IllegalArgumentException -> L5a
            if (r1 == 0) goto L4b
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.IllegalArgumentException -> L5a
            int[] r1 = kotlin.collections.C42745f0.L0(r1)     // Catch: java.lang.IllegalArgumentException -> L5a
        L49:
            r5 = r1
            goto L4f
        L4b:
            r1 = 0
            int[] r1 = new int[r1]     // Catch: java.lang.IllegalArgumentException -> L5a
            goto L49
        L4f:
            android.os.Parcelable r6 = super.onSaveInstanceState()     // Catch: java.lang.IllegalArgumentException -> L5a
            com.avito.android.lib.design.component_container.ComponentContainer$SavedState r7 = new com.avito.android.lib.design.component_container.ComponentContainer$SavedState     // Catch: java.lang.IllegalArgumentException -> L5a
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L5a
            r0 = r7
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.component_container.ComponentContainer.onSaveInstanceState():android.os.Parcelable");
    }

    public final void q(@Y61.l CharSequence charSequence) {
        h(State.f178866c, charSequence, null);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            p6 p6Var = new p6(linearLayout);
            while (p6Var.hasNext()) {
                com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a((View) p6Var.next());
                if (aVarA != null) {
                    aVarA.detach();
                }
            }
        }
        LinearLayout linearLayout2 = this.f178846g;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@Y61.l View view) {
        com.avito.android.lib.design.component_container.a<View> aVarA;
        if (view != null && (aVarA = com.avito.android.lib.design.component_container.c.a(view)) != null) {
            aVarA.detach();
        }
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            linearLayout.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i12) {
        View childAt;
        com.avito.android.lib.design.component_container.a<View> aVarA;
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i12)) != null && (aVarA = com.avito.android.lib.design.component_container.c.a(childAt)) != null) {
            aVarA.detach();
        }
        LinearLayout linearLayout2 = this.f178846g;
        if (linearLayout2 != null) {
            linearLayout2.removeViewAt(i12);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i12, int i13) {
        View childAt;
        com.avito.android.lib.design.component_container.a<View> aVarA;
        kotlin.ranges.k it = new kotlin.ranges.l(i12, i12 + i13, 1).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            LinearLayout linearLayout = this.f178846g;
            if (linearLayout != null && (childAt = linearLayout.getChildAt(iA2)) != null && (aVarA = com.avito.android.lib.design.component_container.c.a(childAt)) != null) {
                aVarA.detach();
            }
        }
        LinearLayout linearLayout2 = this.f178846g;
        if (linearLayout2 != null) {
            linearLayout2.removeViews(i12, i13);
        }
    }

    public final void setComponentsResetListener(@Y61.l Y41.l<? super Integer, G0> listener) {
        this.f178850k = listener;
    }

    public final void setContainerResetListener(@Y61.l Y41.a<G0> listener) {
        this.f178851l = listener;
    }

    public final void setContentContainerTopPadding(int top) {
        this.f178853n = top;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout != null) {
            p6 p6Var = new p6(linearLayout);
            while (p6Var.hasNext()) {
                ((View) p6Var.next()).setEnabled(enabled);
            }
        }
    }

    public final void setMessage(@e0 int subtitleRes) {
        setMessage(getContext().getString(subtitleRes));
    }

    public final void setMessagePosition(boolean isBelowInput) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        if (isBelowInput) {
            LinearLayout linearLayout = this.f178846g;
            if (linearLayout != null) {
                D6.c(linearLayout, null, Integer.valueOf(y6.b(0)), null, null, 13);
            }
            dVar.i(R.id.design_container_content, 3, R.id.design_container_subtitle, 4);
            dVar.i(R.id.design_container_message, 3, R.id.design_container_content, 4);
        } else {
            LinearLayout linearLayout2 = this.f178846g;
            if (linearLayout2 != null) {
                D6.c(linearLayout2, null, Integer.valueOf(y6.b(16)), null, null, 13);
            }
            dVar.i(R.id.design_container_message, 3, R.id.design_container_subtitle, 4);
            dVar.i(R.id.design_container_content, 3, R.id.design_container_message, 4);
        }
        dVar.c(this);
    }

    public final void setOrientation(int orientation) {
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOrientation(orientation);
    }

    public final void setSubtitle(@e0 int subtitleRes) {
        setSubtitle(getContext().getString(subtitleRes));
    }

    public final void setSubtitleMovementMethod(@Y61.k MovementMethod movement) {
        TextView textView = this.f178842c;
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(movement);
    }

    public final void setTitle(@e0 int titleRes) {
        setTitle(getContext().getString(titleRes));
    }

    public final void setTitlePaddingBottom(int padding) {
        this.f178855p = padding;
    }

    public final void setTitleStyle(@f0 int style) {
        TextView textView = this.f178841b;
        if (textView != null) {
            textView.setTextAppearance(style);
        }
    }

    public final void setTitleTipListener(@Y61.l Y41.a<G0> clickListener) {
        ImageView imageView = this.f178843d;
        if (imageView != null) {
            if (clickListener == null) {
                D6.w(imageView);
            } else {
                D6.H(imageView);
            }
            imageView.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(29, clickListener));
        }
    }

    public final void setTitleTipText(@Y61.k Y41.l<? super TextView, G0> block) {
        TextView textView = this.f178844e;
        if (textView != null) {
            block.invoke(textView);
        }
    }

    public final void setTitleTipViewListener(@Y61.l Y41.l<? super View, G0> clickListener) {
        ImageView imageView = this.f178843d;
        if (imageView != null) {
            if (clickListener == null) {
                D6.w(imageView);
            } else {
                D6.H(imageView);
            }
            imageView.setOnClickListener(new ViewOnClickListenerC31042l(6, clickListener));
        }
    }

    public final void t() {
        int i12;
        LinearLayout linearLayout = this.f178846g;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f178841b;
        TextView textView2 = this.f178842c;
        int i13 = ((textView == null || !D6.y(textView)) && (textView2 == null || !D6.y(textView2))) ? 0 : this.f178853n;
        TextView textView3 = this.f178845f;
        if (textView3 == null || !D6.y(textView3)) {
            i12 = 0;
        } else {
            D6.f(textView3, 0, 0, 0, this.f178856q, 7);
            i12 = this.f178854o;
        }
        if (linearLayout.getPaddingTop() == i13 && linearLayout.getPaddingBottom() == i12) {
            return;
        }
        D6.f(linearLayout, 0, i13, 0, i12, 5);
    }

    public final void u() {
        TextView textView = this.f178841b;
        if (textView == null || textView.getVisibility() == 8) {
            return;
        }
        TextView textView2 = this.f178842c;
        int i12 = (textView2 == null || !D6.y(textView2)) ? 0 : this.f178855p;
        if (textView.getPaddingBottom() != i12) {
            D6.f(textView, 0, 0, 0, i12, 7);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(layoutParams);
        if (layoutParams instanceof f) {
            f fVar2 = (f) layoutParams;
            fVar.f178877u0 = fVar2.f178877u0;
            fVar.f178875s0 = fVar2.f178875s0;
            fVar.f178876t0 = fVar2.f178876t0;
        }
        return fVar;
    }

    public final void setMessage(@Y61.l CharSequence message) {
        this.f178848i = message;
        TextView textView = this.f178845f;
        if (textView != null) {
            I5.a(textView, message, false);
        }
        t();
        u();
    }

    public final void setSubtitle(@Y61.l CharSequence subtitle) {
        TextView textView = this.f178842c;
        if (textView != null) {
            I5.a(textView, subtitle, false);
        }
        t();
        u();
    }

    public final void setTitle(@Y61.l CharSequence title) {
        TextView textView = this.f178841b;
        if (textView != null) {
            I5.a(textView, title, false);
        }
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ConstraintLayout.b generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    public ComponentContainer(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178847h = Condition.f178857b;
        this.f178849j = new ThreadLocal<>();
        this.f178852m = State.f178866c;
        j(this, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    @Y61.k
    public final ConstraintLayout.b generateLayoutParams(@Y61.k AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178984o);
        fVar.f178875s0 = typedArrayObtainStyledAttributes.getString(1);
        fVar.f178876t0 = typedArrayObtainStyledAttributes.getInt(0, 0);
        fVar.f178878v0 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComponentContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Condition {

        /* renamed from: b, reason: collision with root package name */
        public static final Condition f178857b;

        /* renamed from: c, reason: collision with root package name */
        public static final Condition f178858c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Condition[] f178859d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178860e;

        /* compiled from: ComponentContainer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition$a;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends Condition {
            public a() {
                throw null;
            }

            @Override // com.avito.android.lib.design.component_container.ComponentContainer.Condition
            public final void a(@Y61.k ComponentContainer componentContainer) {
                State state;
                LinearLayout linearLayout = componentContainer.f178846g;
                boolean z12 = true;
                if (linearLayout != null) {
                    p6 p6Var = new p6(linearLayout);
                    while (p6Var.hasNext()) {
                        com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a((View) p6Var.next());
                        if (aVarA == null || (state = aVarA.getState()) == null) {
                            state = State.f178866c;
                        }
                        if (state != State.f178866c) {
                            z12 = false;
                        }
                    }
                }
                if (z12) {
                    Y41.a<G0> aVar = componentContainer.f178851l;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    componentContainer.k();
                }
            }
        }

        /* compiled from: ComponentContainer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition$b;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends Condition {
            public b() {
                throw null;
            }

            @Override // com.avito.android.lib.design.component_container.ComponentContainer.Condition
            public final void a(@Y61.k ComponentContainer componentContainer) {
                Y41.a<G0> aVar = componentContainer.f178851l;
                if (aVar != null) {
                    aVar.invoke();
                }
                componentContainer.k();
            }
        }

        static {
            c cVar = new c("MANUAL", 0, null);
            f178857b = cVar;
            b bVar = new b("AT_LEAST_ONE", 1, null);
            a aVar = new a("ALL_RESET", 2, null);
            f178858c = aVar;
            Condition[] conditionArr = {cVar, bVar, aVar};
            f178859d = conditionArr;
            f178860e = kotlin.enums.c.a(conditionArr);
        }

        public Condition() {
            throw null;
        }

        public Condition(String str, int i12, C42822w c42822w) {
        }

        public static Condition valueOf(String str) {
            return (Condition) Enum.valueOf(Condition.class, str);
        }

        public static Condition[] values() {
            return (Condition[]) f178859d.clone();
        }

        public abstract void a(@Y61.k ComponentContainer componentContainer);

        /* compiled from: ComponentContainer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition$c;", "Lcom/avito/android/lib/design/component_container/ComponentContainer$Condition;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends Condition {
            public c() {
                throw null;
            }

            @Override // com.avito.android.lib.design.component_container.ComponentContainer.Condition
            public final void a(@Y61.k ComponentContainer componentContainer) {
            }
        }
    }
}
