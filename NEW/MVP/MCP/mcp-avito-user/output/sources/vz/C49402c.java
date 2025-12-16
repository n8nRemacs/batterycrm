package vz;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import vz.InterfaceC49400a;

/* compiled from: AppEntrypointProviderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvz/c;", "Lvz/b;", "<init>", "()V", "_avito_entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49402c implements InterfaceC49401b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Z1<InterfaceC49400a> f441066a = p2.a(InterfaceC49400a.e.f441065a);

    @Inject
    public C49402c() {
    }

    @Override // vz.InterfaceC49401b
    @k
    public final InterfaceC49400a a() {
        return this.f441066a.getValue();
    }
}
