package com.avito.android.error;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ErrorsHandlings.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Output", "Result", "it", "", "", "invoke", "(Ljava/util/Map;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.error.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30360t extends kotlin.jvm.internal.N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l f147760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30360t(Y41.l lVar) {
        super(1);
        this.f147760l = lVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        String str = (String) C42745f0.F(((Map) obj).values());
        if (str == null) {
            str = "";
        }
        return this.f147760l.invoke(str);
    }
}
