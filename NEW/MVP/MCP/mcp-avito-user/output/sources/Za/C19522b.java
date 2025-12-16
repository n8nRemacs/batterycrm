package Za;

import Y61.k;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailStatsResourcesProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZa/b;", "LZa/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Za.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C19522b implements InterfaceC19521a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f20208a;

    @Inject
    public C19522b(@k Resources resources) throws Resources.NotFoundException {
        resources.getString(R.string.connection_problem);
        this.f20208a = resources.getString(R.string.unknown_error);
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        new UniversalColor("gray8", new Color(resources.getColor(R.color.gray8, null)), new Color(resources.getColor(R.color.gray8, null)));
    }

    @Override // Za.InterfaceC19521a
    @k
    /* renamed from: a, reason: from getter */
    public final String getF20208a() {
        return this.f20208a;
    }
}
