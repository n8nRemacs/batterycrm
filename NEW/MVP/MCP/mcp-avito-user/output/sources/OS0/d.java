package os0;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: GeoReferenceViewBinder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Los0/d;", "Los0/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends g {
    public d(@k ViewGroup viewGroup) {
        super(viewGroup, false, 2, null);
    }

    @Override // os0.g
    public final int d() {
        return R.layout.development_list_geo_circle;
    }

    @Override // os0.g
    public final int e() {
        return R.attr.black;
    }

    @Override // os0.g
    @k
    public final String f(@k String str, @l String str2) {
        return H.i(',', str, str2);
    }

    @Override // os0.g
    public final int g() {
        return R.layout.development_list_geo_content_text;
    }
}
