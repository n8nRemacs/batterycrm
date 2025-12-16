package W20;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: NavigationConfigPublicFeaturesImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW20/f;", "LU20/d;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements U20.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f17729a;

    @Inject
    public f(@k a aVar) {
        this.f17729a = aVar;
    }

    @Override // U20.d
    public final boolean a() {
        if (f()) {
            a aVar = this.f17729a;
            aVar.getClass();
            n<Object> nVar = a.f17716j[5];
            if (((Boolean) aVar.f17722g.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // U20.d
    public final boolean b() {
        if (f()) {
            a aVar = this.f17729a;
            aVar.getClass();
            n<Object> nVar = a.f17716j[4];
            if (((Boolean) aVar.f17721f.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // U20.d
    public final boolean c() {
        if (f()) {
            a aVar = this.f17729a;
            aVar.getClass();
            n<Object> nVar = a.f17716j[7];
            if (((Boolean) aVar.f17724i.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // U20.d
    public final boolean d() {
        if (f()) {
            a aVar = this.f17729a;
            aVar.getClass();
            n<Object> nVar = a.f17716j[3];
            if (((Boolean) aVar.f17720e.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // U20.d
    public final boolean e() {
        if (f()) {
            a aVar = this.f17729a;
            aVar.getClass();
            n<Object> nVar = a.f17716j[2];
            if (((Boolean) aVar.f17719d.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        a aVar = this.f17729a;
        aVar.getClass();
        n<Object> nVar = a.f17716j[0];
        return ((Boolean) aVar.f17717b.a().invoke()).booleanValue();
    }
}
