package qu;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoritesSyncDao.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu/c;", "", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qu.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC47447c {

    /* compiled from: FavoritesSyncDao.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qu.c$a */
    public static final class a {
    }

    boolean b(@k String str, boolean z12);

    void c(@k List<String> list);

    @k
    Map<String, Boolean> d(@k List<String> list);

    void e(@k String str, @l String str2, @l String str3);

    boolean f(@k String str);

    void g(@k String str, @l String str2, @l String str3);

    int getCount();

    @k
    ArrayList h();

    @k
    LinkedHashMap i();

    @k
    LinkedHashMap j();

    @k
    ArrayList l();

    void m(@k String str, @l String str2);

    @k
    Map<String, Boolean> n();

    void wipe();
}
