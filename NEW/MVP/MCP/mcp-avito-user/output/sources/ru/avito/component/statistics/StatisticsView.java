package ru.avito.component.statistics;

import Ae0.b;
import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatisticsView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/avito/component/statistics/StatisticsView;", "Landroid/widget/FrameLayout;", "", "likes", "Lkotlin/G0;", "setLikes", "(I)V", "Lkotlin/Function0;", "listener", "setOnStatisticsClickListener", "(LY41/a;)V", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getLink", "()Landroid/widget/TextView;", "link", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StatisticsView extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f430567g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f430568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f430569c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView link;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f430571e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DecimalFormat f430572f;

    @j
    public StatisticsView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final String a(int i12, int i13) {
        Integer numValueOf = Integer.valueOf(i12);
        DecimalFormat decimalFormat = this.f430572f;
        String str = decimalFormat.format(numValueOf);
        if (i13 <= 0) {
            return str;
        }
        StringBuilder sbZ = r.z(str, " +");
        sbZ.append(decimalFormat.format(Integer.valueOf(i13)));
        return sbZ.toString();
    }

    @k
    public final TextView getLink() {
        return this.link;
    }

    public final void setLikes(int likes) {
        this.f430569c.setText(this.f430572f.format(Integer.valueOf(likes)));
    }

    public final void setOnStatisticsClickListener(@k a<G0> listener) {
        b bVar = new b(20, listener);
        TextView textView = this.link;
        textView.setOnClickListener(bVar);
        D6.H(textView);
    }

    public StatisticsView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("ru", "RU"));
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f430572f = decimalFormat;
        View.inflate(context, R.layout.statistics_view, this);
        this.f430568b = (TextView) findViewById(R.id.watches);
        this.f430569c = (TextView) findViewById(R.id.likes);
        this.link = (TextView) findViewById(R.id.link);
        this.f430571e = (TextView) findViewById(R.id.contacts);
    }
}
