package Ow;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35787f0;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MetroStationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOw/a;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ow.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14742a {

    /* renamed from: a, reason: collision with root package name */
    public final View f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12714c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12715d;

    /* compiled from: MetroStationItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOw/a$a;", "", "<init>", "()V", "", "COLOR_OPACITY_BITWISE_MASK", "J", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ow.a$a, reason: collision with other inner class name */
    public static final class C0818a {
        public /* synthetic */ C0818a(C42822w c42822w) {
            this();
        }

        public C0818a() {
        }
    }

    static {
        new C0818a(null);
    }

    public C14742a(@k View view) {
        this.f12712a = view.findViewById(R.id.metro_icon);
        this.f12713b = (TextView) view.findViewById(R.id.metro_name);
        this.f12714c = (TextView) view.findViewById(R.id.metro_distance_in_time);
        this.f12715d = (ImageView) view.findViewById(R.id.metro_walk_icon);
    }

    public final void a(@l Metro metro) {
        Drawable drawableH;
        Integer numA;
        ImageView imageView = this.f12715d;
        TextView textView = this.f12714c;
        TextView textView2 = this.f12713b;
        View view = this.f12712a;
        if (metro == null) {
            D6.w(view);
            D6.w(textView2);
            D6.w(textView);
            D6.w(imageView);
            return;
        }
        List<Metro.MetroLine> lines = metro.getLines();
        if (lines == null) {
            lines = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = lines.iterator();
        while (true) {
            drawableH = null;
            Integer numValueOf = null;
            drawableH = null;
            if (!it.hasNext()) {
                break;
            }
            Metro.MetroLine metroLine = (Metro.MetroLine) it.next();
            Integer numA2 = C35787f0.a(metroLine.getColor());
            if (numA2 == null) {
                try {
                    numValueOf = Integer.valueOf(Integer.decode(metroLine.getColor()).intValue() | (-16777216));
                } catch (Exception unused) {
                }
                numA2 = numValueOf;
            }
            if (numA2 != null) {
                arrayList.add(numA2);
            }
        }
        Integer num = (Integer) C42745f0.G(arrayList);
        String str = metro.getName() + (metro.getDistanceInTime() != null ? "," : "");
        Metro.DistanceInTime distanceInTime = metro.getDistanceInTime();
        String text = distanceInTime != null ? distanceInTime.getText() : null;
        Metro.DistanceInTime distanceInTime2 = metro.getDistanceInTime();
        String iconName = distanceInTime2 != null ? distanceInTime2.getIconName() : null;
        if (num != null) {
            D6.H(view);
            view.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
        } else {
            D6.w(view);
        }
        I5.a(textView2, str, false);
        I5.a(textView, text, false);
        Context context = imageView.getContext();
        if (iconName != null && (numA = q.a(iconName)) != null) {
            drawableH = C35835l0.h(numA.intValue(), context);
        }
        C35821j2.a(imageView, drawableH);
    }
}
