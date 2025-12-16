package sJ;

import Y61.k;
import com.avito.avcalls.utils.f;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AvCallsCallIdProviderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsJ/a;", "LIJ/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48058a implements IJ.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FJ.a f437597a;

    @Inject
    public C48058a(@k FJ.a aVar) {
        this.f437597a = aVar;
    }

    @Override // IJ.a
    @k
    public final String a() {
        if (this.f437597a.v().invoke().booleanValue()) {
            f.f333689a.getClass();
            return UUID.randomUUID().toString();
        }
        com.avito.avcalls.android.utils.f.f332467a.getClass();
        return UUID.randomUUID().toString();
    }
}
