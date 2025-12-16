package Oq;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ErrorTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq/a;", "", "_avito-discouraged_avito-libs_communications-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: Oq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14725a {

    /* compiled from: ErrorTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oq.a$a, reason: collision with other inner class name */
    public static final class C0808a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(InterfaceC14725a interfaceC14725a, Throwable th2, Map map, int i12) {
            if ((i12 & 4) != 0) {
                map = P0.c();
            }
            interfaceC14725a.a(th2, null, map);
        }
    }

    void a(@k Throwable th2, @l String str, @k Map<String, ? extends Object> map);
}
