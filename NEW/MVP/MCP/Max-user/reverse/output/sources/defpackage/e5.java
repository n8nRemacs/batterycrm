package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.XECPublicKeySpec;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e5 {
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles f(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback j(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher n(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ XECPublicKey r(PublicKey publicKey) {
        return (XECPublicKey) publicKey;
    }

    public static /* synthetic */ XECPublicKeySpec s(AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        return new XECPublicKeySpec(algorithmParameterSpec, bigInteger);
    }

    public static /* synthetic */ void v() {
    }
}
