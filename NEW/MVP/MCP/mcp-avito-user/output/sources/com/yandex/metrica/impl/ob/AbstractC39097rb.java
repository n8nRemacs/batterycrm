package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;

/* renamed from: com.yandex.metrica.impl.ob.rb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39097rb {

    /* renamed from: com.yandex.metrica.impl.ob.rb$a */
    public static class a extends AbstractC39097rb {
        @Override // com.yandex.metrica.impl.ob.AbstractC39097rb
        @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
        public C39121sb b(@j.N FeatureInfo featureInfo) {
            return new C39121sb(featureInfo.name, featureInfo.version, c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rb$b */
    public static class b extends AbstractC39097rb {
        @Override // com.yandex.metrica.impl.ob.AbstractC39097rb
        public C39121sb b(@j.N FeatureInfo featureInfo) {
            return new C39121sb(featureInfo.name, -1, c(featureInfo));
        }
    }

    public C39121sb a(@j.N FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i12 = featureInfo.reqGlEsVersion;
        return i12 == 0 ? b(featureInfo) : new C39121sb("openGlFeature", i12, c(featureInfo));
    }

    public abstract C39121sb b(FeatureInfo featureInfo);

    public boolean c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
