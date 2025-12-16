package Vf0;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import hg0.InterfaceC40932a;
import javax.inject.Inject;
import javax.inject.Singleton;
import jg0.InterfaceC42375a;
import kotlin.Metadata;

/* compiled from: FirstAppStartDetectorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVf0/a;", "Lhg0/a;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15673a implements InterfaceC40932a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42375a f17350a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17351b;

    @Inject
    public C15673a(@k InterfaceC42375a interfaceC42375a) {
        this.f17350a = interfaceC42375a;
        boolean zI2 = interfaceC42375a.i();
        interfaceC42375a.a();
        this.f17351b = zI2;
    }

    @Override // hg0.InterfaceC40932a
    /* renamed from: a, reason: from getter */
    public final boolean getF17351b() {
        return this.f17351b;
    }
}
