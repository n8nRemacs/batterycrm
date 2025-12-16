package EH;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftStartResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEH/a;", "", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f3907a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3908b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3909c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f3910d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f3911e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f3912f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f3913g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f3914h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f3915i;

    @Inject
    public a(@k Resources resources) {
        this.f3907a = resources.getString(R.string.scan_qr_title);
        this.f3908b = resources.getString(R.string.scan_qr_description);
        this.f3909c = resources.getString(R.string.scan_qr_title_explanation);
        this.f3910d = resources.getString(R.string.scan_qr_description_explanation);
        this.f3911e = resources.getString(R.string.scan_qr_primary_button_title);
        this.f3912f = resources.getString(R.string.scan_qr_secondary_button_title);
        this.f3913g = resources.getString(R.string.another_shift_title);
        this.f3914h = resources.getString(R.string.another_shift_description);
        this.f3915i = resources.getString(R.string.another_shift_button_title);
    }
}
