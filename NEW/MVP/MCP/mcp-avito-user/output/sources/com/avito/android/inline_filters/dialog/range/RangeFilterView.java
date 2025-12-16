package com.avito.android.inline_filters.dialog.range;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.B;
import com.avito.android.inline_filters.dialog.D;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RangeFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/inline_filters/dialog/range/RangeFilterView;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/E;", "Lcom/avito/android/inline_filters/dialog/range/a;", "a", "State", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RangeFilterView implements B, E, com.avito.android.inline_filters.dialog.range.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f171951a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Window f171952b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f171953c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f171954d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f171955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f171956f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public N f171957g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f171958h;

    /* renamed from: i, reason: collision with root package name */
    public final int f171959i;

    /* renamed from: j, reason: collision with root package name */
    public final int f171960j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Input f171961k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Input f171962l;

    /* compiled from: RangeFilterView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/range/RangeFilterView$State;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State implements Parcelable {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f171963b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f171964c;

        /* compiled from: RangeFilterView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State(@l String str, @l String str2) {
            this.f171963b = str;
            this.f171964c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f171963b);
            parcel.writeString(this.f171964c);
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/range/RangeFilterView$a;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f171965a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f171966b;

        public a(@k String str) {
            List listF0 = C43066x.f0(str, new String[]{"%s"}, 0, 6);
            if (listF0.size() != 2) {
                this.f171965a = "";
                this.f171966b = "";
            } else {
                this.f171965a = (String) listF0.get(0);
                this.f171966b = (String) listF0.get(1);
            }
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<List<? extends String>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f171967l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(List<? extends String> list) {
            return G0.f406611a;
        }
    }

    public RangeFilterView(@k View view, @l Window window, @k String str, @k String str2, @l String str3, @k String str4, boolean z12, @l String str5) {
        this.f171951a = view;
        this.f171952b = window;
        this.f171953c = str;
        this.f171954d = str3;
        this.f171955e = z12;
        this.f171956f = new D(view);
        this.f171957g = b.f171967l;
        View viewFindViewById = view.findViewById(R.id.reset_action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171958h = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_btn);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f171959i = C35835l0.d(R.attr.blue, view.getContext());
        this.f171960j = C35835l0.d(R.attr.gray28, view.getContext());
        View viewFindViewById3 = view.findViewById(R.id.inline_filter_to_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        this.f171961k = input;
        View viewFindViewById4 = view.findViewById(R.id.inline_filter_from_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById4;
        this.f171962l = input2;
        StringBuilder sbB = C23088b.b("###", str5, "###", str5, "###");
        m.p(sbB, str5, "###", str5, "###");
        FormatterType formatterType = new FormatterType(1, 2, new MaskParameters("", false, "", null, false, G.h(sbB, str5, "###", str5, "###"), true, "0", (char) 0, 0, null, 1818, null));
        a aVar = new a(str2);
        input2.setPrefix(aVar.f171965a);
        input2.setPostfix(aVar.f171966b);
        input2.setFormatterType(formatterType);
        input2.b(new i(this));
        a aVar2 = new a(str4);
        input.setPrefix(aVar2.f171965a);
        input.setPostfix(aVar2.f171966b);
        input.setFormatterType(formatterType);
        input.b(new i(this));
        button.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 5));
        final int i12 = 0;
        input2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.avito.android.inline_filters.dialog.range.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RangeFilterView f171980c;

            {
                this.f171980c = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i13 == 5) {
                            this.f171980c.f171961k.v();
                            break;
                        }
                        break;
                    default:
                        if (i13 == 6) {
                            RangeFilterView rangeFilterView = this.f171980c;
                            rangeFilterView.f171957g.invoke(C42745f0.U(String.valueOf(RangeFilterView.k(rangeFilterView.f171962l)), String.valueOf(RangeFilterView.k(rangeFilterView.f171961k))));
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        final int i13 = 1;
        input.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.avito.android.inline_filters.dialog.range.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RangeFilterView f171980c;

            {
                this.f171980c = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            this.f171980c.f171961k.v();
                            break;
                        }
                        break;
                    default:
                        if (i132 == 6) {
                            RangeFilterView rangeFilterView = this.f171980c;
                            rangeFilterView.f171957g.invoke(C42745f0.U(String.valueOf(RangeFilterView.k(rangeFilterView.f171962l)), String.valueOf(RangeFilterView.k(rangeFilterView.f171961k))));
                            break;
                        }
                        break;
                }
                return true;
            }
        });
    }

    public static Long k(Input input) {
        String deformattedText = input.getDeformattedText();
        StringBuilder sb2 = new StringBuilder();
        int length = deformattedText.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = deformattedText.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return C43066x.z0(sb2.toString());
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@k Y41.a<G0> aVar) {
        this.f171956f.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@k Y41.a<G0> aVar) {
        this.f171956f.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f171956f.Ud(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @l
    /* renamed from: getState */
    public final Parcelable getF171936c() {
        View view = this.f171951a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        Long lK2 = k(this.f171962l);
        String string = lK2 != null ? lK2.toString() : null;
        Long lK3 = k(this.f171961k);
        return new State(string, lK3 != null ? lK3.toString() : null);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@k String str) {
        this.f171956f.setTitle(str);
    }

    public /* synthetic */ RangeFilterView(View view, Window window, String str, String str2, String str3, String str4, boolean z12, String str5, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : window, str, str2, str3, str4, z12, str5);
    }
}
