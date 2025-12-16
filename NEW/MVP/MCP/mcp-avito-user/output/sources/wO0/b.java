package WO0;

import Au.ViewOnClickListenerC13080b;
import VO0.b;
import XO0.d;
import XO0.e;
import Y41.l;
import Y61.k;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PaymentHistoryAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LWO0/b;", "Landroidx/recyclerview/widget/B;", "LVO0/b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends B<VO0.b, RecyclerView.C> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<b.d, G0> f17917e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.a<G0> f17918f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<G0> f17919g;

    public b(@k Y41.a aVar, @k Y41.a aVar2, @k l lVar) {
        super(c.f17920a);
        this.f17917e = lVar;
        this.f17918f = aVar;
        this.f17919g = aVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        VO0.b item = getItem(i12);
        if (item instanceof b.c) {
            return 0;
        }
        if (item instanceof b.C1178b) {
            return 1;
        }
        if (item instanceof b.d) {
            return 2;
        }
        if (item instanceof b.a) {
            return 3;
        }
        throw new IllegalStateException("Unknown item type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@k RecyclerView.C c12, int i12) {
        if (c12 instanceof e) {
            e eVar = (e) c12;
            b.d dVar = (b.d) getItem(i12);
            I5.a(eVar.f18876d, dVar.f17114c, false);
            I5.a(eVar.f18877e, dVar.f17113b, false);
            I5.a(eVar.f18878f, dVar.f17115d, false);
            I5.a(eVar.f18879g, dVar.f17116e, false);
            int i13 = e.b.f18881a[dVar.f17117f.ordinal()];
            View view = eVar.f18874b;
            TextView textView = eVar.f18880h;
            if (i13 == 1) {
                D6.H(textView);
                textView.setText(R.string.operation_status_active);
                textView.setTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
            } else if (i13 == 2 || i13 == 3) {
                D6.H(textView);
                textView.setText(R.string.operation_status_error);
                textView.setTextColor(C35835l0.d(R.attr.red600, view.getContext()));
            } else if (i13 == 4) {
                if (dVar.f17118g) {
                    D6.H(textView);
                    textView.setText(R.string.refund_status_available);
                    textView.setTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
                } else {
                    D6.w(textView);
                }
            }
            view.setOnClickListener(new ViewOnClickListenerC13080b(22, eVar, dVar));
            return;
        }
        if (c12 instanceof XO0.c) {
            I5.a((TextView) ((XO0.c) c12).f18869b, ((b.C1178b) getItem(i12)).f17110a, false);
            return;
        }
        if (c12 instanceof d) {
            d dVar2 = (d) c12;
            b.c cVar = (b.c) getItem(i12);
            LinearLayout linearLayout = dVar2.f18872c;
            boolean z12 = cVar.f17111a;
            Spinner spinner = dVar2.f18871b;
            if (!z12) {
                D6.H(spinner);
                D6.w(linearLayout);
                return;
            } else {
                if (z12) {
                    D6.w(spinner);
                    D6.H(linearLayout);
                    return;
                }
                return;
            }
        }
        if (c12 instanceof XO0.a) {
            XO0.a aVar = (XO0.a) c12;
            View view2 = aVar.f18864b;
            String string = view2.getContext().getString(R.string.info_banner_main_text);
            String string2 = view2.getContext().getString(R.string.info_banner_action_text);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H.i(' ', string, string2));
            int I12 = C43066x.I(spannableStringBuilder, string2, 0, false, 6);
            int length = string2.length() + I12;
            Object[] objArr = {new XO0.b(aVar), new UnderlineSpan(), new ForegroundColorSpan(C35835l0.d(R.attr.black, view2.getContext()))};
            for (int i14 = 0; i14 < 3; i14++) {
                spannableStringBuilder.setSpan(objArr[i14], I12, length, 33);
            }
            TextView textView2 = aVar.f18866d;
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public final RecyclerView.C onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        if (i12 == 0) {
            d.f18870d.getClass();
            return new d(this.f17918f, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_history_loading_state, viewGroup, false));
        }
        if (i12 == 1) {
            XO0.c.f18868c.getClass();
            return new XO0.c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_history_header, viewGroup, false));
        }
        if (i12 == 2) {
            e.f18873i.getClass();
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_history_operation, viewGroup, false), this.f17917e);
        }
        if (i12 != 3) {
            throw new IllegalStateException("ViewTypeNotRegistered");
        }
        XO0.a.f18863e.getClass();
        return new XO0.a(this.f17919g, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_history_info_banner, viewGroup, false));
    }
}
