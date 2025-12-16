package com.avito.android.lib.design.toast_bar.state;

import Y41.a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToastBarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/state/ToastBarState;", "", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ToastBarState {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final PrintableText f181123a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final View f181124b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ToastBarPosition f181125c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<View> f181126d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<View> f181127e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f181128f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final FrameLayout f181129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f181130h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f181131i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f181132j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final a<G0> f181133k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final State f181134l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastBarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/state/ToastBarState$State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f181135b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f181136c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f181137d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f181138e;

        static {
            State state = new State("SHOW", 0);
            f181135b = state;
            State state2 = new State("DISMISS", 1);
            f181136c = state2;
            State[] stateArr = {state, state2};
            f181137d = stateArr;
            f181138e = c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f181137d.clone();
        }
    }

    public ToastBarState() {
        this(null, null, null, null, null, null, null, 0, false, false, null, null, 4095, null);
    }

    public static ToastBarState a(ToastBarState toastBarState, PrintableText printableText, View view, int i12) {
        PrintableText printableText2 = (i12 & 1) != 0 ? toastBarState.f181123a : printableText;
        View view2 = (i12 & 2) != 0 ? toastBarState.f181124b : view;
        ToastBarPosition toastBarPosition = toastBarState.f181125c;
        List<View> list = toastBarState.f181126d;
        List<View> list2 = toastBarState.f181127e;
        Integer num = toastBarState.f181128f;
        FrameLayout frameLayout = toastBarState.f181129g;
        int i13 = toastBarState.f181130h;
        boolean z12 = toastBarState.f181131i;
        boolean z13 = toastBarState.f181132j;
        a<G0> aVar = toastBarState.f181133k;
        State state = toastBarState.f181134l;
        toastBarState.getClass();
        return new ToastBarState(printableText2, view2, toastBarPosition, list, list2, num, frameLayout, i13, z12, z13, aVar, state);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastBarState)) {
            return false;
        }
        ToastBarState toastBarState = (ToastBarState) obj;
        return L.f(this.f181123a, toastBarState.f181123a) && L.f(this.f181124b, toastBarState.f181124b) && this.f181125c == toastBarState.f181125c && L.f(this.f181126d, toastBarState.f181126d) && L.f(this.f181127e, toastBarState.f181127e) && L.f(this.f181128f, toastBarState.f181128f) && L.f(this.f181129g, toastBarState.f181129g) && this.f181130h == toastBarState.f181130h && this.f181131i == toastBarState.f181131i && this.f181132j == toastBarState.f181132j && L.f(this.f181133k, toastBarState.f181133k) && this.f181134l == toastBarState.f181134l;
    }

    public final int hashCode() {
        PrintableText printableText = this.f181123a;
        int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
        View view = this.f181124b;
        int iHashCode2 = (this.f181125c.hashCode() + ((iHashCode + (view == null ? 0 : view.hashCode())) * 31)) * 31;
        List<View> list = this.f181126d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<View> list2 = this.f181127e;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f181128f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        FrameLayout frameLayout = this.f181129g;
        int i12 = r.i(r.i(r.e(this.f181130h, (iHashCode5 + (frameLayout == null ? 0 : frameLayout.hashCode())) * 31, 31), 31, this.f181131i), 31, this.f181132j);
        a<G0> aVar = this.f181133k;
        return this.f181134l.hashCode() + ((i12 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ToastBarState(title=" + this.f181123a + ", anchor=" + this.f181124b + ", position=" + this.f181125c + ", leftItems=" + this.f181126d + ", rightItems=" + this.f181127e + ", customPosition=" + this.f181128f + ", containerView=" + this.f181129g + ", duration=" + this.f181130h + ", isSwipeToDismissEnabled=" + this.f181131i + ", isForceVerticalLayout=" + this.f181132j + ", onDismiss=" + this.f181133k + ", stateOfVisible=" + this.f181134l + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToastBarState(@l PrintableText printableText, @l View view, @k ToastBarPosition toastBarPosition, @l List<? extends View> list, @l List<? extends View> list2, @l Integer num, @l FrameLayout frameLayout, int i12, boolean z12, boolean z13, @l a<G0> aVar, @k State state) {
        this.f181123a = printableText;
        this.f181124b = view;
        this.f181125c = toastBarPosition;
        this.f181126d = list;
        this.f181127e = list2;
        this.f181128f = num;
        this.f181129g = frameLayout;
        this.f181130h = i12;
        this.f181131i = z12;
        this.f181132j = z13;
        this.f181133k = aVar;
        this.f181134l = state;
    }

    public /* synthetic */ ToastBarState(PrintableText printableText, View view, ToastBarPosition toastBarPosition, List list, List list2, Integer num, FrameLayout frameLayout, int i12, boolean z12, boolean z13, a aVar, State state, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : printableText, (i13 & 2) != 0 ? null : view, (i13 & 4) != 0 ? ToastBarPosition.f181046d : toastBarPosition, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : list2, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : frameLayout, (i13 & 128) != 0 ? 1500 : i12, (i13 & 256) != 0 ? true : z12, (i13 & 512) != 0 ? false : z13, (i13 & 1024) == 0 ? aVar : null, (i13 & 2048) != 0 ? State.f181135b : state);
    }
}
