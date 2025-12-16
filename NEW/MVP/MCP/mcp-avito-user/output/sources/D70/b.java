package D70;

import Ag.CallableC13028a;
import Y61.k;
import android.content.ContentResolver;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.maybe.K;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ThumbnailProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD70/b;", "LD70/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContentResolver f2949a;

    public b(@k ContentResolver contentResolver) {
        this.f2949a = contentResolver;
    }

    @Override // D70.a
    @k
    public final K a(@k Uri uri) {
        return new K(new CallableC13028a(1, this, uri));
    }
}
