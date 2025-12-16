package com.avito.android.mortgage.selected_appeal;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedAppealContentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/a;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<C6052a> f203415a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f203416b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f203417c;

    /* compiled from: SelectedAppealContentView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/a$a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.selected_appeal.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6052a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ViewGroup f203418a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f203419b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f203420c;

        public C6052a(@k ViewGroup viewGroup, @k TextView textView, @k TextView textView2) {
            this.f203418a = viewGroup;
            this.f203419b = textView;
            this.f203420c = textView2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6052a)) {
                return false;
            }
            C6052a c6052a = (C6052a) obj;
            return L.f(this.f203418a, c6052a.f203418a) && L.f(this.f203419b, c6052a.f203419b) && L.f(this.f203420c, c6052a.f203420c);
        }

        public final int hashCode() {
            return this.f203420c.hashCode() + ((this.f203419b.hashCode() + (this.f203418a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "CreditInfoField(field=" + this.f203418a + ", title=" + this.f203419b + ", value=" + this.f203420c + ')';
        }
    }

    public a(@k View view) {
        View viewFindViewById = view.findViewById(R.id.first_field);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.first_field_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.first_field_value);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C6052a c6052a = new C6052a(viewGroup, textView, (TextView) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.second_field);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.second_field_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.second_field_value);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C6052a c6052a2 = new C6052a(viewGroup2, textView2, (TextView) viewFindViewById6);
        View viewFindViewById7 = view.findViewById(R.id.third_field);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.third_field_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.third_field_value);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C6052a c6052a3 = new C6052a(viewGroup3, textView3, (TextView) viewFindViewById9);
        View viewFindViewById10 = view.findViewById(R.id.fourth_field);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup4 = (ViewGroup) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.fourth_field_title);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.fourth_field_value);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C6052a c6052a4 = new C6052a(viewGroup4, textView4, (TextView) viewFindViewById12);
        View viewFindViewById13 = view.findViewById(R.id.fifth_field);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup5 = (ViewGroup) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.fifth_field_title);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView5 = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.fifth_field_value);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f203415a = C42745f0.U(c6052a, c6052a2, c6052a3, c6052a4, new C6052a(viewGroup5, textView5, (TextView) viewFindViewById15));
        View viewFindViewById16 = view.findViewById(R.id.comment_field_title);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f203416b = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.comment_field_value);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f203417c = (TextView) viewFindViewById17;
    }
}
