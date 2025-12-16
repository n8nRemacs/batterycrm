package Kb1;

import X41.f;
import X41.n;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.I;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import lc1.C43728a;
import s2.AbstractC47961a;
import sberid.sdk.app_token.domain.models.models.TypeAuth;

@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"LKb1/b;", "", "", "code", VoiceInfo.STATE, "token", "", "createTime", "Lsberid/sdk/app_token/domain/models/models/TypeAuth;", "typeAuth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLsberid/sdk/app_token/domain/models/models/TypeAuth;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLsberid/sdk/app_token/domain/models/models/TypeAuth;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getCode$annotations", "()V", "getState", "getState$annotations", "b", "getToken$annotations", "J", "a", "()J", "getCreateTime$annotations", "Lsberid/sdk/app_token/domain/models/models/TypeAuth;", "c", "()Lsberid/sdk/app_token/domain/models/models/TypeAuth;", "getTypeAuth$annotations", "t/a", "t/b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f9537a;

    @c("code")
    @k
    private final String code;

    @c("createTime")
    private final long createTime;

    @c(VoiceInfo.STATE)
    @k
    private final String state;

    @c("token")
    @k
    private final String token;

    @c("typeAuth")
    @l
    private final TypeAuth typeAuth;

    static {
        new lc1.b();
        f9537a = new KSerializer[]{null, null, null, null, new I("sberid.sdk.app_token.domain.models.models.TypeAuth", TypeAuth.values())};
    }

    @InterfaceC42830m
    public b(int i12, @v String str, @v String str2, @v String str3, @v long j12, @v TypeAuth typeAuth, P0 p02) {
        if (31 != (i12 & 31)) {
            C43728a.f413943a.getClass();
            E0.b(i12, 31, C43728a.f413944b);
            throw null;
        }
        this.code = str;
        this.state = str2;
        this.token = str3;
        this.createTime = j12;
        this.typeAuth = typeAuth;
    }

    @n
    public static final /* synthetic */ void d(b bVar, d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        dVar.l(pluginGeneratedSerialDescriptor, 0, bVar.code);
        dVar.l(pluginGeneratedSerialDescriptor, 1, bVar.state);
        dVar.l(pluginGeneratedSerialDescriptor, 2, bVar.token);
        dVar.o(pluginGeneratedSerialDescriptor, 3, bVar.createTime);
        dVar.p(pluginGeneratedSerialDescriptor, 4, f9537a[4], bVar.typeAuth);
    }

    /* renamed from: a, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final TypeAuth getTypeAuth() {
        return this.typeAuth;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.code, bVar.code) && L.f(this.state, bVar.state) && L.f(this.token, bVar.token) && this.createTime == bVar.createTime && this.typeAuth == bVar.typeAuth;
    }

    public final int hashCode() {
        int iG2 = r.g(AbstractC47961a.a(this.token, AbstractC47961a.a(this.state, this.code.hashCode() * 31)), 31, this.createTime);
        TypeAuth typeAuth = this.typeAuth;
        return iG2 + (typeAuth == null ? 0 : typeAuth.hashCode());
    }

    @k
    public final String toString() {
        String str = this.code;
        String str2 = this.state;
        String str3 = this.token;
        long j12 = this.createTime;
        TypeAuth typeAuth = this.typeAuth;
        StringBuilder sbB = C23088b.b("AppTokenModel(code=", str, ", state=", str2, ", token=");
        sbB.append(str3);
        sbB.append(", createTime=");
        sbB.append(j12);
        sbB.append(", typeAuth=");
        sbB.append(typeAuth);
        sbB.append(")");
        return sbB.toString();
    }

    public b(@k String str, @k String str2, @k String str3, long j12, @l TypeAuth typeAuth) {
        this.code = str;
        this.state = str2;
        this.token = str3;
        this.createTime = j12;
        this.typeAuth = typeAuth;
    }
}
