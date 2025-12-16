package Lq;

import Y61.k;
import com.avito.android.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: AndroidXPlatformProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLq/a;", "LLq/d;", "_avito-discouraged_common-headers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C14429a implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P f10129a;

    @Inject
    public C14429a(@k P p12) {
        this.f10129a = p12;
    }

    @Override // hd.InterfaceC40916b
    public final boolean a() {
        P p12 = this.f10129a;
        p12.getClass();
        n<Object> nVar = P.f67370w0[76];
        return ((Boolean) p12.f67415j0.a().invoke()).booleanValue();
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253498b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @k
    public final String getKey() {
        return "X-Platform";
    }

    @Override // hd.InterfaceC40915a
    @k
    /* renamed from: getValue */
    public final String getF6495a() {
        return "android";
    }
}
