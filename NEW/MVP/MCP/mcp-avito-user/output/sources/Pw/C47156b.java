package pw;

import Y61.k;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import qw.AbstractC47454a;

/* compiled from: DevelopmentsAdviceJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpw/b;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "<init>", "()V", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pw.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47156b implements h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C47156b f428846a = new C47156b();

    @Override // javax.inject.Provider
    public final Object get() {
        C47155a.f428845a.getClass();
        return new C35866p0(AbstractC47454a.class, P0.g(new Q("ok", AbstractC47454a.b.class), new Q("failure", AbstractC47454a.C12345a.class), new Q("need-phone-verification", AbstractC47454a.c.class)));
    }
}
