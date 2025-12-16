package com.vk.api.sdk;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VKApiCredentials.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/m;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f366630c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f366631a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f366632b;

    /* compiled from: VKApiCredentials.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/m$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* compiled from: VKApiCredentials.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/m;", "<anonymous>", "()Lcom/vk/api/sdk/m;"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.vk.api.sdk.m$a$a, reason: collision with other inner class name */
        public static final class C10817a extends N implements Y41.a<m> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f366633l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f366634m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10817a(String str, String str2) {
                super(0);
                this.f366633l = str;
                this.f366634m = str2;
            }

            @Override // Y41.a
            public final m invoke() {
                return new m(this.f366633l, this.f366634m);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static InterfaceC42726C a(@Y61.k String str, @Y61.l String str2) {
            return C42727D.b(LazyThreadSafetyMode.f406616d, new C10817a(str, str2));
        }

        public a() {
        }
    }

    public m(@Y61.k String str, @Y61.l String str2) {
        this.f366631a = str;
        this.f366632b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f366631a, mVar.f366631a) && L.f(this.f366632b, mVar.f366632b);
    }

    public final int hashCode() {
        int iHashCode = this.f366631a.hashCode() * 31;
        String str = this.f366632b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "VKApiCredentials(accessToken=" + this.f366631a + ", secret=" + ((Object) this.f366632b) + ')';
    }
}
