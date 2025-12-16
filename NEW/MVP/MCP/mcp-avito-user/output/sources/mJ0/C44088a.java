package mj0;

import Y61.k;
import com.avito.android.remote.analytics.u;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import og0.InterfaceC44773a;

/* compiled from: UrlDefinitionProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmj0/a;", "Log0/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C44088a implements InterfaceC44773a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f414666a;

    @Inject
    public C44088a(@k u uVar) {
        this.f414666a = uVar;
    }

    @Override // og0.InterfaceC44773a
    @k
    public final String a(@k String str) {
        return this.f414666a.a(str, str);
    }
}
