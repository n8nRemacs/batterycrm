package Ve0;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GroupContactStringsProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVe0/g;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f17346a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17347b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17348c;

    @Inject
    public g(@k Resources resources) {
        this.f17346a = resources;
        this.f17347b = resources.getString(R.string.group_contact_slot_online_show_off);
        this.f17348c = resources.getString(R.string.group_contact_slot_online_show_on);
    }
}
