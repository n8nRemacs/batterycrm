package com.avito.android.user_adverts_common.safety;

import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.D;
import kotlin.Metadata;
import l41.o;

/* compiled from: SafetyInfoProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "shouldShowInfo", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "kotlin.jvm.PlatformType", "apply", "(Z)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f315922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f315923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f315924d;

    public f(g gVar, String str, String str2) {
        this.f315922b = gVar;
        this.f315923c = str;
        this.f315924d = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return C41928w.f403335b;
        }
        g gVar = this.f315922b;
        return new D(g1.a(new C42007e(new c(gVar, this.f315923c, 1))), new d(gVar)).c(new e(gVar, this.f315924d));
    }
}
