package com.vk.api.sdk.okhttp;

import android.os.Looper;
import com.vk.api.sdk.A;
import com.vk.api.sdk.m;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: OkHttpExecutor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/okhttp/l;", "", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f366654e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f366655a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366656b = C42727D.c(new c());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public volatile Object f366657c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f366658d;

    /* compiled from: OkHttpExecutor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/vk/api/sdk/okhttp/l$a;", "", "<init>", "()V", "", "MIME_APPLICATION", "Ljava/lang/String;", "UTF_8", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OkHttpExecutor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/l$b;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            Object obj = null;
            obj.getClass();
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "MethodResponse(response=" + ((Object) null) + ", headers=" + ((Object) null) + ", executorRequestAccessToken=" + ((Object) null) + ')';
        }
    }

    /* compiled from: OkHttpExecutor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/A;", "<anonymous>", "()Lcom/vk/api/sdk/A;"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.a<A> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final A invoke() {
            if (L.f(Looper.getMainLooper(), Looper.myLooper())) {
                throw new IllegalStateException("UI thread");
            }
            l lVar = l.this;
            com.vk.api.sdk.g gVar = lVar.f366655a.f366661a;
            gVar.f366597g.b(new m(lVar));
            return lVar.f366655a.f366661a.f366597g;
        }
    }

    public l(@Y61.k n nVar) {
        this.f366655a = nVar;
        m.a aVar = com.vk.api.sdk.m.f366630c;
        String value = nVar.f366661a.f366599i.getValue();
        String value2 = nVar.f366661a.f366600j.getValue();
        aVar.getClass();
        this.f366657c = m.a.a(value, value2);
        this.f366658d = nVar.f366661a.f366608r.getValue();
    }
}
