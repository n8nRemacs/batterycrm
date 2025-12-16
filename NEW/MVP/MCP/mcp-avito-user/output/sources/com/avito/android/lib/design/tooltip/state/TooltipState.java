package com.avito.android.lib.design.tooltip.state;

import Y41.a;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TooltipState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/state/TooltipState;", "", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TooltipState {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final q f181271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f181272b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a<G0> f181273c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f181274d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CharSequence f181275e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CharSequence f181276f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final a<G0> f181277g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f181278h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ImageGravity f181279i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Drawable f181280j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f181281k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final a<G0> f181282l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final View f181283m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final State f181284n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TooltipState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/state/TooltipState$State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f181285b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f181286c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f181287d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f181288e;

        static {
            State state = new State("SHOW", 0);
            f181285b = state;
            State state2 = new State("DISMISS", 1);
            f181286c = state2;
            State[] stateArr = {state, state2};
            f181287d = stateArr;
            f181288e = c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f181287d.clone();
        }
    }

    public TooltipState() {
        this(null, false, null, null, null, null, null, null, null, null, false, null, null, null, 16383, null);
    }

    public static TooltipState a(TooltipState tooltipState, a aVar, String str, a aVar2, State state, int i12) {
        q qVar = tooltipState.f181271a;
        boolean z12 = tooltipState.f181272b;
        a aVar3 = (i12 & 4) != 0 ? tooltipState.f181273c : aVar;
        CharSequence charSequence = tooltipState.f181274d;
        CharSequence charSequence2 = (i12 & 16) != 0 ? tooltipState.f181275e : str;
        CharSequence charSequence3 = tooltipState.f181276f;
        a<G0> aVar4 = tooltipState.f181277g;
        Drawable drawable = tooltipState.f181278h;
        ImageGravity imageGravity = tooltipState.f181279i;
        Drawable drawable2 = tooltipState.f181280j;
        boolean z13 = tooltipState.f181281k;
        a aVar5 = (i12 & 2048) != 0 ? tooltipState.f181282l : aVar2;
        View view = tooltipState.f181283m;
        State state2 = (i12 & 8192) != 0 ? tooltipState.f181284n : state;
        tooltipState.getClass();
        return new TooltipState(qVar, z12, aVar3, charSequence, charSequence2, charSequence3, aVar4, drawable, imageGravity, drawable2, z13, aVar5, view, state2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipState)) {
            return false;
        }
        TooltipState tooltipState = (TooltipState) obj;
        return L.f(this.f181271a, tooltipState.f181271a) && this.f181272b == tooltipState.f181272b && L.f(this.f181273c, tooltipState.f181273c) && L.f(this.f181274d, tooltipState.f181274d) && L.f(this.f181275e, tooltipState.f181275e) && L.f(this.f181276f, tooltipState.f181276f) && L.f(this.f181277g, tooltipState.f181277g) && L.f(this.f181278h, tooltipState.f181278h) && this.f181279i == tooltipState.f181279i && L.f(this.f181280j, tooltipState.f181280j) && this.f181281k == tooltipState.f181281k && L.f(this.f181282l, tooltipState.f181282l) && L.f(this.f181283m, tooltipState.f181283m) && this.f181284n == tooltipState.f181284n;
    }

    public final int hashCode() {
        q qVar = this.f181271a;
        int i12 = r.i((qVar == null ? 0 : qVar.hashCode()) * 31, 31, this.f181272b);
        a<G0> aVar = this.f181273c;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CharSequence charSequence = this.f181274d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f181275e;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f181276f;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        a<G0> aVar2 = this.f181277g;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Drawable drawable = this.f181278h;
        int iHashCode6 = (iHashCode5 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ImageGravity imageGravity = this.f181279i;
        int iHashCode7 = (iHashCode6 + (imageGravity == null ? 0 : imageGravity.hashCode())) * 31;
        Drawable drawable2 = this.f181280j;
        int i13 = r.i((iHashCode7 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31, 31, this.f181281k);
        a<G0> aVar3 = this.f181282l;
        int iHashCode8 = (i13 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        View view = this.f181283m;
        return this.f181284n.hashCode() + ((iHashCode8 + (view != null ? view.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "TooltipState(tooltipPosition=" + this.f181271a + ", tailVisible=" + this.f181272b + ", onClick=" + this.f181273c + ", title=" + ((Object) this.f181274d) + ", body=" + ((Object) this.f181275e) + ", buttonText=" + ((Object) this.f181276f) + ", onButtonClick=" + this.f181277g + ", image=" + this.f181278h + ", imageGravity=" + this.f181279i + ", background=" + this.f181280j + ", closeButtonVisible=" + this.f181281k + ", onCloseButtonClick=" + this.f181282l + ", anchor=" + this.f181283m + ", stateOfVisible=" + this.f181284n + ')';
    }

    public TooltipState(@l q qVar, boolean z12, @l a<G0> aVar, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, @l a<G0> aVar2, @l Drawable drawable, @l ImageGravity imageGravity, @l Drawable drawable2, boolean z13, @l a<G0> aVar3, @l View view, @k State state) {
        this.f181271a = qVar;
        this.f181272b = z12;
        this.f181273c = aVar;
        this.f181274d = charSequence;
        this.f181275e = charSequence2;
        this.f181276f = charSequence3;
        this.f181277g = aVar2;
        this.f181278h = drawable;
        this.f181279i = imageGravity;
        this.f181280j = drawable2;
        this.f181281k = z13;
        this.f181282l = aVar3;
        this.f181283m = view;
        this.f181284n = state;
    }

    public /* synthetic */ TooltipState(q qVar, boolean z12, a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, a aVar2, Drawable drawable, ImageGravity imageGravity, Drawable drawable2, boolean z13, a aVar3, View view, State state, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : qVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? null : charSequence, (i12 & 16) != 0 ? null : charSequence2, (i12 & 32) != 0 ? null : charSequence3, (i12 & 64) != 0 ? null : aVar2, (i12 & 128) != 0 ? null : drawable, (i12 & 256) != 0 ? null : imageGravity, (i12 & 512) != 0 ? null : drawable2, (i12 & 1024) == 0 ? z13 : true, (i12 & 2048) != 0 ? null : aVar3, (i12 & 4096) == 0 ? view : null, (i12 & 8192) != 0 ? State.f181285b : state);
    }
}
