package com.avito.android.error;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ErrorsHandlings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Map<String, String>, G0> f147741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f147742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f147743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f147744f;

    public K(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5) {
        this.f147740b = lVar;
        this.f147741c = lVar2;
        this.f147742d = lVar3;
        this.f147743e = lVar4;
        this.f147744f = lVar5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
    @Override // l41.g
    public final void accept(Object obj) {
        z.f((Throwable) obj, this.f147740b, this.f147741c, this.f147742d, this.f147743e, this.f147744f);
    }
}
