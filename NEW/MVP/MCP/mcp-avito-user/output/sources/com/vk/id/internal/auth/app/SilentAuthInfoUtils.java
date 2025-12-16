package com.vk.id.internal.auth.app;

import Y41.l;
import Y61.k;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.u0;

/* compiled from: SilentAuthInfoUtils.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vk/id/internal/auth/app/SilentAuthInfoUtils;", "", "<init>", "()V", "Landroid/content/pm/Signature;", "signature", "", "calculateDigestHex", "(Landroid/content/pm/Signature;)Ljava/lang/String;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "packageManager", "pkg", "Lkotlin/Function1;", "transform", "calculateDigest", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;LY41/l;)Ljava/lang/String;", "", "(Landroid/content/pm/Signature;LY41/l;)Ljava/lang/String;", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;)Ljava/lang/String;", "calculateDigestBase64", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SilentAuthInfoUtils {

    @k
    public static final SilentAuthInfoUtils INSTANCE = new SilentAuthInfoUtils();

    /* compiled from: SilentAuthInfoUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.vk.id.internal.auth.app.SilentAuthInfoUtils$calculateDigestHex$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends H implements l<Signature, String> {
        public AnonymousClass1(Object obj) {
            super(1, obj, SilentAuthInfoUtils.class, "calculateDigestHex", "calculateDigestHex(Landroid/content/pm/Signature;)Ljava/lang/String;", 0);
        }

        @Override // Y41.l
        public final String invoke(Signature signature) {
            return ((SilentAuthInfoUtils) this.receiver).calculateDigestHex(signature);
        }
    }

    private SilentAuthInfoUtils() {
    }

    private final String calculateDigest(InternalVKIDPackageManager packageManager, String pkg, l<? super Signature, String> transform) {
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(pkg, 64).signatures;
            Signature signature = signatureArr.length == 0 ? null : signatureArr[0];
            if (signature != null) {
                return transform.invoke(signature);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateDigestBase64$lambda$0(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateDigestHex$lambda$1(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        u0 u0Var = u0.f406856a;
        return String.format(G.e(bArr.length << 1, "%0", "X"), Arrays.copyOf(new Object[]{bigInteger}, 1)).toLowerCase(Locale.ENGLISH);
    }

    @k
    public final String calculateDigestBase64(@k Signature signature) {
        return calculateDigest(signature, new P11.a(23));
    }

    @Y61.l
    public final String calculateDigestHex(@k InternalVKIDPackageManager packageManager, @k String pkg) {
        return calculateDigest(packageManager, pkg, new AnonymousClass1(INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateDigestHex(Signature signature) {
        return calculateDigest(signature, new P11.a(22));
    }

    private final String calculateDigest(Signature signature, l<? super byte[], String> transform) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(signature.toByteArray());
        return transform.invoke(messageDigest.digest());
    }
}
