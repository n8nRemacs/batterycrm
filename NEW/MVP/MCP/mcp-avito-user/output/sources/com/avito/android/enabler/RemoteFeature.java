package com.avito.android.enabler;

import DE0.a;
import Y41.l;
import Y61.k;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: RemoteFeature.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B:\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R4\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b'\u0010\r*\u0004\b(\u0010)R\u0014\u0010,\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\r¨\u0006-"}, d2 = {"Lcom/avito/android/enabler/RemoteFeature;", "T", "LDE0/a;", "delegate", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "key", "remoteValue", "<init>", "(LDE0/a;LY41/l;)V", "invoke", "()Ljava/lang/Object;", "", "touched", "()Z", "LDE0/a;", "LY41/l;", "getRemoteValue", "()LY41/l;", "Lkotlin/C;", "lazyValue", "Lkotlin/C;", "getApiToggleId", "()Ljava/lang/String;", "apiToggleId", "getDescription", "description", "isRemote", "getKey", "Lcom/avito/android/ownership/Owners;", "getOwner", "()Lcom/avito/android/ownership/Owners;", SearchParamsConverterKt.OWNER, "", "getPriority", "()I", "priority", "getValue", "getValue$delegate", "(Lcom/avito/android/enabler/RemoteFeature;)Ljava/lang/Object;", "value", "getOriginalValue", "originalValue", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class RemoteFeature<T> implements a<T> {

    @k
    private final a<T> delegate;

    @k
    private final InterfaceC42726C<T> lazyValue = C42727D.b(LazyThreadSafetyMode.f406614b, new RemoteFeature$lazyValue$1(this));

    @k
    private final l<String, T> remoteValue;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteFeature(@k a<? extends T> aVar, @k l<? super String, ? extends T> lVar) {
        this.delegate = aVar;
        this.remoteValue = lVar;
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
        return this.delegate.getValue();
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

    @k
    public final l<String, T> getRemoteValue() {
        return this.remoteValue;
    }

    @Override // DE0.a
    public T getValue() {
        return this.lazyValue.getValue();
    }

    @Override // DE0.a
    public T invoke() {
        return getValue();
    }

    @Override // DE0.a
    /* renamed from: isRemote */
    public boolean getF3111f() {
        return this.delegate.getF3111f();
    }

    public final boolean touched() {
        return this.lazyValue.isInitialized();
    }
}
