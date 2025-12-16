package com.avito.android.user_address;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeLocationTextView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/avito/android/user_address/CompositeLocationTextView;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/user_address/CompositeLocationTextView$State;", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "(Lcom/avito/android/user_address/CompositeLocationTextView$State;)V", "", "resId", "setBackground", "(I)V", "", "value", "e", "Ljava/lang/String;", "getFirstText", "()Ljava/lang/String;", "setFirstText", "(Ljava/lang/String;)V", "firstText", "f", "getSecondText", "setSecondText", "secondText", "State", "_avito_user-address_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompositeLocationTextView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f307086b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f307087c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f307088d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public String firstText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public String secondText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CompositeLocationTextView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/CompositeLocationTextView$State;", "", "_avito_user-address_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f307091b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f307092c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f307093d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f307094e;

        static {
            State state = new State("SHORT", 0);
            f307091b = state;
            State state2 = new State("FULL", 1);
            f307092c = state2;
            State[] stateArr = {state, state2};
            f307093d = stateArr;
            f307094e = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f307093d.clone();
        }
    }

    @j
    public CompositeLocationTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@InterfaceC42150f int i12, @InterfaceC42150f int i13) {
        int iJ2 = C35835l0.j(i12, getContext());
        TextView textView = this.f307088d;
        textView.setTextAppearance(iJ2);
        textView.setTextColor(C35835l0.d(i13, getContext()));
        int iJ3 = C35835l0.j(i12, getContext());
        TextView textView2 = this.f307087c;
        textView2.setTextAppearance(iJ3);
        textView2.setTextColor(C35835l0.d(i13, getContext()));
    }

    @k
    public final String getFirstText() {
        return this.firstText;
    }

    @k
    public final String getSecondText() {
        return this.secondText;
    }

    public final void setBackground(@InterfaceC42165v int resId) {
        this.f307086b.setBackgroundResource(resId);
    }

    public final void setFirstText(@k String str) {
        this.f307087c.setText(str);
        this.firstText = str;
    }

    public final void setSecondText(@k String str) {
        this.f307088d.setText(str);
        this.secondText = str;
    }

    public final void setState(@k State state) {
        this.f307088d.setVisibility(state == State.f307092c ? 0 : 8);
    }

    public CompositeLocationTextView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.composite_location_text_view, (ViewGroup) this, true);
        this.f307086b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.location);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307087c = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.house);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307088d = (TextView) viewFindViewById2;
        this.firstText = "";
        this.secondText = "";
    }
}
