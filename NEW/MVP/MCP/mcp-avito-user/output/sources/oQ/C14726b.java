package Oq;

import Y61.k;
import Y61.l;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SimpleErrorTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq/b;", "LOq/a;", "_avito-discouraged_avito-libs_communications-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14726b implements InterfaceC14725a {
    @Override // Oq.InterfaceC14725a
    public final void a(@k Throwable th2, @l String str, @k Map<String, ? extends Object> map) {
        if (str == null) {
            str = "";
        }
        new NonFatalErrorEvent(str, th2, map, NonFatalErrorEvent.a.C4323a.f147930a);
        throw null;
    }
}
