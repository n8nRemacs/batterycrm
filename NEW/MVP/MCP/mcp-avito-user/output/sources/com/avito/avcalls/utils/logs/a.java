package com.avito.avcalls.utils.logs;

import Y61.k;
import Y61.l;
import androidx.compose.ui.platform.C22491k0;
import com.avito.avcalls.logger.g;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.text.C43066x;

/* compiled from: FuncLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/utils/logs/a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f333693a;

    public a(@k String str) {
        this.f333693a = str;
    }

    public final void a(@k String str, @l String str2, @l Exception exc) {
        StringBuilder sb2 = new StringBuilder();
        C43066x.k(sb2, str, " -> ");
        if (str2 != null) {
            sb2.append((Object) str2);
        }
        String string = sb2.toString();
        g.f332960a.getClass();
        g.a(this.f333693a, string, exc);
    }

    public final void b(@k String str, @k Object... objArr) {
        g gVar = g.f332960a;
        StringBuilder sbB = C22491k0.b(str, '(');
        sbB.append(C42756l.P(objArr, null, null, null, null, 63));
        sbB.append(')');
        String string = sbB.toString();
        gVar.getClass();
        g.b(this.f333693a, string);
    }

    public final void c(@l Object obj, @k String str, @k Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        C43066x.k(sb2, str, " -> ");
        if (obj != null) {
            sb2.append(obj);
        }
        if (objArr.length != 0) {
            C43066x.k(sb2, ", ", C42756l.P(objArr, null, null, null, null, 63));
        }
        String string = sb2.toString();
        g.f332960a.getClass();
        g.b(this.f333693a, string);
    }
}
