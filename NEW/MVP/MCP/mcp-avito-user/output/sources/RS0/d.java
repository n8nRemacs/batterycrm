package rs0;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: SerpElementWidgetStateProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrs0/d;", "Lrs0/c;", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Kundle f430270a;

    @Override // rs0.c
    @l
    public final Parcelable a(@k String str) {
        return this.f430270a.d(str);
    }

    @Override // rs0.c
    public final void b(@k Parcelable parcelable, @k String str) {
        this.f430270a.j(parcelable, str);
    }

    @Override // rs0.c
    @k
    /* renamed from: c, reason: from getter */
    public final Kundle getF430270a() {
        return this.f430270a;
    }
}
