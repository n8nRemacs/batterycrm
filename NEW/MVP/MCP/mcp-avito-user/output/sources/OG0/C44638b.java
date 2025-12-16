package oG0;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalMapResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoG0/b;", "LoG0/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44638b implements InterfaceC44637a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419643a;

    @Inject
    public C44638b(@k Resources resources) {
        this.f419643a = resources.getString(R.string.unknown_error);
    }

    @Override // oG0.InterfaceC44637a
    @k
    /* renamed from: a, reason: from getter */
    public final String getF419643a() {
        return this.f419643a;
    }
}
