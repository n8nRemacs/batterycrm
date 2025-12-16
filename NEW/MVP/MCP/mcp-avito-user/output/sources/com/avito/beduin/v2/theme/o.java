package com.avito.beduin.v2.theme;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Declaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/theme/m;", "T", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/theme/n;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class o<T extends m> implements d<T>, n<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f338364a;

    public o(@Y61.k String str) {
        if (str.length() > 0) {
            str = ((Object) String.valueOf(str.charAt(0)).toLowerCase(Locale.ROOT)) + str.substring(1);
        }
        this.f338364a = str;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF338364a() {
        return this.f338364a;
    }

    @Y61.k
    public final String c(@Y61.k G g12) {
        String string = g12.getString("styleName");
        return string == null ? this.f338364a : string;
    }
}
