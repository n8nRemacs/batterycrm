package sC;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteComparisonResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsC/f;", "LsC/e;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sC.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48029f implements InterfaceC48028e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437540a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437541b;

    @Inject
    public C48029f(@k Resources resources) {
        this.f437540a = resources.getString(R.string.favorite_comparison_error_toast_message);
        this.f437541b = resources.getString(R.string.favorite_comparison_error_toast_action);
    }

    @Override // sC.InterfaceC48028e
    @k
    /* renamed from: a, reason: from getter */
    public final String getF437540a() {
        return this.f437540a;
    }

    @Override // sC.InterfaceC48028e
    @k
    /* renamed from: b, reason: from getter */
    public final String getF437541b() {
        return this.f437541b;
    }
}
