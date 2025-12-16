package com.avito.beduin.v2.avito.component.gradient.content;

import Y61.k;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: GradientContent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/gradient/content/e;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/gradient/content/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.beduin.v2.theme.d<a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f334366a = new e();

    @k
    public static a b(@k G g12) {
        String string = g12.getString("name");
        if (string == null) {
            string = "";
        }
        return new a(null, string, g12.getString("themeName"), 1, null);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ a a(G g12) {
        return b(g12);
    }
}
