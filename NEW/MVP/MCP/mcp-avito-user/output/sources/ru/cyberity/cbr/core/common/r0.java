package ru.cyberity.cbr.core.common;

import android.content.Context;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RootChecker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\n\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/common/r0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/scottyab/rootbeer/d;", "a", "Lkotlin/C;", "()Lcom/scottyab/rootbeer/d;", "beer", "", "b", "Z", "()Z", "isRooted", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C beer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isRooted = a().c();

    /* compiled from: RootChecker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/scottyab/rootbeer/d;", "a", "()Lcom/scottyab/rootbeer/d;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<com.scottyab.rootbeer.d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f432819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f432819a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.scottyab.rootbeer.d invoke() {
            return new com.scottyab.rootbeer.d(this.f432819a);
        }
    }

    public r0(@Y61.k Context context) {
        this.beer = C42727D.c(new a(context));
    }

    private final com.scottyab.rootbeer.d a() {
        return (com.scottyab.rootbeer.d) this.beer.getValue();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsRooted() {
        return this.isRooted;
    }
}
