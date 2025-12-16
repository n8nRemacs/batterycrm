package com.avito.android.enabler;

import DE0.a;
import Y41.l;
import Y61.k;
import com.avito.android.InterfaceC36170z0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RemoteFeaturesDecorator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/enabler/RemoteFeaturesDecorator;", "Lcom/avito/android/z0;", "Lcom/avito/android/enabler/TogglesStorage;", "storage", "<init>", "(Lcom/avito/android/enabler/TogglesStorage;)V", "LDE0/a;", "", "feature", "decorate", "(LDE0/a;)LDE0/a;", "Lcom/avito/android/enabler/TogglesStorage;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class RemoteFeaturesDecorator implements InterfaceC36170z0 {

    @k
    private final TogglesStorage storage;

    /* compiled from: RemoteFeaturesDecorator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "key", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.enabler.RemoteFeaturesDecorator$decorate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements l<String, Object> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // Y41.l
        @Y61.l
        public final Object invoke(@k String str) {
            return RemoteFeaturesDecorator.this.storage.getFeatureValue(str);
        }
    }

    public RemoteFeaturesDecorator(@k TogglesStorage togglesStorage) {
        this.storage = togglesStorage;
    }

    @Override // com.avito.android.InterfaceC36170z0
    @k
    public a<Object> decorate(@k a<? extends Object> feature) {
        return feature.getF3111f() ? new RemoteFeature(feature, new AnonymousClass1()) : feature;
    }
}
