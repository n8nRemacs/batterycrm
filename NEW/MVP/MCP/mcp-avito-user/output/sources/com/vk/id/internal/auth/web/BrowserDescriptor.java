package com.vk.id.internal.auth.web;

import Y61.k;
import Y61.l;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BrowserDescriptor.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "", "", "packageName", "", "signatureHashes", "version", "", "useCustomTab", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Z)V", "Landroid/content/pm/PackageInfo;", "packageInfo", "(Landroid/content/pm/PackageInfo;Z)V", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "Ljava/util/Set;", "getSignatureHashes", "()Ljava/util/Set;", "getVersion", "Z", "getUseCustomTab", "()Z", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrowserDescriptor {

    @k
    private final String packageName;

    @k
    private final Set<String> signatureHashes;
    private final boolean useCustomTab;

    @k
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag(Companion.class.getSimpleName());

    /* compiled from: BrowserDescriptor.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/auth/web/BrowserDescriptor$Companion;", "", "<init>", "()V", "PRIME_HASH_FACTOR", "", "DIGEST_SHA_512", "", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "generateSignatureHash", "signature", "Landroid/content/pm/Signature;", "generateSignatureHashes", "", "signatures", "", "([Landroid/content/pm/Signature;)Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final String generateSignatureHash(@k Signature signature) {
            try {
                return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
            } catch (NoSuchAlgorithmException e12) {
                BrowserDescriptor.logger.error("Can't generate signature hash", e12);
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }

        @k
        public final Set<String> generateSignatureHashes(@k Signature[] signatures) {
            HashSet hashSet = new HashSet();
            for (Signature signature : signatures) {
                hashSet.add(generateSignatureHash(signature));
            }
            return hashSet;
        }

        private Companion() {
        }
    }

    public BrowserDescriptor(@k String str, @k Set<String> set, @k String str2, boolean z12) {
        this.packageName = str;
        this.signatureHashes = set;
        this.version = str2;
        this.useCustomTab = z12;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof BrowserDescriptor)) {
            return false;
        }
        BrowserDescriptor browserDescriptor = (BrowserDescriptor) other;
        return L.f(this.packageName, browserDescriptor.packageName) && L.f(this.version, browserDescriptor.version) && this.useCustomTab == browserDescriptor.useCustomTab && L.f(this.signatureHashes, browserDescriptor.signatureHashes);
    }

    @k
    public final String getPackageName() {
        return this.packageName;
    }

    @k
    public final Set<String> getSignatureHashes() {
        return this.signatureHashes;
    }

    public final boolean getUseCustomTab() {
        return this.useCustomTab;
    }

    @k
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iD2 = H.d(this.packageName.hashCode() * 92821, 92821, this.version) + (this.useCustomTab ? 1 : 0);
        Iterator<String> it = this.signatureHashes.iterator();
        while (it.hasNext()) {
            iD2 = (iD2 * 92821) + it.next().hashCode();
        }
        return iD2;
    }

    public BrowserDescriptor(@k PackageInfo packageInfo, boolean z12) {
        this(packageInfo.packageName, INSTANCE.generateSignatureHashes(packageInfo.signatures), packageInfo.versionName, z12);
    }
}
