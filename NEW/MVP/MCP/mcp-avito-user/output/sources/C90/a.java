package C90;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: IncomeWidgetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC90/a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2011a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f2012b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f2013c;

    public a(@k View view) {
        this.f2011a = (TextView) view.findViewById(R.id.tv_income_time);
        this.f2012b = (TextView) view.findViewById(R.id.tv_income_price);
        this.f2013c = (TextView) view.findViewById(R.id.tv_income_percent);
    }
}
