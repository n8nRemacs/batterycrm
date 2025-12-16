package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: AndroidMetadataExtractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lshark/M1$c;", "instance", "Lkotlin/Q;", "", "", "invoke", "(Lshark/M1$c;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48245e extends kotlin.jvm.internal.N implements Y41.l<M1.c, kotlin.Q<? extends String, ? extends Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48245e f438271l = new C48245e();

    public C48245e() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.Q<? extends String, ? extends Boolean> invoke(M1.c cVar) {
        M1.c cVarA;
        K1 k1J;
        X1 x12;
        String strI;
        K1 k1J2;
        X1 x13;
        M1.c cVar2 = cVar;
        K1 k1J3 = cVar2.j("android.database.sqlite.SQLiteDatabase", "mConfigurationLocked");
        if (k1J3 == null || (cVarA = k1J3.a()) == null || (k1J = cVarA.j("android.database.sqlite.SQLiteDatabaseConfiguration", "label")) == null || (x12 = k1J.f438095c) == null || (strI = x12.i()) == null || (k1J2 = cVar2.j("android.database.sqlite.SQLiteDatabase", "mConnectionPoolLocked")) == null || (x13 = k1J2.f438095c) == null) {
            return null;
        }
        return new kotlin.Q<>(strI, Boolean.valueOf(x13.g()));
    }
}
