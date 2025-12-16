package zE0;

import Y61.k;
import com.avito.android.ownership.Owners;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import vE0.AbstractC49202b;
import vE0.C49204d;
import vE0.InterfaceC49203c;

/* compiled from: FavoritesUnviewedTimestampFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzE0/b;", "LvE0/c;", "<init>", "()V", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50447b implements InterfaceC49203c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C50447b f443974a = new C50447b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final AbstractC49202b.AbstractC12751b.C12752b f443975b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final AbstractC49202b.AbstractC12751b.C12752b f443976c;

    static {
        Owners owners = Owners.f210476d;
        f443975b = new AbstractC49202b.AbstractC12751b.C12752b("FavoritesUnviewedTimestampFeature_show", new C49204d(32L, null, 2, null), true, false, 8, null);
        f443976c = new AbstractC49202b.AbstractC12751b.C12752b("FavoritesUnviewedTimestampFeature_add", new C49204d(1L, 14L), false, false, 12, null);
    }

    @Override // vE0.InterfaceC49203c
    @k
    public final List<AbstractC49202b.AbstractC12751b.C12752b> a() {
        return C42745f0.U(f443975b, f443976c);
    }
}
