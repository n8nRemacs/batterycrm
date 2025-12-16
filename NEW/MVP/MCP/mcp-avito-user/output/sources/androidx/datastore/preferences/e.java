package androidx.datastore.preferences;

import Y61.k;
import Y61.l;
import android.content.Context;
import j.B;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.n;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/e;", "Lkotlin/properties/g;", "Landroid/content/Context;", "Landroidx/datastore/core/h;", "Landroidx/datastore/preferences/core/f;", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class e implements kotlin.properties.g<Context, androidx.datastore.core.h<androidx.datastore.preferences.core.f>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f45574b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final W0.b<androidx.datastore.preferences.core.f> f45575c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.l<Context, List<androidx.datastore.core.c<androidx.datastore.preferences.core.f>>> f45576d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f45577e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f45578f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @B
    @l
    public volatile androidx.datastore.preferences.core.c f45579g;

    public e(@k String str, @l W0.b bVar, @k Y41.l lVar, @k C43238h c43238h) {
        this.f45574b = str;
        this.f45575c = bVar;
        this.f45576d = lVar;
        this.f45577e = c43238h;
    }

    @Override // kotlin.properties.g
    public final androidx.datastore.core.h<androidx.datastore.preferences.core.f> getValue(Context context, n nVar) {
        androidx.datastore.preferences.core.c cVar;
        Context context2 = context;
        androidx.datastore.preferences.core.c cVar2 = this.f45579g;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f45578f) {
            try {
                if (this.f45579g == null) {
                    Context applicationContext = context2.getApplicationContext();
                    androidx.datastore.preferences.core.e eVar = androidx.datastore.preferences.core.e.f45564a;
                    W0.b<androidx.datastore.preferences.core.f> bVar = this.f45575c;
                    List<androidx.datastore.core.c<androidx.datastore.preferences.core.f>> listInvoke = this.f45576d.invoke(applicationContext);
                    C43238h c43238h = this.f45577e;
                    d dVar = new d(applicationContext, this);
                    eVar.getClass();
                    this.f45579g = androidx.datastore.preferences.core.e.a(bVar, listInvoke, c43238h, dVar);
                }
                cVar = this.f45579g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
