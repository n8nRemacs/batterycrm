package com.yandex.div.core.util.mask;

import Y41.l;
import Y61.k;
import com.yandex.div.core.util.mask.a;
import java.util.regex.PatternSyntaxException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FixedLengthInputMask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/c;", "Lcom/yandex/div/core/util/mask/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class c extends a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<Exception, G0> f367820e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k a.b bVar, @k l<? super Exception, G0> lVar) {
        super(bVar);
        this.f367820e = lVar;
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void i(@k PatternSyntaxException patternSyntaxException) {
        this.f367820e.invoke(patternSyntaxException);
    }
}
