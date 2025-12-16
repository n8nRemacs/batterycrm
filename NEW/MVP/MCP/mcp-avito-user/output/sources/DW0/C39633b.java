package dW0;

import Y61.k;
import com.avito.android.util.X5;
import com.avito.user_stats.UserStatsTemplateUnitTypeAdapter;
import dagger.internal.h;
import eW0.InterfaceC40066i;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lE.i;

/* compiled from: UserStatsJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LdW0/b;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "a", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dW0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39633b implements h<Set<X5>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f393898b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f393899a;

    /* compiled from: UserStatsJsonModule_ProvideTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdW0/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dW0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39633b(@k i iVar) {
        this.f393899a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f393899a.get();
        f393898b.getClass();
        int i12 = C39632a.f393897a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(InterfaceC40066i.class, new UserStatsTemplateUnitTypeAdapter()));
        return linkedHashSet;
    }
}
