package wj;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import wj.InterfaceC49636a;

/* compiled from: BeduinSnippetResponseManagerImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwj/b;", "Lwj/a;", "<init>", "()V", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49637b implements InterfaceC49636a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f441765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d2<InterfaceC49636a.C12828a> f441766b;

    @Inject
    public C49637b() {
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f441765a = e2VarB;
        this.f441766b = C43175k.a(e2VarB);
    }

    @Override // wj.InterfaceC49636a
    public final void a(@k InterfaceC49636a.C12828a c12828a) {
        this.f441765a.K5(c12828a);
    }

    @Override // wj.InterfaceC49636a
    public final InterfaceC43160i b() {
        return this.f441766b;
    }
}
