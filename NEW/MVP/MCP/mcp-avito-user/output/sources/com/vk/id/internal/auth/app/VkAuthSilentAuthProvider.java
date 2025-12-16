package com.vk.id.internal.auth.app;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

/* compiled from: VkAuthSilentAuthProvider.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "", "", "appPackage", "appSha", "", "weight", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppPackage", "getAppSha", "I", "getWeight", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VkAuthSilentAuthProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String appPackage;

    @l
    private final String appSha;
    private final int weight;

    /* compiled from: VkAuthSilentAuthProvider.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider$Companion;", "", "<init>", "()V", "parse", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "json", "Lorg/json/JSONObject;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final VkAuthSilentAuthProvider parse(@k JSONObject json) {
            return new VkAuthSilentAuthProvider(json.getString("pkg"), json.getString("sha256"), VkAuthSilentAuthProviderKt.getInt(json, "weight", 0));
        }

        private Companion() {
        }
    }

    public VkAuthSilentAuthProvider(@k String str, @l String str2, int i12) {
        this.appPackage = str;
        this.appSha = str2;
        this.weight = i12;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VkAuthSilentAuthProvider)) {
            return false;
        }
        VkAuthSilentAuthProvider vkAuthSilentAuthProvider = (VkAuthSilentAuthProvider) other;
        return L.f(this.appPackage, vkAuthSilentAuthProvider.appPackage) && L.f(this.appSha, vkAuthSilentAuthProvider.appSha) && this.weight == vkAuthSilentAuthProvider.weight;
    }

    @k
    public final String getAppPackage() {
        return this.appPackage;
    }

    @l
    public final String getAppSha() {
        return this.appSha;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.appPackage.hashCode() * 31;
        String str = this.appSha;
        return Integer.hashCode(this.weight) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        return c.i(this.weight, ")", C23088b.b("VkAuthSilentAuthProvider(appPackage=", this.appPackage, ", appSha=", this.appSha, ", weight="));
    }

    public /* synthetic */ VkAuthSilentAuthProvider(String str, String str2, int i12, int i13, C42822w c42822w) {
        this(str, str2, (i13 & 4) != 0 ? 0 : i12);
    }
}
