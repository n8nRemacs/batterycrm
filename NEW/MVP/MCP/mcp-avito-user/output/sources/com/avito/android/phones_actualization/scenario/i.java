package com.avito.android.phones_actualization.scenario;

import To.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "LTo/d;", "invoke", "(Ljava/util/Map;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Map<String, ? extends String>, To.d> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f216254l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final To.d invoke(Map<String, ? extends String> map) {
        String str = (String) C42745f0.F(map.values());
        return str == null ? new d.b(com.avito.android.code_check_public.k.a(), null, null, 6, null) : new d.c.b(com.avito.android.printable_text.b.f(str));
    }
}
