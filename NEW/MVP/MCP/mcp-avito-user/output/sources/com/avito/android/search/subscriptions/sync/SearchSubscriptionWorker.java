package com.avito.android.search.subscriptions.sync;

import Y61.k;
import android.content.Context;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/search/subscriptions/sync/SearchSubscriptionWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public final class SearchSubscriptionWorker extends RxWorker {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f264004c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f264005b;

    /* compiled from: SearchSubscriptionWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/search/subscriptions/sync/SearchSubscriptionWorker$a;", "", "<init>", "()V", "", "KEY_UPDATE_MODE", "Ljava/lang/String;", "TAG", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SearchSubscriptionWorker(@k Context context, @k WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f264005b = context;
    }

    @Override // androidx.work.rxjava3.RxWorker
    @k
    public final I<F.a> b() {
        return new G(new VH0.c(this, 29));
    }

    @Override // androidx.work.F
    public final void onStopped() {
        super.onStopped();
        V2.f318762a.c("SearchSubscriptionWorker", "SearchSubscriptionWorker stopped", null);
    }
}
