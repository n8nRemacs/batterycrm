package com.avito.android.enabler;

import DE0.a;
import Y41.l;
import Y61.k;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AnalyticFeature.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR&\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/enabler/AnalyticFeature;", "T", "LDE0/a;", "Lcom/avito/android/enabler/RemoteFeature;", "delegate", "Lkotlin/Function1;", "Lkotlin/G0;", "reportCallback", "<init>", "(Lcom/avito/android/enabler/RemoteFeature;LY41/l;)V", "invoke", "()Ljava/lang/Object;", "Lcom/avito/android/enabler/RemoteFeature;", "LY41/l;", "", "getApiToggleId", "()Ljava/lang/String;", "apiToggleId", "getDescription", "description", "", "isRemote", "()Z", "getKey", "key", "getOriginalValue", "originalValue", "Lcom/avito/android/ownership/Owners;", "getOwner", "()Lcom/avito/android/ownership/Owners;", SearchParamsConverterKt.OWNER, "", "getPriority", "()I", "priority", "getValue", "value", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnalyticFeature<T> implements a<T> {

    @k
    private final RemoteFeature<T> delegate;

    @k
    private final l<RemoteFeature<T>, G0> reportCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticFeature(@k RemoteFeature<T> remoteFeature, @k l<? super RemoteFeature<T>, G0> lVar) {
        this.delegate = remoteFeature;
        this.reportCallback = lVar;
    }

    @Override // DE0.a
    @Y61.l
    /* renamed from: getApiToggleId */
    public String getF3110e() {
        return this.delegate.getF3110e();
    }

    @Override // DE0.a
    @k
    /* renamed from: getDescription */
    public String getF3106a() {
        return this.delegate.getF3106a();
    }

    @Override // DE0.a
    @k
    /* renamed from: getKey */
    public String getF3108c() {
        return this.delegate.getF3108c();
    }

    @Override // DE0.a
    public T getOriginalValue() {
        return this.delegate.getOriginalValue();
    }

    @Override // DE0.a
    @Y61.l
    /* renamed from: getOwner */
    public Owners getF3112g() {
        return this.delegate.getF3112g();
    }

    @Override // DE0.a
    /* renamed from: getPriority */
    public int getF3109d() {
        return this.delegate.getF3109d();
    }

    @Override // DE0.a
    public T getValue() {
        return invoke();
    }

    @Override // DE0.a
    public T invoke() {
        if (!this.delegate.touched() && this.delegate.getF3111f()) {
            this.reportCallback.invoke(this.delegate);
        }
        return this.delegate.getValue();
    }

    @Override // DE0.a
    /* renamed from: isRemote */
    public boolean getF3111f() {
        return this.delegate.getF3111f();
    }
}
